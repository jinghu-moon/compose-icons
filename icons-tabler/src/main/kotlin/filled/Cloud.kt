package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Cloud: ImageVector
    get() {
        if (_cloud != null) return _cloud!!
        _cloud = tablerFilledIcon(
            name = "Cloud",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.040 4.305 C 12.235 3.638 14.655 4.081 16.400 5.481 C 17.786 6.589 18.588 8.167 18.652 9.821 L 18.655 10.033 L 18.746 10.036 C 21.046 10.143 22.889 11.997 22.996 14.306 L 23.000 14.517 C 23.000 16.924 21.115 18.889 18.745 18.999 L 18.535 19.004 L 6.657 19.004 L 6.435 18.996 C 3.495 18.886 1.118 16.597 1.005 13.733 L 1.000 13.517 C 1.000 10.770 3.080 8.507 5.784 8.100 L 5.898 8.084 L 5.968 7.903 C 6.631 6.283 8.024 4.997 9.797 4.385 L 10.041 4.305 Z"),
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
        return _cloud!!
    }

private var _cloud: ImageVector? = null
