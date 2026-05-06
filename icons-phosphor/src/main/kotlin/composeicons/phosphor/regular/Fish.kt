package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Fish: ImageVector
    get() {
        if (_fish != null) return _fish!!
        _fish = phosphorRegularIcon(
            name = "Fish",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 76c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM216.72 143.64c-19.37 34.9-55.44 53.76-107.24 56.1l-22 51.41c-1.264 2.951-4.17 4.861-7.38 4.85h-.51c-3.378-.212-6.257-2.526-7.19-5.78L57.6 198.39 5.8 183.56C2.537 182.643 .206 179.77-.019 176.388c-.225-3.382 1.706-6.538 4.819-7.878l51.41-22C58.56 94.73 77.42 58.67 112.3 39.29 137.05 25.55 165.04 23.45 184.18 24.11c18.64 .64 36 4.27 38.86 6 1.168 .688 2.142 1.662 2.83 2.83 1.69 2.85 5.33 20.21 6 38.85 .68 19.1-1.41 47.1-15.15 71.85ZM161.54 172.64c-18.87-7.194-31.884-24.642-33.4-44.78C108.007 126.347 90.561 113.336 83.37 94.47Q72.92 118.26 72.07 152.06c-.072 3.134-1.968 5.937-4.85 7.17L31.83 174.37l34.45 9.86c2.657 .762 4.733 2.841 5.49 5.5l9.84 34.44L96.77 188.77c1.236-2.878 4.039-4.769 7.17-4.84q33.77-.81 57.6-11.29ZM212.42 43.57c-14.15-3-64.1-11-100.3 14.75-5.992 4.275-11.374 9.345-16 15.07-.767 10.574 3.165 20.949 10.749 28.357 7.584 7.408 18.048 11.097 28.601 10.083 2.378-.229 4.734 .617 6.424 2.306 1.689 1.689 2.535 4.046 2.306 6.424-1.012 10.557 2.682 21.024 10.097 28.606 7.415 7.583 17.796 11.51 28.373 10.734 5.704-4.627 10.75-10.01 15-16C223.42 107.73 215.42 57.74 212.42 43.57Z"),
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
        return _fish!!
    }

private var _fish: ImageVector? = null
