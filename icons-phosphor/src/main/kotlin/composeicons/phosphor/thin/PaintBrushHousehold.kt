package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PaintBrushHousehold: ImageVector
    get() {
        if (_paintBrushHousehold != null) return _paintBrushHousehold!!
        _paintBrushHousehold = phosphorThinIcon(
            name = "PaintBrushHousehold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.81 28.19c-5.251-5.252-12.373-8.202-19.8-8.202-7.427 0-14.549 2.95-19.8 8.202l-.21 .23L131.78 94.11 118.15 80.48c-3.751-3.752-8.839-5.861-14.145-5.861-5.306 0-10.394 2.108-14.145 5.861L13.17 157.17c-1.558 1.561-1.558 4.089 0 5.65l80 80c1.561 1.558 4.089 1.558 5.65 0l76.69-76.69c3.752-3.751 5.861-8.839 5.861-14.145 0-5.306-2.108-10.394-5.861-14.145L161.88 124.21 227.58 68l.23-.21c5.252-5.251 8.202-12.373 8.202-19.8 0-7.427-2.95-14.549-8.202-19.8ZM96 234.34 73.66 212 98.83 186.82c1.432-1.58 1.372-4.006-.136-5.514-1.508-1.508-3.934-1.568-5.514-.136L68 206.34 49.66 188 74.83 162.82c1.432-1.58 1.372-4.006-.136-5.514-1.508-1.508-3.934-1.568-5.514-.136L44 182.34 21.66 160 72 109.65 146.35 184ZM222.26 62l-68.85 59c-.848 .724-1.355 1.77-1.399 2.885-.044 1.115 .38 2.197 1.169 2.985l16.69 16.69c2.259 2.252 3.529 5.31 3.529 8.5 0 3.19-1.27 6.248-3.529 8.5L152 178.34 77.66 104 95.52 86.13c2.252-2.259 5.31-3.529 8.5-3.529 3.19 0 6.248 1.27 8.5 3.529l16.69 16.69c.789 .789 1.871 1.212 2.985 1.169 1.115-.044 2.16-.551 2.885-1.399L194 33.74c7.89-7.262 20.104-7.009 27.686 .574 7.583 7.583 7.836 19.796 .574 27.686Z"),
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
        return _paintBrushHousehold!!
    }

private var _paintBrushHousehold: ImageVector? = null
