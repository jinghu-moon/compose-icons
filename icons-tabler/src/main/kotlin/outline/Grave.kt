package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Grave: ImageVector
    get() {
        if (_grave != null) return _grave!!
        _grave = tablerOutlineIcon(
            name = "Grave",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.000 21.000 L 5.000 19.000 C 5.000 17.343 6.343 16.000 8.000 16.000 L 16.000 16.000 C 17.657 16.000 19.000 17.343 19.000 19.000 L 19.000 21.000 L 5.000 21.000"),
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
        pathData = parseSvgPathData("M 10.000 16.000 L 10.000 11.000 L 6.000 11.000 L 6.000 7.000 L 10.000 7.000 L 10.000 3.000 L 14.000 3.000 L 14.000 7.000 L 18.000 7.000 L 18.000 11.000 L 14.000 11.000 L 14.000 16.000"),
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
        return _grave!!
    }

private var _grave: ImageVector? = null
