package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ImagePlay: ImageVector
    get() {
        if (_imagePlay != null) return _imagePlay!!
        _imagePlay = lucideOutlineIcon(
            name = "ImagePlay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 15.003 C 14.999 14.642 15.193 14.308 15.507 14.130 C 15.822 13.952 16.208 13.957 16.517 14.144 L 21.514 17.141 C 21.817 17.321 22.002 17.648 22.002 18.000 C 22.002 18.352 21.817 18.679 21.514 18.859 L 16.517 21.856 C 16.208 22.043 15.821 22.048 15.507 21.870 C 15.192 21.692 14.999 21.358 15.000 20.996 Z"),
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
                pathData = parseSvgPathData("M 21.000 12.170 L 21.000 5.000 C 21.000 3.895 20.105 3.000 19.000 3.000 L 5.000 3.000 C 3.895 3.000 3.000 3.895 3.000 5.000 L 3.000 19.000 C 3.000 20.105 3.895 21.000 5.000 21.000 L 11.000 21.000"),
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
                pathData = parseSvgPathData("M 6.000 21.000 L 11.000 16.000"),
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
        return _imagePlay!!
    }

private var _imagePlay: ImageVector? = null
