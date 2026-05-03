package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BluetoothX: ImageVector
    get() {
        if (_bluetoothX != null) return _bluetoothX!!
        _bluetoothX = phosphorThinIcon(
            name = "BluetoothX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 178.400 172.800 L 118.670 128.000 L 146.400 107.200 C 148.167 105.875 148.525 103.367 147.200 101.600 C 145.875 99.833 143.367 99.475 141.600 100.800 L 116.000 120.000 L 116.000 40.000 L 141.600 59.200 C 143.367 60.525 145.875 60.167 147.200 58.400 C 148.525 56.633 148.167 54.125 146.400 52.800 L 114.400 28.800 C 113.188 27.891 111.566 27.745 110.211 28.422 C 108.856 29.100 108.000 30.485 108.000 32.000 L 108.000 120.000 L 50.400 76.800 C 48.633 75.475 46.125 75.833 44.800 77.600 C 43.475 79.367 43.833 81.875 45.600 83.200 L 105.330 128.000 L 45.600 172.800 C 43.833 174.125 43.475 176.633 44.800 178.400 C 46.125 180.167 48.633 180.525 50.400 179.200 L 108.000 136.000 L 108.000 224.000 C 107.999 225.516 108.855 226.902 110.210 227.580 C 110.767 227.855 111.379 227.999 112.000 228.000 C 112.865 228.000 113.708 227.719 114.400 227.200 L 178.400 179.200 C 179.407 178.445 180.000 177.259 180.000 176.000 C 180.000 174.741 179.407 173.555 178.400 172.800 ZM 116.000 216.000 L 116.000 136.000 L 169.330 176.000 ZM 234.830 101.170 C 236.393 102.733 236.393 105.267 234.830 106.830 C 233.267 108.393 230.733 108.393 229.170 106.830 L 208.000 85.660 L 186.830 106.830 C 185.267 108.393 182.733 108.393 181.170 106.830 C 179.607 105.267 179.607 102.733 181.170 101.170 L 202.340 80.000 L 181.170 58.830 C 179.607 57.267 179.607 54.733 181.170 53.170 C 182.733 51.607 185.267 51.607 186.830 53.170 L 208.000 74.340 L 229.170 53.170 C 230.733 51.607 233.267 51.607 234.830 53.170 C 236.393 54.733 236.393 57.267 234.830 58.830 L 213.660 80.000 Z"),
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
        return _bluetoothX!!
    }

private var _bluetoothX: ImageVector? = null
