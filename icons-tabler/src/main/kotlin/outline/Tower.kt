package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Tower: ImageVector
    get() {
        if (_tower != null) return _tower!!
        _tower = tablerOutlineIcon(
            name = "Tower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.000 3.000 L 6.000 3.000 C 6.552 3.000 7.000 3.448 7.000 4.000 L 7.000 6.000 L 10.000 6.000 L 10.000 4.000 C 10.000 3.448 10.448 3.000 11.000 3.000 L 13.000 3.000 C 13.552 3.000 14.000 3.448 14.000 4.000 L 14.000 6.000 L 17.000 6.000 L 17.000 4.000 C 17.000 3.448 17.448 3.000 18.000 3.000 L 19.000 3.000 C 19.552 3.000 20.000 3.448 20.000 4.000 L 20.000 8.394 C 20.000 8.789 19.883 9.175 19.664 9.504 L 18.336 11.496 C 18.117 11.825 18.000 12.211 18.000 12.606 L 18.000 20.000 C 18.000 20.552 17.552 21.000 17.000 21.000 L 7.000 21.000 C 6.448 21.000 6.000 20.552 6.000 20.000 L 6.000 12.606 C 6.000 12.211 5.883 11.825 5.664 11.496 L 4.336 9.504 C 4.117 9.175 4.000 8.789 4.000 8.394 L 4.000 4.000 C 4.000 3.448 4.448 3.000 5.000 3.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 10.000 21.000 L 10.000 16.000 C 10.000 14.895 10.895 14.000 12.000 14.000 C 13.105 14.000 14.000 14.895 14.000 16.000 L 14.000 21.000"),
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
        return _tower!!
    }

private var _tower: ImageVector? = null
