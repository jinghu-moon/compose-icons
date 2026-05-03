package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Headset: ImageVector
    get() {
        if (_headset != null) return _headset!!
        _headset = lucideOutlineIcon(
            name = "Headset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.000 11.000 L 6.000 11.000 C 7.105 11.000 8.000 11.895 8.000 13.000 L 8.000 16.000 C 8.000 17.105 7.105 18.000 6.000 18.000 L 5.000 18.000 C 3.895 18.000 3.000 17.105 3.000 16.000 L 3.000 11.000 ZM 3.000 11.000 C 3.000 6.029 7.029 2.000 12.000 2.000 C 16.971 2.000 21.000 6.029 21.000 11.000M 21.000 11.000 L 21.000 16.000 C 21.000 17.105 20.105 18.000 19.000 18.000 L 18.000 18.000 C 16.895 18.000 16.000 17.105 16.000 16.000 L 16.000 13.000 C 16.000 11.895 16.895 11.000 18.000 11.000 L 21.000 11.000 Z"),
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
        pathData = parseSvgPathData("M 21.000 16.000 L 21.000 18.000 C 21.000 20.209 19.209 22.000 17.000 22.000 L 12.000 22.000"),
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
        return _headset!!
    }

private var _headset: ImageVector? = null
