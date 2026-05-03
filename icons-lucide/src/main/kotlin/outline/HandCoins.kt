package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HandCoins: ImageVector
    get() {
        if (_handCoins != null) return _handCoins!!
        _handCoins = lucideOutlineIcon(
            name = "HandCoins",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.000 15.000 L 13.000 15.000 C 14.105 15.000 15.000 14.105 15.000 13.000 C 15.000 11.895 14.105 11.000 13.000 11.000 L 10.000 11.000 C 9.400 11.000 8.900 11.200 8.600 11.600 L 3.000 17.000"),
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
                pathData = parseSvgPathData("M 7.000 21.000 L 8.600 19.600 C 8.900 19.200 9.400 19.000 10.000 19.000 L 14.000 19.000 C 15.100 19.000 16.100 18.600 16.800 17.800 L 21.400 13.400 C 22.204 12.641 22.239 11.374 21.480 10.570 C 20.721 9.766 19.454 9.731 18.650 10.490 L 14.450 14.390"),
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
                pathData = parseSvgPathData("M 2.000 16.000 L 8.000 22.000"),
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
                pathData = parseSvgPathData("M 18.900 9.000 C 18.900 10.602 17.602 11.900 16.000 11.900 C 14.398 11.900 13.100 10.602 13.100 9.000 C 13.100 7.398 14.398 6.100 16.000 6.100 C 17.602 6.100 18.900 7.398 18.900 9.000 Z"),
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
                pathData = parseSvgPathData("M 9.000 5.000 C 9.000 6.657 7.657 8.000 6.000 8.000 C 4.343 8.000 3.000 6.657 3.000 5.000 C 3.000 3.343 4.343 2.000 6.000 2.000 C 7.657 2.000 9.000 3.343 9.000 5.000 Z"),
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
        return _handCoins!!
    }

private var _handCoins: ImageVector? = null
