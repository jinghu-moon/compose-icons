package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShareNetwork: ImageVector
    get() {
        if (_shareNetwork != null) return _shareNetwork!!
        _shareNetwork = phosphorThinIcon(
            name = "ShareNetwork",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 176.000 164.000 C 165.166 164.006 154.911 168.891 148.080 177.300 L 96.250 144.000 C 101.264 133.923 101.264 122.078 96.250 112.000 L 148.080 78.700 C 160.143 93.466 181.641 96.238 197.055 85.014 C 212.469 73.790 216.431 52.480 206.082 36.466 C 195.732 20.452 174.676 15.311 158.111 24.754 C 141.546 34.197 135.242 54.936 143.750 72.000 L 91.920 105.300 C 82.311 93.472 66.296 88.976 51.935 94.074 C 37.574 99.173 27.979 112.761 27.979 128.000 C 27.979 143.239 37.574 156.827 51.935 161.926 C 66.296 167.024 82.311 162.528 91.920 150.700 L 143.750 184.000 C 136.602 198.407 139.877 215.808 151.775 226.630 C 163.672 237.453 181.304 239.071 194.972 230.594 C 208.640 222.118 215.028 205.604 210.621 190.136 C 206.215 174.669 192.083 164.000 176.000 164.000 ZM 176.000 28.000 C 191.464 28.000 204.000 40.536 204.000 56.000 C 204.000 71.464 191.464 84.000 176.000 84.000 C 160.536 84.000 148.000 71.464 148.000 56.000 C 148.000 40.536 160.536 28.000 176.000 28.000 ZM 64.000 156.000 C 48.536 156.000 36.000 143.464 36.000 128.000 C 36.000 112.536 48.536 100.000 64.000 100.000 C 79.464 100.000 92.000 112.536 92.000 128.000 C 92.000 143.464 79.464 156.000 64.000 156.000 ZM 176.000 228.000 C 160.536 228.000 148.000 215.464 148.000 200.000 C 148.000 184.536 160.536 172.000 176.000 172.000 C 191.464 172.000 204.000 184.536 204.000 200.000 C 204.000 215.464 191.464 228.000 176.000 228.000 Z"),
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
        return _shareNetwork!!
    }

private var _shareNetwork: ImageVector? = null
