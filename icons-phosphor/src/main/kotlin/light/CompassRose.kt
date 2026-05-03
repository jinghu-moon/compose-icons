package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CompassRose: ImageVector
    get() {
        if (_compassRose != null) return _compassRose!!
        _compassRose = phosphorLightIcon(
            name = "CompassRose",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 249.460 122.180 L 221.120 115.090 C 215.387 73.392 182.599 40.608 140.900 34.880 L 133.820 6.540 C 133.151 3.871 130.752 1.999 128.000 1.999 C 125.248 1.999 122.849 3.871 122.180 6.540 L 115.100 34.880 C 73.401 40.608 40.613 73.392 34.880 115.090 L 6.540 122.180 C 3.871 122.849 1.999 125.248 1.999 128.000 C 1.999 130.752 3.871 133.151 6.540 133.820 L 34.880 140.910 C 40.613 182.608 73.401 215.392 115.100 221.120 L 122.180 249.460 C 122.849 252.129 125.248 254.001 128.000 254.001 C 130.752 254.001 133.151 252.129 133.820 249.460 L 140.900 221.120 C 182.599 215.392 215.387 182.608 221.120 140.910 L 249.460 133.820 C 252.129 133.151 254.001 130.752 254.001 128.000 C 254.001 125.248 252.129 122.849 249.460 122.180 ZM 208.410 111.920 L 157.000 99.050 L 144.080 47.590 C 176.561 54.049 201.951 79.439 208.410 111.920 ZM 145.410 102.160 L 128.000 119.510 L 110.640 102.160 L 128.000 32.740 ZM 111.920 47.590 L 99.050 99.050 L 47.590 111.920 C 54.049 79.439 79.439 54.049 111.920 47.590 ZM 102.160 110.650 L 119.520 128.000 L 102.160 145.350 L 32.740 128.000 ZM 47.590 144.080 L 99.050 157.000 L 111.920 208.460 C 79.425 201.994 54.031 176.580 47.590 144.080 ZM 110.640 153.840 L 128.000 136.490 L 145.360 153.840 L 128.000 223.260 ZM 144.080 208.410 L 157.000 157.000 L 208.460 144.130 C 201.976 176.606 176.566 201.976 144.080 208.410 ZM 153.840 145.350 L 136.480 128.000 L 153.840 110.650 L 223.260 128.000 Z"),
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
        return _compassRose!!
    }

private var _compassRose: ImageVector? = null
