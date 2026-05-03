package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SkipBack: ImageVector
    get() {
        if (_skipBack != null) return _skipBack!!
        _skipBack = phosphorLightIcon(
            name = "SkipBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 198.840 35.770 C 194.388 33.301 188.947 33.442 184.630 36.140 L 62.000 112.830 L 62.000 40.000 C 62.000 36.686 59.314 34.000 56.000 34.000 C 52.686 34.000 50.000 36.686 50.000 40.000 L 50.000 216.000 C 50.000 219.314 52.686 222.000 56.000 222.000 C 59.314 222.000 62.000 219.314 62.000 216.000 L 62.000 143.160 L 184.630 219.860 C 188.947 222.558 194.388 222.699 198.840 220.230 C 203.277 217.822 206.029 213.168 206.000 208.120 L 206.000 47.880 C 206.029 42.832 203.277 38.178 198.840 35.770 ZM 194.000 208.120 C 194.005 208.807 193.617 209.437 193.000 209.740 C 192.372 210.082 191.610 210.063 191.000 209.690 L 62.880 129.560 C 62.332 129.231 61.997 128.639 61.997 128.000 C 61.997 127.361 62.332 126.769 62.880 126.440 L 191.000 46.310 C 191.300 46.120 191.645 46.013 192.000 46.000 C 192.350 46.002 192.694 46.091 193.000 46.260 C 193.617 46.563 194.005 47.193 194.000 47.880 Z"),
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
        return _skipBack!!
    }

private var _skipBack: ImageVector? = null
