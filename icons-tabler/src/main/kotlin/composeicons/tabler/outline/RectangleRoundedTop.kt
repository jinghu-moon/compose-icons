package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RectangleRoundedTop: ImageVector
    get() {
        if (_rectangleRoundedTop != null) return _rectangleRoundedTop!!
        _rectangleRoundedTop = tablerOutlineIcon(
            name = "RectangleRoundedTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 6h6c3.314 0 6 2.686 6 6v5c0 .552-.448 1-1 1h-16C3.448 18 3 17.552 3 17v-5C3 8.686 5.686 6 9 6"),
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
        return _rectangleRoundedTop!!
    }

private var _rectangleRoundedTop: ImageVector? = null
