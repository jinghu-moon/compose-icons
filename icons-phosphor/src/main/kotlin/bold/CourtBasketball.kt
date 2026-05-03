package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CourtBasketball: ImageVector
    get() {
        if (_courtBasketball != null) return _courtBasketball!!
        _courtBasketball = phosphorBoldIcon(
            name = "CourtBasketball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 44.000 L 32.000 44.000 C 20.954 44.000 12.000 52.954 12.000 64.000 L 12.000 192.000 C 12.000 203.046 20.954 212.000 32.000 212.000 L 224.000 212.000 C 235.046 212.000 244.000 203.046 244.000 192.000 L 244.000 64.000 C 244.000 52.954 235.046 44.000 224.000 44.000 ZM 220.000 156.000 L 216.000 156.000 C 200.536 156.000 188.000 143.464 188.000 128.000 C 188.000 112.536 200.536 100.000 216.000 100.000 L 220.000 100.000 ZM 36.000 100.000 L 40.000 100.000 C 55.464 100.000 68.000 112.536 68.000 128.000 C 68.000 143.464 55.464 156.000 40.000 156.000 L 36.000 156.000 ZM 36.000 180.000 L 40.000 180.000 C 68.719 180.000 92.000 156.719 92.000 128.000 C 92.000 99.281 68.719 76.000 40.000 76.000 L 36.000 76.000 L 36.000 68.000 L 116.000 68.000 L 116.000 188.000 L 36.000 188.000 ZM 140.000 188.000 L 140.000 68.000 L 220.000 68.000 L 220.000 76.000 L 216.000 76.000 C 187.281 76.000 164.000 99.281 164.000 128.000 C 164.000 156.719 187.281 180.000 216.000 180.000 L 220.000 180.000 L 220.000 188.000 Z"),
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
        return _courtBasketball!!
    }

private var _courtBasketball: ImageVector? = null
