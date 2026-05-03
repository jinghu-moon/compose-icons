package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.UsersGroup: ImageVector
    get() {
        if (_usersGroup != null) return _usersGroup!!
        _usersGroup = tablerOutlineIcon(
            name = "UsersGroup",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 13.000 C 10.000 14.105 10.895 15.000 12.000 15.000 C 13.105 15.000 14.000 14.105 14.000 13.000 C 14.000 11.895 13.105 11.000 12.000 11.000 C 10.895 11.000 10.000 11.895 10.000 13.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 8.000 21.000 L 8.000 20.000 C 8.000 18.895 8.895 18.000 10.000 18.000 L 14.000 18.000 C 15.105 18.000 16.000 18.895 16.000 20.000 L 16.000 21.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 15.000 5.000 C 15.000 6.105 15.895 7.000 17.000 7.000 C 18.105 7.000 19.000 6.105 19.000 5.000 C 19.000 3.895 18.105 3.000 17.000 3.000 C 15.895 3.000 15.000 3.895 15.000 5.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 17.000 10.000 L 19.000 10.000 C 20.105 10.000 21.000 10.895 21.000 12.000 L 21.000 13.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 5.000 5.000 C 5.000 6.105 5.895 7.000 7.000 7.000 C 8.105 7.000 9.000 6.105 9.000 5.000 C 9.000 3.895 8.105 3.000 7.000 3.000 C 5.895 3.000 5.000 3.895 5.000 5.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 3.000 13.000 L 3.000 12.000 C 3.000 10.895 3.895 10.000 5.000 10.000 L 7.000 10.000"),
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
        return _usersGroup!!
    }

private var _usersGroup: ImageVector? = null
