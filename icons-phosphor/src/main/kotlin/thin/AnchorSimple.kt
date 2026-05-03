package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AnchorSimple: ImageVector
    get() {
        if (_anchorSimple != null) return _anchorSimple!!
        _anchorSimple = phosphorThinIcon(
            name = "AnchorSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 116.000 L 200.000 116.000 C 197.791 116.000 196.000 117.791 196.000 120.000 C 196.000 122.209 197.791 124.000 200.000 124.000 L 219.910 124.000 C 217.774 171.638 179.638 209.774 132.000 211.910 L 132.000 91.710 C 146.535 89.612 156.980 76.640 155.928 61.992 C 154.876 47.344 142.686 35.997 128.000 35.997 C 113.314 35.997 101.124 47.344 100.072 61.992 C 99.020 76.640 109.465 89.612 124.000 91.710 L 124.000 211.910 C 76.362 209.774 38.226 171.638 36.090 124.000 L 56.000 124.000 C 58.209 124.000 60.000 122.209 60.000 120.000 C 60.000 117.791 58.209 116.000 56.000 116.000 L 32.000 116.000 C 29.791 116.000 28.000 117.791 28.000 120.000 C 28.000 175.228 72.772 220.000 128.000 220.000 C 183.228 220.000 228.000 175.228 228.000 120.000 C 228.000 117.791 226.209 116.000 224.000 116.000 ZM 108.000 64.000 C 108.000 52.954 116.954 44.000 128.000 44.000 C 139.046 44.000 148.000 52.954 148.000 64.000 C 148.000 75.046 139.046 84.000 128.000 84.000 C 116.954 84.000 108.000 75.046 108.000 64.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _anchorSimple!!
    }

private var _anchorSimple: ImageVector? = null
