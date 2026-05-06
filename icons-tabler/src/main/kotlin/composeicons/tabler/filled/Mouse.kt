package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Mouse: ImageVector
    get() {
        if (_mouse != null) return _mouse!!
        _mouse = tablerFilledIcon(
            name = "Mouse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 2c2.761 0 5 2.239 5 5v10c0 2.761-2.239 5-5 5h-4C7.239 22 5 19.761 5 17v-10C5 4.239 7.239 2 10 2ZM12 6c-.552 0-1 .448-1 1v4l.007 .117c.062 .525 .523 .911 1.052 .88 .528-.031 .941-.468 .941-.997v-4l-.007-.117C12.934 6.38 12.507 6 12 6Z"),
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
        return _mouse!!
    }

private var _mouse: ImageVector? = null
