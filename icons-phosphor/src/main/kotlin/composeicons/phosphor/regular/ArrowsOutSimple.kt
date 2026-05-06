package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowsOutSimple: ImageVector
    get() {
        if (_arrowsOutSimple != null) return _arrowsOutSimple!!
        _arrowsOutSimple = phosphorRegularIcon(
            name = "ArrowsOutSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 48v48c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-28.69l-50.34 50.35c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L188.69 56h-28.69c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h48c4.418 0 8 3.582 8 8ZM106.34 138.34 56 188.69v-28.69c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v48c0 4.418 3.582 8 8 8h48c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-28.69l50.35-50.34c3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0Z"),
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
        return _arrowsOutSimple!!
    }

private var _arrowsOutSimple: ImageVector? = null
