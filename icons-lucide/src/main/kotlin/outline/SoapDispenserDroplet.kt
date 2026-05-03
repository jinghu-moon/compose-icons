package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SoapDispenserDroplet: ImageVector
    get() {
        if (_soapDispenserDroplet != null) return _soapDispenserDroplet!!
        _soapDispenserDroplet = lucideOutlineIcon(
            name = "SoapDispenserDroplet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.500 2.000 L 10.500 6.000"),
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
        pathData = parseSvgPathData("M 14.000 2.000 L 7.000 2.000 C 5.895 2.000 5.000 2.895 5.000 4.000"),
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
        pathData = parseSvgPathData("M 19.290 14.760 C 18.123 13.802 17.316 12.476 17.000 11.000 C 16.689 12.478 15.881 13.806 14.710 14.760 C 13.560 15.680 13.000 16.800 13.000 17.950 C 13.000 20.170 14.800 22.000 17.000 22.000 C 19.200 22.000 21.000 20.170 21.000 17.950 C 21.000 16.790 20.430 15.690 19.290 14.760"),
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
        pathData = parseSvgPathData("M 9.607 21.000 L 6.000 21.000 C 4.895 21.000 4.000 20.105 4.000 19.000 L 4.000 12.000 C 4.000 10.895 4.895 10.000 6.000 10.000 L 13.000 10.000 L 13.000 7.000 C 13.000 6.448 12.552 6.000 12.000 6.000 L 9.000 6.000 C 8.448 6.000 8.000 6.448 8.000 7.000 L 8.000 10.000"),
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
        return _soapDispenserDroplet!!
    }

private var _soapDispenserDroplet: ImageVector? = null
