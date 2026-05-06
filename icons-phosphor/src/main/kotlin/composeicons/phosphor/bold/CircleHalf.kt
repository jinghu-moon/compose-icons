package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CircleHalf: ImageVector
    get() {
        if (_circleHalf != null) return _circleHalf!!
        _circleHalf = phosphorBoldIcon(
            name = "CircleHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM140 44.87c8.319 1.195 16.41 3.64 24 7.25v151.76c-7.59 3.61-15.681 6.055-24 7.25ZM44 128C44.056 86.266 74.701 50.883 116 44.87v166.26C74.701 205.117 44.056 169.734 44 128ZM188 186.71v-117.42c32 32.599 32 84.821 0 117.42Z"),
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
        return _circleHalf!!
    }

private var _circleHalf: ImageVector? = null
