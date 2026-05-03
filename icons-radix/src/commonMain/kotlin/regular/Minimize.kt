package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Minimize: ImageVector
    get() {
        if (_minimize != null) return _minimize!!
        _minimize = radixIcon(
            name = "Minimize",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.500 8.050 C 6.619 8.050 6.733 8.098 6.818 8.182 C 6.902 8.266 6.950 8.381 6.950 8.500 L 6.950 12.500 C 6.950 12.749 6.748 12.949 6.500 12.950 C 6.252 12.950 6.050 12.748 6.050 12.499 L 6.050 9.585 L 2.318 13.318 C 2.142 13.493 1.858 13.494 1.682 13.319 C 1.506 13.143 1.506 12.858 1.682 12.682 L 5.413 8.951 L 2.500 8.950 C 2.252 8.950 2.051 8.749 2.051 8.500 C 2.051 8.252 2.252 8.050 2.500 8.050 L 6.500 8.050 ZM 12.682 1.682 C 12.858 1.507 13.143 1.506 13.319 1.682 C 13.494 1.858 13.494 2.142 13.319 2.318 L 9.586 6.050 L 12.500 6.050 C 12.749 6.050 12.950 6.252 12.950 6.500 C 12.950 6.749 12.748 6.950 12.500 6.951 L 8.500 6.951 L 8.409 6.941 C 8.205 6.899 8.050 6.718 8.050 6.500 L 8.050 2.500 C 8.050 2.252 8.252 2.050 8.500 2.050 C 8.749 2.050 8.949 2.252 8.949 2.500 L 8.949 5.414 L 12.682 1.682 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _minimize!!
    }

private var _minimize: ImageVector? = null
