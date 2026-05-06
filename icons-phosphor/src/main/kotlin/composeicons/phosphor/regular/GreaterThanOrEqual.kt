package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GreaterThanOrEqual: ImageVector
    get() {
        if (_greaterThanOrEqual != null) return _greaterThanOrEqual!!
        _greaterThanOrEqual = phosphorRegularIcon(
            name = "GreaterThanOrEqual",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M53.24 152.49 184.86 104 53.24 55.51c-2.793-.903-4.867-3.263-5.404-6.149-.537-2.886 .55-5.834 2.832-7.681 2.282-1.847 5.391-2.296 8.102-1.17L210.77 96.51c3.136 1.164 5.216 4.155 5.216 7.5 0 3.345-2.081 6.336-5.216 7.5L58.77 167.51c-.888 .323-1.825 .489-2.77 .49-3.879 .002-7.2-2.78-7.879-6.598-.68-3.819 1.478-7.575 5.119-8.912ZM208 192h-152c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h152c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
        return _greaterThanOrEqual!!
    }

private var _greaterThanOrEqual: ImageVector? = null
