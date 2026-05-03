package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Subtract: ImageVector
    get() {
        if (_subtract != null) return _subtract!!
        _subtract = phosphorFillIcon(
            name = "Subtract",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 174.630 81.350 C 167.243 41.632 131.402 13.654 91.078 16.129 C 50.755 18.604 18.604 50.755 16.129 91.078 C 13.654 131.402 41.632 167.243 81.350 174.630 C 88.737 214.348 124.578 242.326 164.902 239.851 C 205.225 237.376 237.376 205.225 239.851 164.902 C 242.326 124.578 214.348 88.737 174.630 81.350 ZM 96.000 160.000 C 60.654 160.000 32.000 131.346 32.000 96.000 C 32.000 60.654 60.654 32.000 96.000 32.000 C 131.346 32.000 160.000 60.654 160.000 96.000 C 159.961 131.330 131.330 159.961 96.000 160.000 Z"),
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
