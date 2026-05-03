package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MouseScroll: ImageVector
    get() {
        if (_mouseScroll != null) return _mouseScroll!!
        _mouseScroll = phosphorRegularIcon(
            name = "MouseScroll",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 144.000 16.000 L 112.000 16.000 C 76.670 16.039 48.039 44.670 48.000 80.000 L 48.000 176.000 C 48.039 211.330 76.670 239.961 112.000 240.000 L 144.000 240.000 C 179.330 239.961 207.961 211.330 208.000 176.000 L 208.000 80.000 C 207.961 44.670 179.330 16.039 144.000 16.000 ZM 192.000 176.000 C 191.972 202.498 170.498 223.972 144.000 224.000 L 112.000 224.000 C 85.502 223.972 64.028 202.498 64.000 176.000 L 64.000 80.000 C 64.028 53.502 85.502 32.028 112.000 32.000 L 144.000 32.000 C 170.498 32.028 191.972 53.502 192.000 80.000 ZM 136.000 83.310 L 136.000 172.690 L 146.340 162.340 C 149.466 159.214 154.534 159.214 157.660 162.340 C 160.786 165.466 160.786 170.534 157.660 173.660 L 133.660 197.660 C 132.159 199.162 130.123 200.006 128.000 200.006 C 125.877 200.006 123.841 199.162 122.340 197.660 L 98.340 173.660 C 95.214 170.534 95.214 165.466 98.340 162.340 C 101.466 159.214 106.534 159.214 109.660 162.340 L 120.000 172.690 L 120.000 83.310 L 109.660 93.660 C 106.534 96.786 101.466 96.786 98.340 93.660 C 95.214 90.534 95.214 85.466 98.340 82.340 L 122.340 58.340 C 123.841 56.838 125.877 55.994 128.000 55.994 C 130.123 55.994 132.159 56.838 133.660 58.340 L 157.660 82.340 C 160.786 85.466 160.786 90.534 157.660 93.660 C 154.534 96.786 149.466 96.786 146.340 93.660 Z"),
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
