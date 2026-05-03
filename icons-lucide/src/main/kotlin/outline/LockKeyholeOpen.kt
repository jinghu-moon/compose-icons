package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LockKeyholeOpen: ImageVector
    get() {
        if (_lockKeyholeOpen != null) return _lockKeyholeOpen!!
        _lockKeyholeOpen = lucideOutlineIcon(
            name = "LockKeyholeOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.000 16.000 C 13.000 16.552 12.552 17.000 12.000 17.000 C 11.448 17.000 11.000 16.552 11.000 16.000 C 11.000 15.448 11.448 15.000 12.000 15.000 C 12.552 15.000 13.000 15.448 13.000 16.000 Z"),
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
        pathData = parseSvgPathData("M 5.000 10.000 L 19.000 10.000 C 20.105 10.000 21.000 10.895 21.000 12.000 L 21.000 20.000 C 21.000 21.105 20.105 22.000 19.000 22.000 L 5.000 22.000 C 3.895 22.000 3.000 21.105 3.000 20.000 L 3.000 12.000 C 3.000 10.895 3.895 10.000 5.000 10.000 Z"),
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
        pathData = parseSvgPathData("M 7.000 10.000 L 7.000 7.000 C 7.000 4.737 8.520 2.756 10.706 2.171 C 12.892 1.585 15.198 2.540 16.330 4.500"),
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
        return _lockKeyholeOpen!!
    }

private var _lockKeyholeOpen: ImageVector? = null
