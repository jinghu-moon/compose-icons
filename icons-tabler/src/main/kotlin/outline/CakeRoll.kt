package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CakeRoll: ImageVector
    get() {
        if (_cakeRoll != null) return _cakeRoll!!
        _cakeRoll = tablerOutlineIcon(
            name = "CakeRoll",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 15.000 C 7.030 15.000 3.000 12.538 3.000 9.500 C 3.000 6.462 7.030 4.000 12.000 4.000 C 16.970 4.000 21.000 6.462 21.000 9.500 C 21.000 12.538 16.970 15.000 12.000 15.000"),
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
                pathData = parseSvgPathData("M 12.000 6.970 C 15.000 6.970 16.000 8.006 16.000 8.949 C 16.000 11.754 8.000 11.918 8.000 7.959 C 8.000 5.849 9.500 4.000 12.000 4.000"),
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
                pathData = parseSvgPathData("M 21.000 9.333 L 21.000 14.667 C 21.000 17.612 16.970 20.000 12.000 20.000 C 7.030 20.000 3.000 17.612 3.000 14.667 L 3.000 9.333"),
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
        return _cakeRoll!!
    }

private var _cakeRoll: ImageVector? = null
