package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Sort09: ImageVector
    get() {
        if (_sort09 != null) return _sort09!!
        _sort09 = tablerOutlineIcon(
            name = "Sort09",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.000 12.000 L 13.000 12.000"),
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
        pathData = parseSvgPathData("M 4.000 10.000 L 4.000 14.000 C 4.000 15.105 4.895 16.000 6.000 16.000 C 7.105 16.000 8.000 15.105 8.000 14.000 L 8.000 10.000 C 8.000 8.895 7.105 8.000 6.000 8.000 C 4.895 8.000 4.000 8.895 4.000 10.000"),
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
        pathData = parseSvgPathData("M 16.000 15.000 C 16.000 15.552 16.448 16.000 17.000 16.000 L 19.000 16.000 C 19.552 16.000 20.000 15.552 20.000 15.000 L 20.000 9.000 C 20.000 8.448 19.552 8.000 19.000 8.000 L 17.000 8.000 C 16.448 8.000 16.000 8.448 16.000 9.000 L 16.000 11.000 C 16.000 11.552 16.448 12.000 17.000 12.000 L 20.000 12.000"),
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
        return _sort09!!
    }

private var _sort09: ImageVector? = null
