package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number123: ImageVector
    get() {
        if (_number123 != null) return _number123!!
        _number123 = tablerOutlineIcon(
            name = "Number123",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 10.000 L 5.000 8.000 L 5.000 16.000"),
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
                pathData = parseSvgPathData("M 9.000 8.000 L 12.000 8.000 C 12.552 8.000 13.000 8.448 13.000 9.000 L 13.000 11.000 C 13.000 11.552 12.552 12.000 12.000 12.000 L 10.000 12.000 C 9.448 12.000 9.000 12.448 9.000 13.000 L 9.000 15.000 C 9.000 15.552 9.448 16.000 10.000 16.000 L 13.000 16.000"),
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
                pathData = parseSvgPathData("M 17.000 8.000 L 19.500 8.000 C 20.328 8.000 21.000 8.672 21.000 9.500 L 21.000 10.500 C 21.000 11.328 20.328 12.000 19.500 12.000 L 18.000 12.000 L 19.500 12.000 C 20.328 12.000 21.000 12.672 21.000 13.500 L 21.000 14.500 C 21.000 15.328 20.328 16.000 19.500 16.000 L 17.000 16.000"),
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
        return _number123!!
    }

private var _number123: ImageVector? = null
