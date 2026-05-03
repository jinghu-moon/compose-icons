package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowBendUpRight: ImageVector
    get() {
        if (_arrowBendUpRight != null) return _arrowBendUpRight!!
        _arrowBendUpRight = phosphorFillIcon(
            name = "ArrowBendUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 229.660 109.660 L 181.660 157.660 C 179.372 159.951 175.929 160.636 172.938 159.397 C 169.947 158.158 167.997 155.238 168.000 152.000 L 168.000 112.000 L 128.000 112.000 C 79.422 112.055 40.055 151.422 40.000 200.000 C 40.000 204.418 36.418 208.000 32.000 208.000 C 27.582 208.000 24.000 204.418 24.000 200.000 C 24.061 142.588 70.588 96.061 128.000 96.000 L 168.000 96.000 L 168.000 56.000 C 167.997 52.762 169.947 49.842 172.938 48.603 C 175.929 47.364 179.372 48.049 181.660 50.340 L 229.660 98.340 C 231.162 99.841 232.006 101.877 232.006 104.000 C 232.006 106.123 231.162 108.159 229.660 109.660 Z"),
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
        return _arrowBendUpRight!!
    }

private var _arrowBendUpRight: ImageVector? = null
