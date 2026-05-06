package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.RoadHorizon: ImageVector
    get() {
        if (_roadHorizon != null) return _roadHorizon!!
        _roadHorizon = phosphorBoldIcon(
            name = "RoadHorizon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M237.88 202.46c-5.777 3.247-13.092 1.197-16.34-4.58L153 76h-13v4c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-4h-13L34.46 197.88c-2.077 3.782-6.026 6.158-10.341 6.222-4.315 .064-8.332-2.194-10.52-5.914-2.188-3.719-2.211-8.327-.059-12.068L75.48 76h-51.48C17.373 76 12 70.627 12 64 12 57.373 17.373 52 24 52h208c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-51.48l61.94 110.12c3.247 5.777 1.197 13.092-4.58 16.34ZM128 108c-6.627 0-12 5.373-12 12v16c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-16c0-6.627-5.373-12-12-12ZM128 164c-6.627 0-12 5.373-12 12v16c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-16c0-6.627-5.373-12-12-12Z"),
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
        return _roadHorizon!!
    }

private var _roadHorizon: ImageVector? = null
