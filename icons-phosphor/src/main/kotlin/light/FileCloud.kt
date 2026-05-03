package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileCloud: ImageVector
    get() {
        if (_fileCloud != null) return _fileCloud!!
        _fileCloud = phosphorLightIcon(
            name = "FileCloud",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.240 83.760 L 156.240 27.760 C 155.116 26.634 153.591 26.001 152.000 26.000 L 56.000 26.000 C 48.268 26.000 42.000 32.268 42.000 40.000 L 42.000 128.000 C 42.000 131.314 44.686 134.000 48.000 134.000 C 51.314 134.000 54.000 131.314 54.000 128.000 L 54.000 40.000 C 54.000 38.895 54.895 38.000 56.000 38.000 L 146.000 38.000 L 146.000 88.000 C 146.000 91.314 148.686 94.000 152.000 94.000 L 202.000 94.000 L 202.000 216.000 C 202.000 217.105 201.105 218.000 200.000 218.000 L 176.000 218.000 C 172.686 218.000 170.000 220.686 170.000 224.000 C 170.000 227.314 172.686 230.000 176.000 230.000 L 200.000 230.000 C 207.732 230.000 214.000 223.732 214.000 216.000 L 214.000 88.000 C 213.999 86.409 213.366 84.884 212.240 83.760 ZM 158.000 46.480 L 193.520 82.000 L 158.000 82.000 ZM 108.000 130.000 C 87.327 129.995 68.782 142.713 61.340 162.000 L 60.000 162.000 C 41.222 162.000 26.000 177.222 26.000 196.000 C 26.000 214.778 41.222 230.000 60.000 230.000 L 108.000 230.000 C 135.614 230.000 158.000 207.614 158.000 180.000 C 158.000 152.386 135.614 130.000 108.000 130.000 ZM 108.000 218.000 L 60.000 218.000 C 48.161 218.014 38.433 208.657 37.989 196.826 C 37.545 184.995 46.543 174.934 58.350 174.060 C 58.290 174.530 58.250 174.990 58.200 175.460 C 57.902 178.774 60.346 181.702 63.660 182.000 C 66.974 182.298 69.902 179.854 70.200 176.540 C 70.378 174.332 70.746 172.144 71.300 170.000 C 71.402 169.720 71.483 169.432 71.540 169.140 C 77.130 150.395 96.038 138.956 115.237 142.704 C 134.436 146.453 147.652 164.164 145.781 183.636 C 143.909 203.107 127.561 217.977 108.000 218.000 Z"),
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
        return _fileCloud!!
    }

private var _fileCloud: ImageVector? = null
