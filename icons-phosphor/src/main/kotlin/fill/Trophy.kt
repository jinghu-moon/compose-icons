package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Trophy: ImageVector
    get() {
        if (_trophy != null) return _trophy!!
        _trophy = phosphorFillIcon(
            name = "Trophy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 64.000 L 208.000 64.000 L 208.000 48.000 C 208.000 43.582 204.418 40.000 200.000 40.000 L 56.000 40.000 C 51.582 40.000 48.000 43.582 48.000 48.000 L 48.000 64.000 L 24.000 64.000 C 15.163 64.000 8.000 71.163 8.000 80.000 L 8.000 96.000 C 8.000 118.091 25.909 136.000 48.000 136.000 L 51.650 136.000 C 61.282 166.524 88.155 188.388 120.000 191.610 L 120.000 216.000 L 96.000 216.000 C 91.582 216.000 88.000 219.582 88.000 224.000 C 88.000 228.418 91.582 232.000 96.000 232.000 L 160.000 232.000 C 164.418 232.000 168.000 228.418 168.000 224.000 C 168.000 219.582 164.418 216.000 160.000 216.000 L 136.000 216.000 L 136.000 191.580 C 167.940 188.350 194.440 165.940 204.080 136.000 L 208.000 136.000 C 230.091 136.000 248.000 118.091 248.000 96.000 L 248.000 80.000 C 248.000 71.163 240.837 64.000 232.000 64.000 ZM 48.000 120.000 C 34.745 120.000 24.000 109.255 24.000 96.000 L 24.000 80.000 L 48.000 80.000 L 48.000 112.000 Q 48.000 116.000 48.390 120.000 ZM 232.000 96.000 C 232.000 109.255 221.255 120.000 208.000 120.000 L 207.500 120.000 C 207.828 117.045 207.995 114.074 208.000 111.100 L 208.000 80.000 L 232.000 80.000 Z"),
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
        return _trophy!!
    }

private var _trophy: ImageVector? = null
