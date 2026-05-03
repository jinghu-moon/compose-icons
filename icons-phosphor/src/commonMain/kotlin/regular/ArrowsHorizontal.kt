package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowsHorizontal: ImageVector
    get() {
        if (_arrowsHorizontal != null) return _arrowsHorizontal!!
        _arrowsHorizontal = phosphorRegularIcon(
            name = "ArrowsHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(237.66f, 133.66f),
                    PathNode.LineTo(205.66f, 165.66f),
                    PathNode.CurveTo(202.53407f, 168.78593f, 197.46593f, 168.78593f, 194.34f, 165.66f),
                    PathNode.CurveTo(191.21407f, 162.53407f, 191.21407f, 157.46593f, 194.34f, 154.34f),
                    PathNode.LineTo(212.69f, 136.0f),
                    PathNode.LineTo(43.31f, 136.0f),
                    PathNode.LineTo(61.66f, 154.34f),
                    PathNode.CurveTo(64.785934f, 157.46593f, 64.785934f, 162.53407f, 61.66f, 165.66f),
                    PathNode.CurveTo(58.53407f, 168.78593f, 53.46593f, 168.78593f, 50.34f, 165.66f),
                    PathNode.LineTo(18.34f, 133.66f),
                    PathNode.CurveTo(16.837784f, 132.15945f, 15.993707f, 130.12328f, 15.993707f, 128.0f),
                    PathNode.CurveTo(15.993707f, 125.876724f, 16.837784f, 123.840546f, 18.34f, 122.34f),
                    PathNode.LineTo(50.34f, 90.34f),
                    PathNode.CurveTo(53.46593f, 87.214066f, 58.53407f, 87.214066f, 61.66f, 90.34f),
                    PathNode.CurveTo(64.785934f, 93.465935f, 64.785934f, 98.534065f, 61.66f, 101.66f),
                    PathNode.LineTo(43.31f, 120.0f),
                    PathNode.LineTo(212.69f, 120.0f),
                    PathNode.LineTo(194.34f, 101.66f),
                    PathNode.CurveTo(191.21407f, 98.534065f, 191.21407f, 93.465935f, 194.34f, 90.34f),
                    PathNode.CurveTo(197.46593f, 87.214066f, 202.53407f, 87.214066f, 205.66f, 90.34f),
                    PathNode.LineTo(237.66f, 122.34f),
                    PathNode.CurveTo(239.16223f, 123.840546f, 240.00629f, 125.876724f, 240.00629f, 128.0f),
                    PathNode.CurveTo(240.00629f, 130.12328f, 239.16223f, 132.15945f, 237.66f, 133.66f),
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
        return _arrowsHorizontal!!
    }

private var _arrowsHorizontal: ImageVector? = null
