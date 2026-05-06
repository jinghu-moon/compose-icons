package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RectangleRoundedBottom: ImageVector
    get() {
        if (_rectangleRoundedBottom != null) return _rectangleRoundedBottom!!
        _rectangleRoundedBottom = tablerOutlineIcon(
            name = "RectangleRoundedBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 18h6c3.314 0 6-2.686 6-6v-5C21 6.448 20.552 6 20 6h-16C3.448 6 3 6.448 3 7v5c0 3.314 2.686 6 6 6"),
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
        return _rectangleRoundedBottom!!
    }

private var _rectangleRoundedBottom: ImageVector? = null
