package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MapPinned: ImageVector
    get() {
        if (_mapPinned != null) return _mapPinned!!
        _mapPinned = lucideOutlineIcon(
            name = "MapPinned",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 8.000 C 18.000 11.613 14.131 15.429 12.607 16.795 C 12.249 17.069 11.751 17.069 11.393 16.795 C 9.870 15.429 6.000 11.613 6.000 8.000 C 6.000 4.686 8.686 2.000 12.000 2.000 C 15.314 2.000 18.000 4.686 18.000 8.000"),
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
        pathData = parseSvgPathData("M 14.000 8.000 C 14.000 9.105 13.105 10.000 12.000 10.000 C 10.895 10.000 10.000 9.105 10.000 8.000 C 10.000 6.895 10.895 6.000 12.000 6.000 C 13.105 6.000 14.000 6.895 14.000 8.000 Z"),
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
        pathData = parseSvgPathData("M 8.714 14.000 L 5.004 14.000 C 4.574 14.000 4.192 14.275 4.056 14.683 L 2.052 20.683 C 1.950 20.988 2.001 21.323 2.189 21.584 C 2.377 21.845 2.678 22.000 3.000 22.000 L 21.000 22.000 C 21.321 22.000 21.623 21.845 21.811 21.584 C 21.998 21.324 22.050 20.989 21.948 20.684 L 19.948 14.684 C 19.812 14.275 19.430 14.000 18.999 14.000 L 15.287 14.000"),
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
        return _mapPinned!!
    }

private var _mapPinned: ImageVector? = null
