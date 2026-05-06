package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MapPinSimpleLine: ImageVector
    get() {
        if (_mapPinSimpleLine != null) return _mapPinSimpleLine!!
        _mapPinSimpleLine = phosphorBoldIcon(
            name = "MapPinSimpleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 204h-76v-65.21c30.18-6.16 50.792-34.172 47.696-64.818C184.6 43.326 158.802 20.002 128 20.002c-30.802 0-56.6 23.324-59.696 53.969-3.096 30.646 17.517 58.658 47.696 64.818v65.21h-76c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h176c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM92 80C92 60.118 108.118 44 128 44c19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36C108.118 116 92 99.882 92 80Z"),
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
        return _mapPinSimpleLine!!
    }

private var _mapPinSimpleLine: ImageVector? = null
