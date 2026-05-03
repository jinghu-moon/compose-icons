package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ZodiacCancer: ImageVector
    get() {
        if (_zodiacCancer != null) return _zodiacCancer!!
        _zodiacCancer = lucideOutlineIcon(
            name = "ZodiacCancer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 14.500 C 21.002 17.155 18.768 19.545 15.357 20.535 C 11.945 21.526 8.043 20.918 5.500 19.000"),
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
                pathData = parseSvgPathData("M 3.000 9.500 C 2.998 6.845 5.232 4.455 8.643 3.465 C 12.055 2.474 15.957 3.082 18.500 5.000"),
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
                pathData = parseSvgPathData("M 21.000 14.500 C 21.000 16.433 19.433 18.000 17.500 18.000 C 15.567 18.000 14.000 16.433 14.000 14.500 C 14.000 12.567 15.567 11.000 17.500 11.000 C 19.433 11.000 21.000 12.567 21.000 14.500 Z"),
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
                pathData = parseSvgPathData("M 10.000 9.500 C 10.000 11.433 8.433 13.000 6.500 13.000 C 4.567 13.000 3.000 11.433 3.000 9.500 C 3.000 7.567 4.567 6.000 6.500 6.000 C 8.433 6.000 10.000 7.567 10.000 9.500 Z"),
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
        return _zodiacCancer!!
    }

private var _zodiacCancer: ImageVector? = null
