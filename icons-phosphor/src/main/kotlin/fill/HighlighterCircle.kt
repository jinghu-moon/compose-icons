package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HighlighterCircle: ImageVector
    get() {
        if (_highlighterCircle != null) return _highlighterCircle!!
        _highlighterCircle = phosphorFillIcon(
            name = "HighlighterCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 201.540 54.460 C 160.925 13.845 95.075 13.845 54.460 54.460 C 13.845 95.075 13.845 160.925 54.460 201.540 C 95.075 242.155 160.925 242.155 201.540 201.540 C 242.155 160.925 242.155 95.075 201.540 54.460 ZM 96.000 210.000 L 96.000 152.000 L 160.000 152.000 L 160.000 210.000 C 139.417 218.000 116.583 218.000 96.000 210.000 ZM 190.220 190.220 C 185.894 194.554 181.129 198.425 176.000 201.770 L 176.000 152.000 C 176.000 143.163 168.837 136.000 160.000 136.000 L 160.000 72.000 C 160.002 69.226 158.567 66.649 156.207 65.190 C 153.848 63.731 150.901 63.599 148.420 64.840 L 100.420 88.840 C 97.709 90.197 95.998 92.969 96.000 96.000 L 96.000 136.000 C 87.163 136.000 80.000 143.163 80.000 152.000 L 80.000 201.770 C 48.759 181.448 33.708 143.649 42.428 107.415 C 51.148 71.180 81.748 44.367 118.814 40.483 C 155.880 36.599 191.374 56.485 207.416 90.125 C 223.458 123.765 216.569 163.863 190.220 190.220 Z"),
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
