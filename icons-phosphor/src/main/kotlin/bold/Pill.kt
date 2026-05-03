package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Pill: ImageVector
    get() {
        if (_pill != null) return _pill!!
        _pill = phosphorBoldIcon(
            name = "Pill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 219.260 36.770 C 196.891 14.405 160.629 14.405 138.260 36.770 L 36.770 138.260 C 14.402 160.628 14.402 196.892 36.770 219.260 C 59.138 241.628 95.402 241.628 117.770 219.260 L 219.260 117.740 C 241.578 95.364 241.578 59.146 219.260 36.770 ZM 100.780 202.260 C 92.503 211.218 79.988 214.928 68.166 211.927 C 56.345 208.926 47.114 199.695 44.113 187.874 C 41.112 176.052 44.822 163.537 53.780 155.260 L 96.000 113.000 L 143.000 160.000 ZM 202.280 100.770 L 160.000 143.000 L 113.000 96.000 L 155.270 53.740 C 168.386 41.622 188.732 42.024 201.359 54.651 C 213.986 67.278 214.388 87.624 202.270 100.740 ZM 192.510 75.510 C 194.769 77.762 196.039 80.820 196.039 84.010 C 196.039 87.200 194.769 90.258 192.510 92.510 L 168.510 116.510 C 163.816 121.204 156.204 121.204 151.510 116.510 C 146.816 111.816 146.816 104.204 151.510 99.510 L 175.510 75.510 C 177.762 73.251 180.820 71.981 184.010 71.981 C 187.200 71.981 190.258 73.251 192.510 75.510 Z"),
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
        return _pill!!
    }

private var _pill: ImageVector? = null
