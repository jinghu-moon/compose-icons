package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number31Small: ImageVector
    get() {
        if (_number31Small != null) return _number31Small!!
        _number31Small = tablerOutlineIcon(
            name = "Number31Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 8.000 L 16.000 8.000 L 16.000 16.000"),
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
                pathData = parseSvgPathData("M 7.000 8.000 L 9.500 8.000 C 10.328 8.000 11.000 8.672 11.000 9.500 L 11.000 10.500 C 11.000 11.328 10.328 12.000 9.500 12.000 L 8.000 12.000 L 9.500 12.000 C 10.328 12.000 11.000 12.672 11.000 13.500 L 11.000 14.500 C 11.000 15.328 10.328 16.000 9.500 16.000 L 7.000 16.000"),
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
        return _number31Small!!
    }

private var _number31Small: ImageVector? = null
