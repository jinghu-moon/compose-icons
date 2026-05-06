package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Crown: ImageVector
    get() {
        if (_crown != null) return _crown!!
        _crown = tablerFilledIcon(
            name = "Crown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 19h-14c-.5 0-.9-.3-1-.8L2 8.2c0-.4 .1-.8 .5-1.1 .4-.2 .8-.2 1.1 0l4.1 3.3L11.1 5.3c.4-.6 1.3-.6 1.7 0l3.4 5.1L20.3 7.1c.3-.3 .8-.3 1.1 0 .4 .2 .5 .6 .5 1.1l-2 10c0 .5-.5 .8-1 .8Z"),
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
        return _crown!!
    }

private var _crown: ImageVector? = null
