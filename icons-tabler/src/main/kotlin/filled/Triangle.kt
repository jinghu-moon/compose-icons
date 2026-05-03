package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Triangle: ImageVector
    get() {
        if (_triangle != null) return _triangle!!
        _triangle = tablerFilledIcon(
            name = "Triangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 1.670 C 10.981 1.670 10.036 2.202 9.508 3.073 L 1.398 16.610 C 0.874 17.506 0.866 18.614 1.378 19.517 C 1.890 20.421 2.844 20.984 3.882 20.995 L 20.107 20.995 C 21.144 20.988 22.100 20.429 22.615 19.529 C 23.131 18.629 23.129 17.522 22.610 16.624 L 14.494 3.078 C 13.966 2.205 13.020 1.671 12.000 1.670 Z"),
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
        return _triangle!!
    }

private var _triangle: ImageVector? = null
