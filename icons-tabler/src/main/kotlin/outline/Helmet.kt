package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Helmet: ImageVector
    get() {
        if (_helmet != null) return _helmet!!
        _helmet = tablerOutlineIcon(
            name = "Helmet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 4.000 C 15.814 4.000 19.213 6.405 20.485 10.000 C 21.756 13.596 20.622 17.603 17.656 20.000 L 6.344 20.000 C 3.378 17.603 2.244 13.596 3.515 10.000 C 4.787 6.405 8.186 4.000 12.000 4.000"),
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
        pathData = parseSvgPathData("M 20.000 9.000 L 11.200 9.000 C 10.892 9.000 10.601 9.143 10.412 9.386 C 10.222 9.630 10.156 9.947 10.232 10.246 C 10.739 12.246 11.828 13.664 13.500 14.500 C 15.500 15.500 17.833 16.000 20.500 16.000"),
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
        return _helmet!!
    }

private var _helmet: ImageVector? = null
