package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Shovel: ImageVector
    get() {
        if (_shovel != null) return _shovel!!
        _shovel = lucideOutlineIcon(
            name = "Shovel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.560 4.560 C 21.842 4.841 22.000 5.223 22.000 5.621 C 22.000 6.019 21.842 6.401 21.560 6.682 L 21.090 7.152 C 19.914 8.295 18.038 8.282 16.878 7.122 C 16.315 6.559 15.999 5.796 15.999 5.001 C 15.999 4.205 16.315 3.442 16.878 2.879 L 17.318 2.439 C 17.904 1.853 18.853 1.853 19.439 2.439 Z"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 3.000 22.000 C 2.448 22.000 2.000 21.552 2.000 21.000 L 2.000 17.414 C 2.000 17.149 2.105 16.894 2.293 16.707 L 5.648 13.352 C 6.119 12.882 6.881 12.882 7.352 13.352 L 10.648 16.648 C 11.118 17.119 11.118 17.881 10.648 18.352 L 7.293 21.707 C 7.106 21.895 6.851 22.000 6.586 22.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 9.000 15.000 L 16.879 7.122"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _shovel!!
    }

private var _shovel: ImageVector? = null
