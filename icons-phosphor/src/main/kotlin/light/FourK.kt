package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FourK: ImageVector
    get() {
        if (_fourK != null) return _fourK!!
        _fourK = phosphorLightIcon(
            name = "FourK",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 26.000 48.000 C 26.000 44.686 28.686 42.000 32.000 42.000 L 224.000 42.000 C 227.314 42.000 230.000 44.686 230.000 48.000 C 230.000 51.314 227.314 54.000 224.000 54.000 L 32.000 54.000 C 28.686 54.000 26.000 51.314 26.000 48.000 ZM 224.000 202.000 L 32.000 202.000 C 28.686 202.000 26.000 204.686 26.000 208.000 C 26.000 211.314 28.686 214.000 32.000 214.000 L 224.000 214.000 C 227.314 214.000 230.000 211.314 230.000 208.000 C 230.000 204.686 227.314 202.000 224.000 202.000 ZM 144.000 74.000 C 140.686 74.000 138.000 76.686 138.000 80.000 L 138.000 176.000 C 138.000 179.314 140.686 182.000 144.000 182.000 C 147.314 182.000 150.000 179.314 150.000 176.000 L 150.000 146.250 L 165.420 128.630 L 194.820 179.000 C 195.891 180.855 197.869 181.998 200.010 182.000 C 201.065 181.999 202.101 181.716 203.010 181.180 C 205.869 179.511 206.836 175.841 205.170 172.980 L 173.760 119.100 L 204.520 84.000 C 206.451 81.493 206.103 77.917 203.725 75.829 C 201.346 73.742 197.756 73.860 195.520 76.100 L 150.000 128.000 L 150.000 80.000 C 150.000 76.686 147.314 74.000 144.000 74.000 ZM 90.000 176.000 L 90.000 158.000 L 40.000 158.000 C 37.709 158.000 35.618 156.696 34.610 154.639 C 33.603 152.581 33.855 150.129 35.260 148.320 L 91.260 76.320 C 92.832 74.294 95.519 73.491 97.945 74.323 C 100.371 75.154 102.001 77.435 102.000 80.000 L 102.000 146.000 L 112.000 146.000 C 115.314 146.000 118.000 148.686 118.000 152.000 C 118.000 155.314 115.314 158.000 112.000 158.000 L 102.000 158.000 L 102.000 176.000 C 102.000 179.314 99.314 182.000 96.000 182.000 C 92.686 182.000 90.000 179.314 90.000 176.000 ZM 90.000 146.000 L 90.000 97.490 L 52.270 146.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _fourK!!
    }

private var _fourK: ImageVector? = null
