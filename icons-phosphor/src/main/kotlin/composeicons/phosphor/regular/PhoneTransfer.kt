package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PhoneTransfer: ImageVector
    get() {
        if (_phoneTransfer != null) return _phoneTransfer!!
        _phoneTransfer = phosphorRegularIcon(
            name = "PhoneTransfer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M136 72c0-4.418 3.582-8 8-8h52.69L178.34 45.66c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0l32 32c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66l-32 32c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L196.69 80h-52.69c-4.418 0-8-3.582-8-8ZM223.87 183.08C220.19 211.112 196.272 232.054 168 232 88.6 232 24 167.4 24 88 23.946 59.728 44.888 35.81 72.92 32.13c7.035-.861 13.798 3.009 16.62 9.51l21.12 47.15v.12c2.134 4.925 1.658 10.591-1.27 15.09-.18 .27-.37 .52-.57 .77L88 129.45c7.49 15.22 23.41 31 38.83 38.51l24.34-20.71c.239-.201 .489-.388 .75-.56 4.498-3.002 10.209-3.529 15.18-1.4l.11 .06 47.11 21.11c6.517 2.809 10.405 9.575 9.55 16.62ZM208 181.08c0 0-.07 0-.11 0h0l-47-21.05-24.35 20.71c-.236 .201-.483 .388-.74 .56-4.684 3.125-10.665 3.558-15.75 1.14-18.73-9-37.4-27.58-46.46-46.11-2.44-5.047-2.061-11.003 1-15.7 .172-.269 .363-.527 .57-.77L96 95.15l-21-47c-.004-.04-.004-.08 0-.12C54.937 50.647 39.946 67.767 40 88c.077 70.66 57.34 127.923 128 128 20.219 .069 37.345-14.886 40-34.93Z"),
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
        return _phoneTransfer!!
    }

private var _phoneTransfer: ImageVector? = null
