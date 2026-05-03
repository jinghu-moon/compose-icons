package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Pen: ImageVector
    get() {
        if (_pen != null) return _pen!!
        _pen = lucideOutlineIcon(
            name = "Pen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.174 6.812 C 22.275 5.711 22.275 3.926 21.174 2.826 C 20.074 1.725 18.289 1.724 17.188 2.825 L 3.842 16.174 C 3.610 16.406 3.438 16.691 3.342 17.004 L 2.021 21.356 C 1.968 21.532 2.017 21.723 2.147 21.853 C 2.277 21.983 2.468 22.031 2.644 21.978 L 6.997 20.658 C 7.310 20.563 7.595 20.392 7.827 20.161 Z"),
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
        return _pen!!
    }

private var _pen: ImageVector? = null
