package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FourK: ImageVector
    get() {
        if (_fourK != null) return _fourK!!
        _fourK = phosphorBoldIcon(
            name = "FourK",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 44C20 37.373 25.373 32 32 32h192c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-192C25.373 56 20 50.627 20 44ZM224 200h-192c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h192c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM148 68c-6.627 0-12 5.373-12 12v96c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-27.49l8.44-9.65 25.19 43.19c3.437 5.482 10.601 7.253 16.196 4.002 5.595-3.251 7.605-10.352 4.544-16.052L185.11 119.86 213 87.9c3.158-3.164 4.296-7.822 2.951-12.086-1.344-4.264-4.948-7.427-9.35-8.207-4.402-.78-8.873 .951-11.601 4.493l-35 40v-32.1c0-6.627-5.373-12-12-12ZM80 176v-12h-44c-4.584-0-8.767-2.611-10.78-6.729-2.013-4.118-1.505-9.023 1.31-12.641L82.53 72.63c3.148-4.045 8.518-5.644 13.366-3.98 4.848 1.664 8.104 6.224 8.104 11.35v60h4c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-4v12c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM80 140v-25L60.54 140Z"),
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
        return _fourK!!
    }

private var _fourK: ImageVector? = null
