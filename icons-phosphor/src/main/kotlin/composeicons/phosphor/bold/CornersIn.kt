package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CornersIn: ImageVector
    get() {
        if (_cornersIn != null) return _cornersIn!!
        _cornersIn = phosphorBoldIcon(
            name = "CornersIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M148 96v-48c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v36h36c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-48c-6.627 0-12-5.373-12-12ZM96 148h-48c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h36v36c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-48c0-6.627-5.373-12-12-12ZM208 148h-48c-6.627 0-12 5.373-12 12v48c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-36h36c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM96 36C89.373 36 84 41.373 84 48v36h-36C41.373 84 36 89.373 36 96c0 6.627 5.373 12 12 12h48c6.627 0 12-5.373 12-12v-48C108 41.373 102.627 36 96 36Z"),
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
        return _cornersIn!!
    }

private var _cornersIn: ImageVector? = null
