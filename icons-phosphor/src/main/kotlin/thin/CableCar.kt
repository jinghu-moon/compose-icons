package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CableCar: ImageVector
    get() {
        if (_cableCar != null) return _cableCar!!
        _cableCar = phosphorThinIcon(
            name = "CableCar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 243.940 31.300 C 243.755 30.255 243.162 29.326 242.291 28.718 C 241.421 28.111 240.345 27.874 239.300 28.060 L 15.300 68.060 C 13.254 68.418 11.823 70.283 12.006 72.351 C 12.188 74.420 13.923 76.005 16.000 76.000 C 16.235 76.000 16.469 75.980 16.700 75.940 L 124.000 56.780 L 124.000 100.000 L 64.000 100.000 C 48.536 100.000 36.000 112.536 36.000 128.000 L 36.000 192.000 C 36.000 207.464 48.536 220.000 64.000 220.000 L 192.000 220.000 C 207.464 220.000 220.000 207.464 220.000 192.000 L 220.000 128.000 C 220.000 112.536 207.464 100.000 192.000 100.000 L 132.000 100.000 L 132.000 55.350 L 240.700 35.940 C 241.745 35.755 242.674 35.162 243.282 34.291 C 243.889 33.421 244.126 32.345 243.940 31.300 ZM 100.000 164.000 L 100.000 108.000 L 156.000 108.000 L 156.000 164.000 ZM 64.000 108.000 L 92.000 108.000 L 92.000 164.000 L 44.000 164.000 L 44.000 128.000 C 44.000 116.954 52.954 108.000 64.000 108.000 ZM 192.000 212.000 L 64.000 212.000 C 52.954 212.000 44.000 203.046 44.000 192.000 L 44.000 172.000 L 212.000 172.000 L 212.000 192.000 C 212.000 203.046 203.046 212.000 192.000 212.000 ZM 212.000 128.000 L 212.000 164.000 L 164.000 164.000 L 164.000 108.000 L 192.000 108.000 C 203.046 108.000 212.000 116.954 212.000 128.000 Z"),
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
        return _cableCar!!
    }

private var _cableCar: ImageVector? = null
