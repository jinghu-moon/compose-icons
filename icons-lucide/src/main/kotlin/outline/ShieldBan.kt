package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ShieldBan: ImageVector
    get() {
        if (_shieldBan != null) return _shieldBan!!
        _shieldBan = lucideOutlineIcon(
            name = "ShieldBan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 13.000 C 20.000 18.000 16.500 20.500 12.340 21.950 C 12.122 22.024 11.886 22.020 11.670 21.940 C 7.500 20.500 4.000 18.000 4.000 13.000 L 4.000 6.000 C 4.000 5.448 4.448 5.000 5.000 5.000 C 7.000 5.000 9.500 3.800 11.240 2.280 C 11.678 1.906 12.322 1.906 12.760 2.280 C 14.510 3.810 17.000 5.000 19.000 5.000 C 19.552 5.000 20.000 5.448 20.000 6.000 Z"),
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
        pathData = parseSvgPathData("M 4.243 5.210 L 18.633 17.682"),
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
        return _shieldBan!!
    }

private var _shieldBan: ImageVector? = null
