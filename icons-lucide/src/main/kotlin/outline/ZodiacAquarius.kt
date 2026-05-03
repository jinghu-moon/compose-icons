package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ZodiacAquarius: ImageVector
    get() {
        if (_zodiacAquarius != null) return _zodiacAquarius!!
        _zodiacAquarius = lucideOutlineIcon(
            name = "ZodiacAquarius",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.000 10.000 L 4.456 6.316 C 4.587 6.144 4.790 6.041 5.006 6.039 C 5.222 6.036 5.427 6.134 5.562 6.303 L 7.952 9.716 C 8.085 9.883 8.287 9.980 8.500 9.980 C 8.714 9.980 8.915 9.882 9.048 9.715 L 11.450 6.283 C 11.583 6.115 11.785 6.017 11.999 6.017 C 12.213 6.017 12.415 6.115 12.548 6.283 L 14.950 9.715 C 15.083 9.883 15.285 9.981 15.499 9.981 C 15.713 9.981 15.915 9.883 16.048 9.715 L 18.437 6.302 C 18.572 6.133 18.777 6.035 18.993 6.038 C 19.209 6.040 19.412 6.143 19.543 6.315 L 22.000 10.000"),
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
                pathData = parseSvgPathData("M 2.000 18.002 L 4.456 14.318 C 4.587 14.146 4.790 14.043 5.006 14.041 C 5.222 14.038 5.427 14.136 5.562 14.305 L 7.952 17.718 C 8.085 17.885 8.287 17.983 8.500 17.983 C 8.714 17.983 8.916 17.885 9.049 17.718 L 11.451 14.286 C 11.584 14.118 11.786 14.020 12.000 14.020 C 12.214 14.020 12.416 14.118 12.549 14.286 L 14.951 17.718 C 15.084 17.886 15.286 17.984 15.500 17.984 C 15.714 17.984 15.916 17.886 16.049 17.718 L 18.438 14.305 C 18.573 14.136 18.778 14.038 18.994 14.041 C 19.210 14.043 19.413 14.146 19.544 14.318 L 22.000 18.002"),
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
        return _zodiacAquarius!!
    }

private var _zodiacAquarius: ImageVector? = null
