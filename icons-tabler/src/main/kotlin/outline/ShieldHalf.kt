package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ShieldHalf: ImageVector
    get() {
        if (_shieldHalf != null) return _shieldHalf!!
        _shieldHalf = tablerOutlineIcon(
            name = "ShieldHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 3.000 C 14.336 5.067 17.384 6.143 20.500 6.000 C 21.416 9.118 21.029 12.473 19.427 15.301 C 17.825 18.128 15.145 20.184 12.000 21.000 C 8.855 20.184 6.175 18.128 4.573 15.301 C 2.971 12.473 2.584 9.118 3.500 6.000 C 6.616 6.143 9.664 5.067 12.000 3.000"),
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
        pathData = parseSvgPathData("M 12.000 3.000 L 12.000 21.000"),
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
        return _shieldHalf!!
    }

private var _shieldHalf: ImageVector? = null
