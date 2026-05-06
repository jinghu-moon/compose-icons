package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Highlighter: ImageVector
    get() {
        if (_highlighter != null) return _highlighter!!
        _highlighter = phosphorDuotoneIcon(
            name = "Highlighter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M136 176 96 216 24 192 88 128Z"),
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
                pathData = parseSvgPathData("M253.66 106.34c-1.501-1.502-3.537-2.346-5.66-2.346-2.123 0-4.159 .844-5.66 2.346L192 156.69 109.66 74.34h0L107.31 72 157.66 21.66c3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0L96 60.69c-4.969 4.97-6.113 12.601-2.82 18.81L72 100.69c-6.243 6.248-6.243 16.372 0 22.62L76.69 128 18.34 186.34c-1.962 1.961-2.769 4.798-2.131 7.498 .638 2.7 2.629 4.876 5.261 5.752l72 24c.815 .274 1.67 .412 2.53 .41 2.122 .002 4.158-.84 5.66-2.34L136 187.31l4.69 4.69c6.248 6.243 16.372 6.243 22.62 0l21.18-21.18c6.211 3.298 13.848 2.154 18.82-2.82l50.35-50.34c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66ZM93.84 206.85 38.84 188.5 88 139.31 124.69 176ZM152 180.69 141.66 170.34h0l-48-48h0L83.31 112 104 91.31 172.69 160Z"),
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
        return _highlighter!!
    }

private var _highlighter: ImageVector? = null
