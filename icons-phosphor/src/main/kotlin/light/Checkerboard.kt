package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Checkerboard: ImageVector
    get() {
        if (_checkerboard != null) return _checkerboard!!
        _checkerboard = phosphorLightIcon(
            name = "Checkerboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 34.000 L 48.000 34.000 C 40.268 34.000 34.000 40.268 34.000 48.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 208.000 222.000 C 215.732 222.000 222.000 215.732 222.000 208.000 L 222.000 48.000 C 222.000 40.268 215.732 34.000 208.000 34.000 ZM 194.480 122.000 L 134.000 61.520 L 134.000 46.000 L 149.520 46.000 L 210.000 106.480 L 210.000 122.000 ZM 134.000 78.480 L 177.520 122.000 L 134.000 122.000 ZM 210.000 48.000 L 210.000 89.520 L 166.480 46.000 L 208.000 46.000 C 209.105 46.000 210.000 46.895 210.000 48.000 ZM 48.000 46.000 L 122.000 46.000 L 122.000 122.000 L 46.000 122.000 L 46.000 48.000 C 46.000 46.895 46.895 46.000 48.000 46.000 ZM 106.480 210.000 L 46.000 149.520 L 46.000 134.000 L 61.520 134.000 L 122.000 194.480 L 122.000 210.000 ZM 122.000 177.520 L 78.480 134.000 L 122.000 134.000 ZM 46.000 208.000 L 46.000 166.480 L 89.520 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 ZM 208.000 210.000 L 134.000 210.000 L 134.000 192.000 L 134.000 192.000 L 134.000 134.000 L 210.000 134.000 L 210.000 208.000 C 210.000 209.105 209.105 210.000 208.000 210.000 Z"),
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
        return _checkerboard!!
    }

private var _checkerboard: ImageVector? = null
