package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MagicWand: ImageVector
    get() {
        if (_magicWand != null) return _magicWand!!
        _magicWand = phosphorBoldIcon(
            name = "MagicWand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M252 152c0 6.627-5.373 12-12 12h-12v12c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-12h-12c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h12v-12c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v12h12c6.627 0 12 5.373 12 12ZM56 76h12v12c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-12h12c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-12v-12C92 33.373 86.627 28 80 28 73.373 28 68 33.373 68 40v12h-12C49.373 52 44 57.373 44 64c0 6.627 5.373 12 12 12ZM184 188h-4v-4c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v4h-4c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h4v4c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-4h4c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM222.14 82.83 82.82 222.14c-7.81 7.808-20.47 7.808-28.28 0L33.85 201.46c-3.752-3.751-5.861-8.839-5.861-14.145 0-5.306 2.108-10.394 5.861-14.145L173.17 33.86c7.81-7.808 20.47-7.808 28.28 0l20.69 20.68c3.752 3.751 5.861 8.839 5.861 14.145 0 5.306-2.108 10.394-5.861 14.145ZM159 112 144 97 53.65 187.31l15 15ZM202.31 68.69l-15-15L161 80l15 15Z"),
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
        return _magicWand!!
    }

private var _magicWand: ImageVector? = null
