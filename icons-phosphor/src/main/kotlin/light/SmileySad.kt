package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SmileySad: ImageVector
    get() {
        if (_smileySad != null) return _smileySad!!
        _smileySad = phosphorLightIcon(
            name = "SmileySad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 82.000 108.000 C 82.000 102.477 86.477 98.000 92.000 98.000 C 97.523 98.000 102.000 102.477 102.000 108.000 C 102.000 113.523 97.523 118.000 92.000 118.000 C 86.477 118.000 82.000 113.523 82.000 108.000 ZM 174.000 108.000 C 174.000 113.523 169.523 118.000 164.000 118.000 C 158.477 118.000 154.000 113.523 154.000 108.000 C 154.000 102.477 158.477 98.000 164.000 98.000 C 169.523 98.000 174.000 102.477 174.000 108.000 ZM 173.190 173.000 C 174.680 175.849 173.660 179.367 170.876 180.976 C 168.092 182.585 164.535 181.714 162.810 179.000 C 154.970 165.460 142.610 158.000 128.000 158.000 C 113.390 158.000 101.000 165.460 93.190 179.000 C 92.118 180.858 90.135 182.001 87.990 182.000 C 86.936 182.003 85.900 181.723 84.990 181.190 C 82.130 179.528 81.155 175.864 82.810 173.000 C 92.730 155.840 109.200 146.000 128.000 146.000 C 146.800 146.000 163.270 155.840 173.190 173.000 Z"),
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
        return _smileySad!!
    }

private var _smileySad: ImageVector? = null
