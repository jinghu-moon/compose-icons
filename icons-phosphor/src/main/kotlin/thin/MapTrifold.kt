package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MapTrifold: ImageVector
    get() {
        if (_mapTrifold != null) return _mapTrifold!!
        _mapTrifold = phosphorThinIcon(
            name = "MapTrifold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 226.460 52.850 C 225.490 52.092 224.225 51.822 223.030 52.120 L 160.470 67.760 L 97.790 36.420 C 96.935 35.994 95.956 35.887 95.030 36.120 L 31.030 52.120 C 29.249 52.565 28.000 54.165 28.000 56.000 L 28.000 200.000 C 27.998 201.238 28.569 202.408 29.548 203.167 C 30.526 203.926 31.801 204.190 33.000 203.880 L 95.560 188.240 L 158.240 219.580 C 159.095 220.006 160.074 220.113 161.000 219.880 L 225.000 203.880 C 226.769 203.423 228.003 201.827 228.000 200.000 L 228.000 56.000 C 227.999 54.769 227.431 53.607 226.460 52.850 ZM 100.000 46.470 L 156.000 74.470 L 156.000 209.530 L 100.000 181.530 ZM 36.000 59.120 L 92.000 45.120 L 92.000 180.880 L 36.000 194.880 ZM 220.000 196.880 L 164.000 210.880 L 164.000 75.120 L 220.000 61.120 Z"),
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
        return _mapTrifold!!
    }

private var _mapTrifold: ImageVector? = null
