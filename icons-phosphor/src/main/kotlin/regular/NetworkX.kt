package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.NetworkX: ImageVector
    get() {
        if (_networkX != null) return _networkX!!
        _networkX = phosphorRegularIcon(
            name = "NetworkX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 112.000 L 136.000 112.000 L 136.000 88.000 L 144.000 88.000 C 152.837 88.000 160.000 80.837 160.000 72.000 L 160.000 40.000 C 160.000 31.163 152.837 24.000 144.000 24.000 L 112.000 24.000 C 103.163 24.000 96.000 31.163 96.000 40.000 L 96.000 72.000 C 96.000 80.837 103.163 88.000 112.000 88.000 L 120.000 88.000 L 120.000 112.000 L 24.000 112.000 C 19.582 112.000 16.000 115.582 16.000 120.000 C 16.000 124.418 19.582 128.000 24.000 128.000 L 56.000 128.000 L 56.000 160.000 L 48.000 160.000 C 39.163 160.000 32.000 167.163 32.000 176.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 80.000 224.000 C 88.837 224.000 96.000 216.837 96.000 208.000 L 96.000 176.000 C 96.000 167.163 88.837 160.000 80.000 160.000 L 72.000 160.000 L 72.000 128.000 L 184.000 128.000 L 184.000 144.000 C 184.000 148.418 187.582 152.000 192.000 152.000 C 196.418 152.000 200.000 148.418 200.000 144.000 L 200.000 128.000 L 232.000 128.000 C 236.418 128.000 240.000 124.418 240.000 120.000 C 240.000 115.582 236.418 112.000 232.000 112.000 ZM 112.000 40.000 L 144.000 40.000 L 144.000 72.000 L 112.000 72.000 ZM 80.000 208.000 L 48.000 208.000 L 48.000 176.000 L 80.000 176.000 ZM 221.650 173.660 L 203.310 192.000 L 221.660 210.340 C 224.786 213.466 224.786 218.534 221.660 221.660 C 218.534 224.786 213.466 224.786 210.340 221.660 L 192.000 203.310 L 173.660 221.660 C 170.534 224.786 165.466 224.786 162.340 221.660 C 159.214 218.534 159.214 213.466 162.340 210.340 L 180.690 192.000 L 162.340 173.660 C 159.214 170.534 159.214 165.466 162.340 162.340 C 165.466 159.214 170.534 159.214 173.660 162.340 L 192.000 180.690 L 210.340 162.340 C 213.466 159.214 218.534 159.214 221.660 162.340 C 224.786 165.466 224.786 170.534 221.660 173.660 Z"),
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
        return _networkX!!
    }

private var _networkX: ImageVector? = null
