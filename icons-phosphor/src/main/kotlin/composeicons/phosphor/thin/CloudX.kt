package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CloudX: ImageVector
    get() {
        if (_cloudX != null) return _cloudX!!
        _cloudX = phosphorThinIcon(
            name = "CloudX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 44C127.118 44.03 97.269 63.218 83.59 93.12 79.771 92.376 75.89 92.001 72 92 38.863 92 12 118.863 12 152c0 33.137 26.863 60 60 60h88c46.392 0 84-37.608 84-84C244 81.608 206.392 44 160 44ZM160 204h-88C52.407 203.982 34.487 192.953 25.644 175.469c-8.843-17.484-7.107-38.455 4.49-54.247C41.731 105.429 61.22 97.496 80.55 100.7 77.528 109.484 75.99 118.711 76 128c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4C84 86.026 118.026 52 160 52c41.974 0 76 34.026 76 76 0 41.974-34.026 76-76 76ZM186.83 114.83 165.66 136l21.17 21.17c1.563 1.563 1.563 4.097 0 5.66-1.563 1.563-4.097 1.563-5.66 0L160 141.66l-21.17 21.17c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66L154.34 136 133.17 114.83c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0L160 130.34l21.17-21.17c1.563-1.563 4.097-1.563 5.66 0 1.563 1.563 1.563 4.097 0 5.66Z"),
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
        return _cloudX!!
    }

private var _cloudX: ImageVector? = null
