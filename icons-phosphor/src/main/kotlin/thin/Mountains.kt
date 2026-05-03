package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Mountains: ImageVector
    get() {
        if (_mountains != null) return _mountains!!
        _mountains = phosphorThinIcon(
            name = "Mountains",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 164.000 76.000 C 177.255 76.000 188.000 65.255 188.000 52.000 C 188.000 38.745 177.255 28.000 164.000 28.000 C 150.745 28.000 140.000 38.745 140.000 52.000 C 140.000 65.255 150.745 76.000 164.000 76.000 ZM 164.000 36.000 C 172.837 36.000 180.000 43.163 180.000 52.000 C 180.000 60.837 172.837 68.000 164.000 68.000 C 155.163 68.000 148.000 60.837 148.000 52.000 C 148.000 43.163 155.163 36.000 164.000 36.000 ZM 251.440 198.000 L 196.880 105.920 C 194.741 102.244 190.803 99.987 186.550 100.000 L 186.550 100.000 C 182.307 99.978 178.375 102.219 176.230 105.880 L 146.620 155.880 L 98.340 73.910 C 96.183 70.248 92.250 68.000 88.000 68.000 C 83.750 68.000 79.817 70.248 77.660 73.910 L 4.550 198.000 C 3.837 199.235 3.835 200.757 4.546 201.994 C 5.258 203.231 6.573 203.995 8.000 204.000 L 248.000 204.000 C 249.425 203.991 250.737 203.226 251.446 201.990 C 252.155 200.754 252.152 199.234 251.440 198.000 ZM 84.550 78.000 C 85.268 76.776 86.581 76.024 88.000 76.024 C 89.419 76.024 90.732 76.776 91.450 78.000 L 118.570 124.000 L 57.430 124.000 ZM 15.000 196.000 L 52.710 132.000 L 123.290 132.000 L 161.000 196.000 ZM 170.290 196.000 L 151.290 163.710 L 183.110 110.000 C 183.831 108.786 185.138 108.041 186.550 108.041 C 187.962 108.041 189.269 108.786 189.990 110.000 L 240.990 196.000 Z"),
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
        return _mountains!!
    }

private var _mountains: ImageVector? = null
