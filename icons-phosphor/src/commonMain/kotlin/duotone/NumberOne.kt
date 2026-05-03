package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NumberOne: ImageVector
    get() {
        if (_numberOne != null) return _numberOne!!
        _numberOne = phosphorDuotoneIcon(
            name = "NumberOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(216.0f, 224.83656f, 208.83656f, 232.0f, 200.0f, 232.0f),
                    PathNode.LineTo(56.0f, 232.0f),
                    PathNode.CurveTo(47.163445f, 232.0f, 40.0f, 224.83656f, 40.0f, 216.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(40.0f, 31.163445f, 47.163445f, 24.0f, 56.0f, 24.0f),
                    PathNode.LineTo(200.0f, 24.0f),
                    PathNode.CurveTo(208.83656f, 24.0f, 216.0f, 31.163445f, 216.0f, 40.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(144.0f, 48.0f),
                    PathNode.LineTo(144.0f, 208.0f),
                    PathNode.CurveTo(144.0f, 212.41827f, 140.41827f, 216.0f, 136.0f, 216.0f),
                    PathNode.CurveTo(131.58173f, 216.0f, 128.0f, 212.41827f, 128.0f, 208.0f),
                    PathNode.LineTo(128.0f, 62.13f),
                    PathNode.LineTo(100.12f, 78.86f),
                    PathNode.CurveTo(96.33133f, 81.135414f, 91.41541f, 79.90868f, 89.14f, 76.12f),
                    PathNode.CurveTo(86.864586f, 72.33133f, 88.09132f, 67.41541f, 91.88f, 65.14f),
                    PathNode.LineTo(131.88f, 41.14f),
                    PathNode.CurveTo(134.35167f, 39.655018f, 137.43124f, 39.615044f, 139.94063f, 41.035374f),
                    PathNode.CurveTo(142.45001f, 42.455704f, 144.0009f, 45.11654f, 144.0f, 48.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _numberOne!!
    }

private var _numberOne: ImageVector? = null
