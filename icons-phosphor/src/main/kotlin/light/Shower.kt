package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Shower: ImageVector
    get() {
        if (_shower != null) return _shower!!
        _shower = phosphorLightIcon(
            name = "Shower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 62.000 236.000 C 62.000 241.523 57.523 246.000 52.000 246.000 C 46.477 246.000 42.000 241.523 42.000 236.000 C 42.000 230.477 46.477 226.000 52.000 226.000 C 57.523 226.000 62.000 230.477 62.000 236.000 ZM 84.000 194.000 C 78.477 194.000 74.000 198.477 74.000 204.000 C 74.000 209.523 78.477 214.000 84.000 214.000 C 89.523 214.000 94.000 209.523 94.000 204.000 C 94.000 198.477 89.523 194.000 84.000 194.000 ZM 20.000 194.000 C 14.477 194.000 10.000 198.477 10.000 204.000 C 10.000 209.523 14.477 214.000 20.000 214.000 C 25.523 214.000 30.000 209.523 30.000 204.000 C 30.000 198.477 25.523 194.000 20.000 194.000 ZM 52.000 162.000 C 46.477 162.000 42.000 166.477 42.000 172.000 C 42.000 177.523 46.477 182.000 52.000 182.000 C 57.523 182.000 62.000 177.523 62.000 172.000 C 62.000 166.477 57.523 162.000 52.000 162.000 ZM 254.000 40.000 C 254.000 43.314 251.314 46.000 248.000 46.000 L 218.490 46.000 L 189.590 74.890 L 167.830 202.320 C 166.960 207.488 163.275 211.738 158.282 213.332 C 153.289 214.926 147.824 213.598 144.120 209.890 L 46.120 111.890 C 42.411 108.182 41.086 102.711 42.687 97.717 C 44.288 92.722 48.546 89.041 53.720 88.180 L 181.120 66.420 L 211.770 35.770 C 212.890 34.643 214.411 34.007 216.000 34.000 L 248.000 34.000 C 251.314 34.000 254.000 36.686 254.000 40.000 ZM 176.660 79.340 L 55.700 100.000 C 54.956 100.115 54.339 100.638 54.104 101.354 C 53.870 102.070 54.058 102.857 54.590 103.390 L 152.590 201.390 C 153.120 201.922 153.904 202.112 154.618 201.882 C 155.333 201.652 155.859 201.041 155.980 200.300 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _shower!!
    }

private var _shower: ImageVector? = null
