package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Hammer: ImageVector
    get() {
        if (_hammer != null) return _hammer!!
        _hammer = phosphorThinIcon(
            name = "Hammer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248.5 114.81 181.05 46.9C145.066 11.026 86.828 11.071 50.9 47L37.12 61.18c-1.026 1.021-1.421 2.517-1.032 3.911 .389 1.394 1.501 2.469 2.908 2.811 1.406 .342 2.888-.102 3.874-1.162L56.6 52.56c6.515-6.527 14.063-11.933 22.34-16L130.34 88 31.51 186.82c-2.259 2.252-3.529 5.31-3.529 8.5 0 3.19 1.27 6.248 3.529 8.5l20.69 20.66c2.252 2.259 5.31 3.529 8.5 3.529 3.19 0 6.248-1.27 8.5-3.529L168 125.63l17.17 17.18h0l17.66 17.66c2.252 2.259 5.31 3.529 8.5 3.529 3.19 0 6.248-1.27 8.5-3.529l28.69-28.69c4.68-4.692 4.671-12.289-.02-16.97ZM63.5 218.81c-.75 .751-1.768 1.173-2.83 1.173-1.062 0-2.08-.422-2.83-1.173L37.17 198.14c-.751-.75-1.173-1.768-1.173-2.83 0-1.062 .422-2.08 1.173-2.83L108 121.63 134.34 148ZM165.17 117.15 140 142.32 113.65 116 138.83 90.8c.751-.75 1.173-1.768 1.173-2.83 0-1.062-.422-2.08-1.173-2.83l-52-52c30.762-11.345 65.313-3.781 88.52 19.38l47 47.35L188 134.32 170.83 117.15c-.75-.751-1.768-1.173-2.83-1.173-1.062 0-2.08 .422-2.83 1.173ZM242.83 126.15l-28.68 28.69c-.75 .751-1.768 1.173-2.83 1.173-1.062 0-2.08-.422-2.83-1.173L193.66 140l34.39-34.4 14.78 14.88c1.551 1.56 1.551 4.08 0 5.64Z"),
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
        return _hammer!!
    }

private var _hammer: ImageVector? = null
