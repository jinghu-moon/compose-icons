package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberSquareSix: ImageVector
    get() {
        if (_numberSquareSix != null) return _numberSquareSix!!
        _numberSquareSix = phosphorBoldIcon(
            name = "NumberSquareSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 28.0f),
                    PathNode.LineTo(48.0f, 28.0f),
                    PathNode.CurveTo(36.954304f, 28.0f, 28.0f, 36.954304f, 28.0f, 48.0f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 219.0457f, 36.954304f, 228.0f, 48.0f, 228.0f),
                    PathNode.LineTo(208.0f, 228.0f),
                    PathNode.CurveTo(219.0457f, 228.0f, 228.0f, 219.0457f, 228.0f, 208.0f),
                    PathNode.LineTo(228.0f, 48.0f),
                    PathNode.CurveTo(228.0f, 36.954304f, 219.0457f, 28.0f, 208.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 204.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.LineTo(52.0f, 52.0f),
                    PathNode.LineTo(204.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 188.0f),
                    PathNode.CurveTo(149.08112f, 187.96466f, 166.5163f, 171.57417f, 167.85252f, 150.53543f),
                    PathNode.CurveTo(169.18874f, 129.49667f, 153.96725f, 111.032104f, 133.06f, 108.33f),
                    PathNode.LineTo(146.3f, 86.15f),
                    PathNode.CurveTo(148.62556f, 82.46469f, 148.77048f, 77.80829f, 146.67857f, 73.9855f),
                    PathNode.CurveTo(144.58669f, 70.162704f, 140.58678f, 67.77442f, 136.22916f, 67.74628f),
                    PathNode.CurveTo(131.87152f, 67.71814f, 127.8411f, 70.05455f, 125.7f, 73.85f),
                    PathNode.LineTo(93.46f, 127.85f),
                    PathNode.CurveTo(86.24675f, 140.21956f, 86.19572f, 155.50134f, 93.3262f, 167.9188f),
                    PathNode.CurveTo(100.456696f, 180.33624f, 113.68089f, 187.995f, 128.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 132.0f),
                    PathNode.CurveTo(136.83656f, 132.0f, 144.0f, 139.16344f, 144.0f, 148.0f),
                    PathNode.CurveTo(144.0f, 156.83656f, 136.83656f, 164.0f, 128.0f, 164.0f),
                    PathNode.CurveTo(119.163445f, 164.0f, 112.0f, 156.83656f, 112.0f, 148.0f),
                    PathNode.CurveTo(112.0f, 139.16344f, 119.163445f, 132.0f, 128.0f, 132.0f),
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
        return _numberSquareSix!!
    }

private var _numberSquareSix: ImageVector? = null
