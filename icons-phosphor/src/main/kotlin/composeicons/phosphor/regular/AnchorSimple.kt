package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.AnchorSimple: ImageVector
    get() {
        if (_anchorSimple != null) return _anchorSimple!!
        _anchorSimple = phosphorRegularIcon(
            name = "AnchorSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 112h-24c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h15.64c-3.92 42.252-37.387 75.715-79.64 79.63v-112.63c15.602-4.029 25.775-19.03 23.745-35.016C157.714 43.998 144.114 32.016 128 32.016c-16.114 0-29.715 11.982-31.745 27.968C94.225 75.97 104.398 90.971 120 95v112.63C77.747 203.715 44.28 170.252 40.36 128h15.64c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-24c-4.418 0-8 3.582-8 8 0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104 0-4.418-3.582-8-8-8ZM112 64c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16Z"),
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
        return _anchorSimple!!
    }

private var _anchorSimple: ImageVector? = null
