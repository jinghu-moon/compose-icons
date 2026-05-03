package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CaretDown: ImageVector
    get() {
        if (_caretDown != null) return _caretDown!!
        _caretDown = tablerFilledIcon(
            name = "CaretDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 9.000 C 18.852 9.000 19.297 9.986 18.783 10.623 L 18.707 10.707 L 12.707 16.707 C 12.351 17.063 11.785 17.099 11.387 16.790 L 11.293 16.707 L 5.293 10.707 L 5.210 10.613 L 5.156 10.536 L 5.102 10.440 L 5.085 10.404 L 5.058 10.337 L 5.026 10.229 L 5.016 10.176 L 5.006 10.116 L 5.002 10.059 L 5.002 9.941 L 5.007 9.883 L 5.016 9.823 L 5.026 9.771 L 5.058 9.663 L 5.085 9.596 L 5.155 9.464 L 5.220 9.374 L 5.293 9.293 L 5.387 9.210 L 5.464 9.156 L 5.560 9.102 L 5.596 9.085 L 5.663 9.058 L 5.771 9.026 L 5.824 9.016 L 5.884 9.006 L 5.941 9.002 L 18.000 9.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _caretDown!!
    }

private var _caretDown: ImageVector? = null
