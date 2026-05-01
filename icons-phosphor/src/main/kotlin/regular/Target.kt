package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Target: ImageVector
    get() {
        if (_target != null) return _target!!
        _target = phosphorRegularIcon(
            name = "Target",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(221.87f, 83.16f),
                    PathNode.CurveTo(244.8631f, 131.24925f, 227.816f, 188.93752f, 182.37741f, 216.80495f),
                    PathNode.CurveTo(136.93881f, 244.67238f, 77.79104f, 233.71436f, 45.35121f, 191.41876f),
                    PathNode.CurveTo(12.911386f, 149.12317f, 17.6616f, 89.15674f, 56.355915f, 52.49601f),
                    PathNode.CurveTo(95.05023f, 15.835277f, 155.18558f, 14.326214f, 195.67f, 49.0f),
                    PathNode.LineTo(218.34f, 26.32f),
                    PathNode.CurveTo(221.46593f, 23.194069f, 226.53407f, 23.194069f, 229.66f, 26.32f),
                    PathNode.CurveTo(232.78593f, 29.445932f, 232.78593f, 34.51407f, 229.66f, 37.64f),
                    PathNode.LineTo(133.66f, 133.64f),
                    PathNode.CurveTo(130.53407f, 136.76593f, 125.465935f, 136.76593f, 122.34f, 133.64f),
                    PathNode.CurveTo(119.214066f, 130.51407f, 119.214066f, 125.44593f, 122.34f, 122.32f),
                    PathNode.LineTo(150.06f, 94.6f),
                    PathNode.CurveTo(134.59398f, 84.37136f, 114.12585f, 86.11279f, 100.61013f, 98.807205f),
                    PathNode.CurveTo(87.094406f, 111.50162f, 84.0749f, 131.82057f, 93.315155f, 147.89665f),
                    PathNode.CurveTo(102.55541f, 163.97273f, 121.63267f, 171.59084f, 139.40474f, 166.30157f),
                    PathNode.CurveTo(157.1768f, 161.0123f, 168.98389f, 144.20248f, 167.93f, 125.69f),
                    PathNode.CurveTo(167.68147f, 121.27172f, 171.06172f, 117.488525f, 175.48f, 117.24f),
                    PathNode.CurveTo(179.89828f, 116.99147f, 183.68147f, 120.37172f, 183.93f, 124.79f),
                    PathNode.CurveTo(185.43248f, 151.00995f, 168.51167f, 174.75165f, 143.23663f, 181.88716f),
                    PathNode.CurveTo(117.96159f, 189.02269f, 91.12321f, 177.63484f, 78.692154f, 154.5002f),
                    PathNode.CurveTo(66.26109f, 131.36554f, 71.57735f, 102.6999f, 91.47736f, 85.56127f),
                    PathNode.CurveTo(111.377396f, 68.422646f, 140.51445f, 67.415855f, 161.55f, 83.14f),
                    PathNode.LineTo(184.3f, 60.39f),
                    PathNode.CurveTo(149.77527f, 31.725594f, 99.20022f, 33.67621f, 66.98586f, 64.91466f),
                    PathNode.CurveTo(34.7715f, 96.1531f, 31.266474f, 146.64424f, 58.855583f, 182.03416f),
                    PathNode.CurveTo(86.444695f, 217.42409f, 136.26512f, 226.34401f, 174.41931f, 202.72487f),
                    PathNode.CurveTo(212.5735f, 179.10574f, 226.80466f, 130.53503f, 207.43f, 90.06f),
                    PathNode.CurveTo(205.52461f, 86.0725f, 207.21251f, 81.29538f, 211.2f, 79.39f),
                    PathNode.CurveTo(215.1875f, 77.48462f, 219.96461f, 79.1725f, 221.87f, 83.16f),
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
        return _target!!
    }

private var _target: ImageVector? = null
