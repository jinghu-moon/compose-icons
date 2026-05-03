package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SmileyWink: ImageVector
    get() {
        if (_smileyWink != null) return _smileyWink!!
        _smileyWink = phosphorLightIcon(
            name = "SmileyWink",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 82.000 108.000 C 82.000 102.477 86.477 98.000 92.000 98.000 C 97.523 98.000 102.000 102.477 102.000 108.000 C 102.000 113.523 97.523 118.000 92.000 118.000 C 86.477 118.000 82.000 113.523 82.000 108.000 ZM 182.000 108.000 C 182.000 111.314 179.314 114.000 176.000 114.000 L 152.000 114.000 C 148.686 114.000 146.000 111.314 146.000 108.000 C 146.000 104.686 148.686 102.000 152.000 102.000 L 176.000 102.000 C 179.314 102.000 182.000 104.686 182.000 108.000 ZM 173.190 155.000 C 163.270 172.160 146.800 182.000 128.000 182.000 C 109.200 182.000 92.730 172.160 82.810 155.000 C 81.320 152.151 82.340 148.633 85.124 147.024 C 87.908 145.415 91.465 146.286 93.190 149.000 C 101.030 162.540 113.390 170.000 128.000 170.000 C 142.610 170.000 155.000 162.540 162.810 149.000 C 163.832 147.047 165.842 145.812 168.045 145.782 C 170.249 145.752 172.292 146.933 173.366 148.857 C 174.440 150.782 174.372 153.140 173.190 155.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _smileyWink!!
    }

private var _smileyWink: ImageVector? = null
