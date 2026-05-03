package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number3Small: ImageVector
    get() {
        if (_number3Small != null) return _number3Small!!
        _number3Small = tablerOutlineIcon(
            name = "Number3Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 8.000 L 12.500 8.000 C 13.328 8.000 14.000 8.672 14.000 9.500 L 14.000 10.500 C 14.000 11.328 13.328 12.000 12.500 12.000 L 11.000 12.000 L 12.500 12.000 C 13.328 12.000 14.000 12.672 14.000 13.500 L 14.000 14.500 C 14.000 15.328 13.328 16.000 12.500 16.000 L 10.000 16.000"),
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
        return _number3Small!!
    }

private var _number3Small: ImageVector? = null
