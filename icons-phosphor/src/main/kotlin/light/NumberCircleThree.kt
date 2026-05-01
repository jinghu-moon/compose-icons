package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberCircleThree: ImageVector
    get() {
        if (_numberCircleThree != null) return _numberCircleThree!!
        _numberCircleThree = phosphorLightIcon(
            name = "NumberCircleThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 26.0f),
                    PathNode.CurveTo(71.666954f, 26.0f, 26.0f, 71.666954f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 184.33304f, 71.666954f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(184.33304f, 230.0f, 230.0f, 184.33304f, 230.0f, 128.0f),
                    PathNode.CurveTo(229.93387f, 71.69437f, 184.30563f, 26.066126f, 128.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 218.0f),
                    PathNode.CurveTo(78.29437f, 218.0f, 38.0f, 177.70563f, 38.0f, 128.0f),
                    PathNode.CurveTo(38.0f, 78.29437f, 78.29437f, 38.0f, 128.0f, 38.0f),
                    PathNode.CurveTo(177.70563f, 38.0f, 218.0f, 78.29437f, 218.0f, 128.0f),
                    PathNode.CurveTo(217.94489f, 177.68279f, 177.68279f, 217.94489f, 128.0f, 218.0f),
                    PathNode.Close,
                    PathNode.MoveTo(158.0f, 152.0f),
                    PathNode.CurveTo(157.99973f, 165.81589f, 149.63919f, 178.25786f, 136.84764f, 183.4785f),
                    PathNode.CurveTo(124.05611f, 188.69913f, 109.37733f, 185.66023f, 99.71f, 175.79f),
                    PathNode.CurveTo(97.393166f, 173.4207f, 97.4357f, 169.62184f, 99.805f, 167.305f),
                    PathNode.CurveTo(102.1743f, 164.98816f, 105.97317f, 165.0307f, 108.29f, 167.4f),
                    PathNode.CurveTo(115.27932f, 174.53053f, 126.19416f, 176.06004f, 134.8742f, 171.12529f),
                    PathNode.CurveTo(143.55424f, 166.19052f, 147.82259f, 156.0291f, 145.27017f, 146.37611f),
                    PathNode.CurveTo(142.71777f, 136.72313f, 133.98474f, 129.99948f, 124.0f, 130.0f),
                    PathNode.CurveTo(121.762184f, 130.00151f, 119.709496f, 128.75755f, 118.67522f, 126.77309f),
                    PathNode.CurveTo(117.640945f, 124.78861f, 117.79699f, 122.39349f, 119.08f, 120.56f),
                    PathNode.LineTo(140.48f, 90.0f),
                    PathNode.LineTo(104.0f, 90.0f),
                    PathNode.CurveTo(100.686295f, 90.0f, 98.0f, 87.313705f, 98.0f, 84.0f),
                    PathNode.CurveTo(98.0f, 80.686295f, 100.686295f, 78.0f, 104.0f, 78.0f),
                    PathNode.LineTo(152.0f, 78.0f),
                    PathNode.CurveTo(154.23781f, 77.99848f, 156.29051f, 79.242455f, 157.32478f, 81.22691f),
                    PathNode.CurveTo(158.35905f, 83.21139f, 158.20302f, 85.60651f, 156.92f, 87.44f),
                    PathNode.LineTo(134.39f, 119.62f),
                    PathNode.CurveTo(148.44864f, 124.15192f, 157.98383f, 137.22896f, 158.0f, 152.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _numberCircleThree!!
    }

private var _numberCircleThree: ImageVector? = null
