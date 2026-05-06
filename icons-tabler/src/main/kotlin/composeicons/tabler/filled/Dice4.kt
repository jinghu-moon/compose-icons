package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Dice4: ImageVector
    get() {
        if (_dice4 != null) return _dice4!!
        _dice4 = tablerFilledIcon(
            name = "Dice4",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.333 2c1.96 0 3.56 1.537 3.662 3.472L22 5.667v12.666c0 1.96-1.537 3.56-3.472 3.662L18.333 22h-12.666C3.717 22 2.109 20.475 2.005 18.528L2 18.333v-12.666C2 3.707 3.537 2.107 5.472 2.005L5.667 2h12.666ZM15.5 14C14.672 14 14 14.672 14 15.5c0 .828 .672 1.5 1.5 1.5C16.328 17 17 16.328 17 15.5 17 14.672 16.328 14 15.5 14M8.5 14C7.672 14 7 14.672 7 15.5 7 16.328 7.672 17 8.5 17 9.328 17 10 16.328 10 15.5 10 14.672 9.328 14 8.5 14M8.5 7C7.672 7 7 7.672 7 8.5 7 9.328 7.672 10 8.5 10 9.328 10 10 9.328 10 8.5 10 7.672 9.328 7 8.5 7M15.5 7C14.672 7 14 7.672 14 8.5c0 .828 .672 1.5 1.5 1.5C16.328 10 17 9.328 17 8.5 17 7.672 16.328 7 15.5 7"),
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
        return _dice4!!
    }

private var _dice4: ImageVector? = null
