package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AlignHorizontalDistributeStart: ImageVector
    get() {
        if (_alignHorizontalDistributeStart != null) return _alignHorizontalDistributeStart!!
        _alignHorizontalDistributeStart = lucideOutlineIcon(
            name = "AlignHorizontalDistributeStart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.000 5.000 L 8.000 5.000 C 9.105 5.000 10.000 5.895 10.000 7.000 L 10.000 17.000 C 10.000 18.105 9.105 19.000 8.000 19.000 L 6.000 19.000 C 4.895 19.000 4.000 18.105 4.000 17.000 L 4.000 7.000 C 4.000 5.895 4.895 5.000 6.000 5.000 Z"),
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
                pathData = parseSvgPathData("M 16.000 7.000 L 18.000 7.000 C 19.105 7.000 20.000 7.895 20.000 9.000 L 20.000 15.000 C 20.000 16.105 19.105 17.000 18.000 17.000 L 16.000 17.000 C 14.895 17.000 14.000 16.105 14.000 15.000 L 14.000 9.000 C 14.000 7.895 14.895 7.000 16.000 7.000 Z"),
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
                pathData = parseSvgPathData("M 4.000 2.000 L 4.000 22.000"),
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
                pathData = parseSvgPathData("M 14.000 2.000 L 14.000 22.000"),
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
        return _alignHorizontalDistributeStart!!
    }

private var _alignHorizontalDistributeStart: ImageVector? = null
