package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PlaneTakeoff: ImageVector
    get() {
        if (_planeTakeoff != null) return _planeTakeoff!!
        _planeTakeoff = lucideOutlineIcon(
            name = "PlaneTakeoff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.000 22.000 L 22.000 22.000"),
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
        pathData = parseSvgPathData("M 6.360 17.400 L 4.000 17.000 L 2.000 13.000 L 3.100 12.450 C 3.666 12.165 4.334 12.165 4.900 12.450 L 5.070 12.550 C 5.636 12.835 6.304 12.835 6.870 12.550 L 8.000 12.000 L 5.000 6.000 L 5.900 5.550 C 6.578 5.216 7.387 5.294 7.990 5.750 L 12.010 8.750 C 12.615 9.210 13.429 9.288 14.110 8.950 L 18.300 6.890 C 18.835 6.620 19.452 6.559 20.030 6.720 L 21.000 7.000 C 21.406 7.113 21.739 7.402 21.908 7.788 C 22.077 8.174 22.063 8.616 21.870 8.990 L 21.490 9.750 C 21.260 10.210 20.890 10.590 20.420 10.830 L 7.580 17.200 C 7.202 17.387 6.775 17.450 6.360 17.380 Z"),
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
        return _planeTakeoff!!
    }

private var _planeTakeoff: ImageVector? = null
