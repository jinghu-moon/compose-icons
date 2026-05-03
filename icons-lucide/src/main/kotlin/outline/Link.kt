package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Link: ImageVector
    get() {
        if (_link != null) return _link!!
        _link = lucideOutlineIcon(
            name = "Link",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 13.000 C 10.869 14.162 12.200 14.889 13.647 14.992 C 15.094 15.096 16.514 14.566 17.540 13.540 L 20.540 10.540 C 22.435 8.578 22.408 5.460 20.479 3.531 C 18.550 1.602 15.432 1.575 13.470 3.470 L 11.750 5.180"),
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
                pathData = parseSvgPathData("M 14.000 11.000 C 13.131 9.838 11.800 9.111 10.353 9.008 C 8.906 8.904 7.486 9.434 6.460 10.460 L 3.460 13.460 C 1.565 15.422 1.592 18.540 3.521 20.469 C 5.450 22.398 8.568 22.425 10.530 20.530 L 12.240 18.820"),
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
        return _link!!
    }

private var _link: ImageVector? = null
