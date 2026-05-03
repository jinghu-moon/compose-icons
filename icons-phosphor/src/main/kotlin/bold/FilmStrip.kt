package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FilmStrip: ImageVector
    get() {
        if (_filmStrip != null) return _filmStrip!!
        _filmStrip = phosphorBoldIcon(
            name = "FilmStrip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 36.000 L 40.000 36.000 C 28.954 36.000 20.000 44.954 20.000 56.000 L 20.000 200.000 C 20.000 211.046 28.954 220.000 40.000 220.000 L 216.000 220.000 C 227.046 220.000 236.000 211.046 236.000 200.000 L 236.000 56.000 C 236.000 44.954 227.046 36.000 216.000 36.000 ZM 44.000 100.000 L 116.000 100.000 L 116.000 156.000 L 44.000 156.000 ZM 140.000 76.000 L 140.000 60.000 L 164.000 60.000 L 164.000 76.000 ZM 116.000 76.000 L 92.000 76.000 L 92.000 60.000 L 116.000 60.000 ZM 116.000 180.000 L 116.000 196.000 L 92.000 196.000 L 92.000 180.000 ZM 140.000 180.000 L 164.000 180.000 L 164.000 196.000 L 140.000 196.000 ZM 140.000 156.000 L 140.000 100.000 L 212.000 100.000 L 212.000 156.000 ZM 212.000 76.000 L 188.000 76.000 L 188.000 60.000 L 212.000 60.000 ZM 68.000 60.000 L 68.000 76.000 L 44.000 76.000 L 44.000 60.000 ZM 44.000 180.000 L 68.000 180.000 L 68.000 196.000 L 44.000 196.000 ZM 188.000 196.000 L 188.000 180.000 L 212.000 180.000 L 212.000 196.000 Z"),
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
        return _filmStrip!!
    }

private var _filmStrip: ImageVector? = null
