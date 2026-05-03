package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BeachBall: ImageVector
    get() {
        if (_beachBall != null) return _beachBall!!
        _beachBall = phosphorLightIcon(
            name = "BeachBall",
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
                    PathNode.MoveTo(213.0f, 98.45f),
                    PathNode.CurveTo(198.06375f, 93.50566f, 182.59117f, 90.360115f, 166.91f, 89.08f),
                    PathNode.CurveTo(165.63234f, 73.40261f, 162.49016f, 57.933445f, 157.55f, 43.0f),
                    PathNode.CurveTo(183.49966f, 52.096046f, 203.90396f, 72.50033f, 213.0f, 98.45f),
                    PathNode.Close,
                    PathNode.MoveTo(143.52f, 39.34f),
                    PathNode.CurveTo(148.28789f, 51.93695f, 151.67764f, 65.013176f, 153.63f, 78.34f),
                    PathNode.CurveTo(136.2358f, 63.69723f, 116.45458f, 52.152557f, 95.15f, 44.21f),
                    PathNode.CurveTo(110.52341f, 38.18892f, 127.254875f, 36.504356f, 143.52f, 39.34f),
                    PathNode.Close,
                    PathNode.MoveTo(80.15f, 51.81f),
                    PathNode.CurveTo(104.72465f, 59.2853f, 127.48562f, 71.767235f, 147.0f, 88.47f),
                    PathNode.CurveTo(108.043465f, 89.18384f, 70.16023f, 101.35712f, 38.08f, 123.47f),
                    PathNode.CurveTo(39.585255f, 94.15412f, 55.28502f, 67.4119f, 80.15f, 51.81f),
                    PathNode.Close,
                    PathNode.MoveTo(38.55f, 138.0f),
                    PathNode.CurveTo(72.18765f, 112.63391f, 113.43477f, 99.42779f, 155.55f, 100.54f),
                    PathNode.CurveTo(156.66223f, 142.65523f, 143.45609f, 183.90233f, 118.09f, 217.54f),
                    PathNode.CurveTo(76.26349f, 212.83748f, 43.252525f, 179.8265f, 38.55f, 138.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.55f, 217.94f),
                    PathNode.CurveTo(154.66422f, 185.85667f, 166.83752f, 147.96985f, 167.55f, 109.01f),
                    PathNode.CurveTo(184.2547f, 128.53815f, 196.73654f, 151.31255f, 204.21f, 175.9f),
                    PathNode.CurveTo(188.58974f, 200.73442f, 161.85065f, 216.40248f, 132.55f, 217.89f),
                    PathNode.Close,
                    PathNode.MoveTo(211.79f, 160.94f),
                    PathNode.CurveTo(203.85353f, 139.63681f, 192.31567f, 119.8557f, 177.68f, 102.46f),
                    PathNode.CurveTo(191.00682f, 104.41235f, 204.08305f, 107.80212f, 216.68f, 112.57f),
                    PathNode.CurveTo(219.51566f, 128.83513f, 217.83109f, 145.56659f, 211.81f, 160.94f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _beachBall!!
    }

private var _beachBall: ImageVector? = null
