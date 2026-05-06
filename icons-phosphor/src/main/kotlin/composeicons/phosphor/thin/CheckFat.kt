package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CheckFat: ImageVector
    get() {
        if (_checkFat != null) return _checkFat!!
        _checkFat = phosphorThinIcon(
            name = "CheckFat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240.47 71.09l-24-23.58c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529L104 141.83 64.5 103.51C62.248 101.251 59.19 99.981 56 99.981c-3.19 0-6.248 1.27-8.5 3.529l-24 24c-2.259 2.252-3.529 5.31-3.529 8.5 0 3.19 1.27 6.248 3.529 8.5l71.61 72c2.252 2.259 5.31 3.529 8.5 3.529 3.19 0 6.248-1.27 8.5-3.529L240.49 88.08c2.254-2.254 3.518-5.312 3.514-8.499-.004-3.187-1.275-6.242-3.534-8.491ZM234.84 82.43 106.43 210.83c-1.561 1.558-4.089 1.558-5.65 0l-71.61-72c-.751-.75-1.173-1.768-1.173-2.83 0-1.062 .422-2.08 1.173-2.83l24-24c.747-.756 1.767-1.178 2.83-1.17 1.085 .006 2.124 .441 2.89 1.21l42.35 41.08c1.554 1.518 4.036 1.518 5.59 0L205.2 53.19c.751-.757 1.773-1.183 2.84-1.183 1.067 0 2.089 .426 2.84 1.183l24 23.58c.746 .756 1.161 1.777 1.153 2.838-.008 1.062-.437 2.077-1.193 2.822Z"),
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
        return _checkFat!!
    }

private var _checkFat: ImageVector? = null
