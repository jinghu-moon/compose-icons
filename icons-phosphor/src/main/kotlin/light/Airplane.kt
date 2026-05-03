package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Airplane: ImageVector
    get() {
        if (_airplane != null) return _airplane!!
        _airplane = phosphorLightIcon(
            name = "Airplane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 234.680 130.630 L 158.000 92.290 L 158.000 48.000 C 158.000 31.431 144.569 18.000 128.000 18.000 C 111.431 18.000 98.000 31.431 98.000 48.000 L 98.000 92.290 L 21.320 130.630 C 19.285 131.646 17.999 133.725 18.000 136.000 L 18.000 168.000 C 18.001 169.798 18.808 171.500 20.198 172.639 C 21.589 173.778 23.417 174.234 25.180 173.880 L 98.000 159.320 L 98.000 181.510 L 83.760 195.760 C 82.634 196.884 82.001 198.409 82.000 200.000 L 82.000 232.000 C 82.000 233.991 82.988 235.853 84.637 236.969 C 86.286 238.085 88.381 238.310 90.230 237.570 L 128.000 222.460 L 165.770 237.570 C 167.619 238.310 169.714 238.085 171.363 236.969 C 173.012 235.853 174.000 233.991 174.000 232.000 L 174.000 200.000 C 173.999 198.409 173.366 196.884 172.240 195.760 L 158.000 181.510 L 158.000 159.320 L 230.820 173.880 C 232.583 174.234 234.411 173.778 235.802 172.639 C 237.192 171.500 237.999 169.798 238.000 168.000 L 238.000 136.000 C 238.001 133.725 236.715 131.646 234.680 130.630 ZM 226.000 160.680 L 153.180 146.120 C 151.417 145.766 149.589 146.222 148.198 147.361 C 146.808 148.500 146.001 150.202 146.000 152.000 L 146.000 184.000 C 146.001 185.591 146.634 187.116 147.760 188.240 L 162.000 202.490 L 162.000 223.140 L 130.230 210.430 C 128.799 209.857 127.201 209.857 125.770 210.430 L 94.000 223.140 L 94.000 202.490 L 108.240 188.240 C 109.366 187.116 109.999 185.591 110.000 184.000 L 110.000 152.000 C 109.999 150.202 109.192 148.500 107.802 147.361 C 106.411 146.222 104.583 145.766 102.820 146.120 L 30.000 160.680 L 30.000 139.680 L 106.680 101.340 C 108.705 100.329 109.989 98.264 110.000 96.000 L 110.000 48.000 C 110.000 38.059 118.059 30.000 128.000 30.000 C 137.941 30.000 146.000 38.059 146.000 48.000 L 146.000 96.000 C 145.999 98.275 147.285 100.354 149.320 101.370 L 226.000 139.710 Z"),
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
        return _airplane!!
    }

private var _airplane: ImageVector? = null
