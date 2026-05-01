package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextAa: ImageVector
    get() {
        if (_textAa != null) return _textAa!!
        _textAa = phosphorBoldIcon(
            name = "TextAa",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(90.86f, 50.89f),
                    PathNode.CurveTo(88.88175f, 46.681576f, 84.65019f, 43.994938f, 80.0f, 43.994938f),
                    PathNode.CurveTo(75.34981f, 43.994938f, 71.11825f, 46.681576f, 69.14f, 50.89f),
                    PathNode.LineTo(5.14f, 186.89f),
                    PathNode.CurveTo(2.474902f, 192.85628f, 5.073428f, 199.85823f, 10.985565f, 202.64137f),
                    PathNode.CurveTo(16.897703f, 205.42451f, 23.94991f, 202.96565f, 26.85f, 197.11f),
                    PathNode.LineTo(42.44f, 164.0f),
                    PathNode.LineTo(117.56f, 164.0f),
                    PathNode.LineTo(133.14f, 197.11f),
                    PathNode.CurveTo(135.96217f, 203.10782f, 143.11218f, 205.68217f, 149.11f, 202.86f),
                    PathNode.CurveTo(155.10782f, 200.03783f, 157.68217f, 192.88782f, 154.86f, 186.89f),
                    PathNode.Close,
                    PathNode.MoveTo(53.74f, 140.0f),
                    PathNode.LineTo(80.0f, 84.18f),
                    PathNode.LineTo(106.27f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 84.0f),
                    PathNode.CurveTo(186.15f, 84.0f, 175.23f, 87.86f, 167.55f, 95.48f),
                    PathNode.CurveTo(164.26018f, 98.44376f, 162.86981f, 102.97836f, 163.93295f, 107.276794f),
                    PathNode.CurveTo(164.99611f, 111.575226f, 168.33998f, 114.93889f, 172.63206f, 116.02738f),
                    PathNode.CurveTo(176.92416f, 117.115875f, 181.46689f, 115.75228f, 184.45f, 112.48f),
                    PathNode.CurveTo(187.45f, 109.48f, 192.71f, 107.96f, 200.0f, 107.96f),
                    PathNode.CurveTo(211.0f, 107.96f, 220.0f, 115.14f, 220.0f, 123.96f),
                    PathNode.LineTo(220.0f, 128.35f),
                    PathNode.CurveTo(213.73093f, 125.45708f, 206.90433f, 123.97229f, 200.0f, 124.0f),
                    PathNode.CurveTo(175.74f, 124.0f, 156.0f, 141.94f, 156.0f, 164.0f),
                    PathNode.CurveTo(156.0f, 186.06f, 175.74f, 204.0f, 200.0f, 204.0f),
                    PathNode.CurveTo(207.66138f, 204.01952f, 215.21227f, 202.17299f, 222.0f, 198.62f),
                    PathNode.CurveTo(224.92455f, 203.02892f, 230.39148f, 205.00229f, 235.45776f, 203.4778f),
                    PathNode.CurveTo(240.52406f, 201.95331f, 243.99416f, 197.2907f, 244.0f, 192.0f),
                    PathNode.LineTo(244.0f, 124.0f),
                    PathNode.CurveTo(244.0f, 101.94f, 224.26f, 84.0f, 200.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 180.0f),
                    PathNode.CurveTo(189.0f, 180.0f, 180.0f, 172.82f, 180.0f, 164.0f),
                    PathNode.CurveTo(180.0f, 155.18f, 189.0f, 148.0f, 200.0f, 148.0f),
                    PathNode.CurveTo(211.0f, 148.0f, 220.0f, 155.18f, 220.0f, 164.0f),
                    PathNode.CurveTo(220.0f, 172.82f, 211.0f, 180.0f, 200.0f, 180.0f),
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
        return _textAa!!
    }

private var _textAa: ImageVector? = null
