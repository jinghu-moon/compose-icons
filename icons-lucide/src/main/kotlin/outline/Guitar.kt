package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Guitar: ImageVector
    get() {
        if (_guitar != null) return _guitar!!
        _guitar = lucideOutlineIcon(
            name = "Guitar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.900 12.100 L 16.414 7.586"),
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
        pathData = parseSvgPathData("M 20.100 2.300 C 19.711 1.919 19.089 1.919 18.700 2.300 L 17.586 3.414 C 17.211 3.789 17.000 4.298 17.000 4.828 L 17.000 6.172 C 17.000 6.702 16.789 7.211 16.414 7.586 C 16.789 7.211 17.298 7.000 17.828 7.000 L 19.172 7.000 C 19.702 7.000 20.211 6.789 20.586 6.414 L 21.700 5.300 C 22.081 4.911 22.081 4.289 21.700 3.900 Z"),
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
        pathData = parseSvgPathData("M 6.000 16.000 L 8.000 18.000"),
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
        pathData = parseSvgPathData("M 8.230 9.850 C 8.695 8.730 9.788 8.000 11.000 8.000 C 13.761 8.000 16.000 10.239 16.000 13.000 C 16.000 14.212 15.270 15.305 14.150 15.770 L 13.230 16.150 C 12.484 16.461 11.998 17.191 12.000 18.000 C 12.000 20.209 10.209 22.000 8.000 22.000 C 4.686 22.000 2.000 19.314 2.000 16.000 C 2.000 13.791 3.791 12.000 6.000 12.000 C 6.809 12.002 7.539 11.516 7.850 10.770 Z"),
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
        return _guitar!!
    }

private var _guitar: ImageVector? = null
