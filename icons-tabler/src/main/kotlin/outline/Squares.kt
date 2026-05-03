package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Squares: ImageVector
    get() {
        if (_squares != null) return _squares!!
        _squares = tablerOutlineIcon(
            name = "Squares",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.000 10.000 C 8.000 8.895 8.895 8.000 10.000 8.000 L 19.000 8.000 C 20.105 8.000 21.000 8.895 21.000 10.000 L 21.000 19.000 C 21.000 20.105 20.105 21.000 19.000 21.000 L 10.000 21.000 C 8.895 21.000 8.000 20.105 8.000 19.000 L 8.000 10.000"),
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
        pathData = parseSvgPathData("M 16.000 8.000 L 16.000 5.000 C 16.000 3.895 15.105 3.000 14.000 3.000 L 5.000 3.000 C 3.895 3.000 3.000 3.895 3.000 5.000 L 3.000 14.000 C 3.000 15.105 3.895 16.000 5.000 16.000 L 8.000 16.000"),
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
        return _squares!!
    }

private var _squares: ImageVector? = null
