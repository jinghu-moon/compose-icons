package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.LinktreeLogo: ImageVector
    get() {
        if (_linktreeLogo != null) return _linktreeLogo!!
        _linktreeLogo = phosphorRegularIcon(
            name = "LinktreeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 136.000 160.000 L 136.000 232.000 C 136.000 236.418 132.418 240.000 128.000 240.000 C 123.582 240.000 120.000 236.418 120.000 232.000 L 120.000 160.000 C 120.000 155.582 123.582 152.000 128.000 152.000 C 132.418 152.000 136.000 155.582 136.000 160.000 ZM 208.000 96.000 L 147.310 96.000 L 189.660 53.660 C 192.786 50.534 192.786 45.466 189.660 42.340 C 186.534 39.214 181.466 39.214 178.340 42.340 L 136.000 84.690 L 136.000 24.000 C 136.000 19.582 132.418 16.000 128.000 16.000 C 123.582 16.000 120.000 19.582 120.000 24.000 L 120.000 84.690 L 77.660 42.340 C 74.534 39.214 69.466 39.214 66.340 42.340 C 63.214 45.466 63.214 50.534 66.340 53.660 L 108.690 96.000 L 48.000 96.000 C 43.582 96.000 40.000 99.582 40.000 104.000 C 40.000 108.418 43.582 112.000 48.000 112.000 L 108.690 112.000 L 66.340 154.340 C 63.214 157.466 63.214 162.534 66.340 165.660 C 69.466 168.786 74.534 168.786 77.660 165.660 L 128.000 115.310 L 178.340 165.660 C 181.466 168.786 186.534 168.786 189.660 165.660 C 192.786 162.534 192.786 157.466 189.660 154.340 L 147.310 112.000 L 208.000 112.000 C 212.418 112.000 216.000 108.418 216.000 104.000 C 216.000 99.582 212.418 96.000 208.000 96.000 Z"),
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
        return _linktreeLogo!!
    }

private var _linktreeLogo: ImageVector? = null
