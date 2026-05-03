package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberSix: ImageVector
    get() {
        if (_numberSix != null) return _numberSix!!
        _numberSix = phosphorBoldIcon(
            name = "NumberSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 100.0f),
                    PathNode.CurveTo(125.387825f, 100.0042f, 122.77879f, 100.18125f, 120.19f, 100.53f),
                    PathNode.LineTo(146.46f, 53.89f),
                    PathNode.CurveTo(149.71294f, 48.1131f, 147.6669f, 40.792957f, 141.89f, 37.54f),
                    PathNode.CurveTo(136.1131f, 34.287045f, 128.79295f, 36.333103f, 125.54f, 42.11f),
                    PathNode.LineTo(76.0f, 130.13f),
                    PathNode.CurveTo(62.48593f, 153.67279f, 66.46221f, 183.35628f, 85.69604f, 202.5123f),
                    PathNode.CurveTo(104.92986f, 221.66832f, 134.62921f, 225.52425f, 158.11703f, 211.91484f),
                    PathNode.CurveTo(181.60486f, 198.30547f, 193.02927f, 170.62149f, 185.97511f, 144.40828f),
                    PathNode.CurveTo(178.92097f, 118.19507f, 155.14577f, 99.98354f, 128.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 196.0f),
                    PathNode.CurveTo(108.11775f, 196.0f, 92.0f, 179.88223f, 92.0f, 160.0f),
                    PathNode.CurveTo(92.0f, 140.11777f, 108.11775f, 124.0f, 128.0f, 124.0f),
                    PathNode.CurveTo(147.88223f, 124.0f, 164.0f, 140.11777f, 164.0f, 160.0f),
                    PathNode.CurveTo(164.0f, 179.88223f, 147.88223f, 196.0f, 128.0f, 196.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _numberSix!!
    }

private var _numberSix: ImageVector? = null
