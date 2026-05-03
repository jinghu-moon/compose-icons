package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Sailboat: ImageVector
    get() {
        if (_sailboat != null) return _sailboat!!
        _sailboat = phosphorThinIcon(
            name = "Sailboat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 243.610 174.270 C 242.944 172.882 241.540 171.999 240.000 172.000 L 140.000 172.000 L 140.000 140.000 L 216.000 140.000 C 217.590 140.016 219.039 139.088 219.690 137.637 C 220.340 136.186 220.070 134.487 219.000 133.310 L 140.000 46.450 L 140.000 8.000 C 139.997 6.310 138.931 4.804 137.338 4.238 C 135.745 3.673 133.968 4.170 132.900 5.480 L 28.900 133.480 C 27.929 134.677 27.732 136.326 28.394 137.718 C 29.056 139.110 30.459 139.998 32.000 140.000 L 132.000 140.000 L 132.000 172.000 L 16.000 172.000 C 14.463 172.001 13.062 172.883 12.396 174.269 C 11.731 175.655 11.919 177.300 12.880 178.500 L 42.470 215.500 C 44.748 218.345 48.195 220.001 51.840 220.000 L 204.160 220.000 C 207.805 220.001 211.252 218.345 213.530 215.500 L 243.120 178.500 C 244.083 177.301 244.273 175.657 243.610 174.270 ZM 207.000 132.000 L 140.000 132.000 L 140.000 58.350 ZM 40.400 132.000 L 132.000 19.270 L 132.000 132.000 ZM 207.280 210.500 C 206.521 211.447 205.374 211.999 204.160 212.000 L 51.840 212.000 C 50.626 211.999 49.479 211.447 48.720 210.500 L 24.320 180.000 L 231.680 180.000 Z"),
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
        return _sailboat!!
    }

private var _sailboat: ImageVector? = null
