package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MapPinSimple: ImageVector
    get() {
        if (_mapPinSimple != null) return _mapPinSimple!!
        _mapPinSimple = phosphorThinIcon(
            name = "MapPinSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 180.000 72.000 C 180.009 43.799 157.537 20.731 129.345 20.001 C 101.154 19.272 77.519 41.147 76.069 69.311 C 74.619 97.474 95.883 121.661 124.000 123.830 L 124.000 232.000 C 124.000 234.209 125.791 236.000 128.000 236.000 C 130.209 236.000 132.000 234.209 132.000 232.000 L 132.000 123.830 C 159.069 121.717 179.968 99.152 180.000 72.000 ZM 128.000 116.000 C 103.699 116.000 84.000 96.301 84.000 72.000 C 84.000 47.699 103.699 28.000 128.000 28.000 C 152.301 28.000 172.000 47.699 172.000 72.000 C 171.972 96.289 152.289 115.972 128.000 116.000 Z"),
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
        return _mapPinSimple!!
    }

private var _mapPinSimple: ImageVector? = null
