package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Speech: ImageVector
    get() {
        if (_speech != null) return _speech!!
        _speech = lucideOutlineIcon(
            name = "Speech",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.800 20.000 L 8.800 15.900 L 10.700 16.100 C 11.844 16.036 12.766 15.141 12.864 14.000 L 12.864 8.300 C 12.878 5.300 10.457 2.857 7.457 2.843 C 4.457 2.829 2.014 5.250 2.000 8.250 C 2.000 11.050 2.656 11.304 3.000 12.800 C 3.232 13.703 3.242 14.650 3.029 15.558 L 2.000 20.000"),
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
        pathData = parseSvgPathData("M 19.800 17.800 C 22.727 14.872 22.729 10.126 19.803 7.197"),
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
        pathData = parseSvgPathData("M 17.000 15.000 C 17.661 14.339 18.030 13.442 18.025 12.507 C 18.021 11.573 17.642 10.679 16.975 10.025"),
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
        return _speech!!
    }

private var _speech: ImageVector? = null
