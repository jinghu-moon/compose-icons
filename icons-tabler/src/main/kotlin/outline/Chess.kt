package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Chess: ImageVector
    get() {
        if (_chess != null) return _chess!!
        _chess = tablerOutlineIcon(
            name = "Chess",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 3.000 C 13.657 3.000 15.000 4.343 15.000 6.000 C 15.000 7.113 14.400 8.482 13.500 9.000 L 15.000 16.000 L 9.000 16.000 L 10.500 9.000 C 9.600 8.482 9.000 7.113 9.000 6.000 C 9.000 4.343 10.343 3.000 12.000 3.000"),
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
        pathData = parseSvgPathData("M 8.000 9.000 L 16.000 9.000"),
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
        pathData = parseSvgPathData("M 6.684 16.772 C 6.275 16.908 6.000 17.290 6.000 17.721 L 6.000 19.000 C 6.000 19.552 6.448 20.000 7.000 20.000 L 17.000 20.000 C 17.552 20.000 18.000 19.552 18.000 19.000 L 18.000 17.720 C 18.000 17.290 17.724 16.908 17.316 16.772 L 15.000 16.000 L 9.000 16.000 L 6.684 16.772"),
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
        return _chess!!
    }

private var _chess: ImageVector? = null
