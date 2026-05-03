package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.UserScreen: ImageVector
    get() {
        if (_userScreen != null) return _userScreen!!
        _userScreen = tablerOutlineIcon(
            name = "UserScreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.030 17.818 C 20.213 17.385 21.000 16.260 21.000 15.000 L 21.000 7.000 C 21.000 5.343 19.657 4.000 18.000 4.000 L 6.000 4.000 C 4.343 4.000 3.000 5.343 3.000 7.000 L 3.000 15.000 C 3.000 16.317 3.850 17.436 5.030 17.840"),
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
                pathData = parseSvgPathData("M 10.000 14.000 C 10.000 15.105 10.895 16.000 12.000 16.000 C 13.105 16.000 14.000 15.105 14.000 14.000 C 14.000 12.895 13.105 12.000 12.000 12.000 C 10.895 12.000 10.000 12.895 10.000 14.000"),
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
                pathData = parseSvgPathData("M 8.000 21.000 C 8.000 19.895 8.895 19.000 10.000 19.000 L 14.000 19.000 C 15.105 19.000 16.000 19.895 16.000 21.000"),
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
        return _userScreen!!
    }

private var _userScreen: ImageVector? = null
