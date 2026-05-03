package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Microphone: ImageVector
    get() {
        if (_microphone != null) return _microphone!!
        _microphone = phosphorBoldIcon(
            name = "Microphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 180.000 C 156.705 179.967 179.967 156.705 180.000 128.000 L 180.000 64.000 C 180.000 35.281 156.719 12.000 128.000 12.000 C 99.281 12.000 76.000 35.281 76.000 64.000 L 76.000 128.000 C 76.033 156.705 99.295 179.967 128.000 180.000 ZM 100.000 64.000 C 100.000 48.536 112.536 36.000 128.000 36.000 C 143.464 36.000 156.000 48.536 156.000 64.000 L 156.000 128.000 C 156.000 143.464 143.464 156.000 128.000 156.000 C 112.536 156.000 100.000 143.464 100.000 128.000 ZM 140.000 219.220 L 140.000 240.000 C 140.000 246.627 134.627 252.000 128.000 252.000 C 121.373 252.000 116.000 246.627 116.000 240.000 L 116.000 219.220 C 70.251 213.139 36.058 174.151 36.000 128.000 C 36.000 121.373 41.373 116.000 48.000 116.000 C 54.627 116.000 60.000 121.373 60.000 128.000 C 60.000 165.555 90.445 196.000 128.000 196.000 C 165.555 196.000 196.000 165.555 196.000 128.000 C 196.000 121.373 201.373 116.000 208.000 116.000 C 214.627 116.000 220.000 121.373 220.000 128.000 C 219.942 174.151 185.749 213.139 140.000 219.220 Z"),
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
        return _microphone!!
    }

private var _microphone: ImageVector? = null
