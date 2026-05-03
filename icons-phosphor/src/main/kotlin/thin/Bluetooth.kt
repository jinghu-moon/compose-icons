package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bluetooth: ImageVector
    get() {
        if (_bluetooth != null) return _bluetooth!!
        _bluetooth = phosphorThinIcon(
            name = "Bluetooth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 194.400 172.800 L 134.670 128.000 L 194.400 83.200 C 195.407 82.445 196.000 81.259 196.000 80.000 C 196.000 78.741 195.407 77.555 194.400 76.800 L 130.400 28.800 C 129.188 27.891 127.566 27.745 126.211 28.422 C 124.856 29.100 124.000 30.485 124.000 32.000 L 124.000 120.000 L 66.400 76.800 C 64.633 75.475 62.125 75.833 60.800 77.600 C 59.475 79.367 59.833 81.875 61.600 83.200 L 121.330 128.000 L 61.600 172.800 C 59.833 174.125 59.475 176.633 60.800 178.400 C 62.125 180.167 64.633 180.525 66.400 179.200 L 124.000 136.000 L 124.000 224.000 C 124.000 225.515 124.856 226.900 126.211 227.578 C 127.566 228.255 129.188 228.109 130.400 227.200 L 194.400 179.200 C 195.407 178.445 196.000 177.259 196.000 176.000 C 196.000 174.741 195.407 173.555 194.400 172.800 ZM 132.000 40.000 L 185.330 80.000 L 132.000 120.000 ZM 132.000 216.000 L 132.000 136.000 L 185.330 176.000 Z"),
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
        return _bluetooth!!
    }

private var _bluetooth: ImageVector? = null
