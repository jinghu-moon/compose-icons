package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Vignette: ImageVector
    get() {
        if (_vignette != null) return _vignette!!
        _vignette = phosphorBoldIcon(
            name = "Vignette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 36.000 L 40.000 36.000 C 28.954 36.000 20.000 44.954 20.000 56.000 L 20.000 200.000 C 20.000 211.046 28.954 220.000 40.000 220.000 L 216.000 220.000 C 227.046 220.000 236.000 211.046 236.000 200.000 L 236.000 56.000 C 236.000 44.954 227.046 36.000 216.000 36.000 ZM 212.000 196.000 L 44.000 196.000 L 44.000 60.000 L 212.000 60.000 ZM 81.430 166.050 C 94.000 175.050 110.560 180.000 128.000 180.000 C 145.440 180.000 162.000 175.050 174.570 166.050 C 188.190 156.320 196.000 142.450 196.000 128.000 C 196.000 113.550 188.190 99.680 174.570 90.000 C 162.000 81.000 145.440 76.000 128.000 76.000 C 110.560 76.000 94.000 81.000 81.430 90.000 C 67.810 99.680 60.000 113.550 60.000 128.000 C 60.000 142.450 67.810 156.320 81.430 166.050 ZM 128.000 100.000 C 151.850 100.000 172.000 112.820 172.000 128.000 C 172.000 143.180 151.850 156.000 128.000 156.000 C 104.150 156.000 84.000 143.180 84.000 128.000 C 84.000 112.820 104.150 100.000 128.000 100.000 Z"),
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
        return _vignette!!
    }

private var _vignette: ImageVector? = null
