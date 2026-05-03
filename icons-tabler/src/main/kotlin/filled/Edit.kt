package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Edit: ImageVector
    get() {
        if (_edit != null) return _edit!!
        _edit = tablerFilledIcon(
            name = "Edit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.000 7.000 C 8.000 7.552 7.552 8.000 7.000 8.000 L 6.000 8.000 C 5.448 8.000 5.000 8.448 5.000 9.000 L 5.000 18.000 C 5.000 18.552 5.448 19.000 6.000 19.000 L 15.000 19.000 C 15.552 19.000 16.000 18.552 16.000 18.000 L 16.000 17.000 C 16.000 16.448 16.448 16.000 17.000 16.000 C 17.552 16.000 18.000 16.448 18.000 17.000 L 18.000 18.000 C 18.000 19.657 16.657 21.000 15.000 21.000 L 6.000 21.000 C 4.343 21.000 3.000 19.657 3.000 18.000 L 3.000 9.000 C 3.000 7.343 4.343 6.000 6.000 6.000 L 7.000 6.000 C 7.552 6.000 8.000 6.448 8.000 7.000"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 14.596 5.011 L 18.988 9.403 L 12.708 15.706 C 12.520 15.894 12.266 16.000 12.000 16.000 L 9.000 16.000 C 8.448 16.000 8.000 15.552 8.000 15.000 L 8.000 12.000 C 8.000 11.734 8.106 11.480 8.294 11.292 ZM 21.092 2.908 C 22.236 4.051 22.308 5.882 21.257 7.111 L 21.093 7.291 L 20.400 7.985 L 16.013 3.598 L 16.708 2.908 C 17.919 1.697 19.881 1.697 21.092 2.908"),
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
        return _edit!!
    }

private var _edit: ImageVector? = null
