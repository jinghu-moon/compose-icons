package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PhoneOutgoing: ImageVector
    get() {
        if (_phoneOutgoing != null) return _phoneOutgoing!!
        _phoneOutgoing = phosphorRegularIcon(
            name = "PhoneOutgoing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M146.34 109.66c-1.502-1.501-2.346-3.537-2.346-5.66 0-2.123 .844-4.159 2.346-5.66L180.69 64h-20.69c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h40c4.418 0 8 3.582 8 8v40c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-20.69l-34.34 34.35c-1.501 1.502-3.537 2.346-5.66 2.346-2.123 0-4.159-.844-5.66-2.346ZM223.88 183.08C220.191 211.111 196.273 232.051 168 232 88.6 232 24 167.4 24 88 23.949 59.727 44.889 35.809 72.92 32.12c7.035-.861 13.798 3.009 16.62 9.51l21.12 47.16v.12c2.134 4.925 1.658 10.591-1.27 15.09-.18 .27-.37 .52-.57 .77L88 129.45c7.49 15.22 23.41 31 38.83 38.51l24.34-20.71c.239-.201 .489-.388 .75-.56 4.491-3.011 10.203-3.538 15.17-1.4l.13 .06 47.11 21.11c6.517 2.809 10.405 9.575 9.55 16.62ZM208 181.08c0 0-.07 0-.11 0h0l-47-21.06-24.35 20.72c-.236 .2-.483 .387-.74 .56-4.684 3.125-10.665 3.558-15.75 1.14C101.32 173.39 82.65 154.86 73.59 136.33c-2.44-5.047-2.061-11.003 1-15.7 .17-.271 .36-.529 .57-.77L96 95.15l-21-47c-.004-.04-.004-.08 0-.12C54.937 50.647 39.946 67.767 40 88c.077 70.66 57.34 127.923 128 128 20.219 .069 37.345-14.886 40-34.93Z"),
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
        return _phoneOutgoing!!
    }

private var _phoneOutgoing: ImageVector? = null
