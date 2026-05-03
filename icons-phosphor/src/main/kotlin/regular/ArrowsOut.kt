package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowsOut: ImageVector
    get() {
        if (_arrowsOut != null) return _arrowsOut!!
        _arrowsOut = phosphorRegularIcon(
            name = "ArrowsOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 48.000 L 216.000 96.000 C 216.000 100.418 212.418 104.000 208.000 104.000 C 203.582 104.000 200.000 100.418 200.000 96.000 L 200.000 67.310 L 157.660 109.660 C 154.534 112.786 149.466 112.786 146.340 109.660 C 143.214 106.534 143.214 101.466 146.340 98.340 L 188.690 56.000 L 160.000 56.000 C 155.582 56.000 152.000 52.418 152.000 48.000 C 152.000 43.582 155.582 40.000 160.000 40.000 L 208.000 40.000 C 212.418 40.000 216.000 43.582 216.000 48.000 ZM 98.340 146.340 L 56.000 188.690 L 56.000 160.000 C 56.000 155.582 52.418 152.000 48.000 152.000 C 43.582 152.000 40.000 155.582 40.000 160.000 L 40.000 208.000 C 40.000 212.418 43.582 216.000 48.000 216.000 L 96.000 216.000 C 100.418 216.000 104.000 212.418 104.000 208.000 C 104.000 203.582 100.418 200.000 96.000 200.000 L 67.310 200.000 L 109.660 157.660 C 112.786 154.534 112.786 149.466 109.660 146.340 C 106.534 143.214 101.466 143.214 98.340 146.340 ZM 208.000 152.000 C 203.582 152.000 200.000 155.582 200.000 160.000 L 200.000 188.690 L 157.660 146.340 C 154.534 143.214 149.466 143.214 146.340 146.340 C 143.214 149.466 143.214 154.534 146.340 157.660 L 188.690 200.000 L 160.000 200.000 C 155.582 200.000 152.000 203.582 152.000 208.000 C 152.000 212.418 155.582 216.000 160.000 216.000 L 208.000 216.000 C 212.418 216.000 216.000 212.418 216.000 208.000 L 216.000 160.000 C 216.000 155.582 212.418 152.000 208.000 152.000 ZM 67.310 56.000 L 96.000 56.000 C 100.418 56.000 104.000 52.418 104.000 48.000 C 104.000 43.582 100.418 40.000 96.000 40.000 L 48.000 40.000 C 43.582 40.000 40.000 43.582 40.000 48.000 L 40.000 96.000 C 40.000 100.418 43.582 104.000 48.000 104.000 C 52.418 104.000 56.000 100.418 56.000 96.000 L 56.000 67.310 L 98.340 109.660 C 101.466 112.786 106.534 112.786 109.660 109.660 C 112.786 106.534 112.786 101.466 109.660 98.340 Z"),
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
        return _arrowsOut!!
    }

private var _arrowsOut: ImageVector? = null
