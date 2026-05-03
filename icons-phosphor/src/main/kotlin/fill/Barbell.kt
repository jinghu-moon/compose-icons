package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Barbell: ImageVector
    get() {
        if (_barbell != null) return _barbell!!
        _barbell = phosphorFillIcon(
            name = "Barbell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 64.000 L 200.000 192.000 C 200.000 200.837 192.837 208.000 184.000 208.000 L 168.000 208.000 C 159.163 208.000 152.000 200.837 152.000 192.000 L 152.000 136.000 L 104.000 136.000 L 104.000 192.000 C 104.000 200.837 96.837 208.000 88.000 208.000 L 72.000 208.000 C 63.163 208.000 56.000 200.837 56.000 192.000 L 56.000 64.000 C 56.000 55.163 63.163 48.000 72.000 48.000 L 88.000 48.000 C 96.837 48.000 104.000 55.163 104.000 64.000 L 104.000 120.000 L 152.000 120.000 L 152.000 64.000 C 152.000 55.163 159.163 48.000 168.000 48.000 L 184.000 48.000 C 192.837 48.000 200.000 55.163 200.000 64.000 ZM 36.000 72.000 L 32.000 72.000 C 23.163 72.000 16.000 79.163 16.000 88.000 L 16.000 120.000 L 8.270 120.000 C 3.981 119.937 0.372 123.197 -0.000 127.470 C -0.147 129.682 0.631 131.856 2.147 133.473 C 3.664 135.090 5.783 136.005 8.000 136.000 L 16.000 136.000 L 16.000 168.000 C 16.000 176.837 23.163 184.000 32.000 184.000 L 36.000 184.000 C 38.209 184.000 40.000 182.209 40.000 180.000 L 40.000 76.000 C 40.000 73.791 38.209 72.000 36.000 72.000 ZM 256.000 127.470 C 255.629 123.205 252.031 119.947 247.750 120.000 L 240.000 120.000 L 240.000 88.000 C 240.000 79.163 232.837 72.000 224.000 72.000 L 220.000 72.000 C 217.791 72.000 216.000 73.791 216.000 76.000 L 216.000 180.000 C 216.000 182.209 217.791 184.000 220.000 184.000 L 224.000 184.000 C 232.837 184.000 240.000 176.837 240.000 168.000 L 240.000 136.000 L 248.000 136.000 C 250.217 136.005 252.336 135.090 253.853 133.473 C 255.369 131.856 256.147 129.682 256.000 127.470 Z"),
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
        return _barbell!!
    }

private var _barbell: ImageVector? = null
