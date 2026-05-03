package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HandHeart: ImageVector
    get() {
        if (_handHeart != null) return _handHeart!!
        _handHeart = lucideOutlineIcon(
            name = "HandHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.000 14.000 L 13.000 14.000 C 14.105 14.000 15.000 13.105 15.000 12.000 C 15.000 10.895 14.105 10.000 13.000 10.000 L 10.000 10.000 C 9.400 10.000 8.900 10.200 8.600 10.600 L 3.000 16.000"),
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
                pathData = parseSvgPathData("M 14.450 13.390 L 19.500 8.696 C 20.196 8.000 21.000 6.850 21.000 5.750 C 21.000 4.610 20.298 3.589 19.233 3.181 C 18.169 2.774 16.964 3.065 16.203 3.913 C 16.151 3.970 16.077 4.002 16.000 4.002 C 15.923 4.002 15.849 3.970 15.797 3.913 C 15.036 3.065 13.831 2.774 12.767 3.181 C 11.702 3.589 11.000 4.610 11.000 5.750 C 11.000 6.950 11.802 7.998 12.500 8.696 L 16.000 11.950"),
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
                pathData = parseSvgPathData("M 2.000 15.000 L 8.000 21.000"),
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
                pathData = parseSvgPathData("M 7.000 20.000 L 8.600 18.600 C 8.900 18.200 9.400 18.000 10.000 18.000 L 14.000 18.000 C 15.100 18.000 16.100 17.600 16.800 16.800 L 21.400 12.400 C 22.204 11.641 22.239 10.374 21.480 9.570 C 20.721 8.766 19.454 8.731 18.650 9.490"),
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
        return _handHeart!!
    }

private var _handHeart: ImageVector? = null
