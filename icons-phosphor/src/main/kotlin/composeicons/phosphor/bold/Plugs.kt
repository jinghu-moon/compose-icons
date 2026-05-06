package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Plugs: ImageVector
    get() {
        if (_plugs != null) return _plugs!!
        _plugs = phosphorBoldIcon(
            name = "Plugs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M137 168l11.52-11.51c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0L120 151 105 136l11.52-11.51c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0L88 119 72.49 103.51c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17L59 124 38.54 144.49c-14.058 14.059-14.058 36.851 0 50.91l2.55 2.54L15.51 223.51c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0L58.08 214.93l2.54 2.55c14.072 14.025 36.838 14.025 50.91 0L132 197l3.51 3.52c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17ZM94.54 200.49c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529L55.51 178.43c-2.259-2.252-3.529-5.31-3.529-8.5 0-3.19 1.27-6.248 3.529-8.5L76 141l39 39ZM240.54 15.49c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529L197.94 41.09l-2.54-2.55c-14.07-14.03-36.84-14.03-50.91 0L124 59l-3.51-3.52c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17l80 80c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17L197 132l20.49-20.49c14.058-14.059 14.058-36.851 0-50.91l-2.55-2.54L240.52 32.49c2.249-2.255 3.51-5.311 3.504-8.496-.006-3.185-1.277-6.237-3.534-8.484ZM200.54 94.49 180 115 141 76 161.49 55.51c2.252-2.259 5.31-3.529 8.5-3.529 3.19 0 6.248 1.27 8.5 3.529l22.06 22.06c2.259 2.252 3.529 5.31 3.529 8.5 0 3.19-1.27 6.248-3.529 8.5Z"),
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
        return _plugs!!
    }

private var _plugs: ImageVector? = null
