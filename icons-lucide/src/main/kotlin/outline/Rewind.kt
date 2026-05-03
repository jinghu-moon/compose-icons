package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Rewind: ImageVector
    get() {
        if (_rewind != null) return _rewind!!
        _rewind = lucideOutlineIcon(
            name = "Rewind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 6.000 C 12.000 5.191 11.513 4.462 10.765 4.153 C 10.018 3.843 9.158 4.014 8.586 4.586 L 2.586 10.586 C 1.805 11.367 1.805 12.633 2.586 13.414 L 8.586 19.414 C 9.158 19.986 10.018 20.157 10.765 19.847 C 11.513 19.538 12.000 18.809 12.000 18.000 Z"),
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
        pathData = parseSvgPathData("M 22.000 6.000 C 22.000 5.191 21.513 4.462 20.765 4.153 C 20.018 3.843 19.158 4.014 18.586 4.586 L 12.586 10.586 C 11.805 11.367 11.805 12.633 12.586 13.414 L 18.586 19.414 C 19.158 19.986 20.018 20.157 20.765 19.847 C 21.513 19.538 22.000 18.809 22.000 18.000 Z"),
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
        return _rewind!!
    }

private var _rewind: ImageVector? = null
