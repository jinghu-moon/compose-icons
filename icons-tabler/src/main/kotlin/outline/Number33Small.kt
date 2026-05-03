package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number33Small: ImageVector
    get() {
        if (_number33Small != null) return _number33Small!!
        _number33Small = tablerOutlineIcon(
            name = "Number33Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 8.000 L 16.500 8.000 C 17.328 8.000 18.000 8.672 18.000 9.500 L 18.000 10.500 C 18.000 11.328 17.328 12.000 16.500 12.000 L 15.000 12.000 L 16.500 12.000 C 17.328 12.000 18.000 12.672 18.000 13.500 L 18.000 14.500 C 18.000 15.328 17.328 16.000 16.500 16.000 L 14.000 16.000"),
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
        pathData = parseSvgPathData("M 6.000 8.000 L 8.500 8.000 C 9.328 8.000 10.000 8.672 10.000 9.500 L 10.000 10.500 C 10.000 11.328 9.328 12.000 8.500 12.000 L 7.000 12.000 L 8.500 12.000 C 9.328 12.000 10.000 12.672 10.000 13.500 L 10.000 14.500 C 10.000 15.328 9.328 16.000 8.500 16.000 L 6.000 16.000"),
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
        return _number33Small!!
    }

private var _number33Small: ImageVector? = null
