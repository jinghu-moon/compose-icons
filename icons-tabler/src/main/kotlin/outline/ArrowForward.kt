package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowForward: ImageVector
    get() {
        if (_arrowForward != null) return _arrowForward!!
        _arrowForward = tablerOutlineIcon(
            name = "ArrowForward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.000 11.000 L 19.000 15.000 L 15.000 19.000M 19.000 15.000 L 8.000 15.000 C 5.791 15.000 4.000 13.209 4.000 11.000 C 4.000 8.791 5.791 7.000 8.000 7.000 L 9.000 7.000"),
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
        return _arrowForward!!
    }

private var _arrowForward: ImageVector? = null
