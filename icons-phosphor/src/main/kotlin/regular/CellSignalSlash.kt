package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CellSignalSlash: ImageVector
    get() {
        if (_cellSignalSlash != null) return _cellSignalSlash!!
        _cellSignalSlash = phosphorRegularIcon(
            name = "CellSignalSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 88.000 152.000 L 88.000 200.000 C 88.000 204.418 84.418 208.000 80.000 208.000 C 75.582 208.000 72.000 204.418 72.000 200.000 L 72.000 152.000 C 72.000 147.582 75.582 144.000 80.000 144.000 C 84.418 144.000 88.000 147.582 88.000 152.000 ZM 40.000 184.000 C 35.582 184.000 32.000 187.582 32.000 192.000 L 32.000 200.000 C 32.000 204.418 35.582 208.000 40.000 208.000 C 44.418 208.000 48.000 204.418 48.000 200.000 L 48.000 192.000 C 48.000 187.582 44.418 184.000 40.000 184.000 ZM 213.920 210.620 L 53.920 34.620 C 52.008 32.465 49.085 31.504 46.267 32.105 C 43.450 32.706 41.173 34.775 40.306 37.522 C 39.439 40.270 40.117 43.271 42.080 45.380 L 112.000 122.290 L 112.000 200.000 C 112.000 204.418 115.582 208.000 120.000 208.000 C 124.418 208.000 128.000 204.418 128.000 200.000 L 128.000 139.890 L 152.000 166.290 L 152.000 200.000 C 152.000 204.418 155.582 208.000 160.000 208.000 C 164.418 208.000 168.000 204.418 168.000 200.000 L 168.000 183.890 L 202.080 221.380 C 203.992 223.535 206.915 224.496 209.733 223.895 C 212.550 223.294 214.827 221.225 215.694 218.478 C 216.561 215.730 215.883 212.729 213.920 210.620 ZM 160.000 123.620 C 164.418 123.620 168.000 120.038 168.000 115.620 L 168.000 72.000 C 168.000 67.582 164.418 64.000 160.000 64.000 C 155.582 64.000 152.000 67.582 152.000 72.000 L 152.000 115.630 C 152.000 120.048 155.582 123.630 160.000 123.630 ZM 200.000 167.620 C 204.418 167.620 208.000 164.038 208.000 159.620 L 208.000 32.000 C 208.000 27.582 204.418 24.000 200.000 24.000 C 195.582 24.000 192.000 27.582 192.000 32.000 L 192.000 159.630 C 192.000 164.048 195.582 167.630 200.000 167.630 Z"),
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
        return _cellSignalSlash!!
    }

private var _cellSignalSlash: ImageVector? = null
