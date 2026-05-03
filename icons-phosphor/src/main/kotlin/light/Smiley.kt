package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Smiley: ImageVector
    get() {
        if (_smiley != null) return _smiley!!
        _smiley = phosphorLightIcon(
            name = "Smiley",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 173.190 155.000 C 163.270 172.160 146.800 182.000 128.000 182.000 C 109.200 182.000 92.730 172.160 82.810 155.000 C 81.320 152.151 82.340 148.633 85.124 147.024 C 87.908 145.415 91.465 146.286 93.190 149.000 C 101.030 162.540 113.390 170.000 128.000 170.000 C 142.610 170.000 155.000 162.540 162.810 149.000 C 163.832 147.047 165.842 145.812 168.045 145.782 C 170.249 145.752 172.292 146.933 173.366 148.857 C 174.440 150.782 174.372 153.140 173.190 155.000 ZM 230.000 128.000 C 230.000 184.333 184.333 230.000 128.000 230.000 C 71.667 230.000 26.000 184.333 26.000 128.000 C 26.000 71.667 71.667 26.000 128.000 26.000 C 184.306 26.066 229.934 71.694 230.000 128.000 ZM 218.000 128.000 C 218.000 78.294 177.706 38.000 128.000 38.000 C 78.294 38.000 38.000 78.294 38.000 128.000 C 38.000 177.706 78.294 218.000 128.000 218.000 C 177.683 217.945 217.945 177.683 218.000 128.000 ZM 92.000 118.000 C 97.523 118.000 102.000 113.523 102.000 108.000 C 102.000 102.477 97.523 98.000 92.000 98.000 C 86.477 98.000 82.000 102.477 82.000 108.000 C 82.000 113.523 86.477 118.000 92.000 118.000 ZM 164.000 98.000 C 158.477 98.000 154.000 102.477 154.000 108.000 C 154.000 113.523 158.477 118.000 164.000 118.000 C 169.523 118.000 174.000 113.523 174.000 108.000 C 174.000 102.477 169.523 98.000 164.000 98.000 Z"),
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
        return _smiley!!
    }

private var _smiley: ImageVector? = null
