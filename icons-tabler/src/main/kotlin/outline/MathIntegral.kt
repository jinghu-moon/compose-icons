package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MathIntegral: ImageVector
    get() {
        if (_mathIntegral != null) return _mathIntegral!!
        _mathIntegral = tablerOutlineIcon(
            name = "MathIntegral",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.000 19.000 C 7.000 20.105 7.895 21.000 9.000 21.000 C 11.000 21.000 11.000 17.000 12.000 12.000 C 13.000 7.000 13.000 3.000 15.000 3.000 C 16.105 3.000 17.000 3.895 17.000 5.000"),
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
        return _mathIntegral!!
    }

private var _mathIntegral: ImageVector? = null
