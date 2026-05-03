package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Shirt: ImageVector
    get() {
        if (_shirt != null) return _shirt!!
        _shirt = lucideOutlineIcon(
            name = "Shirt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.380 3.460 L 16.000 2.000 C 16.000 4.209 14.209 6.000 12.000 6.000 C 9.791 6.000 8.000 4.209 8.000 2.000 L 3.620 3.460 C 2.685 3.772 2.116 4.718 2.280 5.690 L 2.860 9.160 C 2.939 9.645 3.358 10.001 3.850 10.000 L 6.000 10.000 L 6.000 20.000 C 6.000 21.100 6.900 22.000 8.000 22.000 L 16.000 22.000 C 17.105 22.000 18.000 21.105 18.000 20.000 L 18.000 10.000 L 20.150 10.000 C 20.642 10.001 21.061 9.645 21.140 9.160 L 21.720 5.690 C 21.884 4.718 21.315 3.772 20.380 3.460 Z"),
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
        return _shirt!!
    }

private var _shirt: ImageVector? = null
