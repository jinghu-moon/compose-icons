package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Carrot: ImageVector
    get() {
        if (_carrot != null) return _carrot!!
        _carrot = phosphorRegularIcon(
            name = "Carrot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 64.0f),
                    PathNode.LineTo(203.31f, 64.0f),
                    PathNode.LineTo(229.66f, 37.66f),
                    PathNode.CurveTo(232.78593f, 34.53407f, 232.78593f, 29.46593f, 229.66f, 26.34f),
                    PathNode.CurveTo(226.53407f, 23.21407f, 221.46593f, 23.214067f, 218.34f, 26.34f),
                    PathNode.LineTo(192.0f, 52.69f),
                    PathNode.LineTo(192.0f, 24.0f),
                    PathNode.CurveTo(192.0f, 19.581722f, 188.41827f, 16.0f, 184.0f, 16.0f),
                    PathNode.CurveTo(179.58173f, 16.0f, 176.0f, 19.581722f, 176.0f, 24.0f),
                    PathNode.LineTo(176.0f, 56.57f),
                    PathNode.CurveTo(150.93813f, 42.102043f, 119.28602f, 46.251255f, 98.8f, 66.69f),
                    PathNode.LineTo(98.8f, 66.69f),
                    PathNode.LineTo(98.8f, 66.69f),
                    PathNode.LineTo(98.8f, 66.69f),
                    PathNode.CurveTo(58.7f, 106.08f, 28.55f, 199.77f, 25.61f, 209.14f),
                    PathNode.CurveTo(22.77043f, 215.23526f, 24.044918f, 222.45557f, 28.799673f, 227.21033f),
                    PathNode.CurveTo(33.554432f, 231.96509f, 40.774734f, 233.23956f, 46.87f, 230.4f),
                    PathNode.CurveTo(56.24f, 227.46f, 150.05f, 197.27f, 189.34f, 157.19f),
                    PathNode.CurveTo(209.7639f, 136.69832f, 213.90048f, 105.052956f, 199.43f, 80.0f),
                    PathNode.LineTo(232.0f, 80.0f),
                    PathNode.CurveTo(236.41827f, 80.0f, 240.0f, 76.41828f, 240.0f, 72.0f),
                    PathNode.CurveTo(240.0f, 67.58172f, 236.41827f, 64.0f, 232.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(177.88f, 146.0f),
                    PathNode.CurveTo(168.94f, 155.12f, 156.63f, 163.8f, 143.03f, 171.73f),
                    PathNode.LineTo(117.65f, 146.34f),
                    PathNode.CurveTo(114.52407f, 143.21407f, 109.45593f, 143.21407f, 106.33f, 146.34f),
                    PathNode.CurveTo(103.20407f, 149.46593f, 103.20407f, 154.53407f, 106.33f, 157.66f),
                    PathNode.LineTo(128.42f, 179.75f),
                    PathNode.CurveTo(87.55f, 200.94f, 42.1f, 215.17f, 41.42f, 215.38f),
                    PathNode.CurveTo(40.927563f, 215.53981f, 40.45196f, 215.74748f, 40.0f, 216.0f),
                    PathNode.CurveTo(40.241608f, 215.5501f, 40.439194f, 215.07791f, 40.59f, 214.59f),
                    PathNode.CurveTo(40.88f, 213.66f, 68.59f, 125.01f, 104.59f, 83.92f),
                    PathNode.LineTo(138.36f, 117.69f),
                    PathNode.CurveTo(141.48593f, 120.81593f, 146.55406f, 120.81593f, 149.68f, 117.69f),
                    PathNode.CurveTo(152.80594f, 114.56407f, 152.80594f, 109.49593f, 149.68f, 106.37f),
                    PathNode.LineTo(116.18f, 72.88f),
                    PathNode.CurveTo(136.53076f, 58.4005f, 164.58473f, 61.94703f, 180.69191f, 81.03547f),
                    PathNode.CurveTo(196.79907f, 100.12391f, 195.57628f, 128.3747f, 177.88f, 146.0f),
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
        return _carrot!!
    }

private var _carrot: ImageVector? = null
