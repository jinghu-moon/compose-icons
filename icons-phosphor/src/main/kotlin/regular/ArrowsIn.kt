package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowsIn: ImageVector
    get() {
        if (_arrowsIn != null) return _arrowsIn!!
        _arrowsIn = phosphorRegularIcon(
            name = "ArrowsIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 144.000 104.000 L 144.000 64.000 C 144.000 59.582 147.582 56.000 152.000 56.000 C 156.418 56.000 160.000 59.582 160.000 64.000 L 160.000 84.690 L 202.340 42.340 C 205.466 39.214 210.534 39.214 213.660 42.340 C 216.786 45.466 216.786 50.534 213.660 53.660 L 171.310 96.000 L 192.000 96.000 C 196.418 96.000 200.000 99.582 200.000 104.000 C 200.000 108.418 196.418 112.000 192.000 112.000 L 152.000 112.000 C 147.582 112.000 144.000 108.418 144.000 104.000 ZM 104.000 144.000 L 64.000 144.000 C 59.582 144.000 56.000 147.582 56.000 152.000 C 56.000 156.418 59.582 160.000 64.000 160.000 L 84.690 160.000 L 42.340 202.340 C 39.214 205.466 39.214 210.534 42.340 213.660 C 45.466 216.786 50.534 216.786 53.660 213.660 L 96.000 171.310 L 96.000 192.000 C 96.000 196.418 99.582 200.000 104.000 200.000 C 108.418 200.000 112.000 196.418 112.000 192.000 L 112.000 152.000 C 112.000 147.582 108.418 144.000 104.000 144.000 ZM 171.310 160.000 L 192.000 160.000 C 196.418 160.000 200.000 156.418 200.000 152.000 C 200.000 147.582 196.418 144.000 192.000 144.000 L 152.000 144.000 C 147.582 144.000 144.000 147.582 144.000 152.000 L 144.000 192.000 C 144.000 196.418 147.582 200.000 152.000 200.000 C 156.418 200.000 160.000 196.418 160.000 192.000 L 160.000 171.310 L 202.340 213.660 C 205.466 216.786 210.534 216.786 213.660 213.660 C 216.786 210.534 216.786 205.466 213.660 202.340 ZM 104.000 56.000 C 99.582 56.000 96.000 59.582 96.000 64.000 L 96.000 84.690 L 53.660 42.340 C 50.534 39.214 45.466 39.214 42.340 42.340 C 39.214 45.466 39.214 50.534 42.340 53.660 L 84.690 96.000 L 64.000 96.000 C 59.582 96.000 56.000 99.582 56.000 104.000 C 56.000 108.418 59.582 112.000 64.000 112.000 L 104.000 112.000 C 108.418 112.000 112.000 108.418 112.000 104.000 L 112.000 64.000 C 112.000 59.582 108.418 56.000 104.000 56.000 Z"),
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
        return _arrowsIn!!
    }

private var _arrowsIn: ImageVector? = null
