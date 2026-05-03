package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PackageOpen: ImageVector
    get() {
        if (_packageOpen != null) return _packageOpen!!
        _packageOpen = lucideOutlineIcon(
            name = "PackageOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 22.000 L 12.000 13.000"),
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
        pathData = parseSvgPathData("M 15.170 2.210 C 15.676 1.927 16.294 1.927 16.800 2.210 L 21.000 4.570 C 21.606 4.912 21.980 5.554 21.980 6.250 C 21.980 6.946 21.606 7.588 21.000 7.930 L 8.820 14.790 C 8.312 15.080 7.688 15.080 7.180 14.790 L 3.000 12.430 C 2.394 12.088 2.020 11.446 2.020 10.750 C 2.020 10.054 2.394 9.412 3.000 9.070 Z"),
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
        pathData = parseSvgPathData("M 20.000 13.000 L 20.000 16.870 C 20.001 17.639 19.573 18.345 18.890 18.700 L 12.890 21.780 C 12.332 22.070 11.668 22.070 11.110 21.780 L 5.110 18.700 C 4.427 18.345 3.999 17.639 4.000 16.870 L 4.000 13.000"),
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
        pathData = parseSvgPathData("M 21.000 12.430 C 21.606 12.088 21.980 11.446 21.980 10.750 C 21.980 10.054 21.606 9.412 21.000 9.070 L 8.830 2.200 C 8.325 1.911 7.705 1.911 7.200 2.200 L 3.000 4.570 C 2.394 4.912 2.020 5.554 2.020 6.250 C 2.020 6.946 2.394 7.588 3.000 7.930 L 15.180 14.790 C 15.685 15.080 16.305 15.080 16.810 14.790 Z"),
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
        return _packageOpen!!
    }

private var _packageOpen: ImageVector? = null
