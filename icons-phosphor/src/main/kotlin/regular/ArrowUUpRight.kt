package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowUUpRight: ImageVector
    get() {
        if (_arrowUUpRight != null) return _arrowUUpRight!!
        _arrowUUpRight = phosphorRegularIcon(
            name = "ArrowUUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 170.340 130.340 L 204.690 96.000 L 88.000 96.000 C 61.490 96.000 40.000 117.490 40.000 144.000 C 40.000 170.510 61.490 192.000 88.000 192.000 L 176.000 192.000 C 180.418 192.000 184.000 195.582 184.000 200.000 C 184.000 204.418 180.418 208.000 176.000 208.000 L 88.000 208.000 C 52.654 208.000 24.000 179.346 24.000 144.000 C 24.000 108.654 52.654 80.000 88.000 80.000 L 204.690 80.000 L 170.340 45.660 C 167.214 42.534 167.214 37.466 170.340 34.340 C 173.466 31.214 178.534 31.214 181.660 34.340 L 229.660 82.340 C 231.162 83.841 232.006 85.877 232.006 88.000 C 232.006 90.123 231.162 92.159 229.660 93.660 L 181.660 141.660 C 178.534 144.786 173.466 144.786 170.340 141.660 C 167.214 138.534 167.214 133.466 170.340 130.340 Z"),
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
        return _arrowUUpRight!!
    }

private var _arrowUUpRight: ImageVector? = null
