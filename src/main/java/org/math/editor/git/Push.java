package org.math.editor.git;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.PushCommand;
import org.eclipse.jgit.api.RemoteAddCommand;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.internal.storage.file.FileRepository;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.transport.URIish;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;

import java.io.IOException;
import java.net.URISyntaxException;

public class Push {
    public static void main(String[] args) {
        try {
            Repository localRepo = new FileRepository("E:\\Math\\work_space\\algebra");
            Git git = new Git(localRepo);

            RemoteAddCommand remoteAddCommand = git.remoteAdd();
            remoteAddCommand.setName("origin");
            remoteAddCommand.setUri(new URIish("https://github.com/miaomiaodaa/math.git"));
            remoteAddCommand.call();

            PushCommand pushCommand = git.push();
            pushCommand.setCredentialsProvider(new UsernamePasswordCredentialsProvider("562873345@qq.com", "10293847_WSXokn"));
            pushCommand.call();
        } catch (IOException | URISyntaxException | GitAPIException e) {
            e.printStackTrace();
        }
    }
}
