package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.UserCheck: ImageVector
    get() {
        if (_userCheck != null) return _userCheck!!
        _userCheck = phosphorDuotoneIcon(
            name = "UserCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 168.000 100.000 C 168.000 133.137 141.137 160.000 108.000 160.000 C 74.863 160.000 48.000 133.137 48.000 100.000 C 48.000 66.863 74.863 40.000 108.000 40.000 C 141.137 40.000 168.000 66.863 168.000 100.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 144.000 157.680 C 169.766 141.632 181.775 110.450 173.430 81.265 C 165.084 52.079 138.405 31.960 108.050 31.960 C 77.695 31.960 51.016 52.079 42.670 81.265 C 34.325 110.450 46.334 141.632 72.100 157.680 C 51.450 164.440 32.870 177.070 17.930 194.850 C 15.086 198.233 15.522 203.281 18.905 206.125 C 22.288 208.969 27.336 208.533 30.180 205.150 C 50.250 181.190 77.910 168.000 108.000 168.000 C 138.090 168.000 165.750 181.190 185.870 205.150 C 188.714 208.533 193.762 208.969 197.145 206.125 C 200.528 203.281 200.964 198.233 198.120 194.850 C 183.180 177.070 164.600 164.440 144.000 157.680 ZM 56.000 100.000 C 56.000 71.281 79.281 48.000 108.000 48.000 C 136.719 48.000 160.000 71.281 160.000 100.000 C 160.000 128.719 136.719 152.000 108.000 152.000 C 79.295 151.967 56.033 128.705 56.000 100.000 ZM 253.660 133.660 L 221.660 165.660 C 220.159 167.162 218.123 168.006 216.000 168.006 C 213.877 168.006 211.841 167.162 210.340 165.660 L 194.340 149.660 C 191.214 146.534 191.214 141.466 194.340 138.340 C 197.466 135.214 202.534 135.214 205.660 138.340 L 216.000 148.690 L 242.340 122.340 C 245.466 119.214 250.534 119.214 253.660 122.340 C 256.786 125.466 256.786 130.534 253.660 133.660 Z"),
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
