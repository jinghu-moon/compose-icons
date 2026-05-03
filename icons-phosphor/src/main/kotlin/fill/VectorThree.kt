package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.VectorThree: ImageVector
    get() {
        if (_vectorThree != null) return _vectorThree!!
        _vectorThree = phosphorFillIcon(
            name = "VectorThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 237.660 141.660 L 205.660 173.660 C 203.372 175.951 199.929 176.636 196.938 175.397 C 193.947 174.158 191.997 171.238 192.000 168.000 L 192.000 144.000 L 123.310 144.000 L 83.310 184.000 L 101.660 202.340 C 103.951 204.628 104.636 208.071 103.397 211.062 C 102.158 214.053 99.238 216.003 96.000 216.000 L 48.000 216.000 C 43.582 216.000 40.000 212.418 40.000 208.000 L 40.000 160.000 C 39.997 156.762 41.947 153.842 44.938 152.603 C 47.929 151.364 51.372 152.049 53.660 154.340 L 72.000 172.690 L 112.000 132.690 L 112.000 64.000 L 88.000 64.000 C 84.762 64.003 81.842 62.053 80.603 59.062 C 79.364 56.071 80.049 52.628 82.340 50.340 L 114.340 18.340 C 115.841 16.838 117.877 15.994 120.000 15.994 C 122.123 15.994 124.159 16.838 125.660 18.340 L 157.660 50.340 C 159.951 52.628 160.636 56.071 159.397 59.062 C 158.158 62.053 155.238 64.003 152.000 64.000 L 128.000 64.000 L 128.000 128.000 L 192.000 128.000 L 192.000 104.000 C 191.997 100.762 193.947 97.842 196.938 96.603 C 199.929 95.364 203.372 96.049 205.660 98.340 L 237.660 130.340 C 239.162 131.841 240.006 133.877 240.006 136.000 C 240.006 138.123 239.162 140.159 237.660 141.660 Z"),
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
        return _vectorThree!!
    }

private var _vectorThree: ImageVector? = null
