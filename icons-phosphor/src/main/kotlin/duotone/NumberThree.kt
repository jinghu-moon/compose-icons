package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NumberThree: ImageVector
    get() {
        if (_numberThree != null) return _numberThree!!
        _numberThree = phosphorDuotoneIcon(
            name = "NumberThree",
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
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 160.0f),
                    PathNode.CurveTo(175.99886f, 182.08234f, 163.0208f, 202.10219f, 142.86261f, 211.11754f),
                    PathNode.CurveTo(122.70442f, 220.13289f, 99.13037f, 216.46024f, 82.67f, 201.74f),
                    PathNode.CurveTo(80.42967f, 199.86562f, 79.38902f, 196.9192f, 79.955215f, 194.05359f),
                    PathNode.CurveTo(80.52141f, 191.18797f, 82.60443f, 188.85873f, 85.38927f, 187.97723f),
                    PathNode.CurveTo(88.1741f, 187.09573f, 91.21801f, 187.80212f, 93.33f, 189.82f),
                    PathNode.CurveTo(106.61962f, 201.70143f, 126.167725f, 203.3546f, 141.26393f, 193.87372f),
                    PathNode.CurveTo(156.36014f, 184.39285f, 163.36049f, 166.06647f, 158.4295f, 148.93558f),
                    PathNode.CurveTo(153.4985f, 131.80467f, 137.82645f, 120.00436f, 120.0f, 120.0f),
                    PathNode.CurveTo(116.969826f, 120.0f, 114.19972f, 118.28798f, 112.84458f, 115.577705f),
                    PathNode.CurveTo(111.48945f, 112.86744f, 111.78189f, 109.62414f, 113.6f, 107.2f),
                    PathNode.LineTo(152.0f, 56.0f),
                    PathNode.LineTo(88.0f, 56.0f),
                    PathNode.CurveTo(83.58172f, 56.0f, 80.0f, 52.418278f, 80.0f, 48.0f),
                    PathNode.CurveTo(80.0f, 43.581722f, 83.58172f, 40.0f, 88.0f, 40.0f),
                    PathNode.LineTo(168.0f, 40.0f),
                    PathNode.CurveTo(171.03018f, 40.0f, 173.80028f, 41.71202f, 175.15541f, 44.42229f),
                    PathNode.CurveTo(176.51056f, 47.132565f, 176.21811f, 50.37586f, 174.4f, 52.8f),
                    PathNode.LineTo(134.56f, 105.92f),
                    PathNode.CurveTo(158.99147f, 112.53422f, 175.96811f, 134.68907f, 176.0f, 160.0f),
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
        return _numberThree!!
    }

private var _numberThree: ImageVector? = null
