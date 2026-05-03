package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CloudMoon: ImageVector
    get() {
        if (_cloudMoon != null) return _cloudMoon!!
        _cloudMoon = lucideOutlineIcon(
            name = "CloudMoon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.000 16.000 C 14.657 16.000 16.000 17.343 16.000 19.000 C 16.000 20.657 14.657 22.000 13.000 22.000 L 7.000 22.000 C 4.369 21.999 2.188 19.960 2.012 17.335 C 1.836 14.709 3.725 12.397 6.332 12.045 C 8.940 11.693 11.374 13.422 11.900 16.000 Z"),
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
                pathData = parseSvgPathData("M 18.376 14.512 C 20.117 13.761 21.400 12.230 21.837 10.385 C 21.985 9.760 21.178 9.415 20.589 9.671 C 19.083 10.322 17.332 9.988 16.172 8.828 C 15.012 7.668 14.678 5.917 15.330 4.411 C 15.585 3.822 15.240 3.016 14.614 3.163 C 12.082 3.764 10.227 5.929 10.020 8.523"),
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
        return _cloudMoon!!
    }

private var _cloudMoon: ImageVector? = null
