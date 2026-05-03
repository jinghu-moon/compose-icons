package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CheckSquareOffset: ImageVector
    get() {
        if (_checkSquareOffset != null) return _checkSquareOffset!!
        _checkSquareOffset = phosphorFillIcon(
            name = "CheckSquareOffset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 200.0f),
                    PathNode.CurveTo(77.87763f, 200.00166f, 75.841576f, 199.15993f, 74.34f, 197.66f),
                    PathNode.LineTo(58.34f, 181.66f),
                    PathNode.CurveTo(55.21407f, 178.53407f, 55.21407f, 173.46593f, 58.34f, 170.34f),
                    PathNode.CurveTo(61.46593f, 167.21407f, 66.534065f, 167.21407f, 69.66f, 170.34f),
                    PathNode.LineTo(80.0f, 180.69f),
                    PathNode.LineTo(114.34f, 146.34f),
                    PathNode.CurveTo(117.465935f, 143.21407f, 122.534065f, 143.21407f, 125.66f, 146.34f),
                    PathNode.CurveTo(128.78593f, 149.46593f, 128.78593f, 154.53407f, 125.66f, 157.66f),
                    PathNode.LineTo(85.66f, 197.66f),
                    PathNode.CurveTo(84.158424f, 199.15993f, 82.12237f, 200.00166f, 80.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 192.0f),
                    PathNode.CurveTo(200.0f, 196.41827f, 196.41827f, 200.0f, 192.0f, 200.0f),
                    PathNode.LineTo(136.0f, 200.0f),
                    PathNode.CurveTo(131.58173f, 200.0f, 128.0f, 196.41827f, 128.0f, 192.0f),
                    PathNode.CurveTo(128.0f, 187.58173f, 131.58173f, 184.0f, 136.0f, 184.0f),
                    PathNode.LineTo(184.0f, 184.0f),
                    PathNode.LineTo(184.0f, 72.0f),
                    PathNode.LineTo(72.0f, 72.0f),
                    PathNode.LineTo(72.0f, 136.0f),
                    PathNode.CurveTo(72.0f, 140.41827f, 68.41828f, 144.0f, 64.0f, 144.0f),
                    PathNode.CurveTo(59.581722f, 144.0f, 56.0f, 140.41827f, 56.0f, 136.0f),
                    PathNode.LineTo(56.0f, 64.0f),
                    PathNode.CurveTo(56.0f, 59.581722f, 59.581722f, 56.0f, 64.0f, 56.0f),
                    PathNode.LineTo(192.0f, 56.0f),
                    PathNode.CurveTo(196.41827f, 56.0f, 200.0f, 59.581722f, 200.0f, 64.0f),
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
        return _checkSquareOffset!!
    }

private var _checkSquareOffset: ImageVector? = null
