package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Ungroup: ImageVector
    get() {
        if (_ungroup != null) return _ungroup!!
        _ungroup = lucideOutlineIcon(
            name = "Ungroup",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.000 4.000 L 12.000 4.000 C 12.552 4.000 13.000 4.448 13.000 5.000 L 13.000 9.000 C 13.000 9.552 12.552 10.000 12.000 10.000 L 6.000 10.000 C 5.448 10.000 5.000 9.552 5.000 9.000 L 5.000 5.000 C 5.000 4.448 5.448 4.000 6.000 4.000 Z"),
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
        pathData = parseSvgPathData("M 12.000 14.000 L 18.000 14.000 C 18.552 14.000 19.000 14.448 19.000 15.000 L 19.000 19.000 C 19.000 19.552 18.552 20.000 18.000 20.000 L 12.000 20.000 C 11.448 20.000 11.000 19.552 11.000 19.000 L 11.000 15.000 C 11.000 14.448 11.448 14.000 12.000 14.000 Z"),
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
        return _ungroup!!
    }

private var _ungroup: ImageVector? = null
