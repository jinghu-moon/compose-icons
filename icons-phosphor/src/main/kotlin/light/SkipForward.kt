package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SkipForward: ImageVector
    get() {
        if (_skipForward != null) return _skipForward!!
        _skipForward = phosphorLightIcon(
            name = "SkipForward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 34.000 C 196.686 34.000 194.000 36.686 194.000 40.000 L 194.000 112.840 L 71.370 36.140 C 67.053 33.442 61.612 33.301 57.160 35.770 C 52.723 38.178 49.971 42.832 50.000 47.880 L 50.000 208.120 C 49.971 213.168 52.723 217.822 57.160 220.230 C 61.612 222.699 67.053 222.558 71.370 219.860 L 194.000 143.170 L 194.000 216.000 C 194.000 219.314 196.686 222.000 200.000 222.000 C 203.314 222.000 206.000 219.314 206.000 216.000 L 206.000 40.000 C 206.000 36.686 203.314 34.000 200.000 34.000 ZM 193.120 129.560 L 65.000 209.690 C 64.390 210.063 63.628 210.082 63.000 209.740 C 62.383 209.437 61.995 208.807 62.000 208.120 L 62.000 47.880 C 61.995 47.193 62.383 46.563 63.000 46.260 C 63.306 46.091 63.650 46.002 64.000 46.000 C 64.355 46.013 64.700 46.120 65.000 46.310 L 193.120 126.440 C 193.668 126.769 194.003 127.361 194.003 128.000 C 194.003 128.639 193.668 129.231 193.120 129.560 Z"),
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
        return _skipForward!!
    }

private var _skipForward: ImageVector? = null
