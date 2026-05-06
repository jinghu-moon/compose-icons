package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandPinterest: ImageVector
    get() {
        if (_brandPinterest != null) return _brandPinterest!!
        _brandPinterest = tablerFilledIcon(
            name = "BrandPinterest",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c4.506 2.602 6.263 8.225 4.041 12.93-2.222 4.705-7.681 6.92-12.553 5.093l2.364-5.315c.649 .611 1.507 .952 2.398 .952C15.958 17 18 14.911 18 12 18.002 9.605 16.58 7.438 14.382 6.487 12.184 5.536 9.63 5.984 7.887 7.626 6.143 9.268 5.543 11.79 6.36 14.041c.119 .34 .411 .589 .765 .653 .354 .064 .715-.067 .946-.343 .231-.276 .295-.655 .169-.992C7.695 11.858 8.095 10.177 9.258 9.082c1.163-1.095 2.865-1.393 4.33-.759 1.466 .634 2.414 2.079 2.412 3.676C16 13.817 14.844 15 13.25 15c-.609 0-1.153-.361-1.478-1.022l1.142-2.572c.224-.505-.003-1.096-.508-1.32-.505-.224-1.096 .003-1.32 .508L6.694 20.476C3.774 18.648 2 15.445 2 12l.005-.324C2.119 8.163 4.069 4.968 7.141 3.26 10.213 1.552 13.956 1.582 17 3.34"),
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
        return _brandPinterest!!
    }

private var _brandPinterest: ImageVector? = null
