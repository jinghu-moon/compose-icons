package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HandPalm: ImageVector
    get() {
        if (_handPalm != null) return _handPalm!!
        _handPalm = phosphorThinIcon(
            name = "HandPalm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 188.000 92.000 C 182.092 91.996 176.392 94.179 172.000 98.130 L 172.000 60.000 C 171.990 50.523 166.404 41.940 157.743 38.092 C 149.083 34.245 138.969 35.854 131.930 42.200 C 130.946 29.345 119.982 19.565 107.099 20.048 C 94.216 20.532 84.017 31.108 84.000 44.000 L 84.000 58.130 C 76.948 51.823 66.849 50.247 58.210 54.106 C 49.572 57.965 44.007 66.539 44.000 76.000 L 44.000 152.000 C 44.000 198.392 81.608 236.000 128.000 236.000 C 174.392 236.000 212.000 198.392 212.000 152.000 L 212.000 116.000 C 212.000 102.745 201.255 92.000 188.000 92.000 ZM 204.000 152.000 C 204.000 193.974 169.974 228.000 128.000 228.000 C 86.026 228.000 52.000 193.974 52.000 152.000 L 52.000 76.000 C 52.000 67.163 59.163 60.000 68.000 60.000 C 76.837 60.000 84.000 67.163 84.000 76.000 L 84.000 120.000 C 84.000 122.209 85.791 124.000 88.000 124.000 C 90.209 124.000 92.000 122.209 92.000 120.000 L 92.000 44.000 C 92.000 35.163 99.163 28.000 108.000 28.000 C 116.837 28.000 124.000 35.163 124.000 44.000 L 124.000 112.000 C 124.000 114.209 125.791 116.000 128.000 116.000 C 130.209 116.000 132.000 114.209 132.000 112.000 L 132.000 60.000 C 132.000 51.163 139.163 44.000 148.000 44.000 C 156.837 44.000 164.000 51.163 164.000 60.000 L 164.000 132.180 C 141.356 134.275 124.027 153.260 124.000 176.000 C 124.000 178.209 125.791 180.000 128.000 180.000 C 130.209 180.000 132.000 178.209 132.000 176.000 C 132.000 156.118 148.118 140.000 168.000 140.000 C 170.209 140.000 172.000 138.209 172.000 136.000 L 172.000 116.000 C 172.000 107.163 179.163 100.000 188.000 100.000 C 196.837 100.000 204.000 107.163 204.000 116.000 Z"),
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
        return _handPalm!!
    }

private var _handPalm: ImageVector? = null
