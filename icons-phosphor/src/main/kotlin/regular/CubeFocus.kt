package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CubeFocus: ImageVector
    get() {
        if (_cubeFocus != null) return _cubeFocus!!
        _cubeFocus = phosphorRegularIcon(
            name = "CubeFocus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 48.000 L 232.000 88.000 C 232.000 92.418 228.418 96.000 224.000 96.000 C 219.582 96.000 216.000 92.418 216.000 88.000 L 216.000 56.000 L 184.000 56.000 C 179.582 56.000 176.000 52.418 176.000 48.000 C 176.000 43.582 179.582 40.000 184.000 40.000 L 224.000 40.000 C 228.418 40.000 232.000 43.582 232.000 48.000 ZM 72.000 200.000 L 40.000 200.000 L 40.000 168.000 C 40.000 163.582 36.418 160.000 32.000 160.000 C 27.582 160.000 24.000 163.582 24.000 168.000 L 24.000 208.000 C 24.000 212.418 27.582 216.000 32.000 216.000 L 72.000 216.000 C 76.418 216.000 80.000 212.418 80.000 208.000 C 80.000 203.582 76.418 200.000 72.000 200.000 ZM 224.000 160.000 C 219.582 160.000 216.000 163.582 216.000 168.000 L 216.000 200.000 L 184.000 200.000 C 179.582 200.000 176.000 203.582 176.000 208.000 C 176.000 212.418 179.582 216.000 184.000 216.000 L 224.000 216.000 C 228.418 216.000 232.000 212.418 232.000 208.000 L 232.000 168.000 C 232.000 163.582 228.418 160.000 224.000 160.000 ZM 32.000 96.000 C 36.418 96.000 40.000 92.418 40.000 88.000 L 40.000 56.000 L 72.000 56.000 C 76.418 56.000 80.000 52.418 80.000 48.000 C 80.000 43.582 76.418 40.000 72.000 40.000 L 32.000 40.000 C 27.582 40.000 24.000 43.582 24.000 48.000 L 24.000 88.000 C 24.000 92.418 27.582 96.000 32.000 96.000 ZM 188.000 167.000 L 132.000 199.000 C 129.540 200.406 126.520 200.406 124.060 199.000 L 68.000 167.000 C 65.502 165.558 63.974 162.884 64.000 160.000 L 64.000 96.000 C 63.974 93.116 65.502 90.442 68.000 89.000 L 124.000 57.000 C 126.460 55.594 129.480 55.594 131.940 57.000 L 187.940 89.000 C 190.438 90.442 191.966 93.116 191.940 96.000 L 191.940 160.000 C 191.978 162.871 190.474 165.543 188.000 167.000 ZM 88.120 96.000 L 128.000 118.790 L 167.880 96.000 L 128.000 73.210 ZM 80.000 155.360 L 120.000 178.210 L 120.000 132.640 L 80.000 109.790 ZM 176.000 155.360 L 176.000 109.790 L 136.000 132.640 L 136.000 178.210 Z"),
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
        return _cubeFocus!!
    }

private var _cubeFocus: ImageVector? = null
