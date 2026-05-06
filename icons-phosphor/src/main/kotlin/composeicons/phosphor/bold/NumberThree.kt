package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberThree: ImageVector
    get() {
        if (_numberThree != null) return _numberThree!!
        _numberThree = phosphorBoldIcon(
            name = "NumberThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180 160c-.001 23.661-13.906 45.112-35.506 54.771C122.895 224.43 97.636 220.494 80 204.72c-3.31-2.827-4.829-7.225-3.97-11.493 .859-4.267 3.962-7.735 8.108-9.061 4.146-1.326 8.685-.303 11.862 2.674 11.961 10.692 29.554 12.179 43.14 3.645 13.586-8.533 19.885-25.027 15.447-40.445C150.148 134.623 136.044 124.004 120 124c-4.545 0-8.7-2.568-10.733-6.633-2.033-4.065-1.594-8.93 1.133-12.567L144 60h-56C81.373 60 76 54.627 76 48 76 41.373 81.373 36 88 36h80c4.545 0 8.7 2.568 10.733 6.633 2.033 4.065 1.594 8.93-1.133 12.567l-36.48 48.64c23.37 8.823 38.848 31.18 38.88 56.16Z"),
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
        return _numberThree!!
    }

private var _numberThree: ImageVector? = null
