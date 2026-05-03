package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Percent: ImageVector
    get() {
        if (_percent != null) return _percent!!
        _percent = phosphorLightIcon(
            name = "Percent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 204.240 60.230 L 60.240 204.230 C 57.876 206.433 54.192 206.368 51.907 204.083 C 49.622 201.798 49.557 198.114 51.760 195.750 L 195.760 51.750 C 197.272 50.215 199.492 49.608 201.575 50.162 C 203.658 50.715 205.284 52.343 205.835 54.427 C 206.386 56.510 205.777 58.729 204.240 60.240 ZM 52.000 100.000 C 40.549 88.509 38.811 70.528 47.850 57.057 C 56.888 43.585 74.185 38.376 89.160 44.615 C 104.135 50.855 112.616 66.805 109.415 82.709 C 106.214 98.613 92.223 110.040 76.000 110.000 C 66.986 110.002 58.345 106.402 52.000 100.000 ZM 54.000 76.000 C 54.003 86.495 61.420 95.527 71.715 97.571 C 82.009 99.616 92.314 94.104 96.328 84.406 C 100.341 74.708 96.946 63.526 88.218 57.697 C 79.490 51.869 67.860 53.017 60.440 60.440 C 56.302 64.559 53.983 70.161 54.000 76.000 ZM 214.000 180.000 C 214.040 196.223 202.613 210.214 186.709 213.415 C 170.805 216.616 154.855 208.135 148.615 193.160 C 142.376 178.185 147.585 160.888 161.057 151.850 C 174.528 142.811 192.509 144.549 204.000 156.000 C 210.402 162.345 214.002 170.986 214.000 180.000 ZM 202.000 180.000 C 202.016 174.162 199.698 168.559 195.560 164.440 L 195.560 164.440 C 188.140 157.017 176.510 155.869 167.782 161.697 C 159.054 167.526 155.659 178.708 159.672 188.406 C 163.686 198.104 173.991 203.616 184.285 201.571 C 194.580 199.527 201.997 190.495 202.000 180.000 Z"),
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
        return _percent!!
    }

private var _percent: ImageVector? = null
