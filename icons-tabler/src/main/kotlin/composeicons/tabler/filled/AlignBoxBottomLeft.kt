package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AlignBoxBottomLeft: ImageVector
    get() {
        if (_alignBoxBottomLeft != null) return _alignBoxBottomLeft!!
        _alignBoxBottomLeft = tablerFilledIcon(
            name = "AlignBoxBottomLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.333 2c1.96 0 3.56 1.537 3.662 3.472L22 5.667v12.666c0 1.96-1.537 3.56-3.472 3.662L18.333 22h-12.666C3.717 22 2.109 20.475 2.005 18.528L2 18.333v-12.666C2 3.707 3.537 2.107 5.472 2.005L5.667 2h12.666ZM6 15c-.552 0-1 .448-1 1v2l.007 .117c.062 .525 .523 .911 1.052 .88C6.587 18.966 6.999 18.529 7 18v-2l-.007-.117C6.934 15.38 6.507 15 6 15ZM9 11c-.552 0-1 .448-1 1v6l.007 .117c.062 .525 .523 .911 1.052 .88 .528-.031 .941-.468 .941-.997v-6l-.007-.117C9.934 11.38 9.507 11 9 11ZM12 13c-.552 0-1 .448-1 1v4l.007 .117c.062 .525 .523 .911 1.052 .88 .528-.031 .941-.468 .941-.997v-4l-.007-.117C12.934 13.38 12.507 13 12 13Z"),
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
        return _alignBoxBottomLeft!!
    }

private var _alignBoxBottomLeft: ImageVector? = null
