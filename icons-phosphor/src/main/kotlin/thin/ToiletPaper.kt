package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ToiletPaper: ImageVector
    get() {
        if (_toiletPaper != null) return _toiletPaper!!
        _toiletPaper = phosphorThinIcon(
            name = "ToiletPaper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 72.000 120.000 C 72.000 124.418 68.418 128.000 64.000 128.000 C 59.582 128.000 56.000 124.418 56.000 120.000 C 56.000 115.582 59.582 112.000 64.000 112.000 C 68.418 112.000 72.000 115.582 72.000 120.000 ZM 236.000 120.000 L 236.000 208.000 C 236.000 214.627 230.627 220.000 224.000 220.000 L 112.000 220.000 C 105.373 220.000 100.000 214.627 100.000 208.000 L 100.000 168.860 C 92.100 190.260 79.000 204.000 64.000 204.000 C 39.330 204.000 20.000 167.100 20.000 120.000 C 20.000 72.900 39.330 36.000 64.000 36.000 L 192.000 36.000 C 216.670 36.000 236.000 72.900 236.000 120.000 ZM 100.000 120.000 C 100.000 78.800 83.510 44.000 64.000 44.000 C 44.490 44.000 28.000 78.800 28.000 120.000 C 28.000 161.200 44.490 196.000 64.000 196.000 C 83.510 196.000 100.000 161.200 100.000 120.000 ZM 228.000 208.000 L 228.000 124.000 L 208.000 124.000 C 205.791 124.000 204.000 122.209 204.000 120.000 C 204.000 117.791 205.791 116.000 208.000 116.000 L 228.000 116.000 C 227.000 76.580 210.930 44.000 192.050 44.000 L 83.050 44.000 C 97.340 56.800 107.190 83.760 107.950 116.000 L 127.950 116.000 C 130.159 116.000 131.950 117.791 131.950 120.000 C 131.950 122.209 130.159 124.000 127.950 124.000 L 108.000 124.000 L 108.000 208.000 C 108.000 210.209 109.791 212.000 112.000 212.000 L 224.000 212.000 C 226.209 212.000 228.000 210.209 228.000 208.000 ZM 176.000 116.000 L 160.000 116.000 C 157.791 116.000 156.000 117.791 156.000 120.000 C 156.000 122.209 157.791 124.000 160.000 124.000 L 176.000 124.000 C 178.209 124.000 180.000 122.209 180.000 120.000 C 180.000 117.791 178.209 116.000 176.000 116.000 Z"),
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
        return _toiletPaper!!
    }

private var _toiletPaper: ImageVector? = null
