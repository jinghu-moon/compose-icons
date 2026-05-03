package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChartArea: ImageVector
    get() {
        if (_chartArea != null) return _chartArea!!
        _chartArea = lucideOutlineIcon(
            name = "ChartArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 3.000 L 3.000 19.000 C 3.000 20.105 3.895 21.000 5.000 21.000 L 21.000 21.000"),
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
                pathData = parseSvgPathData("M 7.000 11.207 C 7.000 11.075 7.053 10.948 7.146 10.854 L 9.146 8.854 C 9.240 8.760 9.367 8.707 9.500 8.707 C 9.633 8.707 9.760 8.760 9.854 8.854 L 13.146 12.146 C 13.240 12.240 13.367 12.293 13.500 12.293 C 13.633 12.293 13.760 12.240 13.854 12.146 L 18.146 7.854 C 18.289 7.711 18.504 7.668 18.691 7.745 C 18.878 7.822 19.000 8.005 19.000 8.207 L 19.000 16.000 C 19.000 16.552 18.552 17.000 18.000 17.000 L 8.000 17.000 C 7.448 17.000 7.000 16.552 7.000 16.000 Z"),
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
        return _chartArea!!
    }

private var _chartArea: ImageVector? = null
