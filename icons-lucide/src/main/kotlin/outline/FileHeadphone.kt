package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileHeadphone: ImageVector
    get() {
        if (_fileHeadphone != null) return _fileHeadphone!!
        _fileHeadphone = lucideOutlineIcon(
            name = "FileHeadphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 6.835 L 4.000 4.000 C 4.000 2.895 4.895 2.000 6.000 2.000 L 14.000 2.000 C 14.640 1.998 15.254 2.253 15.706 2.706 L 19.294 6.294 C 19.747 6.746 20.002 7.360 20.000 8.000 L 20.000 20.000 C 20.000 21.105 19.105 22.000 18.000 22.000 L 17.657 22.000"),
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
        pathData = parseSvgPathData("M 2.000 19.000 C 2.000 17.895 2.895 17.000 4.000 17.000 C 5.105 17.000 6.000 17.895 6.000 19.000 L 6.000 20.000 C 6.000 21.105 5.105 22.000 4.000 22.000 C 2.895 22.000 2.000 21.105 2.000 20.000 L 2.000 16.000 C 2.000 12.686 4.686 10.000 8.000 10.000 C 11.314 10.000 14.000 12.686 14.000 16.000 L 14.000 20.000 C 14.000 21.105 13.105 22.000 12.000 22.000 C 10.895 22.000 10.000 21.105 10.000 20.000 L 10.000 19.000 C 10.000 17.895 10.895 17.000 12.000 17.000 C 13.105 17.000 14.000 17.895 14.000 19.000"),
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
        return _fileHeadphone!!
    }

private var _fileHeadphone: ImageVector? = null
