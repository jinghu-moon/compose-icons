package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ShieldOff: ImageVector
    get() {
        if (_shieldOff != null) return _shieldOff!!
        _shieldOff = lucideOutlineIcon(
            name = "ShieldOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.000 2.000 L 22.000 22.000"),
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
        pathData = parseSvgPathData("M 5.000 5.000 C 4.448 5.000 4.000 5.448 4.000 6.000 L 4.000 13.000 C 4.000 18.000 7.500 20.500 11.670 21.940 C 11.886 22.020 12.122 22.024 12.340 21.950 C 14.690 21.130 16.820 19.980 18.240 18.240"),
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
        pathData = parseSvgPathData("M 9.309 3.652 C 9.995 3.258 10.642 2.799 11.240 2.280 C 11.678 1.906 12.322 1.906 12.760 2.280 C 14.510 3.810 17.000 5.000 19.000 5.000 C 19.552 5.000 20.000 5.448 20.000 6.000 L 20.000 13.000 C 20.001 13.423 19.974 13.845 19.920 14.264"),
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
        return _shieldOff!!
    }

private var _shieldOff: ImageVector? = null
