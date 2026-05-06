package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.HeartHalf: ImageVector
    get() {
        if (_heartHalf != null) return _heartHalf!!
        _heartHalf = phosphorRegularIcon(
            name = "HeartHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M169.47 56.79c4.344-.812 7.207-4.991 6.395-9.335-.812-4.344-4.991-7.207-9.335-6.395C150.42 44.08 137 52.18 128 64 116.74 49 98.64 40 78 40 43.774 40.039 16.039 67.774 16 102c0 70 103.79 126.67 108.21 129 2.363 1.286 5.217 1.286 7.58 0h0c14.351-8.044 28.085-17.143 41.09-27.22 2.358-1.71 3.6-4.568 3.242-7.459-.358-2.891-2.259-5.359-4.963-6.443-2.704-1.084-5.784-.612-8.039 1.232-10.31 7.94-20 14.37-27.12 18.82v-128.23c5.84-12.95 17.94-22 33.47-24.91ZM120 210C93.58 193.41 32 149.71 32 102 32.033 76.609 52.609 56.033 78 56c18.91 0 34.86 9.78 42 25.64ZM232.55 104c-.296 .015-.594 .015-.89 0-4.073-.006-7.492-3.071-7.94-7.12C222.228 83.394 214.843 71.261 203.55 63.74c-2.456-1.555-3.874-4.32-3.706-7.222 .168-2.902 1.898-5.484 4.517-6.745 2.619-1.261 5.716-1.002 8.089 .677 15.216 10.14 25.164 26.495 27.17 44.67 .247 2.116-.36 4.244-1.687 5.911-1.327 1.667-3.265 2.736-5.383 2.969ZM230.46 139.62c-5.67 11.37-13.94 23-24.59 34.49-1.914 2.199-4.874 3.182-7.724 2.567-2.85-.616-5.139-2.733-5.975-5.527-.836-2.793-.085-5.82 1.958-7.9 9.61-10.4 17-20.75 22-30.77 1.221-2.649 3.787-4.424 6.697-4.631 2.91-.207 5.702 1.186 7.286 3.635 1.584 2.449 1.71 5.567 .327 8.136Z"),
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
        return _heartHalf!!
    }

private var _heartHalf: ImageVector? = null
