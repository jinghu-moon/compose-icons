package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CompassRose: ImageVector
    get() {
        if (_compassRose != null) return _compassRose!!
        _compassRose = phosphorThinIcon(
            name = "CompassRose",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 249.000 124.120 L 219.320 116.700 C 214.194 74.824 181.196 41.826 139.320 36.700 L 131.880 7.000 C 131.434 5.220 129.835 3.972 128.000 3.972 C 126.165 3.972 124.566 5.220 124.120 7.000 L 116.700 36.710 C 74.824 41.836 41.826 74.834 36.700 116.710 L 7.000 124.120 C 5.220 124.566 3.972 126.165 3.972 128.000 C 3.972 129.835 5.220 131.434 7.000 131.880 L 36.680 139.300 C 41.806 181.176 74.804 214.174 116.680 219.300 L 124.120 249.000 C 124.566 250.780 126.165 252.028 128.000 252.028 C 129.835 252.028 131.434 250.780 131.880 249.000 L 139.300 219.320 C 181.176 214.194 214.174 181.196 219.300 139.320 L 249.000 131.880 C 250.780 131.434 252.028 129.835 252.028 128.000 C 252.028 126.165 250.780 124.566 249.000 124.120 ZM 210.950 114.610 L 155.300 100.700 L 141.390 45.080 C 177.150 50.809 205.191 78.850 210.920 114.610 ZM 128.000 24.490 L 147.570 102.770 L 128.000 122.340 L 108.430 102.770 ZM 114.610 45.080 L 100.700 100.700 L 45.080 114.610 C 50.809 78.850 78.850 50.809 114.610 45.080 ZM 102.770 108.430 L 122.340 128.000 L 102.770 147.570 L 24.490 128.000 ZM 45.080 141.430 L 100.700 155.300 L 114.610 210.920 C 78.850 205.191 50.809 177.150 45.080 141.390 ZM 128.000 231.510 L 108.430 153.230 L 128.000 133.660 L 147.570 153.230 ZM 141.390 210.920 L 155.300 155.300 L 210.920 141.390 C 205.191 177.150 177.150 205.191 141.390 210.920 ZM 153.230 147.570 L 133.660 128.000 L 153.230 108.430 L 231.510 128.000 Z"),
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
        return _compassRose!!
    }

private var _compassRose: ImageVector? = null
