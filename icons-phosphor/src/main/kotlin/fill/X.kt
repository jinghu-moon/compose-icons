package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.X: ImageVector
    get() {
        if (_x != null) return _x!!
        _x = phosphorFillIcon(
            name = "X",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 181.660 170.340 C 184.786 173.466 184.786 178.534 181.660 181.660 C 178.534 184.786 173.466 184.786 170.340 181.660 L 128.000 139.310 L 85.660 181.660 C 82.534 184.786 77.466 184.786 74.340 181.660 C 71.214 178.534 71.214 173.466 74.340 170.340 L 116.690 128.000 L 74.340 85.660 C 71.214 82.534 71.214 77.466 74.340 74.340 C 77.466 71.214 82.534 71.214 85.660 74.340 L 128.000 116.690 L 170.340 74.340 C 173.466 71.214 178.534 71.214 181.660 74.340 C 184.786 77.466 184.786 82.534 181.660 85.660 L 139.310 128.000 Z"),
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
        return _x!!
    }

private var _x: ImageVector? = null
