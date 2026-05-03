package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Intersect: ImageVector
    get() {
        if (_intersect != null) return _intersect!!
        _intersect = phosphorLightIcon(
            name = "Intersect",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 172.910 83.090 C 166.341 43.893 131.350 15.904 91.668 18.102 C 51.985 20.301 20.301 51.985 18.102 91.668 C 15.904 131.350 43.893 166.341 83.090 172.910 C 89.659 212.107 124.650 240.096 164.332 237.898 C 204.015 235.699 235.699 204.015 237.898 164.332 C 240.096 124.650 212.107 89.659 172.910 83.090 ZM 30.000 96.000 C 30.019 62.289 55.440 34.010 88.959 30.414 C 122.478 26.817 153.320 49.060 160.490 82.000 L 160.000 82.000 C 116.942 82.050 82.050 116.942 82.000 160.000 C 82.000 160.170 82.000 160.330 82.000 160.490 C 51.675 153.869 30.042 127.039 30.000 96.000 ZM 94.000 160.000 C 93.989 150.511 96.036 141.132 100.000 132.510 L 123.490 156.000 C 114.868 159.964 105.489 162.011 96.000 162.000 C 95.350 162.000 94.700 162.000 94.000 161.950 C 94.000 161.300 94.000 160.650 94.000 160.000 ZM 134.230 149.750 L 106.230 121.750 C 110.508 115.752 115.752 110.508 121.750 106.230 L 149.750 134.230 C 145.472 140.228 140.228 145.472 134.230 149.750 ZM 162.000 96.000 C 162.011 105.489 159.964 114.868 156.000 123.490 L 132.510 100.000 C 141.132 96.036 150.511 93.989 160.000 94.000 C 160.650 94.000 161.300 94.000 161.950 94.000 C 162.000 94.700 162.000 95.350 162.000 96.000 ZM 160.000 226.000 C 128.961 225.958 102.131 204.325 95.510 174.000 L 96.000 174.000 C 139.058 173.950 173.950 139.058 174.000 96.000 C 174.000 95.830 174.000 95.670 174.000 95.510 C 206.940 102.680 229.183 133.522 225.586 167.041 C 221.990 200.560 193.711 225.981 160.000 226.000 Z"),
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
        return _intersect!!
    }

private var _intersect: ImageVector? = null
