package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Carrot: ImageVector
    get() {
        if (_carrot != null) return _carrot!!
        _carrot = lucideOutlineIcon(
            name = "Carrot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.270 21.700 C 2.270 21.700 12.140 18.200 15.000 15.340 C 16.759 13.584 16.761 10.734 15.005 8.975 C 13.249 7.216 10.399 7.214 8.640 8.970 C 5.770 11.840 2.270 21.700 2.270 21.700 ZM 8.640 14.000 L 6.590 11.960M 15.340 15.000 L 12.880 12.540"),
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
        pathData = parseSvgPathData("M 22.000 9.000 C 22.000 9.000 20.670 7.000 18.500 7.000 C 16.860 7.000 15.000 9.000 15.000 9.000 C 15.000 9.000 16.330 11.000 18.500 11.000 C 20.670 11.000 22.000 9.000 22.000 9.000 Z"),
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
        pathData = parseSvgPathData("M 15.000 2.000 C 15.000 2.000 13.000 3.330 13.000 5.500 C 13.000 7.670 15.000 9.000 15.000 9.000 C 15.000 9.000 17.000 7.160 17.000 5.500 C 17.000 3.330 15.000 2.000 15.000 2.000 Z"),
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
        return _carrot!!
    }

private var _carrot: ImageVector? = null
