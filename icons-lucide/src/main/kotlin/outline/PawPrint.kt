package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PawPrint: ImageVector
    get() {
        if (_pawPrint != null) return _pawPrint!!
        _pawPrint = lucideOutlineIcon(
            name = "PawPrint",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.000 4.000 C 13.000 5.105 12.105 6.000 11.000 6.000 C 9.895 6.000 9.000 5.105 9.000 4.000 C 9.000 2.895 9.895 2.000 11.000 2.000 C 12.105 2.000 13.000 2.895 13.000 4.000 Z"),
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
        pathData = parseSvgPathData("M 20.000 8.000 C 20.000 9.105 19.105 10.000 18.000 10.000 C 16.895 10.000 16.000 9.105 16.000 8.000 C 16.000 6.895 16.895 6.000 18.000 6.000 C 19.105 6.000 20.000 6.895 20.000 8.000 Z"),
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
        pathData = parseSvgPathData("M 22.000 16.000 C 22.000 17.105 21.105 18.000 20.000 18.000 C 18.895 18.000 18.000 17.105 18.000 16.000 C 18.000 14.895 18.895 14.000 20.000 14.000 C 21.105 14.000 22.000 14.895 22.000 16.000 Z"),
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
        pathData = parseSvgPathData("M 9.000 10.000 C 11.761 10.000 14.000 12.239 14.000 15.000 L 14.000 18.500 C 13.999 20.228 12.737 21.698 11.029 21.959 C 9.320 22.220 7.677 21.194 7.160 19.545 Q 6.520 17.480 4.460 16.840 C 2.811 16.324 1.786 14.682 2.046 12.974 C 2.306 11.266 3.772 10.003 5.500 10.000 Z"),
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
        return _pawPrint!!
    }

private var _pawPrint: ImageVector? = null
