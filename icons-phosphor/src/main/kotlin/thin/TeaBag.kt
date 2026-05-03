package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TeaBag: ImageVector
    get() {
        if (_teaBag != null) return _teaBag!!
        _teaBag = phosphorThinIcon(
            name = "TeaBag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 164.000 C 212.954 164.000 204.000 155.046 204.000 144.000 L 204.000 64.000 C 204.000 35.281 180.719 12.000 152.000 12.000 C 123.281 12.000 100.000 35.281 100.000 64.000 L 100.000 76.000 L 76.530 76.000 C 72.317 76.013 68.416 78.223 66.240 81.830 L 45.710 116.000 C 44.583 117.878 43.992 120.029 44.000 122.220 L 44.000 216.000 C 44.000 222.627 49.373 228.000 56.000 228.000 L 152.000 228.000 C 158.627 228.000 164.000 222.627 164.000 216.000 L 164.000 122.220 C 164.001 120.043 163.410 117.907 162.290 116.040 L 141.760 81.830 C 139.584 78.223 135.683 76.013 131.470 76.000 L 108.000 76.000 L 108.000 64.000 C 108.000 39.699 127.699 20.000 152.000 20.000 C 176.301 20.000 196.000 39.699 196.000 64.000 L 196.000 144.000 C 196.000 159.464 208.536 172.000 224.000 172.000 C 226.209 172.000 228.000 170.209 228.000 168.000 C 228.000 165.791 226.209 164.000 224.000 164.000 ZM 131.470 84.000 C 132.875 84.000 134.177 84.736 134.900 85.940 L 155.430 120.160 C 155.803 120.782 156.000 121.494 156.000 122.220 L 156.000 216.000 C 156.000 218.209 154.209 220.000 152.000 220.000 L 56.000 220.000 C 53.791 220.000 52.000 218.209 52.000 216.000 L 52.000 122.220 C 52.000 121.494 52.197 120.782 52.570 120.160 L 73.100 85.940 C 73.823 84.736 75.125 84.000 76.530 84.000 L 100.000 84.000 L 100.000 136.000 C 100.000 138.209 101.791 140.000 104.000 140.000 C 106.209 140.000 108.000 138.209 108.000 136.000 L 108.000 84.000 Z"),
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
        return _teaBag!!
    }

private var _teaBag: ImageVector? = null
