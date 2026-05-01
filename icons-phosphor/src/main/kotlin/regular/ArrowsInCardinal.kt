package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowsInCardinal: ImageVector
    get() {
        if (_arrowsInCardinal != null) return _arrowsInCardinal!!
        _arrowsInCardinal = phosphorRegularIcon(
            name = "ArrowsInCardinal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(90.34f, 69.66f),
                    PathNode.CurveTo(87.214066f, 66.534065f, 87.214066f, 61.46593f, 90.34f, 58.34f),
                    PathNode.CurveTo(93.465935f, 55.21407f, 98.534065f, 55.21407f, 101.66f, 58.34f),
                    PathNode.LineTo(120.0f, 76.69f),
                    PathNode.LineTo(120.0f, 24.0f),
                    PathNode.CurveTo(120.0f, 19.581722f, 123.58172f, 16.0f, 128.0f, 16.0f),
                    PathNode.CurveTo(132.41827f, 16.0f, 136.0f, 19.581722f, 136.0f, 24.0f),
                    PathNode.LineTo(136.0f, 76.69f),
                    PathNode.LineTo(154.34f, 58.34f),
                    PathNode.CurveTo(157.46593f, 55.21407f, 162.53407f, 55.21407f, 165.66f, 58.34f),
                    PathNode.CurveTo(168.78593f, 61.46593f, 168.78593f, 66.534065f, 165.66f, 69.66f),
                    PathNode.LineTo(133.66f, 101.66f),
                    PathNode.CurveTo(132.15945f, 103.16222f, 130.12328f, 104.006294f, 128.0f, 104.006294f),
                    PathNode.CurveTo(125.876724f, 104.006294f, 123.840546f, 103.16222f, 122.34f, 101.66f),
                    PathNode.Close,
                    PathNode.MoveTo(133.66f, 154.34f),
                    PathNode.CurveTo(132.15945f, 152.83777f, 130.12328f, 151.99371f, 128.0f, 151.99371f),
                    PathNode.CurveTo(125.876724f, 151.99371f, 123.840546f, 152.83777f, 122.34f, 154.34f),
                    PathNode.LineTo(90.34f, 186.34f),
                    PathNode.CurveTo(87.214066f, 189.46593f, 87.214066f, 194.53407f, 90.34f, 197.66f),
                    PathNode.CurveTo(93.465935f, 200.78593f, 98.534065f, 200.78593f, 101.66f, 197.66f),
                    PathNode.LineTo(120.0f, 179.31f),
                    PathNode.LineTo(120.0f, 232.0f),
                    PathNode.CurveTo(120.0f, 236.41827f, 123.58172f, 240.0f, 128.0f, 240.0f),
                    PathNode.CurveTo(132.41827f, 240.0f, 136.0f, 236.41827f, 136.0f, 232.0f),
                    PathNode.LineTo(136.0f, 179.31f),
                    PathNode.LineTo(154.34f, 197.66f),
                    PathNode.CurveTo(157.46593f, 200.78593f, 162.53407f, 200.78593f, 165.66f, 197.66f),
                    PathNode.CurveTo(168.78593f, 194.53407f, 168.78593f, 189.46593f, 165.66f, 186.34f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 120.0f),
                    PathNode.LineTo(179.31f, 120.0f),
                    PathNode.LineTo(197.66f, 101.66f),
                    PathNode.CurveTo(200.78593f, 98.534065f, 200.78593f, 93.465935f, 197.66f, 90.34f),
                    PathNode.CurveTo(194.53407f, 87.214066f, 189.46593f, 87.214066f, 186.34f, 90.34f),
                    PathNode.LineTo(154.34f, 122.34f),
                    PathNode.CurveTo(152.83777f, 123.840546f, 151.99371f, 125.876724f, 151.99371f, 128.0f),
                    PathNode.CurveTo(151.99371f, 130.12328f, 152.83777f, 132.15945f, 154.34f, 133.66f),
                    PathNode.LineTo(186.34f, 165.66f),
                    PathNode.CurveTo(189.46593f, 168.78593f, 194.53407f, 168.78593f, 197.66f, 165.66f),
                    PathNode.CurveTo(200.78593f, 162.53407f, 200.78593f, 157.46593f, 197.66f, 154.34f),
                    PathNode.LineTo(179.31f, 136.0f),
                    PathNode.LineTo(232.0f, 136.0f),
                    PathNode.CurveTo(236.41827f, 136.0f, 240.0f, 132.41827f, 240.0f, 128.0f),
                    PathNode.CurveTo(240.0f, 123.58172f, 236.41827f, 120.0f, 232.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(101.66f, 122.34f),
                    PathNode.LineTo(69.66f, 90.34f),
                    PathNode.CurveTo(66.534065f, 87.214066f, 61.46593f, 87.214066f, 58.34f, 90.34f),
                    PathNode.CurveTo(55.21407f, 93.465935f, 55.21407f, 98.534065f, 58.34f, 101.66f),
                    PathNode.LineTo(76.69f, 120.0f),
                    PathNode.LineTo(24.0f, 120.0f),
                    PathNode.CurveTo(19.581722f, 120.0f, 16.0f, 123.58172f, 16.0f, 128.0f),
                    PathNode.CurveTo(16.0f, 132.41827f, 19.581722f, 136.0f, 24.0f, 136.0f),
                    PathNode.LineTo(76.69f, 136.0f),
                    PathNode.LineTo(58.34f, 154.34f),
                    PathNode.CurveTo(55.21407f, 157.46593f, 55.21407f, 162.53407f, 58.34f, 165.66f),
                    PathNode.CurveTo(61.46593f, 168.78593f, 66.534065f, 168.78593f, 69.66f, 165.66f),
                    PathNode.LineTo(101.66f, 133.66f),
                    PathNode.CurveTo(103.16222f, 132.15945f, 104.006294f, 130.12328f, 104.006294f, 128.0f),
                    PathNode.CurveTo(104.006294f, 125.876724f, 103.16222f, 123.840546f, 101.66f, 122.34f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowsInCardinal!!
    }

private var _arrowsInCardinal: ImageVector? = null
