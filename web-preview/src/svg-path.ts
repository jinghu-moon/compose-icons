import type { PreviewPath, PreviewPathCommand } from './types'

export function buildSvgPath(paths: PreviewPath[]): string {
  return paths
    .map((path) => path.commands.map(toSegment).join(' '))
    .join(' ')
}

function toSegment(command: PreviewPathCommand): string {
  if (command.command === 'Z' || command.command === 'z') {
    return command.command
  }
  return `${command.command}${command.arguments.join(' ')}`
}

