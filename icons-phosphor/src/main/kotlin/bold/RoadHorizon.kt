package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.RoadHorizon: ImageVector
    get() {
        if (_roadHorizon != null) return _roadHorizon!!
        _roadHorizon = phosphorBoldIcon(
            name = "RoadHorizon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 237.880 202.460 C 232.103 205.707 224.788 203.657 221.540 197.880 L 153.000 76.000 L 140.000 76.000 L 140.000 80.000 C 140.000 86.627 134.627 92.000 128.000 92.000 C 121.373 92.000 116.000 86.627 116.000 80.000 L 116.000 76.000 L 103.000 76.000 L 34.460 197.880 C 32.383 201.662 28.434 204.038 24.119 204.102 C 19.804 204.166 15.787 201.908 13.599 198.188 C 11.411 194.469 11.388 189.861 13.540 186.120 L 75.480 76.000 L 24.000 76.000 C 17.373 76.000 12.000 70.627 12.000 64.000 C 12.000 57.373 17.373 52.000 24.000 52.000 L 232.000 52.000 C 238.627 52.000 244.000 57.373 244.000 64.000 C 244.000 70.627 238.627 76.000 232.000 76.000 L 180.520 76.000 L 242.460 186.120 C 245.707 191.897 243.657 199.212 237.880 202.460 ZM 128.000 108.000 C 121.373 108.000 116.000 113.373 116.000 120.000 L 116.000 136.000 C 116.000 142.627 121.373 148.000 128.000 148.000 C 134.627 148.000 140.000 142.627 140.000 136.000 L 140.000 120.000 C 140.000 113.373 134.627 108.000 128.000 108.000 ZM 128.000 164.000 C 121.373 164.000 116.000 169.373 116.000 176.000 L 116.000 192.000 C 116.000 198.627 121.373 204.000 128.000 204.000 C 134.627 204.000 140.000 198.627 140.000 192.000 L 140.000 176.000 C 140.000 169.373 134.627 164.000 128.000 164.000 Z"),
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
        return _roadHorizon!!
    }

private var _roadHorizon: ImageVector? = null
