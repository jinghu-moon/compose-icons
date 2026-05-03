package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowBendDownRight: ImageVector
    get() {
        if (_arrowBendDownRight != null) return _arrowBendDownRight!!
        _arrowBendDownRight = phosphorFillIcon(
            name = "ArrowBendDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 229.660 157.660 L 181.660 205.660 C 179.372 207.951 175.929 208.636 172.938 207.397 C 169.947 206.158 167.997 203.238 168.000 200.000 L 168.000 160.000 L 128.000 160.000 C 70.588 159.939 24.061 113.412 24.000 56.000 C 24.000 51.582 27.582 48.000 32.000 48.000 C 36.418 48.000 40.000 51.582 40.000 56.000 C 40.055 104.578 79.422 143.945 128.000 144.000 L 168.000 144.000 L 168.000 104.000 C 167.997 100.762 169.947 97.842 172.938 96.603 C 175.929 95.364 179.372 96.049 181.660 98.340 L 229.660 146.340 C 231.162 147.841 232.006 149.877 232.006 152.000 C 232.006 154.123 231.162 156.159 229.660 157.660 Z"),
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
        return _arrowBendDownRight!!
    }

private var _arrowBendDownRight: ImageVector? = null
