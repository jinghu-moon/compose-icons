package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Torus: ImageVector
    get() {
        if (_torus != null) return _torus!!
        _torus = lucideOutlineIcon(
            name = "Torus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.000 11.000 C 15.000 12.105 13.657 13.000 12.000 13.000 C 10.343 13.000 9.000 12.105 9.000 11.000 C 9.000 9.895 10.343 9.000 12.000 9.000 C 13.657 9.000 15.000 9.895 15.000 11.000 Z"),
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
        pathData = parseSvgPathData("M 22.000 12.500 C 22.000 17.194 17.523 21.000 12.000 21.000 C 6.477 21.000 2.000 17.194 2.000 12.500 C 2.000 7.806 6.477 4.000 12.000 4.000 C 17.523 4.000 22.000 7.806 22.000 12.500 Z"),
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
        return _torus!!
    }

private var _torus: ImageVector? = null
