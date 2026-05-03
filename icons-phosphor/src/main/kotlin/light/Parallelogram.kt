package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Parallelogram: ImageVector
    get() {
        if (_parallelogram != null) return _parallelogram!!
        _parallelogram = phosphorLightIcon(
            name = "Parallelogram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 243.750 48.400 C 241.172 44.412 236.749 42.003 232.000 42.000 L 88.810 42.000 C 83.286 41.982 78.269 45.214 76.000 50.250 L 11.200 194.250 C 9.246 198.588 9.629 203.622 12.216 207.614 C 14.804 211.607 19.242 214.012 24.000 214.000 L 167.190 214.000 C 172.714 214.018 177.731 210.786 180.000 205.750 L 244.800 61.750 C 246.739 57.410 246.344 52.383 243.750 48.400 ZM 233.820 56.820 L 169.020 200.820 C 168.696 201.540 167.979 202.002 167.190 202.000 L 24.000 202.000 C 23.320 202.002 22.686 201.659 22.316 201.089 C 21.947 200.519 21.891 199.800 22.170 199.180 L 87.000 55.180 C 87.321 54.467 88.028 54.006 88.810 54.000 L 232.000 54.000 C 232.680 53.998 233.314 54.341 233.684 54.911 C 234.053 55.481 234.109 56.200 233.830 56.820 Z"),
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
        return _parallelogram!!
    }

private var _parallelogram: ImageVector? = null
