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
                pathData = parseSvgPathData("M2 14h3v-2c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v2-1.5C9 11.119 10.119 10 11.5 10 12.881 10 14 11.119 14 12.5v1.5-1.5C14 11.119 15.119 10 16.5 10 17.881 10 19 11.119 19 12.5v1.5h3"),
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
