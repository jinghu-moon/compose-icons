package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArticleNyTimes: ImageVector
    get() {
        if (_articleNyTimes != null) return _articleNyTimes!!
        _articleNyTimes = phosphorBoldIcon(
            name = "ArticleNyTimes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 156.000 92.000 C 156.000 85.373 161.373 80.000 168.000 80.000 L 232.000 80.000 C 238.627 80.000 244.000 85.373 244.000 92.000 C 244.000 98.627 238.627 104.000 232.000 104.000 L 168.000 104.000 C 161.373 104.000 156.000 98.627 156.000 92.000 ZM 232.000 120.000 L 168.000 120.000 C 161.373 120.000 156.000 125.373 156.000 132.000 C 156.000 138.627 161.373 144.000 168.000 144.000 L 232.000 144.000 C 238.627 144.000 244.000 138.627 244.000 132.000 C 244.000 125.373 238.627 120.000 232.000 120.000 ZM 232.000 160.000 L 80.000 160.000 C 73.373 160.000 68.000 165.373 68.000 172.000 C 68.000 178.627 73.373 184.000 80.000 184.000 L 232.000 184.000 C 238.627 184.000 244.000 178.627 244.000 172.000 C 244.000 165.373 238.627 160.000 232.000 160.000 ZM 232.000 200.000 L 80.000 200.000 C 73.373 200.000 68.000 205.373 68.000 212.000 C 68.000 218.627 73.373 224.000 80.000 224.000 L 232.000 224.000 C 238.627 224.000 244.000 218.627 244.000 212.000 C 244.000 205.373 238.627 200.000 232.000 200.000 ZM 96.000 144.000 C 102.627 144.000 108.000 138.627 108.000 132.000 C 108.000 125.373 102.627 120.000 96.000 120.000 L 92.000 120.000 L 92.000 68.000 L 116.000 68.000 L 116.000 72.000 C 116.000 78.627 121.373 84.000 128.000 84.000 C 134.627 84.000 140.000 78.627 140.000 72.000 L 140.000 56.000 C 140.000 49.373 134.627 44.000 128.000 44.000 L 32.000 44.000 C 25.373 44.000 20.000 49.373 20.000 56.000 L 20.000 72.000 C 20.000 78.627 25.373 84.000 32.000 84.000 C 38.627 84.000 44.000 78.627 44.000 72.000 L 44.000 68.000 L 68.000 68.000 L 68.000 120.000 L 64.000 120.000 C 57.373 120.000 52.000 125.373 52.000 132.000 C 52.000 138.627 57.373 144.000 64.000 144.000 Z"),
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
        return _articleNyTimes!!
    }

private var _articleNyTimes: ImageVector? = null
