package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Alien: ImageVector
    get() {
        if (_alien != null) return _alien!!
        _alien = phosphorBoldIcon(
            name = "Alien",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 12C72.797 12.061 28.061 56.797 28 112c0 24.86 12.86 56.8 34.41 85.44C70.63 208.36 99.64 244 128 244c28.36 0 57.37-35.64 65.59-46.56C215.14 168.8 228 136.86 228 112 227.939 56.797 183.203 12.061 128 12ZM174.41 183C160.58 201.38 140.2 220 128 220 115.8 220 95.42 201.39 81.59 183 63.34 158.75 52 131.54 52 112 52 70.026 86.026 36 128 36c41.974 0 76 34.026 76 76 0 19.54-11.34 46.75-29.59 71ZM104 148C84.118 148 68 131.882 68 112c0-6.627 5.373-12 12-12 19.882 0 36 16.118 36 36 0 6.627-5.373 12-12 12ZM188 112c0 19.882-16.118 36-36 36-6.627 0-12-5.373-12-12 0-19.882 16.118-36 36-36 6.627 0 12 5.373 12 12ZM152 184c0 6.627-5.373 12-12 12h-24c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h24c6.627 0 12 5.373 12 12Z"),
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
        return _alien!!
    }

private var _alien: ImageVector? = null
