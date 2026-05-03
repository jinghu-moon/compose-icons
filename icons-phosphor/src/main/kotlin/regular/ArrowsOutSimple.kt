package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowsOutSimple: ImageVector
    get() {
        if (_arrowsOutSimple != null) return _arrowsOutSimple!!
        _arrowsOutSimple = phosphorRegularIcon(
            name = "ArrowsOutSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 48.000 L 216.000 96.000 C 216.000 100.418 212.418 104.000 208.000 104.000 C 203.582 104.000 200.000 100.418 200.000 96.000 L 200.000 67.310 L 149.660 117.660 C 146.534 120.786 141.466 120.786 138.340 117.660 C 135.214 114.534 135.214 109.466 138.340 106.340 L 188.690 56.000 L 160.000 56.000 C 155.582 56.000 152.000 52.418 152.000 48.000 C 152.000 43.582 155.582 40.000 160.000 40.000 L 208.000 40.000 C 212.418 40.000 216.000 43.582 216.000 48.000 ZM 106.340 138.340 L 56.000 188.690 L 56.000 160.000 C 56.000 155.582 52.418 152.000 48.000 152.000 C 43.582 152.000 40.000 155.582 40.000 160.000 L 40.000 208.000 C 40.000 212.418 43.582 216.000 48.000 216.000 L 96.000 216.000 C 100.418 216.000 104.000 212.418 104.000 208.000 C 104.000 203.582 100.418 200.000 96.000 200.000 L 67.310 200.000 L 117.660 149.660 C 120.786 146.534 120.786 141.466 117.660 138.340 C 114.534 135.214 109.466 135.214 106.340 138.340 Z"),
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
        return _arrowsOutSimple!!
    }

private var _arrowsOutSimple: ImageVector? = null
