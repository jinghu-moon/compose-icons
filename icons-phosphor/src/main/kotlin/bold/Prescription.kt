package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Prescription: ImageVector
    get() {
        if (_prescription != null) return _prescription!!
        _prescription = phosphorBoldIcon(
            name = "Prescription",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 189.000 188.000 L 208.520 168.490 C 213.214 163.796 213.214 156.184 208.520 151.490 C 203.826 146.796 196.214 146.796 191.520 151.490 L 172.000 171.000 L 138.930 138.000 C 165.983 130.570 183.362 104.268 179.589 76.468 C 175.816 48.669 152.054 27.951 124.000 28.000 L 72.000 28.000 C 65.373 28.000 60.000 33.373 60.000 40.000 L 60.000 192.000 C 60.000 198.627 65.373 204.000 72.000 204.000 C 78.627 204.000 84.000 198.627 84.000 192.000 L 84.000 140.000 L 107.000 140.000 L 155.000 188.000 L 135.480 207.510 C 130.786 212.204 130.786 219.816 135.480 224.510 C 140.174 229.204 147.786 229.204 152.480 224.510 L 172.000 205.000 L 191.510 224.520 C 196.204 229.214 203.816 229.214 208.510 224.520 C 213.204 219.826 213.204 212.214 208.510 207.520 ZM 84.000 52.000 L 124.000 52.000 C 141.673 52.000 156.000 66.327 156.000 84.000 C 156.000 101.673 141.673 116.000 124.000 116.000 L 84.000 116.000 Z"),
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
        return _prescription!!
    }

private var _prescription: ImageVector? = null
