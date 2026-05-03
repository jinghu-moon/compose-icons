package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsOutSimple: ImageVector
    get() {
        if (_arrowsOutSimple != null) return _arrowsOutSimple!!
        _arrowsOutSimple = phosphorFillIcon(
            name = "ArrowsOutSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 117.660 138.340 C 119.162 139.841 120.006 141.877 120.006 144.000 C 120.006 146.123 119.162 148.159 117.660 149.660 L 83.310 184.000 L 101.660 202.340 C 103.951 204.628 104.636 208.071 103.397 211.062 C 102.158 214.053 99.238 216.003 96.000 216.000 L 48.000 216.000 C 43.582 216.000 40.000 212.418 40.000 208.000 L 40.000 160.000 C 39.997 156.762 41.947 153.842 44.938 152.603 C 47.929 151.364 51.372 152.049 53.660 154.340 L 72.000 172.690 L 106.340 138.340 C 107.841 136.838 109.877 135.994 112.000 135.994 C 114.123 135.994 116.159 136.838 117.660 138.340 ZM 208.000 40.000 L 160.000 40.000 C 156.762 39.997 153.842 41.947 152.603 44.938 C 151.364 47.929 152.049 51.372 154.340 53.660 L 172.690 72.000 L 138.340 106.340 C 135.214 109.466 135.214 114.534 138.340 117.660 C 141.466 120.786 146.534 120.786 149.660 117.660 L 184.000 83.310 L 202.340 101.660 C 204.628 103.951 208.071 104.636 211.062 103.397 C 214.053 102.158 216.003 99.238 216.000 96.000 L 216.000 48.000 C 216.000 43.582 212.418 40.000 208.000 40.000 Z"),
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
        return _arrowsOutSimple!!
    }

private var _arrowsOutSimple: ImageVector? = null
