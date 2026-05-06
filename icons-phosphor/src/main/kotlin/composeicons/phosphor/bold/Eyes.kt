package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Eyes: ImageVector
    get() {
        if (_eyes != null) return _eyes!!
        _eyes = phosphorBoldIcon(
            name = "Eyes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220.48 60C209.21 39.37 193.42 28 176 28c-17.42 0-33.21 11.37-44.48 32-1.24 2.28-2.42 4.65-3.52 7.11C126.9 64.65 125.72 62.28 124.48 60 113.21 39.37 97.42 28 80 28 62.58 28 46.79 39.37 35.52 60 25.51 78.38 20 102.52 20 128c0 25.48 5.51 49.62 15.52 68C46.79 216.62 62.58 228 80 228c17.42 0 33.21-11.38 44.48-32 1.24-2.28 2.42-4.65 3.52-7.11 1.1 2.46 2.28 4.83 3.52 7.11 11.27 20.65 27.06 32 44.48 32 17.42 0 33.21-11.38 44.48-32C230.48 177.65 236 153.51 236 128c0-25.51-5.51-49.62-15.52-68ZM152 116c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12ZM56 116c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12ZM80 204C67.92 204 54.87 188.28 48.3 163.16c2.528 .56 5.11 .841 7.7 .84 19.882 0 36-16.118 36-36C92 108.118 75.882 92 56 92c-2.59-.001-5.172 .28-7.7 .84C54.87 67.72 67.92 52 80 52c17 0 36 31.21 36 76 0 44.79-19 76-36 76ZM176 204c-12.08 0-25.13-15.72-31.7-40.84 2.528 .56 5.11 .841 7.7 .84 19.882 0 36-16.118 36-36C188 108.118 171.882 92 152 92c-2.59-.001-5.172 .28-7.7 .84C150.87 67.72 163.92 52 176 52c17 0 36 31.21 36 76 0 44.79-19 76-36 76Z"),
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
        return _eyes!!
    }

private var _eyes: ImageVector? = null
