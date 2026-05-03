package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Strikethrough: ImageVector
    get() {
        if (_strikethrough != null) return _strikethrough!!
        _strikethrough = tablerOutlineIcon(
            name = "Strikethrough",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.000 12.000 L 19.000 12.000"),
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
                pathData = parseSvgPathData("M 16.000 6.500 C 15.533 5.594 13.871 4.970 12.000 5.000 L 11.000 5.000 C 9.067 5.000 7.500 6.567 7.500 8.500 C 7.500 10.433 9.067 12.000 11.000 12.000 L 13.000 12.000 C 14.933 12.000 16.500 13.567 16.500 15.500 C 16.500 17.433 14.933 19.000 13.000 19.000 L 11.500 19.000 C 9.629 19.030 7.967 18.406 7.500 17.500"),
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
        return _strikethrough!!
    }

private var _strikethrough: ImageVector? = null
