package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LensConvex: ImageVector
    get() {
        if (_lensConvex != null) return _lensConvex!!
        _lensConvex = lucideOutlineIcon(
            name = "LensConvex",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.433 2.000 C 13.765 2.003 14.074 2.171 14.257 2.448 C 17.915 8.291 17.915 15.709 14.257 21.552 C 14.074 21.829 13.765 21.997 13.433 22.000 L 10.567 22.000 C 10.235 21.997 9.926 21.829 9.743 21.552 C 6.085 15.709 6.085 8.291 9.743 2.448 C 9.926 2.171 10.235 2.003 10.567 2.000 Z"),
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
        return _lensConvex!!
    }

private var _lensConvex: ImageVector? = null
