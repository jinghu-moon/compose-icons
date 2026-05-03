package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowBendDoubleUpRight: ImageVector
    get() {
        if (_arrowBendDoubleUpRight != null) return _arrowBendDoubleUpRight!!
        _arrowBendDoubleUpRight = phosphorDuotoneIcon(
            name = "ArrowBendDoubleUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 176.000 104.000 L 128.000 152.000 L 128.000 56.000 Z"),
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
        pathData = parseSvgPathData("M 229.660 109.660 L 181.660 157.660 C 178.534 160.786 173.466 160.786 170.340 157.660 C 167.214 154.534 167.214 149.466 170.340 146.340 L 212.690 104.000 L 170.340 61.660 C 167.214 58.534 167.214 53.466 170.340 50.340 C 173.466 47.214 178.534 47.214 181.660 50.340 L 229.660 98.340 C 231.162 99.841 232.006 101.877 232.006 104.000 C 232.006 106.123 231.162 108.159 229.660 109.660 ZM 181.660 109.660 L 133.660 157.660 C 131.372 159.951 127.929 160.636 124.938 159.397 C 121.947 158.158 119.997 155.238 120.000 152.000 L 120.000 112.370 C 74.714 116.556 40.055 154.521 40.000 200.000 C 40.000 204.418 36.418 208.000 32.000 208.000 C 27.582 208.000 24.000 204.418 24.000 200.000 C 24.068 145.691 65.857 100.550 120.000 96.300 L 120.000 56.000 C 119.997 52.762 121.947 49.842 124.938 48.603 C 127.929 47.364 131.372 48.049 133.660 50.340 L 181.660 98.340 C 183.162 99.841 184.006 101.877 184.006 104.000 C 184.006 106.123 183.162 108.159 181.660 109.660 ZM 164.660 104.000 L 136.000 75.310 L 136.000 132.690 Z"),
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
