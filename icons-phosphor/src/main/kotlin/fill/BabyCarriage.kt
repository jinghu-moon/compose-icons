package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BabyCarriage: ImageVector
    get() {
        if (_babyCarriage != null) return _babyCarriage!!
        _babyCarriage = phosphorFillIcon(
            name = "BabyCarriage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 215.580 54.550 C 215.193 54.075 214.750 53.648 214.260 53.280 C 199.510 39.589 180.125 31.986 160.000 32.000 L 152.000 32.000 C 143.163 32.000 136.000 39.163 136.000 48.000 L 136.000 104.000 L 55.200 104.000 C 51.373 85.388 35.001 72.023 16.000 72.000 C 11.582 72.000 8.000 75.582 8.000 80.000 C 8.000 84.418 11.582 88.000 16.000 88.000 C 29.255 88.000 40.000 98.745 40.000 112.000 C 40.050 156.162 75.838 191.950 120.000 192.000 L 160.000 192.000 C 192.598 192.023 221.945 172.249 234.166 142.028 C 246.386 111.806 239.032 77.192 215.580 54.550 ZM 208.670 70.550 C 216.769 80.013 221.918 91.642 223.480 104.000 L 166.810 104.000 ZM 160.000 48.000 C 173.136 47.988 185.953 52.043 196.690 59.610 L 152.000 95.350 L 152.000 48.000 ZM 104.000 224.000 C 104.000 232.837 96.837 240.000 88.000 240.000 C 79.163 240.000 72.000 232.837 72.000 224.000 C 72.000 215.163 79.163 208.000 88.000 208.000 C 96.837 208.000 104.000 215.163 104.000 224.000 ZM 208.000 224.000 C 208.000 232.837 200.837 240.000 192.000 240.000 C 183.163 240.000 176.000 232.837 176.000 224.000 C 176.000 215.163 183.163 208.000 192.000 208.000 C 200.837 208.000 208.000 215.163 208.000 224.000 Z"),
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
        return _babyCarriage!!
    }

private var _babyCarriage: ImageVector? = null
