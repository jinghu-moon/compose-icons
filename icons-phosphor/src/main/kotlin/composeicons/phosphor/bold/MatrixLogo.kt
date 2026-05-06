package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MatrixLogo: ImageVector
    get() {
        if (_matrixLogo != null) return _matrixLogo!!
        _matrixLogo = phosphorBoldIcon(
            name = "MatrixLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M76 216c0 6.627-5.373 12-12 12h-24c-6.627 0-12-5.373-12-12v-176C28 33.373 33.373 28 40 28h24c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-12v152h12c6.627 0 12 5.373 12 12ZM216 28h-24c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h12v152h-12c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h24c6.627 0 12-5.373 12-12v-176c0-6.627-5.373-12-12-12ZM188 160v-40c-.013-14.191-8.361-27.05-21.318-32.837C153.725 81.375 138.577 83.74 128 93.2 117.192 83.487 101.596 81.245 88.49 87.52 85.059 84.085 79.897 83.056 75.411 84.913 70.925 86.769 68 91.145 68 96v64c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-40c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v40c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-40c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v40c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12Z"),
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
        return _matrixLogo!!
    }

private var _matrixLogo: ImageVector? = null
