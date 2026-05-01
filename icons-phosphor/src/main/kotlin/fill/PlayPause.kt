package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PlayPause: ImageVector
    get() {
        if (_playPause != null) return _playPause!!
        _playPause = phosphorFillIcon(
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
                    PathNode.MoveTo(136.67f, 114.66f),
                    PathNode.LineTo(48.48f, 58.51f),
                    PathNode.CurveTo(43.592247f, 55.385033f, 37.391014f, 55.1682f, 32.29693f, 57.94414f),
                    PathNode.CurveTo(27.202847f, 60.720085f, 24.023523f, 66.048706f, 24.0f, 71.85f),
                    PathNode.LineTo(24.0f, 184.15f),
                    PathNode.CurveTo(24.013239f, 189.92181f, 27.166866f, 195.22896f, 32.23f, 198.0f),
                    PathNode.CurveTo(37.33691f, 200.80455f, 43.566692f, 200.60136f, 48.48f, 197.47f),
                    PathNode.LineTo(136.67f, 141.32f),
                    PathNode.CurveTo(141.23663f, 138.42165f, 144.00334f, 133.38875f, 144.00334f, 127.98f),
                    PathNode.CurveTo(144.00334f, 122.57125f, 141.23663f, 117.53836f, 136.67f, 114.64f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _playPause!!
    }

private var _playPause: ImageVector? = null
