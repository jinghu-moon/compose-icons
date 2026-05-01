package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.NumberFive: ImageVector
    get() {
        if (_numberFive != null) return _numberFive!!
        _numberFive = phosphorRegularIcon(
            name = "NumberFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 160.0f),
                    PathNode.CurveTo(175.99886f, 182.08234f, 163.0208f, 202.10219f, 142.86261f, 211.11754f),
                    PathNode.CurveTo(122.70442f, 220.13289f, 99.13037f, 216.46024f, 82.67f, 201.74f),
                    PathNode.CurveTo(80.42967f, 199.86562f, 79.38902f, 196.9192f, 79.955215f, 194.05359f),
                    PathNode.CurveTo(80.52141f, 191.18797f, 82.60443f, 188.85873f, 85.38927f, 187.97723f),
                    PathNode.CurveTo(88.1741f, 187.09573f, 91.21801f, 187.80212f, 93.33f, 189.82f),
                    PathNode.CurveTo(109.26723f, 204.07452f, 133.59683f, 203.27473f, 148.56348f, 188.0043f),
                    PathNode.CurveTo(163.53015f, 172.73387f, 163.84094f, 148.39313f, 149.2691f, 132.74548f),
                    PathNode.CurveTo(134.69727f, 117.09786f, 110.39602f, 115.67708f, 94.1f, 129.52f),
                    PathNode.CurveTo(91.503654f, 131.70352f, 87.81244f, 132.01204f, 84.88963f, 130.28984f),
                    PathNode.CurveTo(81.966835f, 128.56763f, 80.448074f, 125.189224f, 81.1f, 121.86f),
                    PathNode.LineTo(96.16f, 46.43f),
                    PathNode.CurveTo(96.90798f, 42.692745f, 100.18863f, 40.00211f, 104.0f, 40.0f),
                    PathNode.LineTo(168.0f, 40.0f),
                    PathNode.CurveTo(172.41827f, 40.0f, 176.0f, 43.581722f, 176.0f, 48.0f),
                    PathNode.CurveTo(176.0f, 52.418278f, 172.41827f, 56.0f, 168.0f, 56.0f),
                    PathNode.LineTo(110.56f, 56.0f),
                    PathNode.LineTo(100.24f, 107.6f),
                    PathNode.CurveTo(117.44294f, 101.112526f, 136.73447f, 103.48257f, 151.85553f, 113.94116f),
                    PathNode.CurveTo(166.97658f, 124.39975f, 176.00069f, 141.61447f, 176.0f, 160.0f),
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
        return _numberFive!!
    }

private var _numberFive: ImageVector? = null
