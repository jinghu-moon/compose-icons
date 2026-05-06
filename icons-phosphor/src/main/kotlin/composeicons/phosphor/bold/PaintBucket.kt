package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PaintBucket: ImageVector
    get() {
        if (_paintBucket != null) return _paintBucket!!
        _paintBucket = phosphorBoldIcon(
            name = "PaintBucket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.79 142.88c3.947-1.313 6.933-4.576 7.891-8.624 .958-4.048-.25-8.303-3.191-11.246L125 7.52C122.748 5.261 119.69 3.991 116.5 3.991c-3.19 0-6.248 1.27-8.5 3.529L70.25 45.29 48.48 23.52c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17L53.28 62.26 12.2 103.35c-5.252 5.251-8.202 12.373-8.202 19.8 0 7.427 2.95 14.549 8.202 19.8l84.86 84.86c5.251 5.252 12.373 8.202 19.8 8.202 7.427 0 14.549-2.95 19.8-8.202L214.48 150ZM204.21 128.11c-1.771 .588-3.38 1.581-4.7 2.9l-79.82 79.83c-.75 .751-1.768 1.173-2.83 1.173-1.062 0-2.08-.422-2.83-1.173L29.17 126c-.751-.75-1.173-1.768-1.173-2.83 0-1.062 .422-2.08 1.173-2.83L70.25 79.24l24.29 24.29c-5.971 14.1-1.116 30.455 11.581 39.014 12.698 8.559 29.679 6.922 40.509-3.904h0c10.819-10.833 12.449-27.811 3.89-40.504C141.96 85.442 125.608 80.59 111.51 86.56L87.23 62.26 116.52 33l93.27 93.28ZM118.34 110.36h0c3.135-3.102 8.189-3.082 11.299 .045 3.11 3.127 3.103 8.18-.015 11.299-3.118 3.118-8.172 3.125-11.299 .015-3.127-3.11-3.147-8.164-.045-11.299ZM256 208c0 13.255-10.745 24-24 24-13.255 0-24-10.745-24-24 0-19.44 12.93-37.23 14.4-39.2C224.666 165.778 228.223 164 232 164c3.777 0 7.334 1.778 9.6 4.8C243.07 170.78 256 188.57 256 208Z"),
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
        return _paintBucket!!
    }

private var _paintBucket: ImageVector? = null
