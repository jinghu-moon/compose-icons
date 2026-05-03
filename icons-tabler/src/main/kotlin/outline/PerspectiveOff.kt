package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PerspectiveOff: ImageVector
    get() {
        if (_perspectiveOff != null) return _perspectiveOff!!
        _perspectiveOff = tablerOutlineIcon(
            name = "PerspectiveOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.511 4.502 L 18.141 5.877 C 18.634 5.947 19.000 6.369 19.000 6.867 L 19.000 15.000M 18.141 18.123 L 6.141 19.837 C 5.854 19.878 5.564 19.792 5.345 19.602 C 5.126 19.412 5.000 19.137 5.000 18.847 L 5.000 5.153 C 5.000 5.107 5.004 5.061 5.010 5.016"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
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
        return _perspectiveOff!!
    }

private var _perspectiveOff: ImageVector? = null
