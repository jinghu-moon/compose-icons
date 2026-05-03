package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Activity: ImageVector
    get() {
        if (_activity != null) return _activity!!
        _activity = lucideOutlineIcon(
            name = "Activity",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 22.000 12.000 L 19.520 12.000 C 18.622 11.998 17.833 12.595 17.590 13.460 L 15.240 21.820 C 15.209 21.927 15.111 22.000 15.000 22.000 C 14.889 22.000 14.791 21.927 14.760 21.820 L 9.240 2.180 C 9.209 2.073 9.111 2.000 9.000 2.000 C 8.889 2.000 8.791 2.073 8.760 2.180 L 6.410 10.540 C 6.168 11.401 5.384 11.997 4.490 12.000 L 2.000 12.000"),
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
        return _activity!!
    }

private var _activity: ImageVector? = null
