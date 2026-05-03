package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FishingHook: ImageVector
    get() {
        if (_fishingHook != null) return _fishingHook!!
        _fishingHook = lucideOutlineIcon(
            name = "FishingHook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.586 11.414 L 11.656 17.344 C 9.447 19.553 5.865 19.553 3.656 17.344 C 1.447 15.135 1.447 11.553 3.656 9.344 L 6.793 6.207 C 6.995 6.005 7.299 5.944 7.564 6.054 C 7.828 6.163 8.000 6.421 8.000 6.707 L 8.000 10.000"),
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
        pathData = parseSvgPathData("M 20.414 8.586 L 22.000 7.000"),
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
        pathData = parseSvgPathData("M 21.000 10.000 C 21.000 11.105 20.105 12.000 19.000 12.000 C 17.895 12.000 17.000 11.105 17.000 10.000 C 17.000 8.895 17.895 8.000 19.000 8.000 C 20.105 8.000 21.000 8.895 21.000 10.000 Z"),
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
        return _fishingHook!!
    }

private var _fishingHook: ImageVector? = null
