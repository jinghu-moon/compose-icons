package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Goblet2Fill: ImageVector
    get() {
        if (_goblet2Fill != null) return _goblet2Fill!!
        _goblet2Fill = remixIcon(
            name = "Goblet2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.133 2.000 L 5.011 9.859 C 4.708 11.973 5.532 13.789 6.891 15.047 C 7.996 16.069 9.459 16.732 11.000 16.934 L 11.000 20.000 L 6.000 20.000 L 6.000 22.000 L 18.000 22.000 L 18.000 20.000 L 13.000 20.000 L 13.000 16.934 C 14.542 16.732 16.005 16.069 17.110 15.047 C 18.469 13.789 19.292 11.973 18.990 9.859 L 17.868 2.000 L 6.133 2.000 ZM 10.000 7.000 C 9.169 7.000 8.162 7.242 7.371 7.476 L 7.868 4.000 L 16.133 4.000 L 16.623 7.431 C 15.785 7.707 14.890 8.000 14.000 8.000 C 12.608 8.000 11.428 7.000 10.000 7.000 Z"),
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
        return _goblet2Fill!!
    }

private var _goblet2Fill: ImageVector? = null
