package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ClosedCaption: ImageVector
    get() {
        if (_closedCaption != null) return _closedCaption!!
        _closedCaption = lucideOutlineIcon(
            name = "ClosedCaption",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 9.170 C 8.757 8.733 7.375 9.158 6.592 10.217 C 5.809 11.277 5.809 12.723 6.592 13.783 C 7.375 14.842 8.757 15.267 10.000 14.830"),
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
        pathData = parseSvgPathData("M 17.000 9.170 C 15.757 8.733 14.375 9.158 13.592 10.217 C 12.809 11.277 12.809 12.723 13.592 13.783 C 14.375 14.842 15.757 15.267 17.000 14.830"),
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
        pathData = parseSvgPathData("M 4.000 5.000 L 20.000 5.000 C 21.105 5.000 22.000 5.895 22.000 7.000 L 22.000 17.000 C 22.000 18.105 21.105 19.000 20.000 19.000 L 4.000 19.000 C 2.895 19.000 2.000 18.105 2.000 17.000 L 2.000 7.000 C 2.000 5.895 2.895 5.000 4.000 5.000 Z"),
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
        return _closedCaption!!
    }

private var _closedCaption: ImageVector? = null
