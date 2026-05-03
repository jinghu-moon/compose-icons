package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LessThanOrEqual: ImageVector
    get() {
        if (_lessThanOrEqual != null) return _lessThanOrEqual!!
        _lessThanOrEqual = phosphorLightIcon(
            name = "LessThanOrEqual",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 42.000 104.000 C 42.001 101.485 43.570 99.238 45.930 98.370 L 197.930 42.370 C 201.039 41.224 204.489 42.816 205.635 45.925 C 206.781 49.034 205.189 52.484 202.080 53.630 L 65.360 104.000 L 202.070 154.370 C 204.797 155.375 206.412 158.190 205.903 161.051 C 205.393 163.913 202.906 165.998 200.000 166.000 C 199.290 165.999 198.586 165.874 197.920 165.630 L 45.920 109.630 C 43.564 108.759 41.999 106.512 42.000 104.000 ZM 200.000 194.000 L 48.000 194.000 C 44.686 194.000 42.000 196.686 42.000 200.000 C 42.000 203.314 44.686 206.000 48.000 206.000 L 200.000 206.000 C 203.314 206.000 206.000 203.314 206.000 200.000 C 206.000 196.686 203.314 194.000 200.000 194.000 Z"),
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
        return _lessThanOrEqual!!
    }

private var _lessThanOrEqual: ImageVector? = null
