package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CaretRight: ImageVector
    get() {
        if (_caretRight != null) return _caretRight!!
        _caretRight = tablerFilledIcon(
            name = "CaretRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.000 6.000 C 9.000 5.148 9.986 4.703 10.623 5.217 L 10.707 5.293 L 16.707 11.293 C 17.063 11.649 17.099 12.215 16.790 12.613 L 16.707 12.707 L 10.707 18.707 L 10.613 18.790 L 10.536 18.844 L 10.440 18.898 L 10.404 18.915 L 10.337 18.942 L 10.229 18.974 L 10.176 18.984 L 10.116 18.994 L 10.059 18.998 L 10.000 19.000 L 9.941 18.998 L 9.883 18.993 L 9.823 18.984 L 9.771 18.974 L 9.663 18.942 L 9.596 18.915 L 9.464 18.845 L 9.374 18.780 L 9.293 18.707 L 9.210 18.613 L 9.156 18.536 L 9.102 18.440 L 9.085 18.404 L 9.058 18.337 L 9.026 18.229 L 9.016 18.176 L 9.006 18.116 L 9.002 18.059 L 9.000 6.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _caretRight!!
    }

private var _caretRight: ImageVector? = null
