package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LockKeyhole: ImageVector
    get() {
        if (_lockKeyhole != null) return _lockKeyhole!!
        _lockKeyhole = lucideOutlineIcon(
            name = "LockKeyhole",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.000 16.000 C 13.000 16.552 12.552 17.000 12.000 17.000 C 11.448 17.000 11.000 16.552 11.000 16.000 C 11.000 15.448 11.448 15.000 12.000 15.000 C 12.552 15.000 13.000 15.448 13.000 16.000 Z"),
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
                pathData = parseSvgPathData("M 5.000 10.000 L 19.000 10.000 C 20.105 10.000 21.000 10.895 21.000 12.000 L 21.000 20.000 C 21.000 21.105 20.105 22.000 19.000 22.000 L 5.000 22.000 C 3.895 22.000 3.000 21.105 3.000 20.000 L 3.000 12.000 C 3.000 10.895 3.895 10.000 5.000 10.000 Z"),
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
                pathData = parseSvgPathData("M 7.000 10.000 L 7.000 7.000 C 7.000 4.239 9.239 2.000 12.000 2.000 C 14.761 2.000 17.000 4.239 17.000 7.000 L 17.000 10.000"),
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
        return _lockKeyhole!!
    }

private var _lockKeyhole: ImageVector? = null
