package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PlaneLanding: ImageVector
    get() {
        if (_planeLanding != null) return _planeLanding!!
        _planeLanding = lucideOutlineIcon(
            name = "PlaneLanding",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.000 22.000 L 22.000 22.000"),
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
                pathData = parseSvgPathData("M 3.770 10.770 L 2.000 9.000 L 4.000 4.500 L 5.100 5.050 C 5.650 5.330 6.000 5.890 6.000 6.500 C 6.000 7.110 6.350 7.670 6.900 7.950 L 8.000 8.500 L 11.000 2.500 L 12.050 3.030 C 12.642 3.325 13.051 3.894 13.140 4.550 L 13.860 9.950 C 13.949 10.606 14.358 11.175 14.950 11.470 L 19.350 13.670 C 19.770 13.890 20.130 14.220 20.360 14.630 L 20.960 15.660 C 21.450 16.540 20.900 17.640 19.900 17.760 L 18.720 17.910 C 18.250 17.970 17.770 17.890 17.350 17.670 L 4.290 11.150 C 4.097 11.052 3.922 10.924 3.770 10.770 Z"),
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
        return _planeLanding!!
    }

private var _planeLanding: ImageVector? = null
