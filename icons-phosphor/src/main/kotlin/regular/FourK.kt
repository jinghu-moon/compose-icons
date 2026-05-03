package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FourK: ImageVector
    get() {
        if (_fourK != null) return _fourK!!
        _fourK = phosphorRegularIcon(
            name = "FourK",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 24.000 48.000 C 24.000 43.582 27.582 40.000 32.000 40.000 L 224.000 40.000 C 228.418 40.000 232.000 43.582 232.000 48.000 C 232.000 52.418 228.418 56.000 224.000 56.000 L 32.000 56.000 C 27.582 56.000 24.000 52.418 24.000 48.000 ZM 224.000 200.000 L 32.000 200.000 C 27.582 200.000 24.000 203.582 24.000 208.000 C 24.000 212.418 27.582 216.000 32.000 216.000 L 224.000 216.000 C 228.418 216.000 232.000 212.418 232.000 208.000 C 232.000 203.582 228.418 200.000 224.000 200.000 ZM 144.000 72.000 C 139.582 72.000 136.000 75.582 136.000 80.000 L 136.000 176.000 C 136.000 180.418 139.582 184.000 144.000 184.000 C 148.418 184.000 152.000 180.418 152.000 176.000 L 152.000 147.000 L 165.090 132.000 L 193.090 180.000 C 194.417 182.666 197.116 184.374 200.093 184.433 C 203.071 184.492 205.834 182.892 207.266 180.281 C 208.698 177.669 208.561 174.479 206.910 172.000 L 176.210 119.370 L 206.000 85.270 C 208.091 83.158 208.838 80.061 207.941 77.227 C 207.044 74.394 204.650 72.291 201.725 71.767 C 198.800 71.243 195.825 72.384 194.000 74.730 L 152.000 122.730 L 152.000 80.000 C 152.000 75.582 148.418 72.000 144.000 72.000 ZM 88.000 176.000 L 88.000 160.000 L 40.000 160.000 C 36.946 159.998 34.160 158.257 32.819 155.513 C 31.477 152.769 31.816 149.501 33.690 147.090 L 89.690 75.090 C 91.789 72.397 95.366 71.332 98.596 72.441 C 101.826 73.549 103.997 76.585 104.000 80.000 L 104.000 144.000 L 112.000 144.000 C 116.418 144.000 120.000 147.582 120.000 152.000 C 120.000 156.418 116.418 160.000 112.000 160.000 L 104.000 160.000 L 104.000 176.000 C 104.000 180.418 100.418 184.000 96.000 184.000 C 91.582 184.000 88.000 180.418 88.000 176.000 ZM 88.000 144.000 L 88.000 103.320 L 56.360 144.000 Z"),
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
        return _fourK!!
    }

private var _fourK: ImageVector? = null
