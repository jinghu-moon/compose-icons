package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FolderHeart: ImageVector
    get() {
        if (_folderHeart != null) return _folderHeart!!
        _folderHeart = lucideOutlineIcon(
            name = "FolderHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.638 20.000 L 4.000 20.000 C 2.895 20.000 2.000 19.105 2.000 18.000 L 2.000 5.000 C 2.000 3.895 2.895 3.000 4.000 3.000 L 7.900 3.000 C 8.580 2.993 9.216 3.332 9.590 3.900 L 10.400 5.100 C 10.770 5.662 11.397 6.000 12.070 6.000 L 20.000 6.000 C 21.105 6.000 22.000 6.895 22.000 8.000 L 22.000 11.417"),
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
                pathData = parseSvgPathData("M 14.620 18.800 C 14.047 18.203 13.848 17.339 14.103 16.551 C 14.357 15.763 15.024 15.179 15.838 15.029 C 16.652 14.880 17.483 15.190 18.000 15.836 C 18.520 15.197 19.348 14.893 20.158 15.044 C 20.968 15.195 21.630 15.776 21.885 16.560 C 22.140 17.343 21.946 18.203 21.380 18.802 L 18.754 21.658 C 18.564 21.876 18.290 22.002 18.000 22.002 C 17.711 22.002 17.437 21.876 17.247 21.658 Z"),
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
        return _folderHeart!!
    }

private var _folderHeart: ImageVector? = null
