package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PersonSimpleCircle: ImageVector
    get() {
        if (_personSimpleCircle != null) return _personSimpleCircle!!
        _personSimpleCircle = phosphorBoldIcon(
            name = "PersonSimpleCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 108.000 80.000 C 108.000 68.954 116.954 60.000 128.000 60.000 C 139.046 60.000 148.000 68.954 148.000 80.000 C 148.000 91.046 139.046 100.000 128.000 100.000 C 116.954 100.000 108.000 91.046 108.000 80.000 ZM 184.000 120.000 C 184.000 126.627 178.627 132.000 172.000 132.000 L 140.000 132.000 L 140.000 132.510 L 166.120 173.560 C 169.674 179.150 168.027 186.562 162.440 190.120 C 160.520 191.355 158.283 192.008 156.000 192.000 C 151.895 192.002 148.073 189.904 145.870 186.440 L 128.000 158.350 L 110.120 186.440 C 106.480 191.822 99.219 193.330 93.737 189.842 C 88.256 186.353 86.546 179.136 89.880 173.560 L 116.000 132.510 L 116.000 132.000 L 84.000 132.000 C 77.373 132.000 72.000 126.627 72.000 120.000 C 72.000 113.373 77.373 108.000 84.000 108.000 L 172.000 108.000 C 178.627 108.000 184.000 113.373 184.000 120.000 Z"),
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
        return _personSimpleCircle!!
    }

private var _personSimpleCircle: ImageVector? = null
