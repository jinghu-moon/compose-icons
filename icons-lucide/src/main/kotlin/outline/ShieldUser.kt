package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ShieldUser: ImageVector
    get() {
        if (_shieldUser != null) return _shieldUser!!
        _shieldUser = lucideOutlineIcon(
            name = "ShieldUser",
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
        pathData = parseSvgPathData("M 6.376 18.910 C 7.250 16.559 9.494 15.000 12.002 15.001 C 14.509 15.001 16.752 16.562 17.625 18.913"),
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
        pathData = parseSvgPathData("M 16.000 11.000 C 16.000 13.209 14.209 15.000 12.000 15.000 C 9.791 15.000 8.000 13.209 8.000 11.000 C 8.000 8.791 9.791 7.000 12.000 7.000 C 14.209 7.000 16.000 8.791 16.000 11.000 Z"),
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
        return _shieldUser!!
    }

private var _shieldUser: ImageVector? = null
