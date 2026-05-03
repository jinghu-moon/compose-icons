package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TeaBag: ImageVector
    get() {
        if (_teaBag != null) return _teaBag!!
        _teaBag = phosphorFillIcon(
            name = "TeaBag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 112.000 136.000 L 112.000 72.000 L 131.470 72.000 C 137.086 72.018 142.286 74.963 145.190 79.770 L 165.720 114.000 C 167.211 116.490 167.998 119.338 168.000 122.240 L 168.000 216.000 C 168.000 224.837 160.837 232.000 152.000 232.000 L 56.000 232.000 C 47.163 232.000 40.000 224.837 40.000 216.000 L 40.000 122.220 C 40.005 119.325 40.793 116.484 42.280 114.000 L 62.810 79.770 C 65.714 74.963 70.914 72.018 76.530 72.000 L 96.000 72.000 L 96.000 136.000 C 96.000 140.418 99.582 144.000 104.000 144.000 C 108.418 144.000 112.000 140.418 112.000 136.000 ZM 224.000 160.000 C 215.163 160.000 208.000 152.837 208.000 144.000 L 208.000 64.000 C 208.000 33.072 182.928 8.000 152.000 8.000 C 121.072 8.000 96.000 33.072 96.000 64.000 L 96.000 72.000 L 112.000 72.000 L 112.000 64.000 C 112.000 41.909 129.909 24.000 152.000 24.000 C 174.091 24.000 192.000 41.909 192.000 64.000 L 192.000 144.000 C 192.000 161.673 206.327 176.000 224.000 176.000 C 228.418 176.000 232.000 172.418 232.000 168.000 C 232.000 163.582 228.418 160.000 224.000 160.000 Z"),
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
        return _teaBag!!
    }

private var _teaBag: ImageVector? = null
