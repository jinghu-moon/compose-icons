package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Island: ImageVector
    get() {
        if (_island != null) return _island!!
        _island = phosphorBoldIcon(
            name = "Island",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M241.37 231.5c-1.989 2.486-4.884 4.079-8.048 4.43-3.164 .351-6.337-.57-8.822-2.56C224.16 233.1 186.64 204 128 204c-58.64 0-96.17 29.1-96.54 29.39-5.18 4.142-12.738 3.3-16.88-1.88-4.142-5.18-3.3-12.738 1.88-16.88 1.62-1.3 37.57-29.53 95.85-34C109.916 169.273 109.139 157.635 110 146.06c1.67-20.79 9.88-47.91 37-69.78-2.22-.218-4.451-.295-6.68-.23-17.2 .56-27.61 10.37-32.74 30.88-1.337 5.312-6.102 9.044-11.58 9.07-.985 .002-1.966-.119-2.92-.36-6.428-1.608-10.336-8.122-8.73-14.55C88.81 83.3 101.91 53.27 139.61 52.09c4.954-.131 9.909 .204 14.8 1-3.47-4.89-7.81-9.21-13.08-11.39-8.28-3.43-18.73-1.33-31.06 6.23-5.661 3.466-13.059 1.686-16.525-3.975C90.279 38.294 92.059 30.896 97.72 27.43c19.3-11.84 37.11-14.5 52.93-7.89 10.46 4.37 19.63 12.92 26.75 24.88 5.86-7.19 12.72-12.18 20.2-14.61 16.42-5.35 31.7 2.47 41.63 10 3.527 2.546 5.4 6.802 4.895 11.123-.505 4.321-3.309 8.03-7.329 9.694-4.019 1.664-8.625 1.022-12.036-1.677-7.79-5.89-14.42-8-19.68-6.32-4.57 1.47-8.45 5.67-11.43 10.19 5.704 1.596 11.194 3.876 16.35 6.79 15.48 8.87 34 27.6 34 66.39 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-20-6.13-34.43-18.21-43.15 4.492 16.641 1.836 34.402-7.33 49-2.174 3.858-6.295 6.205-10.722 6.106-4.427-.099-8.44-2.628-10.439-6.579-1.999-3.951-1.661-8.682 .882-12.308 2.908-4.815 4.785-10.182 5.51-15.76 1.18-9.09-1.07-17.81-6.66-26-23.61 14.28-36.72 34.36-39 59.8-.894 11.103 .076 22.277 2.87 33.06 62.23 2.71 100.91 33.07 102.6 34.42 2.497 1.99 4.099 4.893 4.45 8.066 .351 3.174-.577 6.356-2.58 8.844ZM20 144c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32C34.327 176 20 161.673 20 144ZM44 144c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8Z"),
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
        return _island!!
    }

private var _island: ImageVector? = null
