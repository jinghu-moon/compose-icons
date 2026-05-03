package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MouseScroll: ImageVector
    get() {
        if (_mouseScroll != null) return _mouseScroll!!
        _mouseScroll = phosphorThinIcon(
            name = "MouseScroll",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 144.000 20.000 L 112.000 20.000 C 78.879 20.039 52.039 46.879 52.000 80.000 L 52.000 176.000 C 52.039 209.121 78.879 235.961 112.000 236.000 L 144.000 236.000 C 177.121 235.961 203.961 209.121 204.000 176.000 L 204.000 80.000 C 203.961 46.879 177.121 20.039 144.000 20.000 ZM 196.000 176.000 C 195.967 204.705 172.705 227.967 144.000 228.000 L 112.000 228.000 C 83.295 227.967 60.033 204.705 60.000 176.000 L 60.000 80.000 C 60.033 51.295 83.295 28.033 112.000 28.000 L 144.000 28.000 C 172.705 28.033 195.967 51.295 196.000 80.000 ZM 132.000 73.660 L 132.000 182.340 L 149.170 165.170 C 150.733 163.607 153.267 163.607 154.830 165.170 C 156.393 166.733 156.393 169.267 154.830 170.830 L 130.830 194.830 C 130.080 195.581 129.062 196.003 128.000 196.003 C 126.938 196.003 125.920 195.581 125.170 194.830 L 101.170 170.830 C 99.607 169.267 99.607 166.733 101.170 165.170 C 102.733 163.607 105.267 163.607 106.830 165.170 L 124.000 182.340 L 124.000 73.660 L 106.830 90.830 C 105.267 92.393 102.733 92.393 101.170 90.830 C 99.607 89.267 99.607 86.733 101.170 85.170 L 125.170 61.170 C 125.920 60.419 126.938 59.997 128.000 59.997 C 129.062 59.997 130.080 60.419 130.830 61.170 L 154.830 85.170 C 156.393 86.733 156.393 89.267 154.830 90.830 C 153.267 92.393 150.733 92.393 149.170 90.830 Z"),
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
        return _mouseScroll!!
    }

private var _mouseScroll: ImageVector? = null
