package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UserCheck: ImageVector
    get() {
        if (_userCheck != null) return _userCheck!!
        _userCheck = phosphorFillIcon(
            name = "UserCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 253.660 133.660 L 221.660 165.660 C 220.159 167.162 218.123 168.006 216.000 168.006 C 213.877 168.006 211.841 167.162 210.340 165.660 L 194.340 149.660 C 191.214 146.534 191.214 141.466 194.340 138.340 C 197.466 135.214 202.534 135.214 205.660 138.340 L 216.000 148.690 L 242.340 122.340 C 245.466 119.214 250.534 119.214 253.660 122.340 C 256.786 125.466 256.786 130.534 253.660 133.660 ZM 144.000 157.680 C 169.766 141.632 181.775 110.450 173.430 81.265 C 165.084 52.079 138.405 31.960 108.050 31.960 C 77.695 31.960 51.016 52.079 42.670 81.265 C 34.325 110.450 46.334 141.632 72.100 157.680 C 51.450 164.440 32.870 177.070 17.930 194.850 C 15.933 197.223 15.488 200.537 16.788 203.353 C 18.088 206.169 20.899 207.980 24.000 208.000 L 192.000 208.000 C 195.112 208.003 197.944 206.201 199.259 203.380 C 200.574 200.559 200.134 197.232 198.130 194.850 C 183.180 177.070 164.600 164.440 144.000 157.680 Z"),
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
        return _userCheck!!
    }

private var _userCheck: ImageVector? = null
