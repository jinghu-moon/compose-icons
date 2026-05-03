package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowsDownUp: ImageVector
    get() {
        if (_arrowsDownUp != null) return _arrowsDownUp!!
        _arrowsDownUp = phosphorRegularIcon(
            name = "ArrowsDownUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 117.660 170.340 C 119.162 171.841 120.006 173.877 120.006 176.000 C 120.006 178.123 119.162 180.159 117.660 181.660 L 85.660 213.660 C 84.159 215.162 82.123 216.006 80.000 216.006 C 77.877 216.006 75.841 215.162 74.340 213.660 L 42.340 181.660 C 39.214 178.534 39.214 173.466 42.340 170.340 C 45.466 167.214 50.534 167.214 53.660 170.340 L 72.000 188.690 L 72.000 48.000 C 72.000 43.582 75.582 40.000 80.000 40.000 C 84.418 40.000 88.000 43.582 88.000 48.000 L 88.000 188.690 L 106.340 170.340 C 107.841 168.838 109.877 167.994 112.000 167.994 C 114.123 167.994 116.159 168.838 117.660 170.340 ZM 213.660 74.340 L 181.660 42.340 C 180.159 40.838 178.123 39.994 176.000 39.994 C 173.877 39.994 171.841 40.838 170.340 42.340 L 138.340 74.340 C 135.214 77.466 135.214 82.534 138.340 85.660 C 141.466 88.786 146.534 88.786 149.660 85.660 L 168.000 67.310 L 168.000 208.000 C 168.000 212.418 171.582 216.000 176.000 216.000 C 180.418 216.000 184.000 212.418 184.000 208.000 L 184.000 67.310 L 202.340 85.660 C 205.466 88.786 210.534 88.786 213.660 85.660 C 216.786 82.534 216.786 77.466 213.660 74.340 Z"),
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
        return _arrowsDownUp!!
    }

private var _arrowsDownUp: ImageVector? = null
