package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Trophy: ImageVector
    get() {
        if (_trophy != null) return _trophy!!
        _trophy = tablerFilledIcon(
            name = "Trophy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3c.507 0 .934 .38 .993 .883L18 4v2.17c1.243-.438 2.626-.013 3.409 1.046 .783 1.06 .783 2.507 0 3.566-.783 1.06-2.167 1.484-3.409 1.046v.171c-0 2.928-2.113 5.428-5 5.917v2.083h3c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L16 22h-8c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L8 20h3v-2.083C8.197 17.442 6.111 15.066 6.004 12.225L6 12v-.171c-.889 .315-1.875 .193-2.66-.329C2.554 10.979 2.059 10.118 2.004 9.176L2.001 9l.005-.176C2.061 7.882 2.555 7.021 3.341 6.5c.786-.522 1.771-.644 2.66-.33L6 4C6 3.448 6.448 3 7 3h10ZM5 8C4.448 8 4 8.448 4 9c0 .552 .448 1 1 1 .552 0 1-.448 1-1C6 8.448 5.552 8 5 8M19 8c-.552 0-1 .448-1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1C20 8.448 19.552 8 19 8"),
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
        return _trophy!!
    }

private var _trophy: ImageVector? = null
