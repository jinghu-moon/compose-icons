package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PaintBrushBroad: ImageVector
    get() {
        if (_paintBrushBroad != null) return _paintBrushBroad!!
        _paintBrushBroad = phosphorRegularIcon(
            name = "PaintBrushBroad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 24.000 L 72.000 24.000 C 49.909 24.000 32.000 41.909 32.000 64.000 L 32.000 136.000 C 32.000 149.255 42.745 160.000 56.000 160.000 L 104.000 160.000 L 96.110 206.670 C 96.038 207.110 96.001 207.554 96.000 208.000 C 96.000 225.673 110.327 240.000 128.000 240.000 C 145.673 240.000 160.000 225.673 160.000 208.000 C 159.999 207.554 159.962 207.110 159.890 206.670 L 152.000 160.000 L 200.000 160.000 C 213.255 160.000 224.000 149.255 224.000 136.000 L 224.000 32.000 C 224.000 27.582 220.418 24.000 216.000 24.000 ZM 72.000 40.000 L 176.000 40.000 L 176.000 80.000 C 176.000 84.418 179.582 88.000 184.000 88.000 C 188.418 88.000 192.000 84.418 192.000 80.000 L 192.000 40.000 L 208.000 40.000 L 208.000 104.000 L 48.000 104.000 L 48.000 64.000 C 48.000 50.745 58.745 40.000 72.000 40.000 ZM 200.000 144.000 L 152.000 144.000 C 147.362 144.000 142.952 146.012 139.913 149.516 C 136.874 153.019 135.505 157.669 136.160 162.260 L 136.160 162.460 L 144.000 208.600 C 144.000 217.437 136.837 224.600 128.000 224.600 C 119.163 224.600 112.000 217.437 112.000 208.600 L 119.800 162.460 L 119.800 162.260 C 120.454 157.676 119.090 153.033 116.060 149.531 C 113.030 146.029 108.631 144.011 104.000 144.000 L 56.000 144.000 C 51.582 144.000 48.000 140.418 48.000 136.000 L 48.000 120.000 L 208.000 120.000 L 208.000 136.000 C 208.000 140.418 204.418 144.000 200.000 144.000 Z"),
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
        return _paintBrushBroad!!
    }

private var _paintBrushBroad: ImageVector? = null
