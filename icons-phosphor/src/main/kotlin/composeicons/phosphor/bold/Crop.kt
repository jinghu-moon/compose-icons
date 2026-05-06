package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Crop: ImageVector
    get() {
        if (_crop != null) return _crop!!
        _crop = phosphorBoldIcon(
            name = "Crop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 192c0 6.627-5.373 12-12 12h-28v28c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-28h-116c-6.627 0-12-5.373-12-12v-116h-28C17.373 76 12 70.627 12 64 12 57.373 17.373 52 24 52h28v-28C52 17.373 57.373 12 64 12c6.627 0 12 5.373 12 12v156h156c6.627 0 12 5.373 12 12ZM104 76h76v76c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-88c0-6.627-5.373-12-12-12h-88C97.373 52 92 57.373 92 64c0 6.627 5.373 12 12 12Z"),
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
        return _crop!!
    }

private var _crop: ImageVector? = null
