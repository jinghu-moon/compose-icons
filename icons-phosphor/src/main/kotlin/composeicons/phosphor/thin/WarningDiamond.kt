package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.WarningDiamond: ImageVector
    get() {
        if (_warningDiamond != null) return _warningDiamond!!
        _warningDiamond = phosphorThinIcon(
            name = "WarningDiamond",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M124 136v-56c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v56c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4ZM128 164c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM236 128c.009 3.171-1.251 6.214-3.5 8.45l-96.05 96.06c-4.678 4.639-12.222 4.639-16.9 0h0L23.55 136.45c-4.639-4.678-4.639-12.222 0-16.9L119.6 23.49c4.678-4.639 12.222-4.639 16.9 0l96.05 96.06c2.23 2.244 3.472 5.286 3.45 8.45ZM228 128c.004-1.048-.414-2.054-1.16-2.79L130.79 29.15c-1.553-1.512-4.027-1.512-5.58 0l-96 96.06c-.741 .739-1.158 1.743-1.158 2.79 0 1.047 .417 2.051 1.158 2.79l96.05 96.06c1.553 1.512 4.027 1.512 5.58 0l96.05-96.06c.728-.745 1.127-1.749 1.11-2.79Z"),
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
        return _warningDiamond!!
    }

private var _warningDiamond: ImageVector? = null
