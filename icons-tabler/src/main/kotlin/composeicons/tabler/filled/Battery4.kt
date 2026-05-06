package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Battery4: ImageVector
    get() {
        if (_battery4 != null) return _battery4!!
        _battery4 = tablerFilledIcon(
            name = "Battery4",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 6c1.589-0 2.902 1.238 2.995 2.824L20 9v.086l.052 .019c.523 .207 .887 .69 .941 1.25l.007 .145v3c0 .615-.376 1.169-.948 1.395L20 14.913v.087c0 1.589-1.238 2.902-2.824 2.995L17 18h-11C4.411 18 3.098 16.762 3.005 15.176L3 15v-6C3 7.411 4.238 6.098 5.824 6.005L6 6h11ZM7 9C6.448 9 6 9.448 6 10v4l.007 .117c.062 .525 .523 .911 1.052 .88C7.587 14.966 7.999 14.529 8 14v-4L7.993 9.883C7.934 9.38 7.507 9 7 9ZM10 9C9.448 9 9 9.448 9 10v4l.007 .117c.062 .525 .523 .911 1.052 .88 .528-.031 .941-.468 .941-.997v-4l-.007-.117C10.934 9.38 10.507 9 10 9ZM13 9c-.552 0-1 .448-1 1v4l.007 .117c.062 .525 .523 .911 1.052 .88 .528-.031 .941-.468 .941-.997v-4l-.007-.117C13.934 9.38 13.507 9 13 9ZM16 9c-.552 0-1 .448-1 1v4l.007 .117c.062 .525 .523 .911 1.052 .88 .528-.031 .941-.468 .941-.997v-4l-.007-.117C16.934 9.38 16.507 9 16 9Z"),
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
        return _battery4!!
    }

private var _battery4: ImageVector? = null
