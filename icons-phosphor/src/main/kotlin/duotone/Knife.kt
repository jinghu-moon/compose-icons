package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Knife: ImageVector
    get() {
        if (_knife != null) return _knife!!
        _knife = phosphorDuotoneIcon(
            name = "Knife",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 226.200 65.800 L 174.000 118.000 L 146.000 90.000 L 198.200 37.800 C 205.932 30.069 218.468 30.069 226.200 37.800 L 226.200 37.800 C 233.931 45.532 233.931 58.068 226.200 65.800 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 231.870 32.130 C 221.004 21.292 203.416 21.292 192.550 32.130 L 18.340 206.400 C 16.285 208.457 15.507 211.467 16.309 214.262 C 17.111 217.057 19.367 219.196 22.200 219.850 C 34.070 222.602 46.215 223.994 58.400 224.000 C 91.350 224.000 124.320 213.800 155.350 193.770 C 187.110 173.270 205.540 149.950 206.350 148.960 C 208.845 145.776 208.570 141.231 205.710 138.370 L 185.320 118.000 L 231.870 71.440 C 242.696 60.573 242.696 42.997 231.870 32.130 ZM 189.100 144.440 C 176.411 158.269 162.008 170.421 146.240 180.600 C 111.810 202.700 76.300 211.520 40.470 206.900 L 146.000 101.330 ZM 220.560 60.140 L 174.000 106.700 L 157.320 90.000 L 203.870 43.440 C 208.479 38.831 215.951 38.831 220.560 43.440 C 225.169 48.049 225.169 55.521 220.560 60.130 Z"),
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
        return _knife!!
    }

private var _knife: ImageVector? = null
