package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Volume2: ImageVector
    get() {
        if (_volume2 != null) return _volume2!!
        _volume2 = lucideOutlineIcon(
            name = "Volume2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.000 4.702 C 11.000 4.417 10.828 4.161 10.565 4.052 C 10.301 3.943 9.999 4.003 9.797 4.204 L 6.413 7.587 C 6.149 7.852 5.790 8.001 5.416 8.000 L 3.000 8.000 C 2.448 8.000 2.000 8.448 2.000 9.000 L 2.000 15.000 C 2.000 15.552 2.448 16.000 3.000 16.000 L 5.416 16.000 C 5.790 15.999 6.149 16.148 6.413 16.413 L 9.796 19.797 C 9.998 19.999 10.301 20.060 10.565 19.950 C 10.829 19.841 11.000 19.583 11.000 19.298 Z"),
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
                pathData = parseSvgPathData("M 16.000 9.000 C 17.333 10.778 17.333 13.222 16.000 15.000"),
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
                pathData = parseSvgPathData("M 19.364 18.364 C 21.052 16.676 22.000 14.387 22.000 12.000 C 22.000 9.613 21.052 7.324 19.364 5.636"),
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
        return _volume2!!
    }

private var _volume2: ImageVector? = null
