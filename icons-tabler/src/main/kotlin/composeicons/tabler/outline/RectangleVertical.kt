package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RectangleVertical: ImageVector
    get() {
        if (_rectangleVertical != null) return _rectangleVertical!!
        _rectangleVertical = tablerOutlineIcon(
            name = "RectangleVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 5C5 3.895 5.895 3 7 3h10c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-10C5.895 21 5 20.105 5 19v-14"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _rectangleVertical!!
    }

private var _rectangleVertical: ImageVector? = null
