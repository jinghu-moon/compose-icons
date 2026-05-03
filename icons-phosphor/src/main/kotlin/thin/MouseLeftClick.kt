package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MouseLeftClick: ImageVector
    get() {
        if (_mouseLeftClick != null) return _mouseLeftClick!!
        _mouseLeftClick = phosphorThinIcon(
            name = "MouseLeftClick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 144.000 20.000 L 112.000 20.000 C 78.879 20.039 52.039 46.879 52.000 80.000 L 52.000 176.000 C 52.039 209.121 78.879 235.961 112.000 236.000 L 144.000 236.000 C 177.121 235.961 203.961 209.121 204.000 176.000 L 204.000 80.000 C 203.961 46.879 177.121 20.039 144.000 20.000 ZM 196.000 80.000 L 196.000 108.000 L 132.000 108.000 L 132.000 28.000 L 144.000 28.000 C 172.705 28.033 195.967 51.295 196.000 80.000 ZM 124.000 28.000 L 124.000 70.340 L 87.700 34.050 C 95.180 30.069 103.526 27.991 112.000 28.000 ZM 80.780 38.440 L 124.000 81.660 L 124.000 108.000 L 113.660 108.000 L 64.510 58.850 C 68.129 50.785 73.725 43.765 80.780 38.440 ZM 60.000 80.000 C 59.996 75.700 60.530 71.417 61.590 67.250 L 102.340 108.000 L 60.000 108.000 ZM 144.000 228.000 L 112.000 228.000 C 83.295 227.967 60.033 204.705 60.000 176.000 L 60.000 116.000 L 196.000 116.000 L 196.000 176.000 C 195.967 204.705 172.705 227.967 144.000 228.000 Z"),
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
        return _mouseLeftClick!!
    }

private var _mouseLeftClick: ImageVector? = null
