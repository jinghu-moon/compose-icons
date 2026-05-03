package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MapPinPen: ImageVector
    get() {
        if (_mapPinPen != null) return _mapPinPen!!
        _mapPinPen = lucideOutlineIcon(
            name = "MapPinPen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.970 9.304 C 17.599 5.036 13.932 1.817 9.652 2.004 C 5.371 2.190 1.998 5.716 2.000 10.000 C 2.000 14.690 6.887 19.562 9.022 21.468"),
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
        pathData = parseSvgPathData("M 21.378 16.626 C 22.208 15.796 22.208 14.452 21.378 13.622 C 20.548 12.792 19.204 12.792 18.374 13.622 L 14.364 17.634 C 14.126 17.872 13.952 18.165 13.858 18.488 L 13.021 21.358 C 12.970 21.533 13.018 21.722 13.147 21.852 C 13.277 21.981 13.466 22.029 13.641 21.978 L 16.511 21.141 C 16.834 21.047 17.127 20.873 17.365 20.635 Z"),
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
        pathData = parseSvgPathData("M 13.000 10.000 C 13.000 11.657 11.657 13.000 10.000 13.000 C 8.343 13.000 7.000 11.657 7.000 10.000 C 7.000 8.343 8.343 7.000 10.000 7.000 C 11.657 7.000 13.000 8.343 13.000 10.000 Z"),
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
        return _mapPinPen!!
    }

private var _mapPinPen: ImageVector? = null
