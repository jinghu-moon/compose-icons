package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.StarOfDavid: ImageVector
    get() {
        if (_starOfDavid != null) return _starOfDavid!!
        _starOfDavid = phosphorRegularIcon(
            name = "StarOfDavid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 201.210 128.000 L 231.000 76.000 C 232.436 73.514 232.429 70.449 230.982 67.969 C 229.536 65.489 226.871 63.974 224.000 64.000 L 164.650 64.000 L 135.000 12.000 C 133.577 9.503 130.924 7.962 128.050 7.962 C 125.176 7.962 122.523 9.503 121.100 12.000 L 91.330 64.000 L 32.000 64.000 C 29.138 63.992 26.490 65.514 25.055 67.991 C 23.621 70.467 23.619 73.521 25.050 76.000 L 54.770 128.000 L 25.050 180.000 C 23.614 182.486 23.621 185.551 25.068 188.031 C 26.514 190.511 29.179 192.026 32.050 192.000 L 91.330 192.000 L 121.050 244.000 C 122.473 246.497 125.126 248.038 128.000 248.038 C 130.874 248.038 133.527 246.497 134.950 244.000 L 164.650 192.000 L 224.000 192.000 C 226.871 192.026 229.536 190.511 230.982 188.031 C 232.429 185.551 232.436 182.486 231.000 180.000 ZM 210.210 80.000 L 192.000 111.880 L 173.790 80.000 ZM 182.790 128.000 L 155.370 176.000 L 100.620 176.000 L 73.200 128.000 L 100.620 80.000 L 155.370 80.000 ZM 128.000 32.120 L 146.220 64.000 L 109.770 64.000 ZM 45.780 80.000 L 82.190 80.000 L 64.000 111.880 ZM 45.780 175.920 L 64.000 144.120 L 82.190 176.000 ZM 128.000 223.880 L 109.770 192.000 L 146.220 192.000 ZM 173.790 176.000 L 192.000 144.120 L 210.210 176.000 Z"),
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
        return _starOfDavid!!
    }

private var _starOfDavid: ImageVector? = null
