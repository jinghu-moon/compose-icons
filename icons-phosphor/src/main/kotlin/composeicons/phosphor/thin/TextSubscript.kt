package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextSubscript: ImageVector
    get() {
        if (_textSubscript != null) return _textSubscript!!
        _textSubscript = phosphorThinIcon(
            name = "TextSubscript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 208c0 2.209-1.791 4-4 4h-48c-1.515 0-2.9-.856-3.578-2.211-.678-1.355-.531-2.977 .378-4.189L232 148c6.627-8.837 4.837-21.373-4-28-8.837-6.627-21.373-4.837-28 4-1.229 1.634-2.204 3.444-2.89 5.37-.735 2.085-3.02 3.18-5.105 2.445-2.085-.735-3.18-3.02-2.445-5.105 .947-2.694 2.295-5.229 4-7.52 9.373-12.138 26.766-14.479 39.013-5.249 12.248 9.23 14.792 26.594 5.707 38.949L200 204h40c2.209 0 4 1.791 4 4ZM146.62 53c-1.668-1.446-4.193-1.267-5.64 .4L92 109.89 43 53.38c-.889-1.23-2.397-1.851-3.894-1.604-1.497 .247-2.725 1.32-3.172 2.77-.446 1.45-.034 3.028 1.065 4.074L86.71 116 37 173.38c-1.099 1.046-1.512 2.624-1.065 4.074 .446 1.45 1.675 2.523 3.172 2.77 1.497 .247 3.005-.374 3.894-1.604L92 122.11l49 56.51c1.497 1.425 3.832 1.475 5.389 .115 1.556-1.359 1.821-3.68 .611-5.355L97.29 116 147 58.62c1.437-1.66 1.268-4.169-.38-5.62Z"),
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
        return _textSubscript!!
    }

private var _textSubscript: ImageVector? = null
