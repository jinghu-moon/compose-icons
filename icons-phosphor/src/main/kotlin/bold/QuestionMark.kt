package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.QuestionMark: ImageVector
    get() {
        if (_questionMark != null) return _questionMark!!
        _questionMark = phosphorBoldIcon(
            name = "QuestionMark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 196.000 96.000 C 196.000 125.470 171.790 150.050 140.000 155.060 L 140.000 156.000 C 140.000 162.627 134.627 168.000 128.000 168.000 C 121.373 168.000 116.000 162.627 116.000 156.000 L 116.000 144.000 C 116.000 137.373 121.373 132.000 128.000 132.000 C 152.260 132.000 172.000 115.850 172.000 96.000 C 172.000 76.150 152.260 60.000 128.000 60.000 C 103.740 60.000 84.000 76.150 84.000 96.000 C 84.000 102.627 78.627 108.000 72.000 108.000 C 65.373 108.000 60.000 102.627 60.000 96.000 C 60.000 62.920 90.500 36.000 128.000 36.000 C 165.500 36.000 196.000 62.920 196.000 96.000 ZM 128.000 188.000 C 116.954 188.000 108.000 196.954 108.000 208.000 C 108.000 219.046 116.954 228.000 128.000 228.000 C 139.046 228.000 148.000 219.046 148.000 208.000 C 148.000 196.954 139.046 188.000 128.000 188.000 Z"),
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
        return _questionMark!!
    }

private var _questionMark: ImageVector? = null
