package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FlowArrow: ImageVector
    get() {
        if (_flowArrow != null) return _flowArrow!!
        _flowArrow = phosphorFillIcon(
            name = "FlowArrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(245.66f, 85.66f),
                    PathNode.LineTo(213.66f, 117.66f),
                    PathNode.CurveTo(210.53407f, 120.785934f, 205.46593f, 120.785934f, 202.34f, 117.66f),
                    PathNode.CurveTo(199.21407f, 114.534065f, 199.21407f, 109.465935f, 202.34f, 106.34f),
                    PathNode.LineTo(220.69f, 88.0f),
                    PathNode.LineTo(208.0f, 88.0f),
                    PathNode.CurveTo(169.33f, 88.0f, 161.41f, 107.0f, 151.38f, 131.08f),
                    PathNode.CurveTo(141.05f, 155.88f, 129.33f, 184.0f, 80.0f, 184.0f),
                    PathNode.LineTo(79.0f, 184.0f),
                    PathNode.CurveTo(74.971466f, 199.60245f, 59.969707f, 209.7754f, 43.983997f, 207.74495f),
                    PathNode.CurveTo(27.998285f, 205.7145f, 16.016132f, 192.11415f, 16.016132f, 176.0f),
                    PathNode.CurveTo(16.016132f, 159.88585f, 27.998285f, 146.2855f, 43.983997f, 144.25505f),
                    PathNode.CurveTo(59.969707f, 142.2246f, 74.971466f, 152.39755f, 79.0f, 168.0f),
                    PathNode.LineTo(80.0f, 168.0f),
                    PathNode.CurveTo(118.67f, 168.0f, 126.59f, 149.0f, 136.62f, 124.92f),
                    PathNode.CurveTo(147.0f, 100.12f, 158.67f, 72.0f, 208.0f, 72.0f),
                    PathNode.LineTo(220.69f, 72.0f),
                    PathNode.LineTo(202.34f, 53.66f),
                    PathNode.CurveTo(199.21407f, 50.53407f, 199.21407f, 45.46593f, 202.34f, 42.34f),
                    PathNode.CurveTo(205.46593f, 39.21407f, 210.53407f, 39.21407f, 213.66f, 42.34f),
                    PathNode.LineTo(245.66f, 74.34f),
                    PathNode.CurveTo(247.16223f, 75.840546f, 248.00629f, 77.876724f, 248.00629f, 80.0f),
                    PathNode.CurveTo(248.00629f, 82.123276f, 247.16223f, 84.159454f, 245.66f, 85.66f),
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
        return _flowArrow!!
    }

private var _flowArrow: ImageVector? = null
