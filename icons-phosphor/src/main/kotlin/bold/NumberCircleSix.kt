package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberCircleSix: ImageVector
    get() {
        if (_numberCircleSix != null) return _numberCircleSix!!
        _numberCircleSix = phosphorBoldIcon(
            name = "NumberCircleSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(68.35325f, 20.0f, 20.0f, 68.35325f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 187.64676f, 68.35325f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(187.64676f, 236.0f, 236.0f, 187.64676f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.93387f, 68.38066f, 187.61934f, 20.066133f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(81.60808f, 212.0f, 44.0f, 174.39192f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 81.60808f, 81.60808f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(174.39192f, 44.0f, 212.0f, 81.60808f, 212.0f, 128.0f),
                    PathNode.CurveTo(211.9504f, 174.37135f, 174.37135f, 211.9504f, 128.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(133.06f, 108.33f),
                    PathNode.LineTo(146.3f, 86.15f),
                    PathNode.CurveTo(148.62556f, 82.46469f, 148.77048f, 77.80829f, 146.67857f, 73.9855f),
                    PathNode.CurveTo(144.58669f, 70.162704f, 140.58678f, 67.77442f, 136.22916f, 67.74628f),
                    PathNode.CurveTo(131.87152f, 67.71814f, 127.8411f, 70.05455f, 125.7f, 73.85f),
                    PathNode.LineTo(93.46f, 127.85f),
                    PathNode.CurveTo(84.56796f, 143.09798f, 86.72174f, 162.37192f, 98.76021f, 175.281f),
                    PathNode.CurveTo(110.79866f, 188.1901f, 129.87558f, 191.68225f, 145.70633f, 183.8748f),
                    PathNode.CurveTo(161.5371f, 176.06737f, 170.37886f, 158.80623f, 167.46494f, 141.3971f),
                    PathNode.CurveTo(164.551f, 123.987946f, 150.5703f, 110.54683f, 133.06f, 108.32f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 164.0f),
                    PathNode.CurveTo(119.163445f, 164.0f, 112.0f, 156.83656f, 112.0f, 148.0f),
                    PathNode.CurveTo(112.0f, 139.16344f, 119.163445f, 132.0f, 128.0f, 132.0f),
                    PathNode.CurveTo(136.83656f, 132.0f, 144.0f, 139.16344f, 144.0f, 148.0f),
                    PathNode.CurveTo(144.0f, 156.83656f, 136.83656f, 164.0f, 128.0f, 164.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _numberCircleSix!!
    }

private var _numberCircleSix: ImageVector? = null
