package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowsInSimple: ImageVector
    get() {
        if (_arrowsInSimple != null) return _arrowsInSimple!!
        _arrowsInSimple = phosphorRegularIcon(
            name = "ArrowsInSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 213.660 53.660 L 163.310 104.000 L 192.000 104.000 C 196.418 104.000 200.000 107.582 200.000 112.000 C 200.000 116.418 196.418 120.000 192.000 120.000 L 144.000 120.000 C 139.582 120.000 136.000 116.418 136.000 112.000 L 136.000 64.000 C 136.000 59.582 139.582 56.000 144.000 56.000 C 148.418 56.000 152.000 59.582 152.000 64.000 L 152.000 92.690 L 202.340 42.340 C 205.466 39.214 210.534 39.214 213.660 42.340 C 216.786 45.466 216.786 50.534 213.660 53.660 ZM 112.000 136.000 L 64.000 136.000 C 59.582 136.000 56.000 139.582 56.000 144.000 C 56.000 148.418 59.582 152.000 64.000 152.000 L 92.690 152.000 L 42.340 202.340 C 39.214 205.466 39.214 210.534 42.340 213.660 C 45.466 216.786 50.534 216.786 53.660 213.660 L 104.000 163.310 L 104.000 192.000 C 104.000 196.418 107.582 200.000 112.000 200.000 C 116.418 200.000 120.000 196.418 120.000 192.000 L 120.000 144.000 C 120.000 139.582 116.418 136.000 112.000 136.000 Z"),
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
        return _arrowsInSimple!!
    }

private var _arrowsInSimple: ImageVector? = null
