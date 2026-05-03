package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileLock: ImageVector
    get() {
        if (_fileLock != null) return _fileLock!!
        _fileLock = lucideOutlineIcon(
            name = "FileLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 9.800 L 4.000 4.000 C 4.000 2.895 4.895 2.000 6.000 2.000 L 14.000 2.000 C 14.640 1.998 15.254 2.253 15.706 2.706 L 19.294 6.294 C 19.747 6.746 20.002 7.360 20.000 8.000 L 20.000 20.000 C 20.000 21.105 19.105 22.000 18.000 22.000 L 15.000 22.000"),
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
                pathData = parseSvgPathData("M 9.000 17.000 L 9.000 15.000 C 9.000 13.895 8.105 13.000 7.000 13.000 C 5.895 13.000 5.000 13.895 5.000 15.000 L 5.000 17.000"),
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
                pathData = parseSvgPathData("M 4.000 17.000 L 10.000 17.000 C 10.552 17.000 11.000 17.448 11.000 18.000 L 11.000 21.000 C 11.000 21.552 10.552 22.000 10.000 22.000 L 4.000 22.000 C 3.448 22.000 3.000 21.552 3.000 21.000 L 3.000 18.000 C 3.000 17.448 3.448 17.000 4.000 17.000 Z"),
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
        return _fileLock!!
    }

private var _fileLock: ImageVector? = null
