package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HandHelping: ImageVector
    get() {
        if (_handHelping != null) return _handHelping!!
        _handHelping = lucideOutlineIcon(
            name = "HandHelping",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.000 12.000 L 13.000 12.000 C 14.105 12.000 15.000 11.105 15.000 10.000 C 15.000 8.895 14.105 8.000 13.000 8.000 L 10.000 8.000 C 9.400 8.000 8.900 8.200 8.600 8.600 L 3.000 14.000"),
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
                pathData = parseSvgPathData("M 7.000 18.000 L 8.600 16.600 C 8.900 16.200 9.400 16.000 10.000 16.000 L 14.000 16.000 C 15.100 16.000 16.100 15.600 16.800 14.800 L 21.400 10.400 C 22.204 9.641 22.239 8.374 21.480 7.570 C 20.721 6.766 19.454 6.731 18.650 7.490 L 14.450 11.390"),
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
                pathData = parseSvgPathData("M 2.000 13.000 L 8.000 19.000"),
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
        return _handHelping!!
    }

private var _handHelping: ImageVector? = null
