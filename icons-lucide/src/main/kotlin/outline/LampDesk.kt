package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LampDesk: ImageVector
    get() {
        if (_lampDesk != null) return _lampDesk!!
        _lampDesk = lucideOutlineIcon(
            name = "LampDesk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.293 2.293 C 10.684 1.903 11.316 1.903 11.707 2.293 L 14.207 4.793 L 20.201 6.020 C 20.562 6.094 20.852 6.360 20.958 6.712 C 21.064 7.065 20.967 7.447 20.707 7.707 L 13.707 14.707 C 13.447 14.967 13.065 15.064 12.712 14.958 C 12.360 14.852 12.094 14.562 12.020 14.201 L 10.793 8.207 L 8.293 5.707 C 7.903 5.317 7.903 4.683 8.293 4.293 Z"),
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
                pathData = parseSvgPathData("M 14.207 4.793 L 10.793 8.207"),
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
                pathData = parseSvgPathData("M 3.000 20.000 C 3.000 18.895 3.895 18.000 5.000 18.000 L 9.000 18.000 C 10.105 18.000 11.000 18.895 11.000 20.000 L 11.000 21.000 C 11.000 21.552 10.552 22.000 10.000 22.000 L 4.000 22.000 C 3.448 22.000 3.000 21.552 3.000 21.000 Z"),
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
                pathData = parseSvgPathData("M 9.086 6.500 L 4.293 11.293 C 3.984 11.602 3.911 12.076 4.113 12.463 L 7.000 18.000"),
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
        return _lampDesk!!
    }

private var _lampDesk: ImageVector? = null
