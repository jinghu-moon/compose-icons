package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FloppyDiskBack: ImageVector
    get() {
        if (_floppyDiskBack != null) return _floppyDiskBack!!
        _floppyDiskBack = phosphorThinIcon(
            name = "FloppyDiskBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 36h-124.69c-3.18 0-6.23 1.263-8.48 3.51L39.52 74.83C37.26 77.072 35.992 80.126 36 83.31v124.69c0 6.627 5.373 12 12 12h160c6.627 0 12-5.373 12-12v-160c0-6.627-5.373-12-12-12ZM84 44h88v36c0 2.209-1.791 4-4 4h-80c-2.209 0-4-1.791-4-4ZM212 208c0 2.209-1.791 4-4 4h-160c-2.209 0-4-1.791-4-4v-124.69c.002-1.058 .422-2.072 1.17-2.82L76 49.66v30.34c0 6.627 5.373 12 12 12h80c6.627 0 12-5.373 12-12v-36h28c2.209 0 4 1.791 4 4ZM128 116c-19.882 0-36 16.118-36 36 0 19.882 16.118 36 36 36 19.882 0 36-16.118 36-36 0-19.882-16.118-36-36-36ZM128 180c-15.464 0-28-12.536-28-28 0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28Z"),
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
        return _floppyDiskBack!!
    }

private var _floppyDiskBack: ImageVector? = null
