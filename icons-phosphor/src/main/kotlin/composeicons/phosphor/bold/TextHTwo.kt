package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextHTwo: ImageVector
    get() {
        if (_textHTwo != null) return _textHTwo!!
        _textHTwo = phosphorBoldIcon(
            name = "TextHTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M156 56v120c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-48h-80v48c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-120C28 49.373 33.373 44 40 44c6.627 0 12 5.373 12 12v48h80v-48c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM240 196h-24l28.74-38.33c8.535-11.326 9.626-26.608 2.785-39.031C240.684 106.216 227.187 98.966 213.052 100.124c-14.135 1.157-26.273 10.506-31.002 23.876-2.209 6.249 1.066 13.106 7.315 15.315 6.249 2.209 13.106-1.066 15.315-7.315 .404-1.158 .988-2.244 1.73-3.22 2.552-3.509 6.799-5.367 11.108-4.86 4.309 .507 8.008 3.301 9.676 7.306 1.667 4.005 1.043 8.599-1.633 12.014l-43.16 57.56c-2.727 3.636-3.166 8.501-1.133 12.567 2.033 4.065 6.188 6.633 10.733 6.633h48c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12Z"),
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
        return _textHTwo!!
    }

private var _textHTwo: ImageVector? = null
