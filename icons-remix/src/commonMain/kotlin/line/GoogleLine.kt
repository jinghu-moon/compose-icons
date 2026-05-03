package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GoogleLine: ImageVector
    get() {
        if (_googleLine != null) return _googleLine!!
        _googleLine = remixIcon(
            name = "GoogleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 11.000 L 20.533 11.000 C 20.577 11.385 20.600 11.779 20.600 12.184 C 20.600 14.918 19.620 17.220 17.922 18.784 C 16.437 20.155 14.404 20.959 11.980 20.959 C 8.469 20.959 5.433 18.947 3.955 16.012 C 3.347 14.800 3.000 13.429 3.000 11.980 C 3.000 10.531 3.347 9.159 3.955 7.947 C 5.433 5.012 8.469 3.000 11.980 3.000 C 14.400 3.000 16.433 3.890 17.988 5.339 L 16.525 6.801 C 15.368 5.682 13.803 5.000 12.000 5.000 C 8.134 5.000 5.000 8.134 5.000 12.000 C 5.000 15.866 8.134 19.000 12.000 19.000 C 15.526 19.000 18.144 16.392 18.577 13.000 L 12.000 13.000 L 12.000 11.000 Z"),
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
        return _googleLine!!
    }

private var _googleLine: ImageVector? = null
