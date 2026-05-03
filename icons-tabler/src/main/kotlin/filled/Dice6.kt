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
                pathData = parseSvgPathData("M 18.333 2.000 C 20.293 2.000 21.893 3.537 21.995 5.472 L 22.000 5.667 L 22.000 18.333 C 22.000 20.293 20.463 21.893 18.528 21.995 L 18.333 22.000 L 5.667 22.000 C 3.717 22.000 2.109 20.475 2.005 18.528 L 2.000 18.333 L 2.000 5.667 C 2.000 3.707 3.537 2.107 5.472 2.005 L 5.667 2.000 L 18.333 2.000 ZM 15.500 15.000 C 14.672 15.000 14.000 15.672 14.000 16.500 C 14.000 17.328 14.672 18.000 15.500 18.000 C 16.328 18.000 17.000 17.328 17.000 16.500 C 17.000 15.672 16.328 15.000 15.500 15.000M 8.500 15.000 C 7.672 15.000 7.000 15.672 7.000 16.500 C 7.000 17.328 7.672 18.000 8.500 18.000 C 9.328 18.000 10.000 17.328 10.000 16.500 C 10.000 15.672 9.328 15.000 8.500 15.000M 8.500 10.500 C 7.672 10.500 7.000 11.172 7.000 12.000 C 7.000 12.828 7.672 13.500 8.500 13.500 C 9.328 13.500 10.000 12.828 10.000 12.000 C 10.000 11.172 9.328 10.500 8.500 10.500M 15.500 10.500 C 14.672 10.500 14.000 11.172 14.000 12.000 C 14.000 12.828 14.672 13.500 15.500 13.500 C 16.328 13.500 17.000 12.828 17.000 12.000 C 17.000 11.172 16.328 10.500 15.500 10.500M 8.500 6.000 C 7.672 6.000 7.000 6.672 7.000 7.500 C 7.000 8.328 7.672 9.000 8.500 9.000 C 9.328 9.000 10.000 8.328 10.000 7.500 C 10.000 6.672 9.328 6.000 8.500 6.000M 15.500 6.000 C 14.672 6.000 14.000 6.672 14.000 7.500 C 14.000 8.328 14.672 9.000 15.500 9.000 C 16.328 9.000 17.000 8.328 17.000 7.500 C 17.000 6.672 16.328 6.000 15.500 6.000"),
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
