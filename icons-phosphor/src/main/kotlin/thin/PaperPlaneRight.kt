package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PaperPlaneRight: ImageVector
    get() {
        if (_paperPlaneRight != null) return _paperPlaneRight!!
        _paperPlaneRight = phosphorThinIcon(
            name = "PaperPlaneRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 229.890 117.430 L 61.890 21.550 C 57.534 19.107 52.121 19.617 48.298 22.830 C 44.475 26.044 43.042 31.289 44.700 36.000 L 75.780 128.000 L 44.710 220.000 C 43.413 223.669 43.975 227.739 46.219 230.919 C 48.462 234.098 52.109 235.992 56.000 236.000 C 58.079 235.993 60.120 235.453 61.930 234.430 L 229.870 138.350 C 233.650 136.225 235.989 132.226 235.989 127.890 C 235.989 123.554 233.650 119.555 229.870 117.430 ZM 225.890 131.430 L 58.000 227.470 C 56.546 228.282 54.741 228.108 53.469 227.034 C 52.197 225.960 51.723 224.209 52.280 222.640 L 52.280 222.570 L 82.870 132.000 L 144.000 132.000 C 146.209 132.000 148.000 130.209 148.000 128.000 C 148.000 125.791 146.209 124.000 144.000 124.000 L 82.870 124.000 L 52.260 33.370 C 51.678 31.811 52.152 30.054 53.440 29.000 C 54.154 28.384 55.058 28.031 56.000 28.000 C 56.680 28.008 57.345 28.194 57.930 28.540 L 225.930 124.410 C 227.203 125.114 227.994 126.455 227.994 127.910 C 227.994 129.365 227.203 130.706 225.930 131.410 Z"),
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
        return _paperPlaneRight!!
    }

private var _paperPlaneRight: ImageVector? = null
