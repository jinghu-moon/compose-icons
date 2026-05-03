package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.IceCreamCone: ImageVector
    get() {
        if (_iceCreamCone != null) return _iceCreamCone!!
        _iceCreamCone = lucideOutlineIcon(
            name = "IceCreamCone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.000 11.000 L 11.080 21.350 C 11.237 21.719 11.599 21.958 12.000 21.958 C 12.401 21.958 12.763 21.719 12.920 21.350 L 17.000 11.000"),
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
                pathData = parseSvgPathData("M 17.000 7.000 C 17.000 4.239 14.761 2.000 12.000 2.000 C 9.239 2.000 7.000 4.239 7.000 7.000"),
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
                pathData = parseSvgPathData("M 17.000 7.000 C 18.105 7.000 19.000 7.895 19.000 9.000 C 19.000 10.105 18.105 11.000 17.000 11.000 L 7.000 11.000 C 5.895 11.000 5.000 10.105 5.000 9.000 C 5.000 7.895 5.895 7.000 7.000 7.000"),
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
        return _iceCreamCone!!
    }

private var _iceCreamCone: ImageVector? = null
