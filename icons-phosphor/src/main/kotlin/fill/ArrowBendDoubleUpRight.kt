package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowBendDoubleUpRight: ImageVector
    get() {
        if (_arrowBendDoubleUpRight != null) return _arrowBendDoubleUpRight!!
        _arrowBendDoubleUpRight = phosphorFillIcon(
            name = "ArrowBendDoubleUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 229.660 109.660 L 181.660 157.660 C 178.534 160.786 173.466 160.786 170.340 157.660 C 167.214 154.534 167.214 149.466 170.340 146.340 L 212.690 104.000 L 170.340 61.660 C 167.214 58.534 167.214 53.466 170.340 50.340 C 173.466 47.214 178.534 47.214 181.660 50.340 L 229.660 98.340 C 231.162 99.841 232.006 101.877 232.006 104.000 C 232.006 106.123 231.162 108.159 229.660 109.660 ZM 181.660 98.340 L 133.660 50.340 C 131.372 48.049 127.929 47.364 124.938 48.603 C 121.947 49.842 119.997 52.762 120.000 56.000 L 120.000 96.300 C 65.857 100.550 24.068 145.691 24.000 200.000 C 24.000 204.418 27.582 208.000 32.000 208.000 C 36.418 208.000 40.000 204.418 40.000 200.000 C 40.055 154.521 74.714 116.556 120.000 112.370 L 120.000 152.000 C 119.997 155.238 121.947 158.158 124.938 159.397 C 127.929 160.636 131.372 159.951 133.660 157.660 L 181.660 109.660 C 183.162 108.159 184.006 106.123 184.006 104.000 C 184.006 101.877 183.162 99.841 181.660 98.340 Z"),
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
        return _arrowBendDoubleUpRight!!
    }

private var _arrowBendDoubleUpRight: ImageVector? = null
