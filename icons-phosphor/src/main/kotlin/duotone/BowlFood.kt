package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BowlFood: ImageVector
    get() {
        if (_bowlFood != null) return _bowlFood!!
        _bowlFood = phosphorDuotoneIcon(
            name = "BowlFood",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 224.000 112.000 C 224.012 149.547 202.133 183.655 168.000 199.300 L 168.000 208.000 C 168.000 212.418 164.418 216.000 160.000 216.000 L 96.000 216.000 C 91.582 216.000 88.000 212.418 88.000 208.000 L 88.000 199.300 C 53.867 183.655 31.988 149.547 32.000 112.000 Z"),
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
        pathData = parseSvgPathData("M 224.000 104.000 L 215.630 104.000 C 211.464 58.714 173.478 24.061 128.000 24.061 C 82.522 24.061 44.536 58.714 40.370 104.000 L 32.000 104.000 C 27.582 104.000 24.000 107.582 24.000 112.000 C 24.072 150.775 45.638 186.314 80.000 204.280 L 80.000 208.000 C 80.000 216.837 87.163 224.000 96.000 224.000 L 160.000 224.000 C 168.837 224.000 176.000 216.837 176.000 208.000 L 176.000 204.280 C 210.362 186.314 231.928 150.775 232.000 112.000 C 232.000 107.582 228.418 104.000 224.000 104.000 ZM 173.480 56.230 Q 176.230 58.480 178.750 60.980 C 157.454 68.472 139.855 83.868 129.600 103.980 L 100.100 103.980 C 110.345 75.264 137.511 56.067 168.000 56.000 C 169.830 56.000 171.660 56.090 173.480 56.230 ZM 189.390 74.430 C 194.915 83.417 198.381 93.515 199.540 104.000 L 148.120 104.000 C 157.819 89.449 172.493 78.935 189.390 74.430 ZM 128.000 40.000 C 134.420 40.004 140.810 40.869 147.000 42.570 C 116.315 50.182 92.035 73.607 83.330 104.000 L 56.460 104.000 C 60.568 67.582 91.351 40.044 128.000 40.000 ZM 164.660 192.000 C 161.810 193.309 159.988 196.164 160.000 199.300 L 160.000 208.000 L 96.000 208.000 L 96.000 199.300 C 96.012 196.164 94.190 193.309 91.340 192.000 C 62.707 178.824 43.269 151.383 40.340 120.000 L 215.630 120.000 C 212.706 151.376 193.282 178.816 164.660 192.000 Z"),
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
        return _bowlFood!!
    }

private var _bowlFood: ImageVector? = null
