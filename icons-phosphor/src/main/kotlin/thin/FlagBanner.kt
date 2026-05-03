package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FlagBanner: ImageVector
    get() {
        if (_flagBanner != null) return _flagBanner!!
        _flagBanner = phosphorThinIcon(
            name = "FlagBanner",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 235.380 53.860 C 234.647 52.702 233.371 52.000 232.000 52.000 L 40.000 52.000 C 38.381 51.999 36.921 52.973 36.302 54.469 C 35.682 55.964 36.025 57.686 37.170 58.830 L 82.340 104.000 L 37.170 149.170 C 36.025 150.314 35.682 152.036 36.302 153.531 C 36.921 155.027 38.381 156.001 40.000 156.000 L 180.000 156.000 L 148.440 222.280 C 147.491 224.274 148.337 226.660 150.330 227.610 C 150.851 227.862 151.421 227.995 152.000 228.000 C 153.542 227.999 154.947 227.112 155.610 225.720 L 235.610 57.720 C 236.202 56.479 236.115 55.022 235.380 53.860 ZM 183.760 148.000 L 49.660 148.000 L 90.830 106.830 C 91.581 106.080 92.003 105.062 92.003 104.000 C 92.003 102.938 91.581 101.920 90.830 101.170 L 49.660 60.000 L 225.660 60.000 Z"),
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
        return _flagBanner!!
    }

private var _flagBanner: ImageVector? = null
