package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Hockey: ImageVector
    get() {
        if (_hockey != null) return _hockey!!
        _hockey = phosphorBoldIcon(
            name = "Hockey",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 148h-91.25L41.14 40.23C36.801 35.374 29.381 34.865 24.419 39.083c-4.962 4.218-5.654 11.623-1.559 16.687l95.16 112 .06 .07L156.46 213c3.809 4.453 9.38 7.012 15.24 7h52.3c11.046 0 20-8.954 20-20v-32c0-11.046-8.954-20-20-20ZM153.15 172h26.85v24h-6.45ZM220 196h-16v-24h16ZM153.66 112.23 214.86 40.23c4.339-4.856 11.759-5.365 16.721-1.147 4.962 4.218 5.654 11.623 1.559 16.687l-61.2 72c-2.74 3.389-7.101 5.026-11.394 4.277-4.293-.749-7.842-3.766-9.273-7.883-1.43-4.116-.517-8.684 2.387-11.934ZM109.52 182.68c-5.049-4.289-12.618-3.676-16.91 1.37L82.45 196h-6.45v-24.07c6.34-.688 11.034-6.214 10.688-12.581C86.342 152.982 81.077 147.997 74.7 148h-42.7c-11.046 0-20 8.954-20 20v32c0 11.046 8.954 20 20 20h52.3c5.86 .012 11.431-2.547 15.24-7l11.35-13.36c2.075-2.427 3.098-5.582 2.841-8.765-.257-3.183-1.773-6.133-4.211-8.195ZM36 172h16v24h-16Z"),
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
        return _hockey!!
    }

private var _hockey: ImageVector? = null
