package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.StarOffLine: ImageVector
    get() {
        if (_starOffLine != null) return _starOffLine!!
        _starOffLine = remixIcon(
            name = "StarOffLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M23.413 8.792l-5.392 4.987L16.606 12.363l2.266-2.096L14.039 9.694 12.001 5.275l-.784 1.699L9.71 5.467 12.001 .5l3.386 7.34 8.027 .952ZM8.459 9.873l-3.33 .395 3.573 3.304-.948 4.773 4.247-2.377 4.247 2.377-.17-.854L8.459 9.873ZM18.622 20.036l.432 2.172L12.001 18.26 4.947 22.208 6.522 14.28 .588 8.792 6.658 8.072 1.394 2.808 2.808 1.393 22.607 21.192l-1.414 1.414L18.622 20.036Z"),
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
        return _starOffLine!!
    }

private var _starOffLine: ImageVector? = null
