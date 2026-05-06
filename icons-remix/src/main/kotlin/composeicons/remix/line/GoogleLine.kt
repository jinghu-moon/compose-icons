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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 11h8.533c.044 .385 .067 .779 .067 1.184 0 2.735-.98 5.037-2.678 6.6-1.486 1.371-3.518 2.175-5.943 2.175-3.51 0-6.547-2.012-8.024-4.947C3.347 14.8 3 13.429 3 11.98 3 10.531 3.347 9.159 3.955 7.947 5.433 5.012 8.469 3 11.98 3c2.42 0 4.453 .89 6.008 2.339L16.525 6.801C15.368 5.682 13.803 5 12 5 8.134 5 5 8.134 5 12c0 3.866 3.134 7 7 7 3.526 0 6.144-2.608 6.577-6h-6.577v-2Z"),
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
        return _googleLine!!
    }

private var _googleLine: ImageVector? = null
