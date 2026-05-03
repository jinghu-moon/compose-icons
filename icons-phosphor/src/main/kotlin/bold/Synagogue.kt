package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Synagogue: ImageVector
    get() {
        if (_synagogue != null) return _synagogue!!
        _synagogue = phosphorBoldIcon(
            name = "Synagogue",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 54.340 L 208.000 32.000 C 208.000 25.373 202.627 20.000 196.000 20.000 C 189.373 20.000 184.000 25.373 184.000 32.000 L 184.000 54.340 C 171.924 59.243 164.018 70.967 164.000 84.000 L 164.000 110.750 L 140.000 97.000 L 140.000 72.000 C 140.000 65.373 134.627 60.000 128.000 60.000 C 121.373 60.000 116.000 65.373 116.000 72.000 L 116.000 97.000 L 92.000 110.750 L 92.000 84.000 C 91.982 70.967 84.076 59.243 72.000 54.340 L 72.000 32.000 C 72.000 25.373 66.627 20.000 60.000 20.000 C 53.373 20.000 48.000 25.373 48.000 32.000 L 48.000 54.340 C 35.924 59.243 28.018 70.967 28.000 84.000 L 28.000 216.000 C 28.000 222.627 33.373 228.000 40.000 228.000 L 216.000 228.000 C 222.627 228.000 228.000 222.627 228.000 216.000 L 228.000 84.000 C 227.982 70.967 220.076 59.243 208.000 54.340 ZM 128.000 160.000 C 121.373 160.000 116.000 165.373 116.000 172.000 L 116.000 204.000 L 92.000 204.000 L 92.000 138.390 L 128.000 117.820 L 164.000 138.390 L 164.000 204.000 L 140.000 204.000 L 140.000 172.000 C 140.000 165.373 134.627 160.000 128.000 160.000 ZM 52.000 84.000 C 52.000 79.582 55.582 76.000 60.000 76.000 C 64.418 76.000 68.000 79.582 68.000 84.000 L 68.000 100.000 L 52.000 100.000 ZM 188.000 84.000 C 188.000 79.582 191.582 76.000 196.000 76.000 C 200.418 76.000 204.000 79.582 204.000 84.000 L 204.000 100.000 L 188.000 100.000 ZM 52.000 124.000 L 68.000 124.000 L 68.000 204.000 L 52.000 204.000 ZM 188.000 204.000 L 188.000 124.000 L 204.000 124.000 L 204.000 204.000 Z"),
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
        return _synagogue!!
    }

private var _synagogue: ImageVector? = null
