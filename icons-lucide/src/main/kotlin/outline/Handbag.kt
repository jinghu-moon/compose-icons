package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Handbag: ImageVector
    get() {
        if (_handbag != null) return _handbag!!
        _handbag = lucideOutlineIcon(
            name = "Handbag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.048 18.566 C 1.916 19.158 2.061 19.778 2.440 20.251 C 2.820 20.724 3.393 21.000 4.000 21.000 L 20.000 21.000 C 20.607 21.000 21.180 20.724 21.560 20.251 C 21.939 19.778 22.084 19.158 21.952 18.566 L 19.952 9.566 C 19.749 8.651 18.937 8.000 18.000 8.000 L 6.000 8.000 C 5.063 8.000 4.251 8.651 4.048 9.566 Z"),
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
        pathData = parseSvgPathData("M 8.000 11.000 L 8.000 6.000 C 8.000 3.791 9.791 2.000 12.000 2.000 C 14.209 2.000 16.000 3.791 16.000 6.000 L 16.000 11.000"),
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
        return _handbag!!
    }

private var _handbag: ImageVector? = null
