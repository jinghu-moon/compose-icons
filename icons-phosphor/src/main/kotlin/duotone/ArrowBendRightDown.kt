package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowBendRightDown: ImageVector
    get() {
        if (_arrowBendRightDown != null) return _arrowBendRightDown!!
        _arrowBendRightDown = phosphorDuotoneIcon(
            name = "ArrowBendRightDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 200.000 176.000 L 152.000 224.000 L 104.000 176.000 Z"),
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
        pathData = parseSvgPathData("M 207.390 172.940 C 206.152 169.950 203.236 168.001 200.000 168.000 L 160.000 168.000 L 160.000 128.000 C 159.939 70.588 113.412 24.061 56.000 24.000 C 51.582 24.000 48.000 27.582 48.000 32.000 C 48.000 36.418 51.582 40.000 56.000 40.000 C 104.578 40.055 143.945 79.422 144.000 128.000 L 144.000 168.000 L 104.000 168.000 C 100.762 167.997 97.842 169.947 96.603 172.938 C 95.364 175.929 96.049 179.372 98.340 181.660 L 146.340 229.660 C 147.841 231.162 149.877 232.006 152.000 232.006 C 154.123 232.006 156.159 231.162 157.660 229.660 L 205.660 181.660 C 207.947 179.371 208.630 175.929 207.390 172.940 ZM 152.000 212.690 L 123.310 184.000 L 180.690 184.000 Z"),
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
