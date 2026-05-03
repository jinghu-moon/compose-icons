package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CaretDoubleRight: ImageVector
    get() {
        if (_caretDoubleRight != null) return _caretDoubleRight!!
        _caretDoubleRight = phosphorDuotoneIcon(
            name = "CaretDoubleRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 136.000 128.000 L 56.000 208.000 L 56.000 48.000 Z"),
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
        pathData = parseSvgPathData("M 141.660 122.340 L 61.660 42.340 C 59.372 40.049 55.929 39.364 52.938 40.603 C 49.947 41.842 47.997 44.762 48.000 48.000 L 48.000 208.000 C 47.997 211.238 49.947 214.158 52.938 215.397 C 55.929 216.636 59.372 215.951 61.660 213.660 L 141.660 133.660 C 143.162 132.159 144.006 130.123 144.006 128.000 C 144.006 125.877 143.162 123.841 141.660 122.340 ZM 64.000 188.690 L 64.000 67.310 L 124.690 128.000 ZM 221.660 133.690 L 141.660 213.690 C 138.534 216.816 133.466 216.816 130.340 213.690 C 127.214 210.564 127.214 205.496 130.340 202.370 L 204.690 128.000 L 130.340 53.660 C 127.214 50.534 127.214 45.466 130.340 42.340 C 133.466 39.214 138.534 39.214 141.660 42.340 L 221.660 122.340 C 223.162 123.841 224.006 125.877 224.006 128.000 C 224.006 130.123 223.162 132.159 221.660 133.660 Z"),
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
        return _caretDoubleRight!!
    }

private var _caretDoubleRight: ImageVector? = null
