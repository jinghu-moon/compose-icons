package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Speedometer: ImageVector
    get() {
        if (_speedometer != null) return _speedometer!!
        _speedometer = phosphorRegularIcon(
            name = "Speedometer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M114.34 154.34l96-96c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32l-96 96c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32ZM128 88c6.949-.009 13.853 1.116 20.44 3.33 2.722 .965 5.753 .388 7.93-1.509 2.177-1.897 3.162-4.821 2.578-7.649-.584-2.828-2.647-5.122-5.398-6.002C127.64 67.435 99.064 72.538 77.779 89.7 56.493 106.863 45.447 133.707 48.49 160.88c.448 4.049 3.867 7.114 7.94 7.12 .29 0 .59 0 .89-.05 4.39-.487 7.555-4.44 7.07-8.83C64.13 156.756 63.999 154.379 64 152c.039-35.33 28.67-63.961 64-64ZM227.74 101c-2.016-3.932-6.838-5.486-10.77-3.47-3.932 2.016-5.486 6.838-3.47 10.77 11.961 23.488 13.768 50.853 5 75.71L37.4 183.94C27.148 154.553 31.741 122.022 49.728 96.621 67.715 71.221 96.876 56.087 128 56h.88c14.899 .094 29.568 3.691 42.82 10.5 2.553 1.405 5.667 1.311 8.13-.246 2.463-1.556 3.885-4.329 3.713-7.237-.173-2.909-1.913-5.493-4.543-6.747C138.179 31.361 88.736 37.453 54.212 67.645 19.688 97.837 7.059 146.027 22.34 189.27c2.261 6.417 8.317 10.714 15.12 10.73h181.07c6.801 .004 12.861-4.291 15.11-10.71 10.197-29.001 8.064-60.913-5.9-88.3Z"),
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
        return _speedometer!!
    }

private var _speedometer: ImageVector? = null
