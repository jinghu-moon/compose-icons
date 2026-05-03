package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.WashingMachine: ImageVector
    get() {
        if (_washingMachine != null) return _washingMachine!!
        _washingMachine = phosphorFillIcon(
            name = "WashingMachine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 128.000 184.000 C 97.072 184.000 72.000 158.928 72.000 128.000 C 72.000 97.072 97.072 72.000 128.000 72.000 C 158.928 72.000 184.000 97.072 184.000 128.000 C 184.000 158.928 158.928 184.000 128.000 184.000 ZM 188.000 80.000 C 181.373 80.000 176.000 74.627 176.000 68.000 C 176.000 61.373 181.373 56.000 188.000 56.000 C 194.627 56.000 200.000 61.373 200.000 68.000 C 200.000 74.627 194.627 80.000 188.000 80.000 ZM 133.660 109.660 L 101.660 141.660 C 98.534 144.786 93.466 144.786 90.340 141.660 C 87.214 138.534 87.214 133.466 90.340 130.340 L 122.340 98.340 C 125.466 95.214 130.534 95.214 133.660 98.340 C 136.786 101.466 136.786 106.534 133.660 109.660 ZM 165.660 106.340 C 167.162 107.841 168.006 109.877 168.006 112.000 C 168.006 114.123 167.162 116.159 165.660 117.660 L 117.660 165.660 C 114.534 168.786 109.466 168.786 106.340 165.660 C 103.214 162.534 103.214 157.466 106.340 154.340 L 154.340 106.340 C 155.841 104.838 157.877 103.994 160.000 103.994 C 162.123 103.994 164.159 104.838 165.660 106.340 Z"),
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
        return _washingMachine!!
    }

private var _washingMachine: ImageVector? = null
