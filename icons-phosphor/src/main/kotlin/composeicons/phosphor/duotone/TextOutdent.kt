package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TextOutdent: ImageVector
    get() {
        if (_textOutdent != null) return _textOutdent!!
        _textOutdent = phosphorDuotoneIcon(
            name = "TextOutdent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 64v128h-176v-104L64 64Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M224 128c0 4.418-3.582 8-8 8h-104c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h104c4.418 0 8 3.582 8 8ZM112 72h104c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-104c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM216 184h-176c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h176c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM72 144c3.238 .003 6.158-1.947 7.397-4.938 1.239-2.991 .554-6.434-1.737-8.722L43.31 96 77.66 61.66c3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0L26.34 90.34C24.838 91.841 23.994 93.877 23.994 96c0 2.123 .844 4.159 2.346 5.66l40 40c1.502 1.5 3.538 2.342 5.66 2.34Z"),
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
        return _textOutdent!!
    }

private var _textOutdent: ImageVector? = null
