package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowBendUpRight: ImageVector
    get() {
        if (_arrowBendUpRight != null) return _arrowBendUpRight!!
        _arrowBendUpRight = phosphorDuotoneIcon(
            name = "ArrowBendUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 104.000 L 176.000 152.000 L 176.000 56.000 Z"),
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
                pathData = parseSvgPathData("M 229.660 98.340 L 181.660 50.340 C 179.372 48.049 175.929 47.364 172.938 48.603 C 169.947 49.842 167.997 52.762 168.000 56.000 L 168.000 96.000 L 128.000 96.000 C 70.588 96.061 24.061 142.588 24.000 200.000 C 24.000 204.418 27.582 208.000 32.000 208.000 C 36.418 208.000 40.000 204.418 40.000 200.000 C 40.055 151.422 79.422 112.055 128.000 112.000 L 168.000 112.000 L 168.000 152.000 C 167.997 155.238 169.947 158.158 172.938 159.397 C 175.929 160.636 179.372 159.951 181.660 157.660 L 229.660 109.660 C 231.162 108.159 232.006 106.123 232.006 104.000 C 232.006 101.877 231.162 99.841 229.660 98.340 ZM 184.000 132.690 L 184.000 75.310 L 212.690 104.000 Z"),
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
