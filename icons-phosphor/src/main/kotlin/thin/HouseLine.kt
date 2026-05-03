package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HouseLine: ImageVector
    get() {
        if (_houseLine != null) return _houseLine!!
        _houseLine = phosphorThinIcon(
            name = "HouseLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 212.000 L 220.000 212.000 L 220.000 126.340 L 229.170 135.510 C 230.733 137.073 233.267 137.073 234.830 135.510 C 236.393 133.947 236.393 131.413 234.830 129.850 L 136.490 31.510 C 134.238 29.251 131.180 27.981 127.990 27.981 C 124.800 27.981 121.742 29.251 119.490 31.510 L 21.170 129.850 C 19.607 131.413 19.607 133.947 21.170 135.510 C 22.733 137.073 25.267 137.073 26.830 135.510 L 36.000 126.340 L 36.000 212.000 L 16.000 212.000 C 13.791 212.000 12.000 213.791 12.000 216.000 C 12.000 218.209 13.791 220.000 16.000 220.000 L 240.000 220.000 C 242.209 220.000 244.000 218.209 244.000 216.000 C 244.000 213.791 242.209 212.000 240.000 212.000 ZM 44.000 118.340 L 125.170 37.170 C 125.920 36.419 126.938 35.997 128.000 35.997 C 129.062 35.997 130.080 36.419 130.830 37.170 L 212.000 118.340 L 212.000 212.000 L 156.000 212.000 L 156.000 152.000 C 156.000 149.791 154.209 148.000 152.000 148.000 L 104.000 148.000 C 101.791 148.000 100.000 149.791 100.000 152.000 L 100.000 212.000 L 44.000 212.000 ZM 148.000 212.000 L 108.000 212.000 L 108.000 156.000 L 148.000 156.000 Z"),
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
        return _houseLine!!
    }

private var _houseLine: ImageVector? = null
