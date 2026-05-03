package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Playlist: ImageVector
    get() {
        if (_playlist != null) return _playlist!!
        _playlist = phosphorDuotoneIcon(
            name = "Playlist",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 200.000 192.000 C 200.000 205.255 189.255 216.000 176.000 216.000 C 162.745 216.000 152.000 205.255 152.000 192.000 C 152.000 178.745 162.745 168.000 176.000 168.000 C 189.255 168.000 200.000 178.745 200.000 192.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 32.000 64.000 C 32.000 59.582 35.582 56.000 40.000 56.000 L 216.000 56.000 C 220.418 56.000 224.000 59.582 224.000 64.000 C 224.000 68.418 220.418 72.000 216.000 72.000 L 40.000 72.000 C 35.582 72.000 32.000 68.418 32.000 64.000 ZM 40.000 136.000 L 160.000 136.000 C 164.418 136.000 168.000 132.418 168.000 128.000 C 168.000 123.582 164.418 120.000 160.000 120.000 L 40.000 120.000 C 35.582 120.000 32.000 123.582 32.000 128.000 C 32.000 132.418 35.582 136.000 40.000 136.000 ZM 112.000 184.000 L 40.000 184.000 C 35.582 184.000 32.000 187.582 32.000 192.000 C 32.000 196.418 35.582 200.000 40.000 200.000 L 112.000 200.000 C 116.418 200.000 120.000 196.418 120.000 192.000 C 120.000 187.582 116.418 184.000 112.000 184.000 ZM 247.660 126.300 C 247.050 128.340 245.652 130.053 243.775 131.059 C 241.898 132.065 239.697 132.282 237.660 131.660 L 208.000 122.750 L 208.000 192.000 C 208.023 206.513 198.291 219.231 184.276 223.001 C 170.260 226.772 155.461 220.653 148.200 208.087 C 140.938 195.520 143.028 179.643 153.293 169.383 C 163.559 159.123 179.437 157.042 192.000 164.310 L 192.000 112.000 C 192.001 109.471 193.197 107.092 195.226 105.583 C 197.255 104.074 199.878 103.613 202.300 104.340 L 242.300 116.340 C 246.530 117.611 248.929 122.070 247.660 126.300 ZM 192.000 192.000 C 192.000 183.163 184.837 176.000 176.000 176.000 C 167.163 176.000 160.000 183.163 160.000 192.000 C 160.000 200.837 167.163 208.000 176.000 208.000 C 184.837 208.000 192.000 200.837 192.000 192.000 Z"),
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
        return _playlist!!
    }

private var _playlist: ImageVector? = null
