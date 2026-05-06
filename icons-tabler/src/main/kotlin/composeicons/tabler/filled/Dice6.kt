package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Dice6: ImageVector
    get() {
        if (_dice6 != null) return _dice6!!
        _dice6 = tablerFilledIcon(
            name = "Dice6",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.333 2c1.96 0 3.56 1.537 3.662 3.472L22 5.667v12.666c0 1.96-1.537 3.56-3.472 3.662L18.333 22h-12.666C3.717 22 2.109 20.475 2.005 18.528L2 18.333v-12.666C2 3.707 3.537 2.107 5.472 2.005L5.667 2h12.666ZM15.5 15C14.672 15 14 15.672 14 16.5c0 .828 .672 1.5 1.5 1.5C16.328 18 17 17.328 17 16.5 17 15.672 16.328 15 15.5 15M8.5 15C7.672 15 7 15.672 7 16.5 7 17.328 7.672 18 8.5 18 9.328 18 10 17.328 10 16.5 10 15.672 9.328 15 8.5 15M8.5 10.5C7.672 10.5 7 11.172 7 12c0 .828 .672 1.5 1.5 1.5C9.328 13.5 10 12.828 10 12c0-.828-.672-1.5-1.5-1.5M15.5 10.5C14.672 10.5 14 11.172 14 12c0 .828 .672 1.5 1.5 1.5C16.328 13.5 17 12.828 17 12c0-.828-.672-1.5-1.5-1.5M8.5 6C7.672 6 7 6.672 7 7.5 7 8.328 7.672 9 8.5 9 9.328 9 10 8.328 10 7.5 10 6.672 9.328 6 8.5 6M15.5 6C14.672 6 14 6.672 14 7.5 14 8.328 14.672 9 15.5 9 16.328 9 17 8.328 17 7.5 17 6.672 16.328 6 15.5 6"),
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
        return _dice6!!
    }

private var _dice6: ImageVector? = null
