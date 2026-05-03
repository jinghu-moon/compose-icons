package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LetterCircleP: ImageVector
    get() {
        if (_letterCircleP != null) return _letterCircleP!!
        _letterCircleP = phosphorBoldIcon(
            name = "LetterCircleP",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 136.000 76.000 L 104.000 76.000 C 97.373 76.000 92.000 81.373 92.000 88.000 L 92.000 168.000 C 92.000 174.627 97.373 180.000 104.000 180.000 C 110.627 180.000 116.000 174.627 116.000 168.000 L 116.000 156.000 L 136.000 156.000 C 158.091 156.000 176.000 138.091 176.000 116.000 C 176.000 93.909 158.091 76.000 136.000 76.000 ZM 136.000 132.000 L 116.000 132.000 L 116.000 100.000 L 136.000 100.000 C 144.837 100.000 152.000 107.163 152.000 116.000 C 152.000 124.837 144.837 132.000 136.000 132.000 Z"),
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
        return _letterCircleP!!
    }

private var _letterCircleP: ImageVector? = null
