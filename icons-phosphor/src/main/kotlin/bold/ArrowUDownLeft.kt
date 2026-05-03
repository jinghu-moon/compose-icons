package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowUDownLeft: ImageVector
    get() {
        if (_arrowUDownLeft != null) return _arrowUDownLeft!!
        _arrowUDownLeft = phosphorBoldIcon(
            name = "ArrowUDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 236.000 112.000 C 235.961 149.539 205.539 179.961 168.000 180.000 L 61.000 180.000 L 88.520 207.510 C 93.214 212.204 93.214 219.816 88.520 224.510 C 83.826 229.204 76.214 229.204 71.520 224.510 L 23.520 176.510 C 21.261 174.258 19.991 171.200 19.991 168.010 C 19.991 164.820 21.261 161.762 23.520 159.510 L 71.520 111.510 C 76.214 106.816 83.826 106.816 88.520 111.510 C 93.214 116.204 93.214 123.816 88.520 128.510 L 61.000 156.000 L 168.000 156.000 C 192.301 156.000 212.000 136.301 212.000 112.000 C 212.000 87.699 192.301 68.000 168.000 68.000 L 80.000 68.000 C 73.373 68.000 68.000 62.627 68.000 56.000 C 68.000 49.373 73.373 44.000 80.000 44.000 L 168.000 44.000 C 205.539 44.039 235.961 74.461 236.000 112.000 Z"),
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
        return _arrowUDownLeft!!
    }

private var _arrowUDownLeft: ImageVector? = null
