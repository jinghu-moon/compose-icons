package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Motorbike: ImageVector
    get() {
        if (_motorbike != null) return _motorbike!!
        _motorbike = lucideOutlineIcon(
            name = "Motorbike",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 14.000 L 17.000 11.000"),
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
                pathData = parseSvgPathData("M 3.000 9.000 L 9.000 11.000 C 9.000 9.895 9.895 9.000 11.000 9.000 L 13.000 9.000 C 14.031 9.000 14.892 9.784 14.990 10.810"),
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
                pathData = parseSvgPathData("M 8.000 17.000 L 11.000 17.000 C 11.552 17.000 12.000 16.552 12.000 16.000 C 12.000 12.686 14.686 10.000 18.000 10.000 C 18.552 10.000 19.000 9.552 19.000 9.000 L 19.000 8.250 C 18.789 6.945 18.070 5.776 17.000 5.000"),
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
                pathData = parseSvgPathData("M 22.000 17.000 C 22.000 18.657 20.657 20.000 19.000 20.000 C 17.343 20.000 16.000 18.657 16.000 17.000 C 16.000 15.343 17.343 14.000 19.000 14.000 C 20.657 14.000 22.000 15.343 22.000 17.000 Z"),
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
                pathData = parseSvgPathData("M 8.000 17.000 C 8.000 18.657 6.657 20.000 5.000 20.000 C 3.343 20.000 2.000 18.657 2.000 17.000 C 2.000 15.343 3.343 14.000 5.000 14.000 C 6.657 14.000 8.000 15.343 8.000 17.000 Z"),
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
        return _motorbike!!
    }

private var _motorbike: ImageVector? = null
