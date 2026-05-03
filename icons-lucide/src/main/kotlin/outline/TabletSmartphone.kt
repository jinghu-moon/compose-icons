package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TabletSmartphone: ImageVector
    get() {
        if (_tabletSmartphone != null) return _tabletSmartphone!!
        _tabletSmartphone = lucideOutlineIcon(
            name = "TabletSmartphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.000 8.000 L 11.000 8.000 C 12.105 8.000 13.000 8.895 13.000 10.000 L 13.000 20.000 C 13.000 21.105 12.105 22.000 11.000 22.000 L 5.000 22.000 C 3.895 22.000 3.000 21.105 3.000 20.000 L 3.000 10.000 C 3.000 8.895 3.895 8.000 5.000 8.000 Z"),
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
        pathData = parseSvgPathData("M 5.000 4.000 C 5.000 2.895 5.895 2.000 7.000 2.000 L 19.000 2.000 C 20.105 2.000 21.000 2.895 21.000 4.000 L 21.000 20.000 C 21.000 21.105 20.105 22.000 19.000 22.000 L 16.600 22.000"),
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
        pathData = parseSvgPathData("M 8.000 18.000 L 8.010 18.000"),
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
        return _tabletSmartphone!!
    }

private var _tabletSmartphone: ImageVector? = null
