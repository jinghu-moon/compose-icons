package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CaretLineRight: ImageVector
    get() {
        if (_caretLineRight != null) return _caretLineRight!!
        _caretLineRight = phosphorDuotoneIcon(
            name = "CaretLineRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 144.000 128.000 L 64.000 208.000 L 64.000 48.000 Z"),
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
                pathData = parseSvgPathData("M 69.660 42.340 C 67.372 40.049 63.929 39.364 60.938 40.603 C 57.947 41.842 55.997 44.762 56.000 48.000 L 56.000 208.000 C 55.997 211.238 57.947 214.158 60.938 215.397 C 63.929 216.636 67.372 215.951 69.660 213.660 L 149.660 133.660 C 151.162 132.159 152.006 130.123 152.006 128.000 C 152.006 125.877 151.162 123.841 149.660 122.340 ZM 72.000 188.690 L 72.000 67.310 L 132.690 128.000 ZM 192.000 48.000 L 192.000 208.000 C 192.000 212.418 188.418 216.000 184.000 216.000 C 179.582 216.000 176.000 212.418 176.000 208.000 L 176.000 48.000 C 176.000 43.582 179.582 40.000 184.000 40.000 C 188.418 40.000 192.000 43.582 192.000 48.000 Z"),
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
        return _caretLineRight!!
    }

private var _caretLineRight: ImageVector? = null
