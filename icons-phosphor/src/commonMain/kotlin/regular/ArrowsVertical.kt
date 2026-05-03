package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowsVertical: ImageVector
    get() {
        if (_arrowsVertical != null) return _arrowsVertical!!
        _arrowsVertical = phosphorRegularIcon(
            name = "ArrowsVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(165.66f, 194.34f),
                    PathNode.CurveTo(167.16223f, 195.84055f, 168.00629f, 197.87672f, 168.00629f, 200.0f),
                    PathNode.CurveTo(168.00629f, 202.12328f, 167.16223f, 204.15945f, 165.66f, 205.66f),
                    PathNode.LineTo(133.66f, 237.66f),
                    PathNode.CurveTo(132.15945f, 239.16223f, 130.12328f, 240.00629f, 128.0f, 240.00629f),
                    PathNode.CurveTo(125.876724f, 240.00629f, 123.840546f, 239.16223f, 122.34f, 237.66f),
                    PathNode.LineTo(90.34f, 205.66f),
                    PathNode.CurveTo(87.214066f, 202.53407f, 87.214066f, 197.46593f, 90.34f, 194.34f),
                    PathNode.CurveTo(93.465935f, 191.21407f, 98.534065f, 191.21407f, 101.66f, 194.34f),
                    PathNode.LineTo(120.0f, 212.69f),
                    PathNode.LineTo(120.0f, 43.31f),
                    PathNode.LineTo(101.66f, 61.66f),
                    PathNode.CurveTo(98.534065f, 64.785934f, 93.465935f, 64.785934f, 90.34f, 61.66f),
                    PathNode.CurveTo(87.214066f, 58.53407f, 87.214066f, 53.46593f, 90.34f, 50.34f),
                    PathNode.LineTo(122.34f, 18.34f),
                    PathNode.CurveTo(123.840546f, 16.837784f, 125.876724f, 15.993707f, 128.0f, 15.993707f),
                    PathNode.CurveTo(130.12328f, 15.993707f, 132.15945f, 16.837784f, 133.66f, 18.34f),
                    PathNode.LineTo(165.66f, 50.34f),
                    PathNode.CurveTo(168.78593f, 53.46593f, 168.78593f, 58.53407f, 165.66f, 61.66f),
                    PathNode.CurveTo(162.53407f, 64.785934f, 157.46593f, 64.785934f, 154.34f, 61.66f),
                    PathNode.LineTo(136.0f, 43.31f),
                    PathNode.LineTo(136.0f, 212.69f),
                    PathNode.LineTo(154.34f, 194.34f),
                    PathNode.CurveTo(155.84055f, 192.83777f, 157.87672f, 191.99371f, 160.0f, 191.99371f),
                    PathNode.CurveTo(162.12328f, 191.99371f, 164.15945f, 192.83777f, 165.66f, 194.34f),
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
        return _arrowsVertical!!
    }

private var _arrowsVertical: ImageVector? = null
