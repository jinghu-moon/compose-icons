package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HousePlug: ImageVector
    get() {
        if (_housePlug != null) return _housePlug!!
        _housePlug = lucideOutlineIcon(
            name = "HousePlug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 12.000 L 10.000 8.964"),
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
                pathData = parseSvgPathData("M 14.000 12.000 L 14.000 8.964"),
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
                pathData = parseSvgPathData("M 15.000 12.000 C 15.552 12.000 16.000 12.448 16.000 13.000 L 16.000 15.000 C 16.000 16.105 15.105 17.000 14.000 17.000 L 10.000 17.000 C 8.895 17.000 8.000 16.105 8.000 15.000 L 8.000 13.000 C 8.000 12.448 8.448 12.000 9.000 12.000 Z"),
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
                pathData = parseSvgPathData("M 8.500 21.000 L 5.000 21.000 C 3.895 21.000 3.000 20.105 3.000 19.000 L 3.000 10.000 C 3.000 9.411 3.259 8.852 3.709 8.472 L 10.709 2.472 C 11.454 1.842 12.546 1.842 13.291 2.472 L 20.291 8.472 C 20.741 8.852 21.000 9.411 21.000 10.000 L 21.000 19.000 C 21.000 20.105 20.105 21.000 19.000 21.000 L 14.000 21.000 C 12.895 21.000 12.000 20.105 12.000 19.000 L 12.000 17.000"),
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
        return _housePlug!!
    }

private var _housePlug: ImageVector? = null
