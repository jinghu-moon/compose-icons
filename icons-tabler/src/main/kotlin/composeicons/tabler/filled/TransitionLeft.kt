package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.TransitionLeft: ImageVector
    get() {
        if (_transitionLeft != null) return _transitionLeft!!
        _transitionLeft = tablerFilledIcon(
            name = "TransitionLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6 2c.552 0 1 .448 1 1C7 3.552 6.552 4 6 4 4.895 4 4 4.895 4 6v12c-0 1.047 .806 1.917 1.85 1.995L6 20c.552 0 1 .448 1 1 0 .552-.448 1-1 1C3.791 22 2 20.209 2 18v-12C2 3.791 3.791 2 6 2M18 2c2.209 0 4 1.791 4 4v12c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-5h-4.585l1.292 1.293c.356 .356 .392 .922 .083 1.32l-.083 .094c-.391 .39-1.023 .39-1.414 0l-3-3-.097-.112-.071-.11-.031-.062-.034-.081-.024-.076-.025-.118-.007-.058L6 11.982l.003-.064 .017-.119 .03-.111 .044-.111 .052-.098 .067-.096 .08-.09 3-3c.392-.379 1.016-.374 1.402 .012 .386 .386 .391 1.009 .012 1.402L9.415 11h4.585v-5C14 3.791 15.791 2 18 2"),
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
        return _transitionLeft!!
    }

private var _transitionLeft: ImageVector? = null
