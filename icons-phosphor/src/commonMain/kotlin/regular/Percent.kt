package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Percent: ImageVector
    get() {
        if (_percent != null) return _percent!!
        _percent = phosphorRegularIcon(
            name = "Percent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(205.66f, 61.64f),
                    PathNode.LineTo(61.66f, 205.64f),
                    PathNode.CurveTo(58.53407f, 208.76593f, 53.46593f, 208.76593f, 50.34f, 205.64f),
                    PathNode.CurveTo(47.21407f, 202.51407f, 47.21407f, 197.44594f, 50.34f, 194.32f),
                    PathNode.LineTo(194.34f, 50.32f),
                    PathNode.CurveTo(197.46317f, 47.19407f, 202.52907f, 47.19183f, 205.655f, 50.315f),
                    PathNode.CurveTo(208.78093f, 53.43817f, 208.78317f, 58.504066f, 205.66f, 61.63f),
                    PathNode.Close,
                    PathNode.MoveTo(50.54f, 101.44f),
                    PathNode.CurveTo(36.48159f, 87.37883f, 36.48383f, 64.583405f, 50.545f, 50.525f),
                    PathNode.CurveTo(64.60617f, 36.46659f, 87.40159f, 36.46883f, 101.46f, 50.53f),
                    PathNode.LineTo(101.46f, 50.53f),
                    PathNode.CurveTo(115.51841f, 64.59117f, 115.51617f, 87.38659f, 101.455f, 101.445f),
                    PathNode.CurveTo(87.39383f, 115.50341f, 64.59841f, 115.50117f, 50.54f, 101.44f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 76.0f),
                    PathNode.CurveTo(56.007126f, 85.05054f, 62.091225f, 92.96832f, 70.83472f, 95.305756f),
                    PathNode.CurveTo(79.57821f, 97.64318f, 88.801704f, 93.81762f, 93.32413f, 85.97798f),
                    PathNode.CurveTo(97.84655f, 78.13835f, 96.54066f, 68.23873f, 90.14f, 61.84f),
                    PathNode.LineTo(90.14f, 61.84f),
                    PathNode.CurveTo(84.41754f, 56.119263f, 75.81184f, 54.410255f, 68.33767f, 57.51026f),
                    PathNode.CurveTo(60.86349f, 60.61027f, 55.993633f, 67.90844f, 56.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 180.0f),
                    PathNode.CurveTo(215.99603f, 197.17444f, 203.86086f, 211.9545f, 187.0157f, 215.30147f),
                    PathNode.CurveTo(170.17053f, 218.64842f, 153.30687f, 209.63016f, 146.73763f, 193.76173f),
                    PathNode.CurveTo(140.16838f, 177.89333f, 145.72311f, 159.59422f, 160.00487f, 150.05516f),
                    PathNode.CurveTo(174.28662f, 140.51614f, 193.31781f, 142.39384f, 205.46f, 154.54f),
                    PathNode.LineTo(205.46f, 154.54f),
                    PathNode.CurveTo(212.23332f, 161.27794f, 216.02878f, 170.4461f, 216.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 180.0f),
                    PathNode.CurveTo(200.00204f, 170.45839f, 193.26358f, 162.24413f, 183.90569f, 160.3808f),
                    PathNode.CurveTo(174.54779f, 158.51747f, 165.17682f, 163.52406f, 161.5238f, 172.33868f),
                    PathNode.CurveTo(157.87079f, 181.15334f, 160.95316f, 191.32092f, 168.88582f, 196.62328f),
                    PathNode.CurveTo(176.8185f, 201.92563f, 187.39204f, 200.88591f, 194.14f, 194.14f),
                    PathNode.CurveTo(197.90318f, 190.3983f, 200.01326f, 185.30675f, 200.0f, 180.0f),
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
        return _percent!!
    }

private var _percent: ImageVector? = null
