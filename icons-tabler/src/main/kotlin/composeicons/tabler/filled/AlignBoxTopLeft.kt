package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AlignBoxTopLeft: ImageVector
    get() {
        if (_alignBoxTopLeft != null) return _alignBoxTopLeft!!
        _alignBoxTopLeft = tablerFilledIcon(
            name = "AlignBoxTopLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.333 2c1.96 0 3.56 1.537 3.662 3.472L22 5.667v12.666c0 1.96-1.537 3.56-3.472 3.662L18.333 22h-12.666C3.717 22 2.109 20.475 2.005 18.528L2 18.333v-12.666C2 3.707 3.537 2.107 5.472 2.005L5.667 2h12.666ZM9 5C8.448 5 8 5.448 8 6v6l.007 .117c.062 .525 .523 .911 1.052 .88 .528-.031 .941-.468 .941-.997v-6L9.993 5.883C9.934 5.38 9.507 5 9 5ZM12 5c-.552 0-1 .448-1 1v4l.007 .117c.062 .525 .523 .911 1.052 .88 .528-.031 .941-.468 .941-.997v-4l-.007-.117C12.934 5.38 12.507 5 12 5ZM6 5C5.448 5 5 5.448 5 6v2l.007 .117c.062 .525 .523 .911 1.052 .88C6.587 8.966 6.999 8.529 7 8v-2L6.993 5.883C6.934 5.38 6.507 5 6 5Z"),
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
        return _alignBoxTopLeft!!
    }

private var _alignBoxTopLeft: ImageVector? = null
