package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MapPinHouse: ImageVector
    get() {
        if (_mapPinHouse != null) return _mapPinHouse!!
        _mapPinHouse = lucideOutlineIcon(
            name = "MapPinHouse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 22.000 C 14.448 22.000 14.000 21.552 14.000 21.000 L 14.000 17.000 C 14.000 16.666 14.167 16.354 14.445 16.168 L 17.445 14.168 C 17.781 13.944 18.219 13.944 18.555 14.168 L 21.555 16.168 C 21.833 16.354 22.000 16.666 22.000 17.000 L 22.000 21.000 C 22.000 21.552 21.552 22.000 21.000 22.000 Z"),
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
                pathData = parseSvgPathData("M 18.000 10.000 C 18.000 5.582 14.418 2.000 10.000 2.000 C 5.582 2.000 2.000 5.582 2.000 10.000 C 2.000 14.993 7.539 20.193 9.399 21.799 C 9.572 21.929 9.783 21.999 10.000 21.999"),
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
                pathData = parseSvgPathData("M 18.000 22.000 L 18.000 19.000"),
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
                pathData = parseSvgPathData("M 13.000 10.000 C 13.000 11.657 11.657 13.000 10.000 13.000 C 8.343 13.000 7.000 11.657 7.000 10.000 C 7.000 8.343 8.343 7.000 10.000 7.000 C 11.657 7.000 13.000 8.343 13.000 10.000 Z"),
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
        return _mapPinHouse!!
    }

private var _mapPinHouse: ImageVector? = null
