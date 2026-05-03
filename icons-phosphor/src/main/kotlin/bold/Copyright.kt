package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Copyright: ImageVector
    get() {
        if (_copyright != null) return _copyright!!
        _copyright = phosphorBoldIcon(
            name = "Copyright",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 169.590 159.210 C 156.156 177.108 132.778 184.404 111.549 177.324 C 90.319 170.243 76.001 150.374 76.001 127.995 C 76.001 105.616 90.319 85.747 111.549 78.666 C 132.778 71.586 156.156 78.882 169.590 96.780 C 172.260 100.200 172.876 104.796 171.201 108.799 C 169.525 112.801 165.819 115.588 161.508 116.085 C 157.198 116.583 152.954 114.715 150.410 111.200 C 143.179 101.558 130.589 97.626 119.156 101.437 C 107.722 105.248 100.010 115.948 100.010 128.000 C 100.010 140.052 107.722 150.752 119.156 154.563 C 130.589 158.374 143.179 154.442 150.410 144.800 C 152.933 141.232 157.196 139.318 161.539 139.802 C 165.881 140.287 169.618 143.094 171.292 147.130 C 172.966 151.166 172.314 155.794 169.590 159.210 Z"),
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
        return _copyright!!
    }

private var _copyright: ImageVector? = null
