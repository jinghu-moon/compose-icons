package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Binoculars: ImageVector
    get() {
        if (_binoculars != null) return _binoculars!!
        _binoculars = phosphorFillIcon(
            name = "Binoculars",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M237.22 151.9v-.1c-.017-.075-.041-.149-.07-.22-.664-1.811-1.435-3.581-2.31-5.3L193.27 51.8c-.4-.91-.967-1.737-1.67-2.44-6.001-6.003-14.142-9.375-22.63-9.375-8.488 0-16.629 3.372-22.63 9.375C144.845 50.857 144.004 52.885 144 55v25h-32v-25c.002-2.122-.84-4.158-2.34-5.66C103.659 43.337 95.518 39.965 87.03 39.965c-8.488 0-16.629 3.372-22.63 9.375-.703 .703-1.27 1.53-1.67 2.44L21.2 146.28c-.875 1.719-1.646 3.489-2.31 5.3-.028 .068-.051 .139-.07 .21 0 0 0 .08 0 .11-8.595 24.834 4.378 51.962 29.104 60.862 24.726 8.9 52.012-3.738 61.216-28.352 1.947-5.313 2.929-10.931 2.9-16.59v-71.82h32v71.83c-.029 5.659 .953 11.277 2.9 16.59 9.204 24.615 36.49 37.252 61.216 28.352 24.726-8.9 37.699-36.028 29.104-60.862ZM94.07 178.9c-6.148 16.403-24.342 24.815-40.821 18.872C36.771 191.829 28.133 173.742 33.87 157.19l1.81-4.13c6.845-13.012 21.677-19.685 35.955-16.177 14.278 3.508 24.329 16.294 24.365 30.997v.12h0c-.001 3.731-.654 7.434-1.93 10.94ZM203 198.07c-9.817 3.594-20.771 2.165-29.339-3.826C165.094 188.253 159.993 178.454 160 168h0v-.11c.054-14.695 10.111-27.465 24.384-30.962 14.273-3.497 29.094 3.176 35.936 16.182l1.81 4.13c5.923 16.554-2.619 34.786-19.13 40.83Z"),
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
        return _binoculars!!
    }

private var _binoculars: ImageVector? = null
