package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Highlighter: ImageVector
    get() {
        if (_highlighter != null) return _highlighter!!
        _highlighter = phosphorThinIcon(
            name = "Highlighter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M250.83 109.17c-.75-.751-1.768-1.173-2.83-1.173-1.062 0-2.08 .422-2.83 1.173l-50.34 50.34c-.75 .751-1.768 1.173-2.83 1.173-1.062 0-2.08-.422-2.83-1.173L104.49 74.83c-.751-.75-1.173-1.768-1.173-2.83 0-1.062 .422-2.08 1.173-2.83L154.83 18.83c1.563-1.563 1.563-4.097 0-5.66-1.563-1.563-4.097-1.563-5.66 0L98.83 63.51C94.324 68.013 94.122 75.253 98.37 80L74.83 103.51c-2.259 2.252-3.529 5.31-3.529 8.5 0 3.19 1.27 6.248 3.529 8.5L82.34 128 21.17 189.17c-.979 .981-1.379 2.399-1.06 3.747 .32 1.348 1.315 2.435 2.63 2.873l72 24c.406 .138 .831 .209 1.26 .21 1.061 .001 2.079-.42 2.83-1.17L136 181.66l7.51 7.51c2.252 2.259 5.31 3.529 8.5 3.529 3.19 0 6.248-1.27 8.5-3.529L184 165.63c4.744 4.235 11.969 4.034 16.47-.46l50.34-50.34c.754-.748 1.179-1.764 1.183-2.826 .004-1.062-.415-2.081-1.163-2.834ZM94.92 211.42 31.4 190.25 88 133.66 130.34 176ZM154.83 183.51c-.75 .751-1.768 1.173-2.83 1.173-1.062 0-2.08-.422-2.83-1.173L80.49 114.83c-.751-.75-1.173-1.768-1.173-2.83 0-1.062 .422-2.08 1.173-2.83L104 85.66 178.34 160Z"),
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
