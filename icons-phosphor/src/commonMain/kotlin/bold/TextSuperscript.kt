package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextSuperscript: ImageVector
    get() {
        if (_textSuperscript != null) return _textSuperscript!!
        _textSuperscript = phosphorBoldIcon(
            name = "TextSuperscript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(252.0f, 144.0f),
                    PathNode.CurveTo(252.0f, 150.62741f, 246.62741f, 156.0f, 240.0f, 156.0f),
                    PathNode.LineTo(192.0f, 156.0f),
                    PathNode.CurveTo(187.45474f, 156.0f, 183.29956f, 153.43199f, 181.26688f, 149.36656f),
                    PathNode.CurveTo(179.23418f, 145.30115f, 179.67284f, 140.43622f, 182.4f, 136.8f),
                    PathNode.LineTo(225.57f, 79.25f),
                    PathNode.CurveTo(228.4091f, 75.47685f, 228.77148f, 70.389435f, 226.49586f, 66.25196f),
                    PathNode.CurveTo(224.22026f, 62.114487f, 219.72972f, 59.696175f, 215.02283f, 60.073326f),
                    PathNode.CurveTo(210.31593f, 60.450474f, 206.26776f, 63.552963f, 204.68f, 68.0f),
                    PathNode.CurveTo(202.47084f, 74.2491f, 195.6141f, 77.52414f, 189.365f, 75.315f),
                    PathNode.CurveTo(183.1159f, 73.10586f, 179.84087f, 66.2491f, 182.05f, 60.0f),
                    PathNode.CurveTo(183.28308f, 56.53478f, 185.0365f, 53.277466f, 187.25f, 50.34f),
                    PathNode.CurveTo(199.26736f, 34.62593f, 221.71283f, 31.55277f, 237.51178f, 43.458317f),
                    PathNode.CurveTo(253.31075f, 55.363865f, 256.54312f, 77.78694f, 244.75f, 93.67f),
                    PathNode.LineTo(216.0f, 132.0f),
                    PathNode.LineTo(240.0f, 132.0f),
                    PathNode.CurveTo(246.62741f, 132.0f, 252.0f, 137.37259f, 252.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(151.86f, 70.94f),
                    PathNode.CurveTo(149.45596f, 68.85373f, 146.32153f, 67.808075f, 143.14644f, 68.03313f),
                    PathNode.CurveTo(139.97133f, 68.25818f, 137.01573f, 69.7355f, 134.93f, 72.14f),
                    PathNode.LineTo(92.0f, 121.68f),
                    PathNode.LineTo(49.07f, 72.14f),
                    PathNode.CurveTo(44.729046f, 67.130775f, 37.149223f, 66.58904f, 32.14f, 70.93f),
                    PathNode.CurveTo(27.130777f, 75.27096f, 26.589043f, 82.85078f, 30.93f, 87.86f),
                    PathNode.LineTo(76.12f, 140.0f),
                    PathNode.LineTo(30.93f, 192.14f),
                    PathNode.CurveTo(26.589043f, 197.14922f, 27.130777f, 204.72903f, 32.14f, 209.07f),
                    PathNode.CurveTo(37.149223f, 213.41096f, 44.729046f, 212.86922f, 49.07f, 207.86f),
                    PathNode.LineTo(92.0f, 158.32f),
                    PathNode.LineTo(134.93f, 207.86f),
                    PathNode.CurveTo(139.27097f, 212.86922f, 146.85078f, 213.41096f, 151.86f, 209.07f),
                    PathNode.CurveTo(156.86922f, 204.72903f, 157.41096f, 197.14922f, 153.07f, 192.14f),
                    PathNode.LineTo(107.88f, 140.0f),
                    PathNode.LineTo(153.07f, 87.86f),
                    PathNode.CurveTo(157.40524f, 82.85256f, 156.86368f, 75.27959f, 151.86f, 70.94f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _textSuperscript!!
    }

private var _textSuperscript: ImageVector? = null
