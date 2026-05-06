package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Ticket: ImageVector
    get() {
        if (_ticket != null) return _ticket!!
        _ticket = tablerFilledIcon(
            name = "Ticket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 4v2c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-2h3c1.657 0 3 1.343 3 3v3c-0 .507-.38 .934-.883 .993L21 11c-.529 .001-.966 .413-.997 .941-.031 .528 .355 .989 .88 1.052L21 13c.552 0 1 .448 1 1v3c0 1.657-1.343 3-3 3h-3v-2c-0-.507-.38-.934-.883-.993L15 17c-.552 0-1 .448-1 1v2h-9C3.343 20 2 18.657 2 17v-3c0-.507 .38-.934 .883-.993L3 13c.529-.001 .966-.413 .997-.941 .031-.528-.355-.989-.88-1.052L3 11C2.448 11 2 10.552 2 10v-3C1.999 5.449 3.182 4.154 4.727 4.015l.222-.014ZM15 10c-.552 0-1 .448-1 1v2c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-2c0-.552-.448-1-1-1"),
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
        return _ticket!!
    }

private var _ticket: ImageVector? = null
