package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Eraser: ImageVector
    get() {
        if (_eraser != null) return _eraser!!
        _eraser = lucideOutlineIcon(
            name = "Eraser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 21.000 L 8.000 21.000 C 7.467 21.001 6.956 20.790 6.580 20.413 L 2.586 16.414 C 1.805 15.633 1.805 14.367 2.586 13.586 L 12.586 3.586 C 12.961 3.211 13.470 3.000 14.000 3.000 C 14.531 3.000 15.040 3.211 15.415 3.586 L 21.414 9.586 C 22.195 10.367 22.195 11.633 21.414 12.414 L 12.834 21.000"),
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
                pathData = parseSvgPathData("M 5.082 11.090 L 13.910 19.918"),
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
        return _eraser!!
    }

private var _eraser: ImageVector? = null
