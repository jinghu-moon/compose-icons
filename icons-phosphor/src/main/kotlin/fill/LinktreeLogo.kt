package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LinktreeLogo: ImageVector
    get() {
        if (_linktreeLogo != null) return _linktreeLogo!!
        _linktreeLogo = phosphorFillIcon(
            name = "LinktreeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 216.000 C 40.000 224.837 47.163 232.000 56.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 40.000 C 216.000 31.163 208.837 24.000 200.000 24.000 ZM 136.000 200.000 C 136.000 204.418 132.418 208.000 128.000 208.000 C 123.582 208.000 120.000 204.418 120.000 200.000 L 120.000 160.000 C 120.000 155.582 123.582 152.000 128.000 152.000 C 132.418 152.000 136.000 155.582 136.000 160.000 ZM 184.000 120.000 L 147.310 120.000 L 173.660 146.340 C 176.786 149.466 176.786 154.534 173.660 157.660 C 170.534 160.786 165.466 160.786 162.340 157.660 L 128.000 123.310 L 93.660 157.660 C 90.534 160.786 85.466 160.786 82.340 157.660 C 79.214 154.534 79.214 149.466 82.340 146.340 L 108.690 120.000 L 72.000 120.000 C 67.582 120.000 64.000 116.418 64.000 112.000 C 64.000 107.582 67.582 104.000 72.000 104.000 L 108.690 104.000 L 82.340 77.660 C 79.214 74.534 79.214 69.466 82.340 66.340 C 85.466 63.214 90.534 63.214 93.660 66.340 L 120.000 92.690 L 120.000 56.000 C 120.000 51.582 123.582 48.000 128.000 48.000 C 132.418 48.000 136.000 51.582 136.000 56.000 L 136.000 92.690 L 162.340 66.340 C 165.466 63.214 170.534 63.214 173.660 66.340 C 176.786 69.466 176.786 74.534 173.660 77.660 L 147.310 104.000 L 184.000 104.000 C 188.418 104.000 192.000 107.582 192.000 112.000 C 192.000 116.418 188.418 120.000 184.000 120.000 Z"),
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
        return _linktreeLogo!!
    }

private var _linktreeLogo: ImageVector? = null
