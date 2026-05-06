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
                pathData = parseSvgPathData("M13.433 2c.332 .003 .641 .171 .824 .448 3.658 5.843 3.658 13.261 0 19.104-.183 .277-.492 .445-.824 .448h-2.866c-.332-.003-.641-.171-.824-.448C6.085 15.709 6.085 8.291 9.743 2.448c.183-.277 .492-.445 .824-.448Z"),
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
