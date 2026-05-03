package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number13Small: ImageVector
    get() {
        if (_number13Small != null) return _number13Small!!
        _number13Small = tablerOutlineIcon(
            name = "Number13Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.000 8.000 L 9.000 8.000 L 9.000 16.000"),
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
                pathData = parseSvgPathData("M 13.000 8.000 L 15.500 8.000 C 16.328 8.000 17.000 8.672 17.000 9.500 L 17.000 10.500 C 17.000 11.328 16.328 12.000 15.500 12.000 L 14.000 12.000 L 15.500 12.000 C 16.328 12.000 17.000 12.672 17.000 13.500 L 17.000 14.500 C 17.000 15.328 16.328 16.000 15.500 16.000 L 13.000 16.000"),
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
        return _number13Small!!
    }

private var _number13Small: ImageVector? = null
