package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FlagBannerFold: ImageVector
    get() {
        if (_flagBannerFold != null) return _flagBannerFold!!
        _flagBannerFold = phosphorLightIcon(
            name = "FlagBannerFold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 237.000 44.750 C 235.904 43.049 234.024 42.015 232.000 42.000 L 152.000 42.000 C 149.647 42.001 147.512 43.378 146.540 45.520 L 137.230 66.000 L 28.000 66.000 C 25.640 66.013 23.506 67.408 22.548 69.565 C 21.590 71.722 21.986 74.241 23.560 76.000 L 59.890 116.000 L 23.560 156.000 C 21.986 157.759 21.590 160.278 22.548 162.435 C 23.506 164.592 25.640 165.987 28.000 166.000 L 101.090 166.000 C 103.443 165.999 105.578 164.622 106.550 162.480 L 115.860 142.000 L 182.680 142.000 L 146.540 221.520 C 145.884 222.971 145.832 224.622 146.395 226.112 C 146.958 227.601 148.089 228.805 149.540 229.460 C 150.312 229.815 151.151 229.999 152.000 230.000 C 154.353 229.999 156.488 228.622 157.460 226.480 L 237.460 50.480 C 238.291 48.616 238.118 46.457 237.000 44.750 ZM 97.230 154.000 L 41.560 154.000 L 72.440 120.000 C 74.525 117.710 74.525 114.210 72.440 111.920 L 41.560 78.000 L 131.770 78.000 ZM 188.140 130.000 L 121.320 130.000 L 155.860 54.000 L 222.680 54.000 Z"),
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
        return _flagBannerFold!!
    }

private var _flagBannerFold: ImageVector? = null
