package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Activity: ImageVector
    get() {
        if (_activity != null) return _activity!!
        _activity = lucideOutlineIcon(
            name = "Activity",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 12h-2.48c-.898-.002-1.687 .595-1.93 1.46l-2.35 8.36C15.209 21.927 15.111 22 15 22c-.111 0-.209-.073-.24-.18L9.24 2.18C9.209 2.073 9.111 2 9 2c-.111 0-.209 .073-.24 .18L6.41 10.54C6.168 11.401 5.384 11.997 4.49 12h-2.49"),
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
        return _activity!!
    }

private var _activity: ImageVector? = null
