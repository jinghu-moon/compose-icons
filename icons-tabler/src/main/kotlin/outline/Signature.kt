package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Signature: ImageVector
    get() {
        if (_signature != null) return _signature!!
        _signature = tablerOutlineIcon(
            name = "Signature",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 17.000 C 6.333 13.667 8.000 11.000 8.000 9.000 C 8.000 6.000 7.000 6.000 6.000 6.000 C 5.000 6.000 3.968 7.085 4.000 9.000 C 4.034 11.048 5.658 13.877 6.500 15.000 C 8.000 17.000 9.000 17.500 10.000 16.000 L 12.000 13.000 C 12.333 15.667 13.333 17.000 15.000 17.000 C 15.530 17.000 17.639 15.000 18.000 15.000 C 18.517 15.000 19.517 15.667 21.000 17.000"),
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
        return _signature!!
    }

private var _signature: ImageVector? = null
