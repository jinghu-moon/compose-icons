package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CellSignalX: ImageVector
    get() {
        if (_cellSignalX != null) return _cellSignalX!!
        _cellSignalX = phosphorRegularIcon(
            name = "CellSignalX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 213.660 194.340 C 216.786 197.466 216.786 202.534 213.660 205.660 C 210.534 208.786 205.466 208.786 202.340 205.660 L 184.000 187.310 L 165.660 205.660 C 162.534 208.786 157.466 208.786 154.340 205.660 C 151.214 202.534 151.214 197.466 154.340 194.340 L 172.690 176.000 L 154.340 157.660 C 151.214 154.534 151.214 149.466 154.340 146.340 C 157.466 143.214 162.534 143.214 165.660 146.340 L 184.000 164.690 L 202.340 146.340 C 205.466 143.214 210.534 143.214 213.660 146.340 C 216.786 149.466 216.786 154.534 213.660 157.660 L 195.310 176.000 ZM 160.000 120.000 C 164.418 120.000 168.000 116.418 168.000 112.000 L 168.000 72.000 C 168.000 67.582 164.418 64.000 160.000 64.000 C 155.582 64.000 152.000 67.582 152.000 72.000 L 152.000 112.000 C 152.000 116.418 155.582 120.000 160.000 120.000 ZM 200.000 120.000 C 204.418 120.000 208.000 116.418 208.000 112.000 L 208.000 32.000 C 208.000 27.582 204.418 24.000 200.000 24.000 C 195.582 24.000 192.000 27.582 192.000 32.000 L 192.000 112.000 C 192.000 116.418 195.582 120.000 200.000 120.000 ZM 120.000 104.000 C 115.582 104.000 112.000 107.582 112.000 112.000 L 112.000 200.000 C 112.000 204.418 115.582 208.000 120.000 208.000 C 124.418 208.000 128.000 204.418 128.000 200.000 L 128.000 112.000 C 128.000 107.582 124.418 104.000 120.000 104.000 ZM 80.000 144.000 C 75.582 144.000 72.000 147.582 72.000 152.000 L 72.000 200.000 C 72.000 204.418 75.582 208.000 80.000 208.000 C 84.418 208.000 88.000 204.418 88.000 200.000 L 88.000 152.000 C 88.000 147.582 84.418 144.000 80.000 144.000 ZM 40.000 184.000 C 35.582 184.000 32.000 187.582 32.000 192.000 L 32.000 200.000 C 32.000 204.418 35.582 208.000 40.000 208.000 C 44.418 208.000 48.000 204.418 48.000 200.000 L 48.000 192.000 C 48.000 187.582 44.418 184.000 40.000 184.000 Z"),
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
        return _cellSignalX!!
    }

private var _cellSignalX: ImageVector? = null
