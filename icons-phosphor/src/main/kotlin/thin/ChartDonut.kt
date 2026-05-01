package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChartDonut: ImageVector
    get() {
        if (_chartDonut != null) return _chartDonut!!
        _chartDonut = phosphorThinIcon(
            name = "ChartDonut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(125.79086f, 28.0f, 124.0f, 29.790861f, 124.0f, 32.0f),
                    PathNode.LineTo(124.0f, 88.0f),
                    PathNode.CurveTo(124.0f, 90.20914f, 125.79086f, 92.0f, 128.0f, 92.0f),
                    PathNode.CurveTo(144.29352f, 92.0014f, 158.55478f, 102.94615f, 162.77084f, 118.684746f),
                    PathNode.CurveTo(166.98691f, 134.42336f, 160.10652f, 151.03152f, 145.99557f, 159.17769f),
                    PathNode.CurveTo(131.88463f, 167.32384f, 114.06154f, 164.9768f, 102.54053f, 153.45529f),
                    PathNode.CurveTo(91.01951f, 141.93379f, 88.67324f, 124.1106f, 96.82f, 110.0f),
                    PathNode.CurveTo(97.351814f, 109.08002f, 97.49571f, 107.98623f, 97.219925f, 106.96f),
                    PathNode.CurveTo(96.94414f, 105.93378f, 96.27134f, 105.05946f, 95.35f, 104.53f),
                    PathNode.LineTo(46.85f, 76.53f),
                    PathNode.CurveTo(44.9362f, 75.42921f, 42.492435f, 76.08715f, 41.39f, 78.0f),
                    PathNode.CurveTo(18.760063f, 117.1962f, 25.277576f, 166.7052f, 57.280544f, 198.70937f),
                    PathNode.CurveTo(89.28351f, 230.71352f, 138.79227f, 237.23288f, 177.9893f, 214.6044f),
                    PathNode.CurveTo(217.18636f, 191.97594f, 236.29826f, 145.84184f, 224.58658f, 102.1235f),
                    PathNode.CurveTo(212.8749f, 58.405163f, 173.25987f, 28.003376f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(46.38f, 85.5f),
                    PathNode.LineTo(88.05f, 109.5f),
                    PathNode.CurveTo(84.30624f, 117.59649f, 83.12018f, 126.64202f, 84.65f, 135.43f),
                    PathNode.LineTo(38.18f, 147.93f),
                    PathNode.CurveTo(33.501717f, 126.80256f, 36.404465f, 104.702705f, 46.38f, 85.5f),
                    PathNode.Close,
                    PathNode.MoveTo(40.25f, 155.65f),
                    PathNode.LineTo(86.71f, 143.2f),
                    PathNode.CurveTo(92.60104f, 159.1163f, 107.101135f, 170.24121f, 124.0f, 171.81f),
                    PathNode.LineTo(124.0f, 219.91f),
                    PathNode.CurveTo(85.366905f, 218.18056f, 51.921513f, 192.51845f, 40.25f, 155.65f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 219.91f),
                    PathNode.LineTo(132.0f, 171.81f),
                    PathNode.CurveTo(154.64322f, 169.72702f, 171.96939f, 150.73383f, 171.96939f, 127.995f),
                    PathNode.CurveTo(171.96939f, 105.25618f, 154.64322f, 86.262985f, 132.0f, 84.18f),
                    PathNode.LineTo(132.0f, 36.09f),
                    PathNode.CurveTo(181.1799f, 38.266953f, 219.9316f, 78.77195f, 219.9316f, 128.0f),
                    PathNode.CurveTo(219.9316f, 177.22806f, 181.1799f, 217.73305f, 132.0f, 219.91f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _chartDonut!!
    }

private var _chartDonut: ImageVector? = null
