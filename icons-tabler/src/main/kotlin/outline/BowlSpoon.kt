package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BowlSpoon: ImageVector
    get() {
        if (_bowlSpoon != null) return _bowlSpoon!!
        _bowlSpoon = tablerOutlineIcon(
            name = "BowlSpoon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 11.000 L 20.000 11.000 C 20.552 11.000 21.000 11.448 21.000 12.000 L 21.000 12.500 C 21.000 14.000 18.483 18.073 17.000 19.000 L 17.000 20.000 C 17.000 20.552 16.552 21.000 16.000 21.000 L 8.000 21.000 C 7.448 21.000 7.000 20.552 7.000 20.000 L 7.000 19.000 C 5.313 17.946 3.000 14.000 3.000 12.500 L 3.000 12.000 C 3.000 11.448 3.448 11.000 4.000 11.000"),
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
        pathData = parseSvgPathData("M 8.000 7.000 C 9.657 7.000 11.000 6.105 11.000 5.000 C 11.000 3.895 9.657 3.000 8.000 3.000 C 6.343 3.000 5.000 3.895 5.000 5.000 C 5.000 6.105 6.343 7.000 8.000 7.000"),
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
        pathData = parseSvgPathData("M 11.000 5.000 L 20.000 5.000"),
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
        return _bowlSpoon!!
    }

private var _bowlSpoon: ImageVector? = null
