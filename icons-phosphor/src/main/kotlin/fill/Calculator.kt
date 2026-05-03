package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Calculator: ImageVector
    get() {
        if (_calculator != null) return _calculator!!
        _calculator = phosphorFillIcon(
            name = "Calculator",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 216.000 C 40.000 224.837 47.163 232.000 56.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 40.000 C 216.000 31.163 208.837 24.000 200.000 24.000 ZM 88.000 200.000 C 81.373 200.000 76.000 194.627 76.000 188.000 C 76.000 181.373 81.373 176.000 88.000 176.000 C 94.627 176.000 100.000 181.373 100.000 188.000 C 100.000 194.627 94.627 200.000 88.000 200.000 ZM 88.000 160.000 C 81.373 160.000 76.000 154.627 76.000 148.000 C 76.000 141.373 81.373 136.000 88.000 136.000 C 94.627 136.000 100.000 141.373 100.000 148.000 C 100.000 154.627 94.627 160.000 88.000 160.000 ZM 128.000 200.000 C 121.373 200.000 116.000 194.627 116.000 188.000 C 116.000 181.373 121.373 176.000 128.000 176.000 C 134.627 176.000 140.000 181.373 140.000 188.000 C 140.000 194.627 134.627 200.000 128.000 200.000 ZM 128.000 160.000 C 121.373 160.000 116.000 154.627 116.000 148.000 C 116.000 141.373 121.373 136.000 128.000 136.000 C 134.627 136.000 140.000 141.373 140.000 148.000 C 140.000 154.627 134.627 160.000 128.000 160.000 ZM 168.000 200.000 C 161.373 200.000 156.000 194.627 156.000 188.000 C 156.000 181.373 161.373 176.000 168.000 176.000 C 174.627 176.000 180.000 181.373 180.000 188.000 C 180.000 194.627 174.627 200.000 168.000 200.000 ZM 168.000 160.000 C 161.373 160.000 156.000 154.627 156.000 148.000 C 156.000 141.373 161.373 136.000 168.000 136.000 C 174.627 136.000 180.000 141.373 180.000 148.000 C 180.000 154.627 174.627 160.000 168.000 160.000 ZM 184.000 104.000 C 184.000 108.418 180.418 112.000 176.000 112.000 L 80.000 112.000 C 75.582 112.000 72.000 108.418 72.000 104.000 L 72.000 64.000 C 72.000 59.582 75.582 56.000 80.000 56.000 L 176.000 56.000 C 180.418 56.000 184.000 59.582 184.000 64.000 Z"),
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
        return _calculator!!
    }

private var _calculator: ImageVector? = null
