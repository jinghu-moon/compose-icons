package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AlignBoxTopRight: ImageVector
    get() {
        if (_alignBoxTopRight != null) return _alignBoxTopRight!!
        _alignBoxTopRight = tablerFilledIcon(
            name = "AlignBoxTopRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.333 2c1.96 0 3.56 1.537 3.662 3.472L22 5.667v12.666c0 1.96-1.537 3.56-3.472 3.662L18.333 22h-12.666C3.717 22 2.109 20.475 2.005 18.528L2 18.333v-12.666C2 3.707 3.537 2.107 5.472 2.005L5.667 2h12.666ZM15 5c-.552 0-1 .448-1 1v6l.007 .117c.062 .525 .523 .911 1.052 .88 .528-.031 .941-.468 .941-.997v-6l-.007-.117C15.934 5.38 15.507 5 15 5ZM18 5c-.552 0-1 .448-1 1v4l.007 .117c.062 .525 .523 .911 1.052 .88 .528-.031 .941-.468 .941-.997v-4l-.007-.117C18.934 5.38 18.507 5 18 5ZM12 5c-.552 0-1 .448-1 1v2l.007 .117c.062 .525 .523 .911 1.052 .88C12.587 8.966 12.999 8.529 13 8v-2l-.007-.117C12.934 5.38 12.507 5 12 5Z"),
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
        return _alignBoxTopRight!!
    }

private var _alignBoxTopRight: ImageVector? = null
