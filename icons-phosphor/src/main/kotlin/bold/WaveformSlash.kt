package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WaveformSlash: ImageVector
    get() {
        if (_waveformSlash != null) return _waveformSlash!!
        _waveformSlash = phosphorBoldIcon(
            name = "WaveformSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 60.000 96.000 L 60.000 160.000 C 60.000 166.627 54.627 172.000 48.000 172.000 C 41.373 172.000 36.000 166.627 36.000 160.000 L 36.000 96.000 C 36.000 89.373 41.373 84.000 48.000 84.000 C 54.627 84.000 60.000 89.373 60.000 96.000 ZM 56.880 31.930 C 54.012 28.697 49.628 27.256 45.401 28.157 C 41.175 29.058 37.759 32.162 36.459 36.284 C 35.159 40.405 36.175 44.907 39.120 48.070 L 76.000 88.640 L 76.000 224.000 C 76.000 230.627 81.373 236.000 88.000 236.000 C 94.627 236.000 100.000 230.627 100.000 224.000 L 100.000 115.000 L 116.000 132.600 L 116.000 192.000 C 116.000 198.627 121.373 204.000 128.000 204.000 C 134.627 204.000 140.000 198.627 140.000 192.000 L 140.000 159.000 L 199.120 224.000 C 203.598 228.810 211.111 229.124 215.974 224.704 C 220.837 220.285 221.241 212.776 216.880 207.860 ZM 128.000 80.540 C 134.627 80.540 140.000 75.167 140.000 68.540 L 140.000 64.000 C 140.000 57.373 134.627 52.000 128.000 52.000 C 121.373 52.000 116.000 57.373 116.000 64.000 L 116.000 68.540 C 116.000 75.167 121.373 80.540 128.000 80.540 ZM 168.000 124.540 C 174.627 124.540 180.000 119.167 180.000 112.540 L 180.000 96.000 C 180.000 89.373 174.627 84.000 168.000 84.000 C 161.373 84.000 156.000 89.373 156.000 96.000 L 156.000 112.540 C 156.000 119.167 161.373 124.540 168.000 124.540 ZM 208.000 68.000 C 201.373 68.000 196.000 73.373 196.000 80.000 L 196.000 156.540 C 196.000 163.167 201.373 168.540 208.000 168.540 C 214.627 168.540 220.000 163.167 220.000 156.540 L 220.000 80.000 C 220.000 73.373 214.627 68.000 208.000 68.000 Z"),
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
        return _waveformSlash!!
    }

private var _waveformSlash: ImageVector? = null
