package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PhoneX: ImageVector
    get() {
        if (_phoneX != null) return _phoneX!!
        _phoneX = phosphorFillIcon(
            name = "PhoneX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M146.34 98.34 164.69 80 146.34 61.66c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0L176 68.69 194.34 50.34c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32L187.32 80l18.34 18.34c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0L176 91.31l-18.34 18.35c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32ZM214.34 166.46 167.23 145.35l-.13-.06c-4.969-2.125-10.674-1.599-15.17 1.4-.261 .172-.511 .359-.75 .56L126.87 168C111.45 160.51 95.53 144.71 88.04 129.49l20.78-24.71c.2-.25 .39-.5 .57-.77 2.933-4.482 3.429-10.136 1.32-15.06v-.12L89.54 41.64C86.721 35.135 79.957 31.261 72.92 32.12 44.889 35.809 23.949 59.727 24 88c0 79.4 64.6 144 144 144 28.273 .051 52.191-20.889 55.88-48.92 .861-7.035-3.009-13.798-9.51-16.62Z"),
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
        return _phoneX!!
    }

private var _phoneX: ImageVector? = null
