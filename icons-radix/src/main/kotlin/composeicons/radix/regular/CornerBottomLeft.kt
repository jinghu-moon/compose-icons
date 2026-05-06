package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.CornerBottomLeft: ImageVector
    get() {
        if (_cornerBottomLeft != null) return _cornerBottomLeft!!
        _cornerBottomLeft = radixIcon(
            name = "CornerBottomLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.5 12c.276 0 .5-.224 .5-.5C12 11.224 11.776 11 11.5 11h-1.6C8.772 11 7.955 11 7.313 10.947c-.636-.052-1.057-.153-1.402-.329C5.253 10.283 4.717 9.747 4.382 9.089 4.206 8.743 4.105 8.323 4.053 7.687 4 7.045 4 6.228 4 5.1v-1.6C4 3.224 3.776 3 3.5 3 3.224 3 3 3.224 3 3.5v1.6c0 1.112 0 1.976 .057 2.668 .057 .698 .174 1.265 .434 1.775 .431 .847 1.12 1.535 1.967 1.967 .51 .26 1.078 .377 1.775 .434 .692 .056 1.556 .057 2.668 .057h1.6Z"),
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
        return _cornerBottomLeft!!
    }

private var _cornerBottomLeft: ImageVector? = null
