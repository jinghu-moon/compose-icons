package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Highlighter: ImageVector
    get() {
        if (_highlighter != null) return _highlighter!!
        _highlighter = phosphorBoldIcon(
            name = "Highlighter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M252.49 107.51c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529L192 151 113 72 156.52 28.49c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0L93.17 57.86c-5.416 5.43-7.25 13.48-4.72 20.72L69.17 97.86c-7.808 7.81-7.808 20.47 0 28.28L71 128 15.51 183.51c-2.941 2.942-4.148 7.197-3.191 11.246 .958 4.048 3.943 7.312 7.891 8.624l72 24c1.221 .412 2.501 .622 3.79 .62 3.185-0 6.239-1.266 8.49-3.52L136 193l1.86 1.86c7.81 7.808 20.47 7.808 28.28 0l19.27-19.27c2.119 .739 4.346 1.121 6.59 1.13 5.307 .014 10.399-2.096 14.14-5.86l46.35-46.34c2.263-2.252 3.534-5.313 3.534-8.505 0-3.192-1.272-6.253-3.534-8.505ZM92.76 202.27 46.21 186.76 88 145l31 31ZM152 175 96.49 119.52h0L89 112 104 97l63 63Z"),
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
