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
                pathData = parseSvgPathData("M 12.000 22.000 C 15.866 22.000 19.000 18.866 19.000 15.000 C 19.000 13.000 18.000 11.100 16.000 9.500 C 14.000 7.900 12.500 5.500 12.000 3.000 C 11.500 5.500 10.000 7.900 8.000 9.500 C 6.000 11.100 5.000 13.000 5.000 15.000 C 5.000 18.866 8.134 22.000 12.000 22.000 Z"),
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
