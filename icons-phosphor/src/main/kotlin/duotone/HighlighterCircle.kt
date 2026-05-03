package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HighlighterCircle: ImageVector
    get() {
        if (_highlighterCircle != null) return _highlighterCircle!!
        _highlighterCircle = phosphorDuotoneIcon(
            name = "HighlighterCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 195.880 195.880 C 187.819 203.961 178.377 210.534 168.000 215.290 L 168.000 152.000 C 168.000 147.582 164.418 144.000 160.000 144.000 L 152.000 144.000 L 152.000 72.000 L 104.000 96.000 L 104.000 144.000 L 96.000 144.000 C 91.582 144.000 88.000 147.582 88.000 152.000 L 88.000 215.290 C 49.856 197.816 27.478 157.594 32.741 115.969 C 38.005 74.344 69.690 40.959 110.983 33.530 C 152.277 26.100 193.612 46.347 213.054 83.527 C 232.496 120.707 225.541 166.206 195.880 195.880 Z"),
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
        pathData = parseSvgPathData("M 201.540 54.460 C 160.925 13.845 95.075 13.845 54.460 54.460 C 13.845 95.075 13.845 160.925 54.460 201.540 C 95.075 242.155 160.925 242.155 201.540 201.540 C 242.155 160.925 242.155 95.075 201.540 54.460 ZM 96.000 210.000 L 96.000 152.000 L 160.000 152.000 L 160.000 210.000 C 139.417 218.000 116.583 218.000 96.000 210.000 ZM 144.000 136.000 L 112.000 136.000 L 112.000 100.940 L 144.000 84.940 ZM 190.220 190.220 C 185.894 194.554 181.129 198.425 176.000 201.770 L 176.000 152.000 C 176.000 143.163 168.837 136.000 160.000 136.000 L 160.000 72.000 C 160.002 69.226 158.567 66.649 156.207 65.190 C 153.848 63.731 150.901 63.599 148.420 64.840 L 100.420 88.840 C 97.709 90.197 95.998 92.969 96.000 96.000 L 96.000 136.000 C 87.163 136.000 80.000 143.163 80.000 152.000 L 80.000 201.770 C 48.759 181.448 33.708 143.649 42.428 107.415 C 51.148 71.180 81.748 44.367 118.814 40.483 C 155.880 36.599 191.374 56.485 207.416 90.125 C 223.458 123.765 216.569 163.863 190.220 190.220 Z"),
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
        return _highlighterCircle!!
    }

private var _highlighterCircle: ImageVector? = null
