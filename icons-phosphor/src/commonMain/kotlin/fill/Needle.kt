package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Needle: ImageVector
    get() {
        if (_needle != null) return _needle!!
        _needle = phosphorFillIcon(
            name = "Needle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.28f, 43.72f),
                    PathNode.CurveTo(196.66f, 28.104721f, 171.34f, 28.104721f, 155.72f, 43.72f),
                    PathNode.LineTo(131.72f, 67.72f),
                    PathNode.CurveTo(130.55017f, 68.88845f, 129.77112f, 70.39066f, 129.49f, 72.02f),
                    PathNode.CurveTo(120.69f, 123.28f, 36.0f, 208.73f, 34.36f, 210.33f),
                    PathNode.LineTo(34.36f, 210.33f),
                    PathNode.CurveTo(31.234068f, 213.45317f, 31.23183f, 218.51907f, 34.355f, 221.645f),
                    PathNode.CurveTo(37.47817f, 224.77094f, 42.544067f, 224.77316f, 45.67f, 221.65f),
                    PathNode.LineTo(45.67f, 221.65f),
                    PathNode.CurveTo(46.53f, 220.78f, 132.5f, 135.34f, 183.99f, 126.5f),
                    PathNode.CurveTo(185.61934f, 126.21888f, 187.12155f, 125.43983f, 188.29f, 124.27f),
                    PathNode.LineTo(212.29f, 100.27f),
                    PathNode.CurveTo(227.90527f, 84.65001f, 227.90527f, 59.329994f, 212.29f, 43.71f),
                    PathNode.Close,
                    PathNode.MoveTo(189.66f, 77.66f),
                    PathNode.LineTo(173.66f, 93.66f),
                    PathNode.CurveTo(170.53407f, 96.785934f, 165.46593f, 96.785934f, 162.34f, 93.66f),
                    PathNode.CurveTo(159.21407f, 90.534065f, 159.21407f, 85.465935f, 162.34f, 82.34f),
                    PathNode.LineTo(178.34f, 66.34f),
                    PathNode.CurveTo(181.46593f, 63.21407f, 186.53407f, 63.21407f, 189.66f, 66.34f),
                    PathNode.CurveTo(192.78593f, 69.465935f, 192.78593f, 74.534065f, 189.66f, 77.66f),
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
        return _needle!!
    }

private var _needle: ImageVector? = null
