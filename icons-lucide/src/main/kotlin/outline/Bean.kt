package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Bean: ImageVector
    get() {
        if (_bean != null) return _bean!!
        _bean = lucideOutlineIcon(
            name = "Bean",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.165 6.598 C 9.954 7.478 9.640 8.360 9.000 9.000 C 8.360 9.640 7.479 9.954 6.598 10.165 C 3.639 10.874 1.679 13.685 2.037 16.706 C 2.395 19.727 4.958 22.002 8.000 22.000 C 15.732 22.000 22.000 15.732 22.000 8.000 C 22.002 4.958 19.727 2.395 16.706 2.037 C 13.685 1.679 10.874 3.639 10.165 6.598 Z"),
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
                pathData = parseSvgPathData("M 5.341 10.620 C 6.066 12.251 7.784 13.205 9.552 12.957 C 11.320 12.709 12.710 11.319 12.958 9.551 C 13.205 7.783 12.252 6.065 10.620 5.340"),
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
        return _bean!!
    }

private var _bean: ImageVector? = null
