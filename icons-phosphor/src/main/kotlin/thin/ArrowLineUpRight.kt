package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowLineUpRight: ImageVector
    get() {
        if (_arrowLineUpRight != null) return _arrowLineUpRight!!
        _arrowLineUpRight = phosphorThinIcon(
            name = "ArrowLineUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 220.000 216.000 C 220.000 218.209 218.209 220.000 216.000 220.000 L 40.000 220.000 C 37.791 220.000 36.000 218.209 36.000 216.000 C 36.000 213.791 37.791 212.000 40.000 212.000 L 216.000 212.000 C 218.209 212.000 220.000 213.791 220.000 216.000 ZM 80.000 172.000 C 81.061 172.001 82.079 171.580 82.830 170.830 L 188.000 65.660 L 188.000 152.000 C 188.000 154.209 189.791 156.000 192.000 156.000 C 194.209 156.000 196.000 154.209 196.000 152.000 L 196.000 56.000 C 196.000 53.791 194.209 52.000 192.000 52.000 L 96.000 52.000 C 93.791 52.000 92.000 53.791 92.000 56.000 C 92.000 58.209 93.791 60.000 96.000 60.000 L 182.340 60.000 L 77.170 165.170 C 76.025 166.314 75.682 168.036 76.302 169.531 C 76.921 171.027 78.381 172.001 80.000 172.000 Z"),
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
        return _arrowLineUpRight!!
    }

private var _arrowLineUpRight: ImageVector? = null
