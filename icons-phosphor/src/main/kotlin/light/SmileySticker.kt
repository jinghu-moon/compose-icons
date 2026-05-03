package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SmileySticker: ImageVector
    get() {
        if (_smileySticker != null) return _smileySticker!!
        _smileySticker = phosphorLightIcon(
            name = "SmileySticker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 26.000 C 87.933 26.040 51.601 49.535 35.125 86.058 C 18.650 122.581 25.083 165.367 51.570 195.430 C 78.058 225.493 119.693 237.264 158.000 225.520 C 158.936 225.233 159.787 224.722 160.480 224.030 L 224.000 160.460 C 224.693 159.764 225.205 158.909 225.490 157.970 C 234.972 127.037 229.225 93.441 210.001 67.418 C 190.777 41.395 160.353 26.028 128.000 26.000 ZM 214.470 153.000 L 153.050 214.430 C 113.644 225.817 71.526 209.090 50.670 173.770 C 29.813 138.449 35.507 93.490 64.509 64.483 C 93.511 35.476 138.469 29.776 173.793 50.626 C 209.117 71.477 225.851 113.592 214.470 153.000 ZM 82.000 108.000 C 82.000 102.477 86.477 98.000 92.000 98.000 C 97.523 98.000 102.000 102.477 102.000 108.000 C 102.000 113.523 97.523 118.000 92.000 118.000 C 86.477 118.000 82.000 113.523 82.000 108.000 ZM 174.000 108.000 C 174.000 113.523 169.523 118.000 164.000 118.000 C 158.477 118.000 154.000 113.523 154.000 108.000 C 154.000 102.477 158.477 98.000 164.000 98.000 C 169.523 98.000 174.000 102.477 174.000 108.000 ZM 173.190 155.000 C 163.270 172.160 146.800 182.000 128.000 182.000 C 109.200 182.000 92.730 172.160 82.810 155.000 C 81.320 152.151 82.340 148.633 85.124 147.024 C 87.908 145.415 91.465 146.286 93.190 149.000 C 101.030 162.540 113.390 170.000 128.000 170.000 C 142.610 170.000 155.000 162.540 162.810 149.000 C 163.832 147.047 165.842 145.812 168.045 145.782 C 170.249 145.752 172.292 146.933 173.366 148.857 C 174.440 150.782 174.372 153.140 173.190 155.000 Z"),
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
        return _smileySticker!!
    }

private var _smileySticker: ImageVector? = null
