package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FilePen: ImageVector
    get() {
        if (_filePen != null) return _filePen!!
        _filePen = lucideOutlineIcon(
            name = "FilePen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.659 22.000 L 18.000 22.000 C 19.105 22.000 20.000 21.105 20.000 20.000 L 20.000 8.000 C 20.002 7.360 19.747 6.746 19.294 6.294 L 15.706 2.706 C 15.254 2.253 14.640 1.998 14.000 2.000 L 6.000 2.000 C 4.895 2.000 4.000 2.895 4.000 4.000 L 4.000 13.340"),
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
        pathData = parseSvgPathData("M 14.000 2.000 L 14.000 7.000 C 14.000 7.552 14.448 8.000 15.000 8.000 L 20.000 8.000"),
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
        pathData = parseSvgPathData("M 10.378 12.622 C 11.207 11.794 12.551 11.794 13.380 12.623 C 14.208 13.453 14.207 14.797 13.378 15.625 L 8.360 20.637 C 8.122 20.875 7.829 21.049 7.506 21.143 L 4.639 21.980 C 4.464 22.031 4.275 21.983 4.145 21.854 C 4.016 21.724 3.968 21.535 4.019 21.360 L 4.855 18.491 C 4.949 18.169 5.123 17.875 5.361 17.638 Z"),
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
        return _filePen!!
    }

private var _filePen: ImageVector? = null
