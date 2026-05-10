package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Reddit2Fill: ImageVector
    get() {
        if (_reddit2Fill != null) return _reddit2Fill!!
        _reddit2Fill = remixIcon(
            name = "Reddit2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.254 .9c1.313 0 2.378 1.064 2.378 2.377-0 1.313-1.065 2.378-2.378 2.378-1.123 0-2.063-.78-2.312-1.827-1.383 .186-2.452 1.372-2.452 2.805-0 .003-.002 .005-.002 .008 2.128 .079 4.073 .678 5.614 1.632 .566-.435 1.274-.693 2.042-.693 1.853 0 3.355 1.502 3.355 3.356-0 1.339-.784 2.494-1.918 3.032-.107 3.898-4.35 7.033-9.573 7.033-5.22 0-9.462-3.131-9.574-7.026C1.292 13.439 .5 12.279 .5 10.934 .5 9.081 2.002 7.579 3.855 7.579c.772 0 1.482 .261 2.049 .699C7.43 7.331 9.354 6.733 11.46 6.644c-0-.003-.001-.007-.001-.011 0-1.997 1.523-3.645 3.468-3.844C15.152 1.711 16.108 .9 17.254 .9ZM12.008 15.716c-1.165 0-2.283 .057-3.315 .162-.177 .017-.289 .201-.22 .364 .579 1.382 1.944 2.354 3.535 2.354 1.591 0 2.958-.971 3.535-2.354 .069-.164-.044-.347-.22-.364-1.034-.105-2.15-.162-3.315-.162ZM7.575 10.914c-.941 0-1.749 .79-1.805 1.998-.056 1.208 .662 1.864 1.603 1.864 .882-0 1.646-.386 1.784-1.43l.02-.216C9.233 11.922 8.516 10.914 7.575 10.914ZM16.442 10.914c-.941 0-1.658 1.009-1.602 2.217l.019 .216c.138 1.043 .904 1.43 1.785 1.43 .94 0 1.657-.657 1.602-1.864-.056-1.208-.863-1.998-1.804-1.998Z"),
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
        return _reddit2Fill!!
    }

private var _reddit2Fill: ImageVector? = null
