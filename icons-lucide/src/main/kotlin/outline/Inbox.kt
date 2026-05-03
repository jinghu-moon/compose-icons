package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Inbox: ImageVector
    get() {
        if (_inbox != null) return _inbox!!
        _inbox = lucideOutlineIcon(
            name = "Inbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 22.000 12.000 L 16.000 12.000 L 14.000 15.000 L 10.000 15.000 L 8.000 12.000 L 2.000 12.000"),
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
        pathData = parseSvgPathData("M 5.450 5.110 L 2.000 12.000 L 2.000 18.000 C 2.000 19.105 2.895 20.000 4.000 20.000 L 20.000 20.000 C 21.105 20.000 22.000 19.105 22.000 18.000 L 22.000 12.000 L 18.550 5.110 C 18.212 4.430 17.519 4.000 16.760 4.000 L 7.240 4.000 C 6.481 4.000 5.788 4.430 5.450 5.110 Z"),
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
        return _inbox!!
    }

private var _inbox: ImageVector? = null
