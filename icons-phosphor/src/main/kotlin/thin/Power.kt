package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Power: ImageVector
    get() {
        if (_power != null) return _power!!
        _power = phosphorThinIcon(
            name = "Power",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 124.000 128.000 L 124.000 48.000 C 124.000 45.791 125.791 44.000 128.000 44.000 C 130.209 44.000 132.000 45.791 132.000 48.000 L 132.000 128.000 C 132.000 130.209 130.209 132.000 128.000 132.000 C 125.791 132.000 124.000 130.209 124.000 128.000 ZM 178.180 52.650 C 176.983 51.802 175.418 51.677 174.102 52.324 C 172.786 52.972 171.929 54.288 171.870 55.753 C 171.812 57.219 172.560 58.599 173.820 59.350 C 198.080 75.170 212.000 100.200 212.000 128.000 C 212.000 174.392 174.392 212.000 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 100.200 57.920 75.170 82.180 59.350 C 83.932 58.108 84.391 55.705 83.220 53.905 C 82.049 52.105 79.665 51.551 77.820 52.650 C 51.240 70.000 36.000 97.440 36.000 128.000 C 36.000 178.810 77.190 220.000 128.000 220.000 C 178.810 220.000 220.000 178.810 220.000 128.000 C 220.000 97.440 204.760 70.000 178.180 52.650 Z"),
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
        return _power!!
    }

private var _power: ImageVector? = null
