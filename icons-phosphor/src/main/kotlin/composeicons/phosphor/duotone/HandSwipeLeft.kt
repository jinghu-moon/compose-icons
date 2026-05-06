package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HandSwipeLeft: ImageVector
    get() {
        if (_handSwipeLeft != null) return _handSwipeLeft!!
        _handSwipeLeft = phosphorDuotoneIcon(
            name = "HandSwipeLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 140v36c0 24-8 40-8 40h-136L34.68 166c-5.434-9.557-2.135-21.708 7.386-27.205 9.521-5.497 21.694-2.279 27.254 7.205L88 176v-108C88 56.954 96.954 48 108 48c11.046 0 20 8.954 20 20v56c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20v16c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M216 140v36c0 25.59-8.49 42.85-8.85 43.58-1.355 2.708-4.122 4.418-7.15 4.42-1.24 .001-2.463-.29-3.57-.85-3.951-1.975-5.553-6.778-3.58-10.73 .06-.12 7.16-14.81 7.16-36.42v-36c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v4c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-20c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v12c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-68c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v108c-0 3.571-2.367 6.709-5.8 7.691-3.433 .982-7.102-.43-8.99-3.461l-18.68-30L62.4 150C59.086 144.256 51.744 142.286 46 145.6c-5.744 3.314-7.714 10.656-4.4 16.4l29.29 50c1.68 2.478 1.837 5.686 .405 8.315-1.431 2.629-4.211 4.239-7.204 4.173-2.993-.066-5.698-1.798-7.012-4.488L27.76 170C19.981 156.632 24.512 139.489 37.88 131.71c13.368-7.779 30.511-3.248 38.29 10.12L80 148v-80C80 52.536 92.536 40 108 40c15.464 0 28 12.536 28 28v30.7c7.284-3.457 15.704-3.606 23.106-.41 7.402 3.196 13.066 9.428 15.544 17.1 8.676-4.706 19.189-4.496 27.67 .552 8.482 5.048 13.679 14.188 13.68 24.058ZM248 48h-52.69L213.65 29.66c3.126-3.123 3.128-8.189 .005-11.315-3.123-3.126-8.189-3.128-11.315-.005l-32 32c-1.502 1.501-2.346 3.537-2.346 5.66 0 2.123 .844 4.159 2.346 5.66l32 32c3.126 3.123 8.192 3.121 11.315-.005 3.123-3.126 3.121-8.192-.005-11.315L195.31 64h52.69c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
        return _handSwipeLeft!!
    }

private var _handSwipeLeft: ImageVector? = null
