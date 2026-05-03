package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TrafficCone: ImageVector
    get() {
        if (_trafficCone != null) return _trafficCone!!
        _trafficCone = lucideOutlineIcon(
            name = "TrafficCone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.050 10.966 C 15.110 11.615 13.603 12.000 12.000 12.000 C 10.397 12.000 8.890 11.615 7.950 10.966"),
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
        pathData = parseSvgPathData("M 16.923 14.049 L 21.403 16.089 C 21.766 16.248 22.001 16.607 22.001 17.004 C 22.001 17.401 21.767 17.760 21.404 17.920 L 12.830 21.820 C 12.303 22.060 11.697 22.060 11.170 21.820 L 2.596 17.910 C 2.233 17.750 1.999 17.391 1.999 16.995 C 1.999 16.599 2.233 16.240 2.596 16.080 L 7.080 14.040"),
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
        pathData = parseSvgPathData("M 16.949 14.140 C 17.225 15.108 16.346 16.068 14.700 16.596 C 13.055 17.125 10.943 17.125 9.298 16.596 C 7.652 16.068 6.773 15.108 7.049 14.140 L 10.063 3.500 C 10.290 2.616 11.087 1.998 12.000 1.998 C 12.913 1.998 13.710 2.616 13.937 3.500 Z"),
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
        pathData = parseSvgPathData("M 9.194 6.570 C 10.888 7.144 13.110 7.144 14.804 6.570"),
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
        return _trafficCone!!
    }

private var _trafficCone: ImageVector? = null
