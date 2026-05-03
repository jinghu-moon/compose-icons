package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ImageDown: ImageVector
    get() {
        if (_imageDown != null) return _imageDown!!
        _imageDown = lucideOutlineIcon(
            name = "ImageDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.300 21.000 L 5.000 21.000 C 3.895 21.000 3.000 20.105 3.000 19.000 L 3.000 5.000 C 3.000 3.895 3.895 3.000 5.000 3.000 L 19.000 3.000 C 20.105 3.000 21.000 3.895 21.000 5.000 L 21.000 15.000 L 17.900 11.900 C 17.117 11.132 15.862 11.139 15.086 11.914 L 6.000 21.000"),
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
                pathData = parseSvgPathData("M 14.000 19.000 L 17.000 22.000 L 17.000 16.500"),
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
                pathData = parseSvgPathData("M 17.000 22.000 L 20.000 19.000"),
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
                pathData = parseSvgPathData("M 11.000 9.000 C 11.000 10.105 10.105 11.000 9.000 11.000 C 7.895 11.000 7.000 10.105 7.000 9.000 C 7.000 7.895 7.895 7.000 9.000 7.000 C 10.105 7.000 11.000 7.895 11.000 9.000 Z"),
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
        return _imageDown!!
    }

private var _imageDown: ImageVector? = null
