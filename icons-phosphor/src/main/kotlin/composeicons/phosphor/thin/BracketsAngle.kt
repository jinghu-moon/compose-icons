package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BracketsAngle: ImageVector
    get() {
        if (_bracketsAngle != null) return _bracketsAngle!!
        _bracketsAngle = phosphorThinIcon(
            name = "BracketsAngle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M83.37 42.15 28.74 128l54.63 85.85c1.186 1.861 .64 4.332-1.22 5.52-.642 .411-1.388 .629-2.15 .63-1.365-.001-2.636-.699-3.37-1.85l-56-88c-.836-1.311-.836-2.989 0-4.3l56-88c.742-1.261 2.114-2.016 3.576-1.969 1.463 .047 2.783 .889 3.442 2.196 .659 1.306 .553 2.869-.278 4.073ZM235.37 125.85l-56-88c-.742-1.261-2.114-2.016-3.576-1.969-1.463 .047-2.783 .889-3.442 2.196-.659 1.306-.553 2.869 .278 4.073L227.26 128l-54.63 85.85c-1.186 1.861-.64 4.332 1.22 5.52 .642 .411 1.388 .629 2.15 .63 1.365-.001 2.636-.699 3.37-1.85l56-88c.836-1.311 .836-2.989 0-4.3Z"),
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
        return _bracketsAngle!!
    }

private var _bracketsAngle: ImageVector? = null
