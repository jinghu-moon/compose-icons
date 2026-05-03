package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PiggyBank: ImageVector
    get() {
        if (_piggyBank != null) return _piggyBank!!
        _piggyBank = lucideOutlineIcon(
            name = "PiggyBank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.000 17.000 L 14.000 17.000 L 14.000 19.000 C 14.000 19.552 14.448 20.000 15.000 20.000 L 17.000 20.000 C 17.552 20.000 18.000 19.552 18.000 19.000 L 18.000 16.000 C 18.944 15.686 19.686 14.944 20.000 14.000 L 21.000 14.000 C 21.552 14.000 22.000 13.552 22.000 13.000 L 22.000 11.000 C 22.000 10.448 21.552 10.000 21.000 10.000 L 20.000 10.000 C 20.000 8.426 19.259 6.944 18.000 6.000 L 18.000 3.000 C 16.741 3.000 15.555 3.593 14.800 4.600 L 14.500 5.000 L 11.000 5.000 C 7.686 5.000 5.000 7.686 5.000 11.000 L 5.000 12.000 C 5.000 13.574 5.741 15.056 7.000 16.000 L 7.000 19.000 C 7.000 19.552 7.448 20.000 8.000 20.000 L 10.000 20.000 C 10.552 20.000 11.000 19.552 11.000 19.000 Z"),
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
                pathData = parseSvgPathData("M 16.000 10.000 L 16.010 10.000"),
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
                pathData = parseSvgPathData("M 2.000 8.000 L 2.000 9.000 C 2.000 10.105 2.895 11.000 4.000 11.000 L 5.000 11.000"),
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
        return _piggyBank!!
    }

private var _piggyBank: ImageVector? = null
