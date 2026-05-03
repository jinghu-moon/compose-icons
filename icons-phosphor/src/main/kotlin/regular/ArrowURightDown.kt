package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowURightDown: ImageVector
    get() {
        if (_arrowURightDown != null) return _arrowURightDown!!
        _arrowURightDown = phosphorRegularIcon(
            name = "ArrowURightDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 221.660 181.660 L 173.660 229.660 C 172.159 231.162 170.123 232.006 168.000 232.006 C 165.877 232.006 163.841 231.162 162.340 229.660 L 114.340 181.660 C 111.214 178.534 111.214 173.466 114.340 170.340 C 117.466 167.214 122.534 167.214 125.660 170.340 L 160.000 204.690 L 160.000 88.000 C 160.000 61.490 138.510 40.000 112.000 40.000 C 85.490 40.000 64.000 61.490 64.000 88.000 L 64.000 176.000 C 64.000 180.418 60.418 184.000 56.000 184.000 C 51.582 184.000 48.000 180.418 48.000 176.000 L 48.000 88.000 C 48.000 52.654 76.654 24.000 112.000 24.000 C 147.346 24.000 176.000 52.654 176.000 88.000 L 176.000 204.690 L 210.340 170.340 C 213.466 167.214 218.534 167.214 221.660 170.340 C 224.786 173.466 224.786 178.534 221.660 181.660 Z"),
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
        return _arrowURightDown!!
    }

private var _arrowURightDown: ImageVector? = null
