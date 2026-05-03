package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Acorn: ImageVector
    get() {
        if (_acorn != null) return _acorn!!
        _acorn = phosphorBoldIcon(
            name = "Acorn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.000 104.000 C 235.961 70.879 209.121 44.039 176.000 44.000 L 140.400 44.000 C 142.301 34.687 150.495 27.998 160.000 28.000 C 166.627 28.000 172.000 22.627 172.000 16.000 C 172.000 9.373 166.627 4.000 160.000 4.000 C 137.263 4.032 118.285 21.360 116.190 44.000 L 80.000 44.000 C 46.879 44.039 20.039 70.879 20.000 104.000 C 20.000 110.295 22.964 116.223 28.000 120.000 L 28.000 128.000 C 28.000 165.450 62.000 192.710 89.230 214.610 C 99.450 222.810 114.860 235.190 116.000 240.170 C 116.000 246.797 121.373 252.170 128.000 252.170 C 134.627 252.170 140.000 246.797 140.000 240.170 C 141.140 235.170 156.550 222.810 166.770 214.610 C 194.050 192.710 228.000 165.450 228.000 128.000 L 228.000 120.000 C 233.036 116.223 236.000 110.295 236.000 104.000 ZM 80.000 68.000 L 176.000 68.000 C 194.325 68.026 209.717 81.791 211.780 100.000 L 44.220 100.000 C 46.283 81.791 61.675 68.026 80.000 68.000 ZM 151.740 195.900 C 142.570 203.260 134.280 209.900 128.000 216.450 C 121.720 209.920 113.430 203.260 104.260 195.900 C 81.000 177.200 52.000 153.940 52.000 128.000 L 52.000 124.000 L 204.000 124.000 L 204.000 128.000 C 204.000 153.940 175.000 177.200 151.740 195.900 Z"),
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
        return _acorn!!
    }

private var _acorn: ImageVector? = null
