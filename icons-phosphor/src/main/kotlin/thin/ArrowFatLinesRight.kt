package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowFatLinesRight: ImageVector
    get() {
        if (_arrowFatLinesRight != null) return _arrowFatLinesRight!!
        _arrowFatLinesRight = phosphorThinIcon(
            name = "ArrowFatLinesRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 234.830 125.170 L 138.830 29.170 C 137.686 28.025 135.964 27.682 134.469 28.302 C 132.973 28.921 131.999 30.381 132.000 32.000 L 132.000 76.000 L 104.000 76.000 C 101.791 76.000 100.000 77.791 100.000 80.000 L 100.000 176.000 C 100.000 178.209 101.791 180.000 104.000 180.000 L 132.000 180.000 L 132.000 224.000 C 131.998 225.620 132.974 227.080 134.470 227.700 C 135.965 228.319 137.687 227.975 138.830 226.830 L 234.830 130.830 C 235.581 130.080 236.003 129.062 236.003 128.000 C 236.003 126.938 235.581 125.920 234.830 125.170 ZM 140.000 214.340 L 140.000 176.000 C 140.000 173.791 138.209 172.000 136.000 172.000 L 108.000 172.000 L 108.000 84.000 L 136.000 84.000 C 138.209 84.000 140.000 82.209 140.000 80.000 L 140.000 41.660 L 226.340 128.000 ZM 44.000 80.000 L 44.000 176.000 C 44.000 178.209 42.209 180.000 40.000 180.000 C 37.791 180.000 36.000 178.209 36.000 176.000 L 36.000 80.000 C 36.000 77.791 37.791 76.000 40.000 76.000 C 42.209 76.000 44.000 77.791 44.000 80.000 ZM 76.000 80.000 L 76.000 176.000 C 76.000 178.209 74.209 180.000 72.000 180.000 C 69.791 180.000 68.000 178.209 68.000 176.000 L 68.000 80.000 C 68.000 77.791 69.791 76.000 72.000 76.000 C 74.209 76.000 76.000 77.791 76.000 80.000 Z"),
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
        return _arrowFatLinesRight!!
    }

private var _arrowFatLinesRight: ImageVector? = null
