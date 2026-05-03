package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HatGlasses: ImageVector
    get() {
        if (_hatGlasses != null) return _hatGlasses!!
        _hatGlasses = lucideOutlineIcon(
            name = "HatGlasses",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 18.000 C 14.000 16.895 13.105 16.000 12.000 16.000 C 10.895 16.000 10.000 16.895 10.000 18.000"),
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
                pathData = parseSvgPathData("M 19.000 11.000 L 16.890 4.343 C 16.703 3.805 16.296 3.373 15.771 3.154 C 15.245 2.934 14.652 2.949 14.138 3.195 L 12.862 3.805 C 12.593 3.933 12.298 4.000 12.000 4.000 L 8.500 4.000 C 7.605 4.000 6.818 4.595 6.575 5.456 L 5.000 11.000"),
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
                pathData = parseSvgPathData("M 2.000 11.000 L 22.000 11.000"),
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
                pathData = parseSvgPathData("M 20.000 18.000 C 20.000 19.657 18.657 21.000 17.000 21.000 C 15.343 21.000 14.000 19.657 14.000 18.000 C 14.000 16.343 15.343 15.000 17.000 15.000 C 18.657 15.000 20.000 16.343 20.000 18.000 Z"),
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
                pathData = parseSvgPathData("M 10.000 18.000 C 10.000 19.657 8.657 21.000 7.000 21.000 C 5.343 21.000 4.000 19.657 4.000 18.000 C 4.000 16.343 5.343 15.000 7.000 15.000 C 8.657 15.000 10.000 16.343 10.000 18.000 Z"),
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
        return _hatGlasses!!
    }

private var _hatGlasses: ImageVector? = null
