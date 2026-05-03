package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Toilet: ImageVector
    get() {
        if (_toilet != null) return _toilet!!
        _toilet = lucideOutlineIcon(
            name = "Toilet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.000 12.000 L 20.000 12.000 C 20.552 12.000 21.000 12.448 21.000 13.000 C 21.000 15.761 18.761 18.000 16.000 18.000 L 15.402 18.000 C 15.220 18.000 15.053 18.099 14.965 18.258 C 14.877 18.417 14.882 18.611 14.978 18.765 L 16.522 21.235 C 16.618 21.389 16.623 21.583 16.535 21.742 C 16.447 21.901 16.280 22.000 16.098 22.000 L 5.402 22.000 C 5.220 22.000 5.053 21.901 4.965 21.742 C 4.877 21.583 4.882 21.389 4.978 21.235 L 7.000 18.000"),
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
        pathData = parseSvgPathData("M 8.000 18.000 C 5.239 18.000 3.000 15.761 3.000 13.000 L 3.000 4.000 C 3.000 2.895 3.895 2.000 5.000 2.000 L 13.000 2.000 C 14.105 2.000 15.000 2.895 15.000 4.000 L 15.000 12.000"),
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
        return _toilet!!
    }

private var _toilet: ImageVector? = null
