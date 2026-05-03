package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Subtract: ImageVector
    get() {
        if (_subtract != null) return _subtract!!
        _subtract = phosphorDuotoneIcon(
            name = "Subtract",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 232.000 160.000 C 232.011 198.294 202.046 229.897 163.805 231.920 C 125.565 233.944 92.431 205.681 88.400 167.600 L 88.400 167.600 C 90.925 167.865 93.461 167.998 96.000 168.000 C 135.764 168.000 168.000 135.764 168.000 96.000 C 167.998 93.461 167.865 90.925 167.600 88.400 L 167.600 88.400 C 204.218 92.287 232.001 123.177 232.000 160.000 Z"),
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
        pathData = parseSvgPathData("M 174.630 81.350 C 167.243 41.632 131.402 13.654 91.078 16.129 C 50.755 18.604 18.604 50.755 16.129 91.078 C 13.654 131.402 41.632 167.243 81.350 174.630 C 88.737 214.348 124.578 242.326 164.902 239.851 C 205.225 237.376 237.376 205.225 239.851 164.902 C 242.326 124.578 214.348 88.737 174.630 81.350 ZM 32.000 96.000 C 32.000 60.654 60.654 32.000 96.000 32.000 C 131.346 32.000 160.000 60.654 160.000 96.000 C 160.000 131.346 131.346 160.000 96.000 160.000 C 60.670 159.961 32.039 131.330 32.000 96.000 ZM 160.000 224.000 C 130.781 224.082 105.239 204.308 98.000 176.000 C 140.619 174.912 174.912 140.619 176.000 98.000 C 207.268 106.006 227.682 136.042 223.616 168.062 C 219.550 200.082 192.277 224.064 160.000 224.000 Z"),
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
        return _subtract!!
    }

private var _subtract: ImageVector? = null
