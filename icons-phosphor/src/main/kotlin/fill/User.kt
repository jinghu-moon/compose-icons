package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.User: ImageVector
    get() {
        if (_user != null) return _user!!
        _user = phosphorFillIcon(
            name = "User",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 230.930 220.000 C 229.501 222.476 226.859 224.001 224.000 224.000 L 32.000 224.000 C 29.143 223.997 26.505 222.471 25.078 219.996 C 23.651 217.522 23.652 214.474 25.080 212.000 C 40.310 185.670 63.780 166.790 91.170 157.840 C 63.322 141.262 49.982 108.121 58.579 76.874 C 67.176 45.626 95.591 23.973 128.000 23.973 C 160.409 23.973 188.824 45.626 197.421 76.874 C 206.018 108.121 192.678 141.262 164.830 157.840 C 192.220 166.790 215.690 185.670 230.920 212.000 C 232.352 214.473 232.356 217.523 230.930 220.000 Z"),
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
        return _user!!
    }

private var _user: ImageVector? = null
