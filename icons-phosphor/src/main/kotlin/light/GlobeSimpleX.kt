package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GlobeSimpleX: ImageVector
    get() {
        if (_globeSimpleX != null) return _globeSimpleX!!
        _globeSimpleX = phosphorLightIcon(
            name = "GlobeSimpleX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 220.240 172.240 L 200.490 192.000 L 220.240 211.760 C 221.845 213.256 222.506 215.508 221.963 217.634 C 221.420 219.760 219.760 221.420 217.634 221.963 C 215.508 222.506 213.256 221.845 211.760 220.240 L 192.000 200.490 L 172.240 220.240 C 169.876 222.443 166.192 222.378 163.907 220.093 C 161.622 217.808 161.557 214.124 163.760 211.760 L 183.510 192.000 L 163.760 172.240 C 161.557 169.876 161.622 166.192 163.907 163.907 C 166.192 161.622 169.876 161.557 172.240 163.760 L 192.000 183.510 L 211.760 163.760 C 214.124 161.557 217.808 161.622 220.093 163.907 C 222.378 166.192 222.443 169.876 220.240 172.240 ZM 230.000 128.000 C 230.000 131.314 227.314 134.000 224.000 134.000 L 94.130 134.000 C 94.890 156.050 101.324 177.532 112.810 196.370 C 122.160 211.480 131.660 219.250 131.760 219.320 C 133.747 220.914 134.511 223.589 133.665 225.992 C 132.819 228.395 130.548 230.002 128.000 230.000 L 128.000 230.000 C 71.667 230.000 26.000 184.333 26.000 128.000 C 26.000 71.667 71.667 26.000 128.000 26.000 C 184.333 26.000 230.000 71.667 230.000 128.000 ZM 143.460 39.330 C 155.410 53.770 172.350 81.230 173.890 122.000 L 217.800 122.000 C 214.971 80.630 184.298 46.521 143.460 39.330 ZM 112.810 59.630 C 101.324 78.468 94.890 99.950 94.130 122.000 L 161.870 122.000 C 161.110 99.950 154.676 78.468 143.190 59.630 C 138.878 52.593 133.782 46.068 128.000 40.180 C 122.218 46.068 117.122 52.593 112.810 59.630 ZM 38.200 122.000 L 82.110 122.000 C 83.650 81.230 100.590 53.770 112.540 39.330 C 71.702 46.521 41.029 80.630 38.200 122.000 ZM 82.110 134.000 L 38.200 134.000 C 41.029 175.370 71.702 209.479 112.540 216.670 C 100.590 202.230 83.650 174.770 82.110 134.000 Z"),
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
        return _globeSimpleX!!
    }

private var _globeSimpleX: ImageVector? = null
