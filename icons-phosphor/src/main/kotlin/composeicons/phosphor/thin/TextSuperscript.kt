package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextSuperscript: ImageVector
    get() {
        if (_textSuperscript != null) return _textSuperscript!!
        _textSuperscript = phosphorThinIcon(
            name = "TextSuperscript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 144c0 2.209-1.791 4-4 4h-48c-1.515 0-2.9-.856-3.578-2.211-.678-1.355-.531-2.977 .378-4.189L232 84.05c4.879-6.464 5.379-15.232 1.265-22.208C229.152 54.866 221.238 51.059 213.22 52.2c-7.392 1.036-13.592 6.103-16.08 13.14-.737 2.085-3.025 3.177-5.11 2.44-2.085-.737-3.177-3.025-2.44-5.11 .947-2.694 2.295-5.229 4-7.52 5.973-8.122 15.85-12.406 25.862-11.217 10.011 1.19 18.61 7.67 22.513 16.965 3.903 9.296 2.507 19.972-3.655 27.952L200 140h40c2.209 0 4 1.791 4 4ZM146.62 77c-1.668-1.446-4.193-1.267-5.64 .4L92 133.89 43 77.38c-1.497-1.425-3.832-1.475-5.389-.115-1.556 1.359-1.821 3.68-.611 5.355L86.71 140 37 197.38c-1.099 1.046-1.512 2.624-1.065 4.074 .446 1.45 1.675 2.523 3.172 2.77 1.497 .247 3.005-.374 3.894-1.604L92 146.11l49 56.51c1.497 1.425 3.832 1.475 5.389 .115 1.556-1.359 1.821-3.68 .611-5.355L97.29 140 147 82.62c1.437-1.66 1.268-4.169-.38-5.62Z"),
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
        return _textSuperscript!!
    }

private var _textSuperscript: ImageVector? = null
