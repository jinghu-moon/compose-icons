package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.StandardDefinition: ImageVector
    get() {
        if (_standardDefinition != null) return _standardDefinition!!
        _standardDefinition = phosphorBoldIcon(
            name = "StandardDefinition",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172 68h-24c-6.627 0-12 5.373-12 12v96c0 6.627 5.373 12 12 12h24c33.137 0 60-26.863 60-60C232 94.863 205.137 68 172 68ZM172 164h-12v-72h12c19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36ZM20 44C20 37.373 25.373 32 32 32h192c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-192C25.373 56 20 50.627 20 44ZM236 212c0 6.627-5.373 12-12 12h-192c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h192c6.627 0 12 5.373 12 12ZM96 152c0-6.37-6.29-9.32-24-14.42C55.86 132.93 33.77 126.58 33.77 104c0-20.52 18.15-36 42.22-36 17.24 0 32.06 8.14 38.69 21.24 2.006 3.833 1.795 8.449-.554 12.081-2.349 3.633-6.471 5.72-10.79 5.463-4.318-.257-8.164-2.819-10.066-6.704C90.8 95.17 84 92 76 92 65.78 92 57.78 97.27 57.78 104c0 1.09 0 2.21 3.28 4.17 4.18 2.48 11 4.45 17.6 6.35 8.75 2.52 17.8 5.13 25.38 9.86 13.19 8.23 16 19.56 16 27.62 0 20.19-19.33 36-44 36-24.67 0-44-15.81-44-36 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.87 10.56 12 20 12C85.48 164 96 158.87 96 152Z"),
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
        return _standardDefinition!!
    }

private var _standardDefinition: ImageVector? = null
