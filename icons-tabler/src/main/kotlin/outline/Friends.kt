package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Friends: ImageVector
    get() {
        if (_friends != null) return _friends!!
        _friends = tablerOutlineIcon(
            name = "Friends",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.000 5.000 C 5.000 6.105 5.895 7.000 7.000 7.000 C 8.105 7.000 9.000 6.105 9.000 5.000 C 9.000 3.895 8.105 3.000 7.000 3.000 C 5.895 3.000 5.000 3.895 5.000 5.000"),
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
        pathData = parseSvgPathData("M 5.000 22.000 L 5.000 17.000 L 4.000 16.000 L 4.000 12.000 C 4.000 11.448 4.448 11.000 5.000 11.000 L 9.000 11.000 C 9.552 11.000 10.000 11.448 10.000 12.000 L 10.000 16.000 L 9.000 17.000 L 9.000 22.000"),
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
        pathData = parseSvgPathData("M 15.000 5.000 C 15.000 6.105 15.895 7.000 17.000 7.000 C 18.105 7.000 19.000 6.105 19.000 5.000 C 19.000 3.895 18.105 3.000 17.000 3.000 C 15.895 3.000 15.000 3.895 15.000 5.000"),
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
        pathData = parseSvgPathData("M 15.000 22.000 L 15.000 18.000 L 13.000 18.000 L 15.000 12.000 C 15.000 11.448 15.448 11.000 16.000 11.000 L 18.000 11.000 C 18.552 11.000 19.000 11.448 19.000 12.000 L 21.000 18.000 L 19.000 18.000 L 19.000 22.000"),
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
        return _friends!!
    }

private var _friends: ImageVector? = null
