package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Hourglass: ImageVector
    get() {
        if (_hourglass != null) return _hourglass!!
        _hourglass = phosphorThinIcon(
            name = "Hourglass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M196 75.64v-35.64c0-6.627-5.373-12-12-12h-112C65.373 28 60 33.373 60 40v36c0 3.777 1.778 7.334 4.8 9.6L121.33 128 64.8 170.4C61.778 172.666 60 176.223 60 180v36c0 6.627 5.373 12 12 12h112c6.627 0 12-5.373 12-12v-35.64c-.008-3.758-1.768-7.297-4.76-9.57L134.63 128 191.24 85.21c2.992-2.273 4.752-5.812 4.76-9.57ZM188 180.36v35.64c0 2.209-1.791 4-4 4h-112c-2.209 0-4-1.791-4-4v-36c0-1.259 .593-2.445 1.6-3.2L128 133l58.42 44.16c1 .76 1.585 1.944 1.58 3.2ZM188 75.64c-.001 1.254-.589 2.435-1.59 3.19L128 123 69.6 79.2C68.593 78.445 68 77.259 68 76v-36c0-2.209 1.791-4 4-4h112c2.209 0 4 1.791 4 4Z"),
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
        return _hourglass!!
    }

private var _hourglass: ImageVector? = null
