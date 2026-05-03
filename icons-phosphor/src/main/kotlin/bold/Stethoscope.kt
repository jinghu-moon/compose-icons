package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Stethoscope: ImageVector
    get() {
        if (_stethoscope != null) return _stethoscope!!
        _stethoscope = phosphorBoldIcon(
            name = "Stethoscope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 248.000 160.000 C 248.005 139.563 232.604 122.409 212.285 120.220 C 191.967 118.030 173.265 131.510 168.916 151.478 C 164.567 171.447 175.971 191.482 195.360 197.940 C 192.565 210.814 181.174 219.999 168.000 220.000 L 144.000 220.000 C 128.536 220.000 116.000 207.464 116.000 192.000 L 116.000 154.900 C 147.730 149.120 172.000 120.810 172.000 87.170 L 172.000 40.000 C 172.000 33.373 166.627 28.000 160.000 28.000 L 136.000 28.000 C 129.373 28.000 124.000 33.373 124.000 40.000 C 124.000 46.627 129.373 52.000 136.000 52.000 L 148.000 52.000 L 148.000 87.170 C 148.000 111.570 128.530 131.690 104.590 132.000 C 92.819 132.158 81.475 127.592 73.095 119.323 C 64.716 111.054 59.999 99.772 60.000 88.000 L 60.000 52.000 L 72.000 52.000 C 78.627 52.000 84.000 46.627 84.000 40.000 C 84.000 33.373 78.627 28.000 72.000 28.000 L 48.000 28.000 C 41.373 28.000 36.000 33.373 36.000 40.000 L 36.000 88.000 C 36.001 120.925 59.591 149.120 92.000 154.930 L 92.000 192.000 C 92.033 220.705 115.295 243.967 144.000 244.000 L 168.000 244.000 C 194.276 243.968 216.410 224.361 219.610 198.280 C 236.456 193.143 247.975 177.612 248.000 160.000 ZM 208.000 176.000 C 199.163 176.000 192.000 168.837 192.000 160.000 C 192.000 151.163 199.163 144.000 208.000 144.000 C 216.837 144.000 224.000 151.163 224.000 160.000 C 224.000 168.837 216.837 176.000 208.000 176.000 Z"),
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
        return _stethoscope!!
    }

private var _stethoscope: ImageVector? = null
