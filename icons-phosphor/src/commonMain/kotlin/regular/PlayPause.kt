package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PlayPause: ImageVector
    get() {
        if (_playPause != null) return _playPause!!
        _playPause = phosphorRegularIcon(
            name = "PlayPause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 64.0f),
                    PathNode.LineTo(184.0f, 192.0f),
                    PathNode.CurveTo(184.0f, 196.41827f, 180.41827f, 200.0f, 176.0f, 200.0f),
                    PathNode.CurveTo(171.58173f, 200.0f, 168.0f, 196.41827f, 168.0f, 192.0f),
                    PathNode.LineTo(168.0f, 64.0f),
                    PathNode.CurveTo(168.0f, 59.581722f, 171.58173f, 56.0f, 176.0f, 56.0f),
                    PathNode.CurveTo(180.41827f, 56.0f, 184.0f, 59.581722f, 184.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 56.0f),
                    PathNode.CurveTo(219.58173f, 56.0f, 216.0f, 59.581722f, 216.0f, 64.0f),
                    PathNode.LineTo(216.0f, 192.0f),
                    PathNode.CurveTo(216.0f, 196.41827f, 219.58173f, 200.0f, 224.0f, 200.0f),
                    PathNode.CurveTo(228.41827f, 200.0f, 232.0f, 196.41827f, 232.0f, 192.0f),
                    PathNode.LineTo(232.0f, 64.0f),
                    PathNode.CurveTo(232.0f, 59.581722f, 228.41827f, 56.0f, 224.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 128.0f),
                    PathNode.CurveTo(144.00827f, 133.41003f, 141.24103f, 138.44618f, 136.67f, 141.34f),
                    PathNode.LineTo(48.48f, 197.49f),
                    PathNode.CurveTo(43.592247f, 200.61497f, 37.391014f, 200.8318f, 32.29693f, 198.05586f),
                    PathNode.CurveTo(27.202847f, 195.27992f, 24.023523f, 189.9513f, 24.0f, 184.15f),
                    PathNode.LineTo(24.0f, 71.85f),
                    PathNode.CurveTo(24.023523f, 66.048706f, 27.202847f, 60.720085f, 32.29693f, 57.94414f),
                    PathNode.CurveTo(37.391014f, 55.1682f, 43.592247f, 55.385033f, 48.48f, 58.51f),
                    PathNode.LineTo(136.67f, 114.66f),
                    PathNode.CurveTo(141.24103f, 117.55382f, 144.00827f, 122.589966f, 144.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(127.82f, 128.0f),
                    PathNode.LineTo(40.0f, 72.08f),
                    PathNode.LineTo(40.0f, 183.93f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _playPause!!
    }

private var _playPause: ImageVector? = null
