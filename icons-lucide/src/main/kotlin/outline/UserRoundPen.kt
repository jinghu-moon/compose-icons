package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.UserRoundPen: ImageVector
    get() {
        if (_userRoundPen != null) return _userRoundPen!!
        _userRoundPen = lucideOutlineIcon(
            name = "UserRoundPen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.000 21.000 C 2.000 18.374 3.288 15.915 5.448 14.420 C 7.608 12.926 10.363 12.587 12.821 13.513"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 21.378 16.626 C 22.208 15.796 22.208 14.452 21.378 13.622 C 20.548 12.792 19.204 12.792 18.374 13.622 L 14.364 17.634 C 14.126 17.872 13.952 18.165 13.858 18.488 L 13.021 21.358 C 12.970 21.533 13.018 21.722 13.147 21.852 C 13.277 21.981 13.466 22.029 13.641 21.978 L 16.511 21.141 C 16.834 21.047 17.127 20.873 17.365 20.635 Z"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 15.000 8.000 C 15.000 10.761 12.761 13.000 10.000 13.000 C 7.239 13.000 5.000 10.761 5.000 8.000 C 5.000 5.239 7.239 3.000 10.000 3.000 C 12.761 3.000 15.000 5.239 15.000 8.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _userRoundPen!!
    }

private var _userRoundPen: ImageVector? = null
