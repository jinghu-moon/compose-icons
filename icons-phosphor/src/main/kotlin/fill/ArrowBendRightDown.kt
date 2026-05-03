package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowBendRightDown: ImageVector
    get() {
        if (_arrowBendRightDown != null) return _arrowBendRightDown!!
        _arrowBendRightDown = phosphorFillIcon(
            name = "ArrowBendRightDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 205.660 181.660 L 157.660 229.660 C 156.159 231.162 154.123 232.006 152.000 232.006 C 149.877 232.006 147.841 231.162 146.340 229.660 L 98.340 181.660 C 96.049 179.372 95.364 175.929 96.603 172.938 C 97.842 169.947 100.762 167.997 104.000 168.000 L 144.000 168.000 L 144.000 128.000 C 143.945 79.422 104.578 40.055 56.000 40.000 C 51.582 40.000 48.000 36.418 48.000 32.000 C 48.000 27.582 51.582 24.000 56.000 24.000 C 113.412 24.061 159.939 70.588 160.000 128.000 L 160.000 168.000 L 200.000 168.000 C 203.238 167.997 206.158 169.947 207.397 172.938 C 208.636 175.929 207.951 179.372 205.660 181.660 Z"),
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
        return _arrowBendRightDown!!
    }

private var _arrowBendRightDown: ImageVector? = null
