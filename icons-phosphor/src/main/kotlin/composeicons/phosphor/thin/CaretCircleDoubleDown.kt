package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CaretCircleDoubleDown: ImageVector
    get() {
        if (_caretCircleDoubleDown != null) return _caretCircleDoubleDown!!
        _caretCircleDoubleDown = phosphorThinIcon(
            name = "CaretCircleDoubleDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M198.71 57.29C173.485 31.843 136.573 21.837 101.949 31.06 67.326 40.283 40.283 67.326 31.06 101.949c-9.223 34.623 .783 71.535 26.23 96.761 25.225 25.447 62.137 35.453 96.761 26.23 34.623-9.223 61.666-36.266 70.889-70.889 9.223-34.623-.783-71.535-26.23-96.761ZM193.05 193.05c-31.037 31.034-79.675 35.821-116.167 11.434C40.39 180.097 26.206 133.328 43.006 92.779 59.805 52.231 102.908 29.195 145.955 37.761 189.002 46.328 220.004 84.109 220 128c.068 24.413-9.637 47.838-26.95 65.05ZM162.83 85.17c.751 .75 1.173 1.768 1.173 2.83 0 1.062-.422 2.08-1.173 2.83l-32 32c-.75 .751-1.768 1.173-2.83 1.173-1.062 0-2.08-.422-2.83-1.173l-32-32c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0L128 114.34 157.17 85.17c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173ZM162.83 141.17c.751 .75 1.173 1.768 1.173 2.83 0 1.062-.422 2.08-1.173 2.83l-32 32c-.75 .751-1.768 1.173-2.83 1.173-1.062 0-2.08-.422-2.83-1.173l-32-32c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0L128 170.34l29.17-29.17c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173Z"),
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
        return _caretCircleDoubleDown!!
    }

private var _caretCircleDoubleDown: ImageVector? = null
