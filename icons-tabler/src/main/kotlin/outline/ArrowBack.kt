package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowBack: ImageVector
    get() {
        if (_arrowBack != null) return _arrowBack!!
        _arrowBack = tablerOutlineIcon(
            name = "ArrowBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.000 11.000 L 5.000 15.000 L 9.000 19.000M 5.000 15.000 L 16.000 15.000 C 18.209 15.000 20.000 13.209 20.000 11.000 C 20.000 8.791 18.209 7.000 16.000 7.000 L 15.000 7.000"),
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
        return _arrowBack!!
    }

private var _arrowBack: ImageVector? = null
