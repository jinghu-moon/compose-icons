package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Skull: ImageVector
    get() {
        if (_skull != null) return _skull!!
        _skull = lucideOutlineIcon(
            name = "Skull",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.500 17.000 L 12.000 16.000 L 11.500 17.000 L 12.500 17.000 Z"),
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
        pathData = parseSvgPathData("M 15.000 22.000 C 15.552 22.000 16.000 21.552 16.000 21.000 L 16.000 20.000 C 16.769 20.000 17.469 19.558 17.802 18.865 C 18.134 18.172 18.040 17.350 17.560 16.750 C 19.904 14.484 20.639 11.022 19.417 7.999 C 18.195 4.977 15.260 2.998 12.000 2.998 C 8.740 2.998 5.805 4.977 4.583 7.999 C 3.361 11.022 4.096 14.484 6.440 16.750 C 5.960 17.350 5.866 18.172 6.198 18.865 C 6.531 19.558 7.231 20.000 8.000 20.000 L 8.000 21.000 C 8.000 21.552 8.448 22.000 9.000 22.000 Z"),
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
        pathData = parseSvgPathData("M 16.000 12.000 C 16.000 12.552 15.552 13.000 15.000 13.000 C 14.448 13.000 14.000 12.552 14.000 12.000 C 14.000 11.448 14.448 11.000 15.000 11.000 C 15.552 11.000 16.000 11.448 16.000 12.000 Z"),
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
        pathData = parseSvgPathData("M 10.000 12.000 C 10.000 12.552 9.552 13.000 9.000 13.000 C 8.448 13.000 8.000 12.552 8.000 12.000 C 8.000 11.448 8.448 11.000 9.000 11.000 C 9.552 11.000 10.000 11.448 10.000 12.000 Z"),
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
        return _skull!!
    }

private var _skull: ImageVector? = null
