package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowsSplit: ImageVector
    get() {
        if (_arrowsSplit != null) return _arrowsSplit!!
        _arrowsSplit = phosphorDuotoneIcon(
            name = "ArrowsSplit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 192.000 136.000 L 192.000 216.000 L 64.000 216.000 L 64.000 136.000 L 128.000 72.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 229.660 189.660 L 197.660 221.660 C 196.159 223.162 194.123 224.006 192.000 224.006 C 189.877 224.006 187.841 223.162 186.340 221.660 L 154.340 189.660 C 151.214 186.534 151.214 181.466 154.340 178.340 C 157.466 175.214 162.534 175.214 165.660 178.340 L 184.000 196.690 L 184.000 139.310 L 128.000 83.310 L 72.000 139.310 L 72.000 196.690 L 90.340 178.340 C 93.466 175.214 98.534 175.214 101.660 178.340 C 104.786 181.466 104.786 186.534 101.660 189.660 L 69.660 221.660 C 68.159 223.162 66.123 224.006 64.000 224.006 C 61.877 224.006 59.841 223.162 58.340 221.660 L 26.340 189.660 C 23.214 186.534 23.214 181.466 26.340 178.340 C 29.466 175.214 34.534 175.214 37.660 178.340 L 56.000 196.690 L 56.000 136.000 C 55.998 133.878 56.840 131.842 58.340 130.340 L 120.000 68.690 L 120.000 24.000 C 120.000 19.582 123.582 16.000 128.000 16.000 C 132.418 16.000 136.000 19.582 136.000 24.000 L 136.000 68.690 L 197.660 130.340 C 199.160 131.842 200.002 133.878 200.000 136.000 L 200.000 196.690 L 218.340 178.340 C 221.466 175.214 226.534 175.214 229.660 178.340 C 232.786 181.466 232.786 186.534 229.660 189.660 Z"),
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
        return _arrowsSplit!!
    }

private var _arrowsSplit: ImageVector? = null
