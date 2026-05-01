package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.NumberSquareZero: ImageVector
    get() {
        if (_numberSquareZero != null) return _numberSquareZero!!
        _numberSquareZero = phosphorRegularIcon(
            name = "NumberSquareZero",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 72.0f),
                    PathNode.CurveTo(113.77f, 72.0f, 102.0f, 78.44f, 94.0f, 90.61f),
                    PathNode.CurveTo(87.53f, 100.47f, 84.0f, 113.75f, 84.0f, 128.0f),
                    PathNode.CurveTo(84.0f, 142.25f, 87.56f, 155.53f, 94.0f, 165.39f),
                    PathNode.CurveTo(102.0f, 177.56f, 113.74f, 184.0f, 128.0f, 184.0f),
                    PathNode.CurveTo(142.26f, 184.0f, 154.0f, 177.56f, 162.0f, 165.39f),
                    PathNode.CurveTo(168.47f, 155.53f, 172.0f, 142.25f, 172.0f, 128.0f),
                    PathNode.CurveTo(172.0f, 113.75f, 168.44f, 100.47f, 162.0f, 90.61f),
                    PathNode.CurveTo(154.0f, 78.44f, 142.23f, 72.0f, 128.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 168.0f),
                    PathNode.CurveTo(105.9f, 168.0f, 100.0f, 142.86f, 100.0f, 128.0f),
                    PathNode.CurveTo(100.0f, 113.14f, 105.9f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(150.1f, 88.0f, 156.0f, 113.14f, 156.0f, 128.0f),
                    PathNode.CurveTo(156.0f, 142.86f, 150.1f, 168.0f, 128.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 48.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _numberSquareZero!!
    }

private var _numberSquareZero: ImageVector? = null
