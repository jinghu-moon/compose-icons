package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SpinnerGap: ImageVector
    get() {
        if (_spinnerGap != null) return _spinnerGap!!
        _spinnerGap = phosphorRegularIcon(
            name = "SpinnerGap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 136.000 32.000 L 136.000 64.000 C 136.000 68.418 132.418 72.000 128.000 72.000 C 123.582 72.000 120.000 68.418 120.000 64.000 L 120.000 32.000 C 120.000 27.582 123.582 24.000 128.000 24.000 C 132.418 24.000 136.000 27.582 136.000 32.000 ZM 224.000 120.000 L 192.000 120.000 C 187.582 120.000 184.000 123.582 184.000 128.000 C 184.000 132.418 187.582 136.000 192.000 136.000 L 224.000 136.000 C 228.418 136.000 232.000 132.418 232.000 128.000 C 232.000 123.582 228.418 120.000 224.000 120.000 ZM 178.910 167.600 C 175.765 164.612 170.811 164.675 167.743 167.743 C 164.675 170.811 164.612 175.765 167.600 178.910 L 190.220 201.540 C 193.346 204.666 198.414 204.666 201.540 201.540 C 204.666 198.414 204.666 193.346 201.540 190.220 ZM 128.000 184.000 C 123.582 184.000 120.000 187.582 120.000 192.000 L 120.000 224.000 C 120.000 228.418 123.582 232.000 128.000 232.000 C 132.418 232.000 136.000 228.418 136.000 224.000 L 136.000 192.000 C 136.000 187.582 132.418 184.000 128.000 184.000 ZM 77.090 167.600 L 54.460 190.220 C 51.334 193.346 51.334 198.414 54.460 201.540 C 57.586 204.666 62.654 204.666 65.780 201.540 L 88.400 178.910 C 91.388 175.765 91.325 170.811 88.257 167.743 C 85.189 164.675 80.235 164.612 77.090 167.600 ZM 72.000 128.000 C 72.000 123.582 68.418 120.000 64.000 120.000 L 32.000 120.000 C 27.582 120.000 24.000 123.582 24.000 128.000 C 24.000 132.418 27.582 136.000 32.000 136.000 L 64.000 136.000 C 68.418 136.000 72.000 132.418 72.000 128.000 ZM 65.780 54.460 C 62.654 51.334 57.586 51.334 54.460 54.460 C 51.334 57.586 51.334 62.654 54.460 65.780 L 77.090 88.400 C 80.235 91.388 85.189 91.325 88.257 88.257 C 91.325 85.189 91.388 80.235 88.400 77.090 Z"),
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
        return _spinnerGap!!
    }

private var _spinnerGap: ImageVector? = null
