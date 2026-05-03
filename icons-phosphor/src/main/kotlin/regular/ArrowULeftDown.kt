package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowULeftDown: ImageVector
    get() {
        if (_arrowULeftDown != null) return _arrowULeftDown!!
        _arrowULeftDown = phosphorRegularIcon(
            name = "ArrowULeftDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 88.000 L 208.000 176.000 C 208.000 180.418 204.418 184.000 200.000 184.000 C 195.582 184.000 192.000 180.418 192.000 176.000 L 192.000 88.000 C 192.000 61.490 170.510 40.000 144.000 40.000 C 117.490 40.000 96.000 61.490 96.000 88.000 L 96.000 204.690 L 130.340 170.340 C 133.466 167.214 138.534 167.214 141.660 170.340 C 144.786 173.466 144.786 178.534 141.660 181.660 L 93.660 229.660 C 92.159 231.162 90.123 232.006 88.000 232.006 C 85.877 232.006 83.841 231.162 82.340 229.660 L 34.340 181.660 C 31.214 178.534 31.214 173.466 34.340 170.340 C 37.466 167.214 42.534 167.214 45.660 170.340 L 80.000 204.690 L 80.000 88.000 C 80.000 52.654 108.654 24.000 144.000 24.000 C 179.346 24.000 208.000 52.654 208.000 88.000 Z"),
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
        return _arrowULeftDown!!
    }

private var _arrowULeftDown: ImageVector? = null
