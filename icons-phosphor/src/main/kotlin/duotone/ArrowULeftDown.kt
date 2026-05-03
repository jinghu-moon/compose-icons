package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowULeftDown: ImageVector
    get() {
        if (_arrowULeftDown != null) return _arrowULeftDown!!
        _arrowULeftDown = phosphorDuotoneIcon(
            name = "ArrowULeftDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 136.000 176.000 L 88.000 224.000 L 40.000 176.000 Z"),
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
        pathData = parseSvgPathData("M 144.000 24.000 C 108.670 24.039 80.039 52.670 80.000 88.000 L 80.000 168.000 L 40.000 168.000 C 36.762 167.997 33.842 169.947 32.603 172.938 C 31.364 175.929 32.049 179.372 34.340 181.660 L 82.340 229.660 C 83.841 231.162 85.877 232.006 88.000 232.006 C 90.123 232.006 92.159 231.162 93.660 229.660 L 141.660 181.660 C 143.951 179.372 144.636 175.929 143.397 172.938 C 142.158 169.947 139.238 167.997 136.000 168.000 L 96.000 168.000 L 96.000 88.000 C 96.000 61.490 117.490 40.000 144.000 40.000 C 170.510 40.000 192.000 61.490 192.000 88.000 L 192.000 176.000 C 192.000 180.418 195.582 184.000 200.000 184.000 C 204.418 184.000 208.000 180.418 208.000 176.000 L 208.000 88.000 C 207.961 52.670 179.330 24.039 144.000 24.000 ZM 88.000 212.690 L 59.310 184.000 L 116.690 184.000 Z"),
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
        return _arrowULeftDown!!
    }

private var _arrowULeftDown: ImageVector? = null
