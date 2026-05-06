package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Desk: ImageVector
    get() {
        if (_desk != null) return _desk!!
        _desk = phosphorBoldIcon(
            name = "Desk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 60h-232C5.373 60 0 65.373 0 72c0 6.627 5.373 12 12 12h4v108c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-36h176v36c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-108h4c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM40 84h76v48h-76ZM216 132h-76v-48h76ZM100 108c0 6.627-5.373 12-12 12h-20c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h20c6.627 0 12 5.373 12 12ZM156 108c0-6.627 5.373-12 12-12h20c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-20c-6.627 0-12-5.373-12-12Z"),
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
        return _desk!!
    }

private var _desk: ImageVector? = null
