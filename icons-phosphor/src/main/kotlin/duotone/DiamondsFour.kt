package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.DiamondsFour: ImageVector
    get() {
        if (_diamondsFour != null) return _diamondsFour!!
        _diamondsFour = phosphorDuotoneIcon(
            name = "DiamondsFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 104.0f),
                    PathNode.LineTo(88.0f, 64.0f),
                    PathNode.LineTo(128.0f, 24.0f),
                    PathNode.LineTo(168.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 192.0f),
                    PathNode.LineTo(128.0f, 232.0f),
                    PathNode.LineTo(168.0f, 192.0f),
                    PathNode.LineTo(128.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 88.0f),
                    PathNode.LineTo(152.0f, 128.0f),
                    PathNode.LineTo(192.0f, 168.0f),
                    PathNode.LineTo(232.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 88.0f),
                    PathNode.LineTo(24.0f, 128.0f),
                    PathNode.LineTo(64.0f, 168.0f),
                    PathNode.LineTo(104.0f, 128.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(122.34f, 109.66f),
                    PathNode.CurveTo(123.840546f, 111.16222f, 125.876724f, 112.006294f, 128.0f, 112.006294f),
                    PathNode.CurveTo(130.12328f, 112.006294f, 132.15945f, 111.16222f, 133.66f, 109.66f),
                    PathNode.LineTo(173.66f, 69.66f),
                    PathNode.CurveTo(175.16223f, 68.159454f, 176.00629f, 66.123276f, 176.00629f, 64.0f),
                    PathNode.CurveTo(176.00629f, 61.876724f, 175.16223f, 59.840546f, 173.66f, 58.34f),
                    PathNode.LineTo(133.66f, 18.34f),
                    PathNode.CurveTo(132.15945f, 16.837784f, 130.12328f, 15.993707f, 128.0f, 15.993707f),
                    PathNode.CurveTo(125.876724f, 15.993707f, 123.840546f, 16.837784f, 122.34f, 18.34f),
                    PathNode.LineTo(82.34f, 58.34f),
                    PathNode.CurveTo(80.83778f, 59.840546f, 79.993706f, 61.876724f, 79.993706f, 64.0f),
                    PathNode.CurveTo(79.993706f, 66.123276f, 80.83778f, 68.159454f, 82.34f, 69.66f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 35.31f),
                    PathNode.LineTo(156.69f, 64.0f),
                    PathNode.LineTo(128.0f, 92.69f),
                    PathNode.LineTo(99.31f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(133.66f, 146.31f),
                    PathNode.CurveTo(132.15945f, 144.80779f, 130.12328f, 143.9637f, 128.0f, 143.9637f),
                    PathNode.CurveTo(125.876724f, 143.9637f, 123.840546f, 144.80779f, 122.34f, 146.31f),
                    PathNode.LineTo(82.34f, 186.31f),
                    PathNode.CurveTo(80.83778f, 187.81055f, 79.993706f, 189.84673f, 79.993706f, 191.97f),
                    PathNode.CurveTo(79.993706f, 194.09328f, 80.83778f, 196.12946f, 82.34f, 197.63f),
                    PathNode.LineTo(122.34f, 237.63f),
                    PathNode.CurveTo(123.840546f, 239.13222f, 125.876724f, 239.97629f, 128.0f, 239.97629f),
                    PathNode.CurveTo(130.12328f, 239.97629f, 132.15945f, 239.13222f, 133.66f, 237.63f),
                    PathNode.LineTo(173.66f, 197.63f),
                    PathNode.CurveTo(175.16223f, 196.12946f, 176.00629f, 194.09328f, 176.00629f, 191.97f),
                    PathNode.CurveTo(176.00629f, 189.84673f, 175.16223f, 187.81055f, 173.66f, 186.31f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.69f),
                    PathNode.LineTo(99.31f, 192.0f),
                    PathNode.LineTo(128.0f, 163.31f),
                    PathNode.LineTo(156.69f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(237.66f, 122.34f),
                    PathNode.LineTo(197.66f, 82.34f),
                    PathNode.CurveTo(196.15945f, 80.83778f, 194.12328f, 79.993706f, 192.0f, 79.993706f),
                    PathNode.CurveTo(189.87672f, 79.993706f, 187.84055f, 80.83778f, 186.34f, 82.34f),
                    PathNode.LineTo(146.34f, 122.34f),
                    PathNode.CurveTo(144.83777f, 123.840546f, 143.99371f, 125.876724f, 143.99371f, 128.0f),
                    PathNode.CurveTo(143.99371f, 130.12328f, 144.83777f, 132.15945f, 146.34f, 133.66f),
                    PathNode.LineTo(186.34f, 173.66f),
                    PathNode.CurveTo(187.84055f, 175.16223f, 189.87672f, 176.00629f, 192.0f, 176.00629f),
                    PathNode.CurveTo(194.12328f, 176.00629f, 196.15945f, 175.16223f, 197.66f, 173.66f),
                    PathNode.LineTo(237.66f, 133.66f),
                    PathNode.CurveTo(239.16223f, 132.15945f, 240.00629f, 130.12328f, 240.00629f, 128.0f),
                    PathNode.CurveTo(240.00629f, 125.876724f, 239.16223f, 123.840546f, 237.66f, 122.34f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 156.69f),
                    PathNode.LineTo(163.31f, 128.0f),
                    PathNode.LineTo(192.0f, 99.31f),
                    PathNode.LineTo(220.69f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(109.66f, 122.34f),
                    PathNode.LineTo(69.66f, 82.34f),
                    PathNode.CurveTo(68.159454f, 80.83778f, 66.123276f, 79.993706f, 64.0f, 79.993706f),
                    PathNode.CurveTo(61.876724f, 79.993706f, 59.840546f, 80.83778f, 58.34f, 82.34f),
                    PathNode.LineTo(18.34f, 122.34f),
                    PathNode.CurveTo(16.837784f, 123.840546f, 15.993707f, 125.876724f, 15.993707f, 128.0f),
                    PathNode.CurveTo(15.993707f, 130.12328f, 16.837784f, 132.15945f, 18.34f, 133.66f),
                    PathNode.LineTo(58.34f, 173.66f),
                    PathNode.CurveTo(59.840546f, 175.16223f, 61.876724f, 176.00629f, 64.0f, 176.00629f),
                    PathNode.CurveTo(66.123276f, 176.00629f, 68.159454f, 175.16223f, 69.66f, 173.66f),
                    PathNode.LineTo(109.66f, 133.66f),
                    PathNode.CurveTo(111.16222f, 132.15945f, 112.006294f, 130.12328f, 112.006294f, 128.0f),
                    PathNode.CurveTo(112.006294f, 125.876724f, 111.16222f, 123.840546f, 109.66f, 122.34f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 156.69f),
                    PathNode.LineTo(35.31f, 128.0f),
                    PathNode.LineTo(64.0f, 99.31f),
                    PathNode.LineTo(92.69f, 128.0f),
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
        return _diamondsFour!!
    }

private var _diamondsFour: ImageVector? = null
