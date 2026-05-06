package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Droplet: ImageVector
    get() {
        if (_droplet != null) return _droplet!!
        _droplet = lucideOutlineIcon(
            name = "Droplet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 22c3.866 0 7-3.134 7-7C19 13 18 11.1 16 9.5 14 7.9 12.5 5.5 12 3 11.5 5.5 10 7.9 8 9.5 6 11.1 5 13 5 15c0 3.866 3.134 7 7 7Z"),
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
        return _droplet!!
    }

private var _droplet: ImageVector? = null
