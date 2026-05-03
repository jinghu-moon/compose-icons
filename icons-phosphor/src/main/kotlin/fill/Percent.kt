package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Percent: ImageVector
    get() {
        if (_percent != null) return _percent!!
        _percent = phosphorFillIcon(
            name = "Percent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 176.000 172.000 C 176.000 178.627 170.627 184.000 164.000 184.000 C 157.373 184.000 152.000 178.627 152.000 172.000 C 152.000 165.373 157.373 160.000 164.000 160.000 C 170.627 160.000 176.000 165.373 176.000 172.000 ZM 92.000 96.000 C 98.627 96.000 104.000 90.627 104.000 84.000 C 104.000 77.373 98.627 72.000 92.000 72.000 C 85.373 72.000 80.000 77.373 80.000 84.000 C 80.000 90.627 85.373 96.000 92.000 96.000 ZM 224.000 48.000 L 224.000 208.000 C 224.000 216.837 216.837 224.000 208.000 224.000 L 48.000 224.000 C 39.163 224.000 32.000 216.837 32.000 208.000 L 32.000 48.000 C 32.000 39.163 39.163 32.000 48.000 32.000 L 208.000 32.000 C 216.837 32.000 224.000 39.163 224.000 48.000 ZM 64.000 84.000 C 64.000 99.464 76.536 112.000 92.000 112.000 C 107.464 112.000 120.000 99.464 120.000 84.000 C 120.000 68.536 107.464 56.000 92.000 56.000 C 76.536 56.000 64.000 68.536 64.000 84.000 ZM 192.000 172.000 C 192.000 156.536 179.464 144.000 164.000 144.000 C 148.536 144.000 136.000 156.536 136.000 172.000 C 136.000 187.464 148.536 200.000 164.000 200.000 C 179.464 200.000 192.000 187.464 192.000 172.000 ZM 189.660 66.340 C 188.159 64.838 186.123 63.994 184.000 63.994 C 181.877 63.994 179.841 64.838 178.340 66.340 L 66.340 178.340 C 63.214 181.466 63.214 186.534 66.340 189.660 C 69.466 192.786 74.534 192.786 77.660 189.660 L 189.660 77.660 C 191.162 76.159 192.006 74.123 192.006 72.000 C 192.006 69.877 191.162 67.841 189.660 66.340 Z"),
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
        return _percent!!
    }

private var _percent: ImageVector? = null
