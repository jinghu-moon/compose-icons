package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AnchorSimple: ImageVector
    get() {
        if (_anchorSimple != null) return _anchorSimple!!
        _anchorSimple = phosphorLightIcon(
            name = "AnchorSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 114.000 L 200.000 114.000 C 196.686 114.000 194.000 116.686 194.000 120.000 C 194.000 123.314 196.686 126.000 200.000 126.000 L 217.800 126.000 C 214.730 170.945 178.946 206.721 134.000 209.780 L 134.000 93.400 C 149.090 90.320 159.396 76.314 157.848 60.991 C 156.300 45.668 143.401 34.006 128.000 34.006 C 112.599 34.006 99.700 45.668 98.152 60.991 C 96.604 76.314 106.910 90.320 122.000 93.400 L 122.000 209.780 C 77.054 206.721 41.270 170.945 38.200 126.000 L 56.000 126.000 C 59.314 126.000 62.000 123.314 62.000 120.000 C 62.000 116.686 59.314 114.000 56.000 114.000 L 32.000 114.000 C 28.686 114.000 26.000 116.686 26.000 120.000 C 26.000 176.333 71.667 222.000 128.000 222.000 C 184.333 222.000 230.000 176.333 230.000 120.000 C 230.000 116.686 227.314 114.000 224.000 114.000 ZM 110.000 64.000 C 110.000 54.059 118.059 46.000 128.000 46.000 C 137.941 46.000 146.000 54.059 146.000 64.000 C 146.000 73.941 137.941 82.000 128.000 82.000 C 118.059 82.000 110.000 73.941 110.000 64.000 Z"),
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
