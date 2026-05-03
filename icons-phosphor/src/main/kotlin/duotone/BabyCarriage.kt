package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BabyCarriage: ImageVector
    get() {
        if (_babyCarriage != null) return _babyCarriage!!
        _babyCarriage = phosphorDuotoneIcon(
            name = "BabyCarriage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 232.000 112.000 L 144.000 112.000 L 144.000 48.000 C 144.000 43.582 147.582 40.000 152.000 40.000 L 160.000 40.000 C 199.764 40.000 232.000 72.235 232.000 112.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 160.000 32.000 L 152.000 32.000 C 143.163 32.000 136.000 39.163 136.000 48.000 L 136.000 104.000 L 55.200 104.000 C 51.373 85.388 35.001 72.023 16.000 72.000 C 11.582 72.000 8.000 75.582 8.000 80.000 C 8.000 84.418 11.582 88.000 16.000 88.000 C 29.255 88.000 40.000 98.745 40.000 112.000 C 40.050 156.162 75.838 191.950 120.000 192.000 L 160.000 192.000 C 204.183 192.000 240.000 156.183 240.000 112.000 C 240.000 67.817 204.183 32.000 160.000 32.000 ZM 223.480 104.000 L 166.810 104.000 L 208.670 70.510 C 216.777 79.984 221.926 91.628 223.480 104.000 ZM 160.000 48.000 C 173.136 47.988 185.953 52.043 196.690 59.610 L 152.000 95.350 L 152.000 48.000 ZM 160.000 176.000 L 120.000 176.000 C 87.761 175.961 60.569 151.981 56.500 120.000 L 223.500 120.000 C 219.431 151.981 192.239 175.961 160.000 176.000 ZM 104.000 224.000 C 104.000 232.837 96.837 240.000 88.000 240.000 C 79.163 240.000 72.000 232.837 72.000 224.000 C 72.000 215.163 79.163 208.000 88.000 208.000 C 96.837 208.000 104.000 215.163 104.000 224.000 ZM 208.000 224.000 C 208.000 232.837 200.837 240.000 192.000 240.000 C 183.163 240.000 176.000 232.837 176.000 224.000 C 176.000 215.163 183.163 208.000 192.000 208.000 C 200.837 208.000 208.000 215.163 208.000 224.000 Z"),
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
