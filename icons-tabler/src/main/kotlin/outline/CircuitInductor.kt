package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircuitInductor: ImageVector
    get() {
        if (_circuitInductor != null) return _circuitInductor!!
        _circuitInductor = tablerOutlineIcon(
            name = "CircuitInductor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.000 14.000 L 5.000 14.000 L 5.000 12.000 C 5.000 10.895 5.895 10.000 7.000 10.000 C 8.105 10.000 9.000 10.895 9.000 12.000 L 9.000 14.000 L 9.000 12.500 C 9.000 11.119 10.119 10.000 11.500 10.000 C 12.881 10.000 14.000 11.119 14.000 12.500 L 14.000 14.000 L 14.000 12.500 C 14.000 11.119 15.119 10.000 16.500 10.000 C 17.881 10.000 19.000 11.119 19.000 12.500 L 19.000 14.000 L 22.000 14.000"),
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
        return _circuitInductor!!
    }

private var _circuitInductor: ImageVector? = null
