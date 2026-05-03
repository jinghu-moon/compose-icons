package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SkipForward: ImageVector
    get() {
        if (_skipForward != null) return _skipForward!!
        _skipForward = phosphorFillIcon(
            name = "SkipForward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 40.0f),
                    PathNode.LineTo(208.0f, 216.0f),
                    PathNode.CurveTo(208.0f, 220.41827f, 204.41827f, 224.0f, 200.0f, 224.0f),
                    PathNode.CurveTo(195.58173f, 224.0f, 192.0f, 220.41827f, 192.0f, 216.0f),
                    PathNode.LineTo(192.0f, 146.77f),
                    PathNode.LineTo(72.43f, 221.55f),
                    PathNode.CurveTo(67.526375f, 224.62827f, 61.339703f, 224.80753f, 56.266056f, 222.01837f),
                    PathNode.CurveTo(51.19241f, 219.22922f, 48.028618f, 213.90968f, 48.0f, 208.12f),
                    PathNode.LineTo(48.0f, 47.88f),
                    PathNode.CurveTo(48.028618f, 42.090317f, 51.19241f, 36.770782f, 56.266056f, 33.98163f),
                    PathNode.CurveTo(61.339703f, 31.192472f, 67.526375f, 31.37174f, 72.43f, 34.45f),
                    PathNode.LineTo(192.0f, 109.23f),
                    PathNode.LineTo(192.0f, 40.0f),
                    PathNode.CurveTo(192.0f, 35.581722f, 195.58173f, 32.0f, 200.0f, 32.0f),
                    PathNode.CurveTo(204.41827f, 32.0f, 208.0f, 35.581722f, 208.0f, 40.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _skipForward!!
    }

private var _skipForward: ImageVector? = null
