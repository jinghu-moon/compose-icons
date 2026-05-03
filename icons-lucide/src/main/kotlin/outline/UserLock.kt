package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.UserLock: ImageVector
    get() {
        if (_userLock != null) return _userLock!!
        _userLock = lucideOutlineIcon(
            name = "UserLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 16.000 L 19.000 14.000 C 19.000 12.895 18.105 12.000 17.000 12.000 C 15.895 12.000 15.000 12.895 15.000 14.000 L 15.000 16.000"),
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
        pathData = parseSvgPathData("M 9.500 15.000 L 7.000 15.000 C 4.791 15.000 3.000 16.791 3.000 19.000 L 3.000 21.000"),
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
        pathData = parseSvgPathData("M 14.000 7.000 C 14.000 9.209 12.209 11.000 10.000 11.000 C 7.791 11.000 6.000 9.209 6.000 7.000 C 6.000 4.791 7.791 3.000 10.000 3.000 C 12.209 3.000 14.000 4.791 14.000 7.000 Z"),
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
        pathData = parseSvgPathData("M 13.899 16.000 L 20.101 16.000 C 20.339 16.000 20.568 16.095 20.737 16.263 C 20.905 16.432 21.000 16.661 21.000 16.899 L 21.000 20.101 C 21.000 20.339 20.905 20.568 20.737 20.737 C 20.568 20.905 20.339 21.000 20.101 21.000 L 13.899 21.000 C 13.661 21.000 13.432 20.905 13.263 20.737 C 13.095 20.568 13.000 20.339 13.000 20.101 L 13.000 16.899 C 13.000 16.661 13.095 16.432 13.263 16.263 C 13.432 16.095 13.661 16.000 13.899 16.000 Z"),
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
        return _userLock!!
    }

private var _userLock: ImageVector? = null
