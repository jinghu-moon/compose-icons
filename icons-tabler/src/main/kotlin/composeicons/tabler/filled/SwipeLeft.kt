package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SwipeLeft: ImageVector
    get() {
        if (_swipeLeft != null) return _swipeLeft!!
        _swipeLeft = tablerFilledIcon(
            name = "SwipeLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 7c2.631 .001 4.811 2.04 4.988 4.665 .176 2.625-1.712 4.938-4.319 5.29-2.607 .352-5.042-1.376-5.568-3.954L6.415 13l1.292 1.293c.356 .356 .392 .922 .083 1.32l-.083 .094c-.39 .39-1.023 .39-1.414 0l-3-3c-.035-.035-.067-.072-.097-.112l-.071-.11-.054-.114-.035-.105-.025-.118-.007-.058L3 12l.003-.075 .017-.126 .03-.111 .044-.111 .052-.098 .067-.096 .08-.09 3-3c.392-.379 1.016-.374 1.402 .012 .386 .386 .391 1.009 .012 1.402L6.415 11h4.685C11.575 8.672 13.624 7 16 7"),
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
        return _swipeLeft!!
    }

private var _swipeLeft: ImageVector? = null
