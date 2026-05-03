package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ClipboardPen: ImageVector
    get() {
        if (_clipboardPen != null) return _clipboardPen!!
        _clipboardPen = lucideOutlineIcon(
            name = "ClipboardPen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.000 4.000 L 18.000 4.000 C 19.105 4.000 20.000 4.895 20.000 6.000 L 20.000 8.000"),
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
                pathData = parseSvgPathData("M 21.340 15.664 C 22.170 14.834 22.170 13.490 21.340 12.660 C 20.510 11.830 19.166 11.830 18.336 12.660 L 13.326 17.672 C 13.088 17.910 12.914 18.203 12.820 18.526 L 11.983 21.396 C 11.932 21.571 11.980 21.760 12.109 21.890 C 12.239 22.019 12.428 22.067 12.603 22.016 L 15.473 21.179 C 15.796 21.085 16.089 20.911 16.327 20.673 Z"),
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
                pathData = parseSvgPathData("M 8.000 22.000 L 6.000 22.000 C 4.895 22.000 4.000 21.105 4.000 20.000 L 4.000 6.000 C 4.000 4.895 4.895 4.000 6.000 4.000 L 8.000 4.000"),
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
                pathData = parseSvgPathData("M 9.000 2.000 L 15.000 2.000 C 15.552 2.000 16.000 2.448 16.000 3.000 L 16.000 5.000 C 16.000 5.552 15.552 6.000 15.000 6.000 L 9.000 6.000 C 8.448 6.000 8.000 5.552 8.000 5.000 L 8.000 3.000 C 8.000 2.448 8.448 2.000 9.000 2.000 Z"),
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
        return _clipboardPen!!
    }

private var _clipboardPen: ImageVector? = null
