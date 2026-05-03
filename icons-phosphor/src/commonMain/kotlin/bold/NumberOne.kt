package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberOne: ImageVector
    get() {
        if (_numberOne != null) return _numberOne!!
        _numberOne = phosphorBoldIcon(
            name = "NumberOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(148.0f, 48.0f),
                    PathNode.LineTo(148.0f, 208.0f),
                    PathNode.CurveTo(148.0f, 214.62741f, 142.62741f, 220.0f, 136.0f, 220.0f),
                    PathNode.CurveTo(129.37259f, 220.0f, 124.0f, 214.62741f, 124.0f, 208.0f),
                    PathNode.LineTo(124.0f, 69.19f),
                    PathNode.LineTo(102.17f, 82.29f),
                    PathNode.CurveTo(96.49867f, 85.552765f, 89.25895f, 83.670975f, 85.89425f, 78.05952f),
                    PathNode.CurveTo(82.52956f, 72.44806f, 84.28024f, 65.17552f, 89.83f, 61.71f),
                    PathNode.LineTo(129.83f, 37.71f),
                    PathNode.CurveTo(133.53697f, 35.487755f, 138.15257f, 35.430634f, 141.91339f, 37.560455f),
                    PathNode.CurveTo(145.67422f, 39.69028f, 147.99919f, 43.677967f, 148.0f, 48.0f),
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
        return _numberOne!!
    }

private var _numberOne: ImageVector? = null
