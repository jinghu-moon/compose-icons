package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChartDots3: ImageVector
    get() {
        if (_chartDots3 != null) return _chartDots3!!
        _chartDots3 = tablerFilledIcon(
            name = "ChartDots3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 2c2.063 .001 3.788 1.571 3.981 3.625 .193 2.054-1.208 3.919-3.235 4.304-2.027 .386-4.015-.834-4.59-2.815L7.862 7.9c-.027 .087-.059 .173-.094 .257l6.446 4.431c.984-.728 2.312-.786 3.355-.145 1.043 .641 1.593 1.851 1.388 3.058-.205 1.207-1.122 2.169-2.318 2.43-1.196 .261-2.431-.231-3.12-1.243L9.992 17.745Q10 17.872 10 18c0 2.209-1.791 4-4 4C3.791 22 2 20.209 2 18l.005-.2c.087-1.738 1.287-3.221 2.969-3.667 1.682-.446 3.46 .246 4.397 1.713l3.64-1.094 .01-.102q.023-.204 .074-.4L6.407 9.65c-.93 .494-2.051 .464-2.953-.079C2.552 9.029 2 8.053 2 7l.005-.176C2.087 5.419 3.134 4.26 4.523 4.036c1.389-.224 2.747 .549 3.266 1.857l6.312-.79C14.519 3.287 16.136 2 18 2"),
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
        return _chartDots3!!
    }

private var _chartDots3: ImageVector? = null
