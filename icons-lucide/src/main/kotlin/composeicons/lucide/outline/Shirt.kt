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
                pathData = parseSvgPathData("M20.38 3.46 16 2c0 2.209-1.791 4-4 4C9.791 6 8 4.209 8 2L3.62 3.46C2.685 3.772 2.116 4.718 2.28 5.69l.58 3.47c.079 .485 .498 .841 .99 .84h2.15v10c0 1.1 .9 2 2 2h8c1.105 0 2-.895 2-2v-10h2.15c.492 .001 .911-.355 .99-.84l.58-3.47c.164-.972-.405-1.918-1.34-2.23Z"),
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
