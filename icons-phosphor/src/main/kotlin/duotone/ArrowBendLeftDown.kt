package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowBendLeftDown: ImageVector
    get() {
        if (_arrowBendLeftDown != null) return _arrowBendLeftDown!!
        _arrowBendLeftDown = phosphorDuotoneIcon(
            name = "ArrowBendLeftDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 152.000 176.000 L 104.000 224.000 L 56.000 176.000 Z"),
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
                pathData = parseSvgPathData("M 200.000 24.000 C 142.588 24.061 96.061 70.588 96.000 128.000 L 96.000 168.000 L 56.000 168.000 C 52.762 167.997 49.842 169.947 48.603 172.938 C 47.364 175.929 48.049 179.372 50.340 181.660 L 98.340 229.660 C 99.841 231.162 101.877 232.006 104.000 232.006 C 106.123 232.006 108.159 231.162 109.660 229.660 L 157.660 181.660 C 159.951 179.372 160.636 175.929 159.397 172.938 C 158.158 169.947 155.238 167.997 152.000 168.000 L 112.000 168.000 L 112.000 128.000 C 112.055 79.422 151.422 40.055 200.000 40.000 C 204.418 40.000 208.000 36.418 208.000 32.000 C 208.000 27.582 204.418 24.000 200.000 24.000 ZM 104.000 212.690 L 75.310 184.000 L 132.690 184.000 Z"),
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
        return _arrowBendLeftDown!!
    }

private var _arrowBendLeftDown: ImageVector? = null
