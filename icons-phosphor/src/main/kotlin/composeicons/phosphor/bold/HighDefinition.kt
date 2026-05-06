package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HighDefinition: ImageVector
    get() {
        if (_highDefinition != null) return _highDefinition!!
        _highDefinition = phosphorBoldIcon(
            name = "HighDefinition",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180 68h-24c-6.627 0-12 5.373-12 12v96c0 6.627 5.373 12 12 12h24c33.137 0 60-26.863 60-60C240 94.863 213.137 68 180 68ZM180 164h-12v-72h12c19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36ZM104 176v-36h-48v36c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-96C32 73.373 37.373 68 44 68c6.627 0 12 5.373 12 12v36h48v-36c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v96c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM20 44C20 37.373 25.373 32 32 32h192c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-192C25.373 56 20 50.627 20 44ZM236 212c0 6.627-5.373 12-12 12h-192c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h192c6.627 0 12 5.373 12 12Z"),
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
        return _highDefinition!!
    }

private var _highDefinition: ImageVector? = null
