package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowFatDown: ImageVector
    get() {
        if (_arrowFatDown != null) return _arrowFatDown!!
        _arrowFatDown = phosphorThinIcon(
            name = "ArrowFatDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 227.700 134.470 C 227.080 132.974 225.620 131.998 224.000 132.000 L 180.000 132.000 L 180.000 48.000 C 180.000 41.373 174.627 36.000 168.000 36.000 L 88.000 36.000 C 81.373 36.000 76.000 41.373 76.000 48.000 L 76.000 132.000 L 32.000 132.000 C 30.381 131.999 28.921 132.973 28.302 134.469 C 27.682 135.964 28.025 137.686 29.170 138.830 L 125.170 234.830 C 125.920 235.581 126.938 236.003 128.000 236.003 C 129.062 236.003 130.080 235.581 130.830 234.830 L 226.830 138.830 C 227.975 137.687 228.319 135.965 227.700 134.470 ZM 128.000 226.340 L 41.660 140.000 L 80.000 140.000 C 82.209 140.000 84.000 138.209 84.000 136.000 L 84.000 48.000 C 84.000 45.791 85.791 44.000 88.000 44.000 L 168.000 44.000 C 170.209 44.000 172.000 45.791 172.000 48.000 L 172.000 136.000 C 172.000 138.209 173.791 140.000 176.000 140.000 L 214.340 140.000 Z"),
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
        return _arrowFatDown!!
    }

private var _arrowFatDown: ImageVector? = null
