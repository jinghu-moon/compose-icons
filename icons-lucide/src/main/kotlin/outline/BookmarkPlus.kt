package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BookmarkPlus: ImageVector
    get() {
        if (_bookmarkPlus != null) return _bookmarkPlus!!
        _bookmarkPlus = lucideOutlineIcon(
            name = "BookmarkPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 7.000 L 12.000 13.000"),
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
        pathData = parseSvgPathData("M 15.000 10.000 L 9.000 10.000"),
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
        pathData = parseSvgPathData("M 17.000 3.000 C 18.105 3.000 19.000 3.895 19.000 5.000 L 19.000 20.000 C 19.000 20.356 18.810 20.686 18.502 20.865 C 18.194 21.043 17.813 21.045 17.504 20.868 L 12.992 18.290 C 12.377 17.939 11.623 17.939 11.008 18.290 L 6.496 20.868 C 6.187 21.045 5.806 21.043 5.498 20.865 C 5.190 20.686 5.000 20.356 5.000 20.000 L 5.000 5.000 C 5.000 3.895 5.895 3.000 7.000 3.000 Z"),
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
        return _bookmarkPlus!!
    }

private var _bookmarkPlus: ImageVector? = null
