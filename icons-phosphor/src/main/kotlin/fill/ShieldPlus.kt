package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ShieldPlus: ImageVector
    get() {
        if (_shieldPlus != null) return _shieldPlus!!
        _shieldPlus = phosphorFillIcon(
            name = "ShieldPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 40.000 L 48.000 40.000 C 39.163 40.000 32.000 47.163 32.000 56.000 L 32.000 112.000 C 32.000 164.720 57.520 196.670 78.930 214.190 C 101.990 233.050 124.930 239.460 125.930 239.720 C 127.305 240.094 128.755 240.094 130.130 239.720 C 131.130 239.460 154.040 233.050 177.130 214.190 C 198.480 196.670 224.000 164.720 224.000 112.000 L 224.000 56.000 C 224.000 47.163 216.837 40.000 208.000 40.000 ZM 160.000 136.000 L 136.000 136.000 L 136.000 160.000 C 136.000 164.418 132.418 168.000 128.000 168.000 C 123.582 168.000 120.000 164.418 120.000 160.000 L 120.000 136.000 L 96.000 136.000 C 91.582 136.000 88.000 132.418 88.000 128.000 C 88.000 123.582 91.582 120.000 96.000 120.000 L 120.000 120.000 L 120.000 96.000 C 120.000 91.582 123.582 88.000 128.000 88.000 C 132.418 88.000 136.000 91.582 136.000 96.000 L 136.000 120.000 L 160.000 120.000 C 164.418 120.000 168.000 123.582 168.000 128.000 C 168.000 132.418 164.418 136.000 160.000 136.000 Z"),
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
        return _shieldPlus!!
    }

private var _shieldPlus: ImageVector? = null
