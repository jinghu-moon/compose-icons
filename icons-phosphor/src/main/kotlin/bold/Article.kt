package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Article: ImageVector
    get() {
        if (_article != null) return _article!!
        _article = phosphorBoldIcon(
            name = "Article",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 36.000 L 40.000 36.000 C 28.954 36.000 20.000 44.954 20.000 56.000 L 20.000 200.000 C 20.000 211.046 28.954 220.000 40.000 220.000 L 216.000 220.000 C 227.046 220.000 236.000 211.046 236.000 200.000 L 236.000 56.000 C 236.000 44.954 227.046 36.000 216.000 36.000 ZM 212.000 196.000 L 44.000 196.000 L 44.000 60.000 L 212.000 60.000 ZM 68.000 92.000 C 68.000 85.373 73.373 80.000 80.000 80.000 L 176.000 80.000 C 182.627 80.000 188.000 85.373 188.000 92.000 C 188.000 98.627 182.627 104.000 176.000 104.000 L 80.000 104.000 C 73.373 104.000 68.000 98.627 68.000 92.000 ZM 68.000 128.000 C 68.000 121.373 73.373 116.000 80.000 116.000 L 176.000 116.000 C 182.627 116.000 188.000 121.373 188.000 128.000 C 188.000 134.627 182.627 140.000 176.000 140.000 L 80.000 140.000 C 73.373 140.000 68.000 134.627 68.000 128.000 ZM 68.000 164.000 C 68.000 157.373 73.373 152.000 80.000 152.000 L 176.000 152.000 C 182.627 152.000 188.000 157.373 188.000 164.000 C 188.000 170.627 182.627 176.000 176.000 176.000 L 80.000 176.000 C 73.373 176.000 68.000 170.627 68.000 164.000 Z"),
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
        return _article!!
    }

private var _article: ImageVector? = null
