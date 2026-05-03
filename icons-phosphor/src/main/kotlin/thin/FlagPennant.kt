package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FlagPennant: ImageVector
    get() {
        if (_flagPennant != null) return _flagPennant!!
        _flagPennant = phosphorThinIcon(
            name = "FlagPennant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 241.310 100.220 L 57.310 36.220 C 56.087 35.796 54.735 35.990 53.680 36.741 C 52.626 37.491 52.000 38.706 52.000 40.000 L 52.000 216.000 C 52.000 218.209 53.791 220.000 56.000 220.000 C 58.209 220.000 60.000 218.209 60.000 216.000 L 60.000 170.840 L 241.310 107.780 C 242.921 107.222 244.002 105.705 244.002 104.000 C 244.002 102.295 242.921 100.778 241.310 100.220 ZM 60.000 162.370 L 60.000 45.630 L 227.820 104.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _flagPennant!!
    }

private var _flagPennant: ImageVector? = null
