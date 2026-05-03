package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FlameKindling: ImageVector
    get() {
        if (_flameKindling != null) return _flameKindling!!
        _flameKindling = lucideOutlineIcon(
            name = "FlameKindling",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 13.000 5.000 14.500 5.500 15.500 6.500 C 16.442 7.423 16.981 8.681 17.000 10.000 C 17.000 12.761 14.761 15.000 12.000 15.000 C 9.239 15.000 7.000 12.761 7.000 10.000 C 7.000 9.700 7.000 9.400 7.100 9.100 C 7.332 9.911 8.047 10.489 8.888 10.546 C 9.729 10.603 10.516 10.126 10.854 9.354 C 11.193 8.582 11.011 7.680 10.400 7.100 C 8.000 4.500 11.000 2.000 12.000 2.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 5.000 22.000 L 19.000 18.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 5.000 18.000 L 19.000 22.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _flameKindling!!
    }

private var _flameKindling: ImageVector? = null
