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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.000 6.000 L 15.000 6.000 C 18.314 6.000 21.000 8.686 21.000 12.000 L 21.000 17.000 C 21.000 17.552 20.552 18.000 20.000 18.000 L 4.000 18.000 C 3.448 18.000 3.000 17.552 3.000 17.000 L 3.000 12.000 C 3.000 8.686 5.686 6.000 9.000 6.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _rectangleRoundedTop!!
    }

private var _rectangleRoundedTop: ImageVector? = null
