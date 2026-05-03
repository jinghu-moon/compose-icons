package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HeartOff: ImageVector
    get() {
        if (_heartOff != null) return _heartOff!!
        _heartOff = lucideOutlineIcon(
            name = "HeartOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.500 4.893 C 10.903 5.154 11.270 5.467 11.591 5.824 C 11.697 5.937 11.845 6.001 12.000 6.001 C 12.155 6.001 12.303 5.937 12.409 5.824 C 13.927 4.118 16.343 3.530 18.475 4.347 C 20.607 5.165 22.011 7.217 22.000 9.500 C 22.000 11.372 20.998 12.856 19.813 14.155"),
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
                pathData = parseSvgPathData("M 16.967 16.967 L 13.508 20.313 C 13.131 20.746 12.586 20.996 12.012 21.000 C 11.438 21.003 10.890 20.760 10.508 20.332 L 5.000 15.000 C 3.500 13.500 2.000 11.800 2.000 9.500 C 2.000 7.536 3.047 5.722 4.747 4.739"),
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
                pathData = parseSvgPathData("M 2.000 2.000 L 22.000 22.000"),
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
        return _heartOff!!
    }

private var _heartOff: ImageVector? = null
