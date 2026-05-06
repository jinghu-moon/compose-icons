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
                pathData = parseSvgPathData("M230.93 220c-1.429 2.476-4.071 4.001-6.93 4h-192c-2.857-.003-5.495-1.529-6.922-4.004-1.427-2.475-1.426-5.523 .002-7.996C40.31 185.67 63.78 166.79 91.17 157.84 63.322 141.262 49.982 108.121 58.579 76.874 67.176 45.626 95.591 23.973 128 23.973c32.409 0 60.824 21.653 69.421 52.901 8.597 31.248-4.743 64.388-32.591 80.966 27.39 8.95 50.86 27.83 66.09 54.16 1.432 2.473 1.436 5.523 .01 8Z"),
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
