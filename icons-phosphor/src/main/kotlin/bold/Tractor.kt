package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Tractor: ImageVector
    get() {
        if (_tractor != null) return _tractor!!
        _tractor = phosphorBoldIcon(
            name = "Tractor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 244.000 164.000 L 244.000 134.000 C 244.041 125.157 238.232 117.351 229.750 114.850 L 229.440 114.760 L 196.000 105.650 L 196.000 76.000 C 196.000 69.373 190.627 64.000 184.000 64.000 C 177.373 64.000 172.000 69.373 172.000 76.000 L 172.000 99.150 L 156.000 94.820 L 156.000 60.000 L 160.000 60.000 C 166.627 60.000 172.000 54.627 172.000 48.000 C 172.000 41.373 166.627 36.000 160.000 36.000 L 40.000 36.000 C 33.373 36.000 28.000 41.373 28.000 48.000 C 28.000 54.627 33.373 60.000 40.000 60.000 L 44.000 60.000 L 44.000 84.000 L 40.000 84.000 C 33.373 84.000 28.000 89.373 28.000 96.000 C 28.000 102.627 33.373 108.000 40.000 108.000 L 68.000 108.000 C 103.330 108.039 131.961 136.670 132.000 172.000 L 132.000 184.000 C 132.000 190.627 137.373 196.000 144.000 196.000 L 172.800 196.000 C 176.089 212.082 188.869 224.522 205.034 227.376 C 221.198 230.230 237.466 222.919 246.063 208.936 C 254.661 194.952 253.843 177.136 244.000 164.000 ZM 132.000 111.670 C 115.404 94.003 92.239 83.988 68.000 84.000 L 68.000 60.000 L 132.000 60.000 ZM 175.350 172.000 L 156.000 172.000 L 156.000 119.680 L 220.000 137.000 L 220.000 148.800 C 217.366 148.269 214.687 148.001 212.000 148.000 C 196.104 148.020 181.723 157.437 175.350 172.000 ZM 212.000 204.000 C 203.163 204.000 196.000 196.837 196.000 188.000 C 196.000 179.163 203.163 172.000 212.000 172.000 C 220.837 172.000 228.000 179.163 228.000 188.000 C 228.000 196.837 220.837 204.000 212.000 204.000 ZM 64.000 124.000 C 35.281 124.000 12.000 147.281 12.000 176.000 C 12.000 204.719 35.281 228.000 64.000 228.000 C 92.719 228.000 116.000 204.719 116.000 176.000 C 115.967 147.295 92.705 124.033 64.000 124.000 ZM 64.000 204.000 C 48.536 204.000 36.000 191.464 36.000 176.000 C 36.000 160.536 48.536 148.000 64.000 148.000 C 79.464 148.000 92.000 160.536 92.000 176.000 C 92.000 191.464 79.464 204.000 64.000 204.000 ZM 80.000 176.000 C 80.000 184.837 72.837 192.000 64.000 192.000 C 55.163 192.000 48.000 184.837 48.000 176.000 C 48.000 167.163 55.163 160.000 64.000 160.000 C 72.837 160.000 80.000 167.163 80.000 176.000 Z"),
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
        return _tractor!!
    }

private var _tractor: ImageVector? = null
