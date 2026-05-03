package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HomeHand: ImageVector
    get() {
        if (_homeHand != null) return _homeHand!!
        _homeHand = tablerOutlineIcon(
            name = "HomeHand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 9.000 L 12.000 3.000 L 3.000 12.000 L 5.000 12.000 L 5.000 19.000 C 5.000 20.105 5.895 21.000 7.000 21.000 L 10.500 21.000"),
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
                pathData = parseSvgPathData("M 9.000 21.000 L 9.000 15.000 C 9.000 13.895 9.895 13.000 11.000 13.000 L 13.000 13.000"),
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
                pathData = parseSvgPathData("M 16.000 17.500 L 15.415 16.922 C 14.843 16.420 13.987 16.420 13.415 16.922 C 12.938 17.355 12.864 18.034 13.238 18.544 L 15.000 21.000 C 15.370 21.506 16.331 22.000 17.000 22.000 L 20.000 22.000 C 21.009 22.000 21.497 21.317 21.622 20.407 C 21.874 19.469 22.000 18.667 22.000 18.000 C 22.000 17.000 21.061 16.157 20.000 16.000 L 19.000 16.000 L 19.000 13.364 C 19.000 12.610 18.328 12.000 17.500 12.000 C 16.672 12.000 16.000 12.610 16.000 13.364 L 16.000 17.500"),
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
        return _homeHand!!
    }

private var _homeHand: ImageVector? = null
