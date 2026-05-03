package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Banana: ImageVector
    get() {
        if (_banana != null) return _banana!!
        _banana = lucideOutlineIcon(
            name = "Banana",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 13.000 C 7.500 11.000 12.000 11.000 14.000 15.000 C 15.721 14.121 17.777 14.210 19.416 15.235 C 21.055 16.259 22.036 18.068 22.000 20.000"),
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
                pathData = parseSvgPathData("M 5.150 17.890 C 10.670 16.370 13.800 11.000 12.150 5.890 C 11.550 4.000 11.500 2.000 13.000 2.000 C 16.220 2.000 18.000 7.500 18.000 10.000 C 18.000 16.500 13.800 22.000 7.510 22.000 C 5.110 22.000 2.000 22.000 2.000 20.000 C 2.000 18.500 3.140 18.450 5.150 17.890 Z"),
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
        return _banana!!
    }

private var _banana: ImageVector? = null
