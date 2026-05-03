package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Spool: ImageVector
    get() {
        if (_spool != null) return _spool!!
        _spool = lucideOutlineIcon(
            name = "Spool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 13.440 L 4.442 17.082 C 3.493 17.362 2.892 18.293 3.027 19.273 C 3.162 20.253 3.993 20.987 4.982 21.000 L 19.000 21.000 C 19.996 21.001 20.841 20.268 20.981 19.282 C 21.122 18.295 20.515 17.356 19.558 17.079 L 18.443 16.759 C 17.588 16.511 16.999 15.727 17.000 14.837 L 17.000 7.660"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 7.000 10.560 L 19.558 6.918 C 20.507 6.638 21.108 5.707 20.973 4.727 C 20.838 3.747 20.007 3.013 19.018 3.000 L 5.000 3.000 C 4.004 2.999 3.159 3.732 3.019 4.718 C 2.878 5.705 3.485 6.644 4.442 6.921 L 5.557 7.241 C 6.412 7.489 7.001 8.273 7.000 9.163 L 7.000 16.341"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _spool!!
    }

private var _spool: ImageVector? = null
