package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Lectern: ImageVector
    get() {
        if (_lectern != null) return _lectern!!
        _lectern = lucideOutlineIcon(
            name = "Lectern",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.000 12.000 L 19.000 12.000 C 19.866 12.000 20.634 11.443 20.902 10.620 L 21.958 7.287 C 22.049 6.984 21.991 6.656 21.802 6.403 C 21.614 6.149 21.316 6.000 21.000 6.000 L 3.000 6.000 C 2.684 6.000 2.386 6.149 2.198 6.403 C 2.009 6.656 1.951 6.984 2.042 7.287 L 3.098 10.621 C 3.367 11.444 4.134 12.000 5.000 12.000 L 8.000 12.000"),
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
        pathData = parseSvgPathData("M 18.000 6.000 L 18.000 3.000 C 18.000 2.448 17.552 2.000 17.000 2.000 L 14.000 2.000"),
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
        pathData = parseSvgPathData("M 9.000 10.000 L 15.000 10.000 C 15.552 10.000 16.000 10.448 16.000 11.000 L 16.000 21.000 C 16.000 21.552 15.552 22.000 15.000 22.000 L 9.000 22.000 C 8.448 22.000 8.000 21.552 8.000 21.000 L 8.000 11.000 C 8.000 10.448 8.448 10.000 9.000 10.000 Z"),
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
        return _lectern!!
    }

private var _lectern: ImageVector? = null
