package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MapPinSimpleArea: ImageVector
    get() {
        if (_mapPinSimpleArea != null) return _mapPinSimpleArea!!
        _mapPinSimpleArea = phosphorBoldIcon(
            name = "MapPinSimpleArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M116 106.32v69.68c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-69.68c21.127-5.989 34.604-26.639 31.581-48.39C168.558 36.18 149.96 19.988 128 19.988c-21.96 0-40.558 16.192-43.581 37.942C81.396 79.681 94.873 100.331 116 106.32ZM128 44c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20C116.954 84 108 75.046 108 64c0-11.046 8.954-20 20-20ZM244 176c0 21.59-23.9 34-38.15 39.48C184.86 223.56 157.22 228 128 228 70.36 228 12 210.14 12 176c0-22.23 26.12-40.2 69.88-48.06 4.249-.826 8.613 .701 11.421 3.994 2.808 3.294 3.625 7.844 2.138 11.909-1.487 4.065-5.048 7.013-9.318 7.717C51.93 157.71 36 169.78 36 176c0 4 7.12 11.07 22.77 17.08C77.07 200.08 101.66 204 128 204c26.34 0 50.93-3.88 69.23-10.92C212.87 187.07 220 180 220 176c0-6.22-15.93-18.29-50.12-24.44-4.271-.704-7.831-3.652-9.318-7.717-1.487-4.065-.67-8.615 2.138-11.909 2.808-3.294 7.172-4.82 11.421-3.994C217.88 135.8 244 153.77 244 176Z"),
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
        return _mapPinSimpleArea!!
    }

private var _mapPinSimpleArea: ImageVector? = null
