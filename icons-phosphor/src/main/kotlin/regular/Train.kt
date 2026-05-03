package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Train: ImageVector
    get() {
        if (_train != null) return _train!!
        _train = phosphorRegularIcon(
            name = "Train",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 184.000 24.000 L 72.000 24.000 C 54.327 24.000 40.000 38.327 40.000 56.000 L 40.000 184.000 C 40.000 201.673 54.327 216.000 72.000 216.000 L 80.000 216.000 L 65.600 235.200 C 62.949 238.735 63.665 243.749 67.200 246.400 C 70.735 249.051 75.749 248.335 78.400 244.800 L 100.000 216.000 L 156.000 216.000 L 177.600 244.800 C 180.251 248.335 185.265 249.051 188.800 246.400 C 192.335 243.749 193.051 238.735 190.400 235.200 L 176.000 216.000 L 184.000 216.000 C 201.673 216.000 216.000 201.673 216.000 184.000 L 216.000 56.000 C 216.000 38.327 201.673 24.000 184.000 24.000 ZM 56.000 120.000 L 56.000 80.000 L 120.000 80.000 L 120.000 120.000 ZM 136.000 80.000 L 200.000 80.000 L 200.000 120.000 L 136.000 120.000 ZM 72.000 40.000 L 184.000 40.000 C 192.837 40.000 200.000 47.163 200.000 56.000 L 200.000 64.000 L 56.000 64.000 L 56.000 56.000 C 56.000 47.163 63.163 40.000 72.000 40.000 ZM 184.000 200.000 L 72.000 200.000 C 63.163 200.000 56.000 192.837 56.000 184.000 L 56.000 136.000 L 200.000 136.000 L 200.000 184.000 C 200.000 192.837 192.837 200.000 184.000 200.000 ZM 96.000 172.000 C 96.000 178.627 90.627 184.000 84.000 184.000 C 77.373 184.000 72.000 178.627 72.000 172.000 C 72.000 165.373 77.373 160.000 84.000 160.000 C 90.627 160.000 96.000 165.373 96.000 172.000 ZM 184.000 172.000 C 184.000 178.627 178.627 184.000 172.000 184.000 C 165.373 184.000 160.000 178.627 160.000 172.000 C 160.000 165.373 165.373 160.000 172.000 160.000 C 178.627 160.000 184.000 165.373 184.000 172.000 Z"),
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
        return _train!!
    }

private var _train: ImageVector? = null
