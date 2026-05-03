package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileMusic: ImageVector
    get() {
        if (_fileMusic != null) return _fileMusic!!
        _fileMusic = lucideOutlineIcon(
            name = "FileMusic",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.650 22.000 L 18.000 22.000 C 19.105 22.000 20.000 21.105 20.000 20.000 L 20.000 8.000 C 20.002 7.360 19.747 6.746 19.294 6.294 L 15.706 2.706 C 15.254 2.253 14.640 1.998 14.000 2.000 L 6.000 2.000 C 4.895 2.000 4.000 2.895 4.000 4.000 L 4.000 14.350"),
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
                pathData = parseSvgPathData("M 14.000 2.000 L 14.000 7.000 C 14.000 7.552 14.448 8.000 15.000 8.000 L 20.000 8.000"),
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
                pathData = parseSvgPathData("M 8.000 20.000 L 8.000 13.000 L 11.000 14.474"),
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
                pathData = parseSvgPathData("M 8.000 20.000 C 8.000 21.105 7.105 22.000 6.000 22.000 C 4.895 22.000 4.000 21.105 4.000 20.000 C 4.000 18.895 4.895 18.000 6.000 18.000 C 7.105 18.000 8.000 18.895 8.000 20.000 Z"),
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
        return _fileMusic!!
    }

private var _fileMusic: ImageVector? = null
