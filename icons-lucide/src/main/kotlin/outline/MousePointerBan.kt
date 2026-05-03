package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MousePointerBan: ImageVector
    get() {
        if (_mousePointerBan != null) return _mousePointerBan!!
        _mousePointerBan = lucideOutlineIcon(
            name = "MousePointerBan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.034 2.681 C 1.960 2.496 2.004 2.285 2.144 2.144 C 2.285 2.004 2.496 1.960 2.681 2.034 L 11.681 5.534 C 11.880 5.611 12.008 5.805 12.000 6.018 C 11.993 6.230 11.851 6.415 11.648 6.478 L 8.204 7.545 C 7.889 7.643 7.642 7.890 7.544 8.205 L 6.478 11.648 C 6.415 11.851 6.230 11.993 6.018 12.000 C 5.805 12.008 5.611 11.880 5.534 11.681 Z"),
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
        pathData = parseSvgPathData("M 22.000 16.000 C 22.000 19.314 19.314 22.000 16.000 22.000 C 12.686 22.000 10.000 19.314 10.000 16.000 C 10.000 12.686 12.686 10.000 16.000 10.000 C 19.314 10.000 22.000 12.686 22.000 16.000 Z"),
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
        pathData = parseSvgPathData("M 11.800 11.800 L 20.200 20.200"),
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
        return _mousePointerBan!!
    }

private var _mousePointerBan: ImageVector? = null
