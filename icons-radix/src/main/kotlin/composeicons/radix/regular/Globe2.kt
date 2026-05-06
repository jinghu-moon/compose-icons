package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Globe2: ImageVector
    get() {
        if (_globe2 != null) return _globe2!!
        _globe2 = radixIcon(
            name = "Globe2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.5 .9c3.645 0 6.6 2.956 6.6 6.601-0 3.645-2.955 6.599-6.6 6.6C3.856 14.1 .9 11.146 .9 7.501 .9 3.856 3.855 .9 7.5 .9ZM10.214 7.95c-.087 1.884-.718 3.753-1.912 5.192 2.622-.369 4.669-2.522 4.878-5.192h-2.966ZM1.819 7.95c.2 2.559 2.089 4.642 4.554 5.137C5.241 11.654 4.643 9.809 4.56 7.95h-2.741ZM5.462 7.95c.09 1.841 .73 3.621 1.893 4.907C8.559 11.571 9.22 9.79 9.313 7.95h-3.851ZM7.355 2.141C6.192 3.427 5.552 5.208 5.462 7.049h3.851C9.22 5.209 8.559 3.428 7.355 2.141ZM8.302 1.857c1.194 1.44 1.826 3.308 1.912 5.192h2.966C12.971 4.379 10.924 2.227 8.302 1.857ZM6.374 1.911C3.908 2.405 2.02 4.49 1.82 7.049h2.74C4.643 5.19 5.241 3.344 6.374 1.911Z"),
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
        return _globe2!!
    }

private var _globe2: ImageVector? = null
