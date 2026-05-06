package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShirtFolded: ImageVector
    get() {
        if (_shirtFolded != null) return _shirtFolded!!
        _shirtFolded = phosphorBoldIcon(
            name = "ShirtFolded",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 36h-23L164.49 23.51h0C162.238 21.26 159.184 19.997 156 20h-56c-3.184-.003-6.238 1.26-8.49 3.51h0L79 36h-23C44.954 36 36 44.954 36 56v152c0 11.046 8.954 20 20 20h144c11.046 0 20-8.954 20-20v-152C220 44.954 211.046 36 200 36ZM96 53l7.33-7.33 15.49 26.53L96 94.48ZM137.18 72.2 152.67 45.64 160 53v41.48ZM60 60h12v44c-.002 8.074 4.851 15.358 12.303 18.466 7.452 3.107 16.042 1.429 21.777-4.256L116 108.5v95.5h-56ZM196 204h-56v-95.5l9.92 9.69c5.732 5.682 14.317 7.362 21.768 4.259C179.138 119.347 183.994 112.071 184 104v-44h12Z"),
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
        return _shirtFolded!!
    }

private var _shirtFolded: ImageVector? = null
