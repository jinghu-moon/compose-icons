package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CaretDoubleDown: ImageVector
    get() {
        if (_caretDoubleDown != null) return _caretDoubleDown!!
        _caretDoubleDown = phosphorDuotoneIcon(
            name = "CaretDoubleDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 208.000 56.000 L 128.000 136.000 L 48.000 56.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 213.660 141.660 L 133.660 221.660 C 132.159 223.162 130.123 224.006 128.000 224.006 C 125.877 224.006 123.841 223.162 122.340 221.660 L 42.340 141.660 C 39.214 138.534 39.214 133.466 42.340 130.340 C 45.466 127.214 50.534 127.214 53.660 130.340 L 128.000 204.690 L 202.340 130.340 C 205.466 127.214 210.534 127.214 213.660 130.340 C 216.786 133.466 216.786 138.534 213.660 141.660 ZM 42.340 61.660 C 40.049 59.372 39.364 55.929 40.603 52.938 C 41.842 49.947 44.762 47.997 48.000 48.000 L 208.000 48.000 C 211.238 47.997 214.158 49.947 215.397 52.938 C 216.636 55.929 215.951 59.372 213.660 61.660 L 133.660 141.660 C 132.159 143.162 130.123 144.006 128.000 144.006 C 125.877 144.006 123.841 143.162 122.340 141.660 ZM 67.340 64.000 L 128.000 124.690 L 188.690 64.000 Z"),
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
        return _caretDoubleDown!!
    }

private var _caretDoubleDown: ImageVector? = null
