package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BracketsRound: ImageVector
    get() {
        if (_bracketsRound != null) return _bracketsRound!!
        _bracketsRound = phosphorBoldIcon(
            name = "BracketsRound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(82.33f, 222.19f),
                    PathNode.CurveTo(80.68812f, 224.92462f, 78.02506f, 226.89305f, 74.92911f, 227.66048f),
                    PathNode.CurveTo(71.83314f, 228.4279f, 68.55903f, 227.93117f, 65.83f, 226.28f),
                    PathNode.CurveTo(64.0f, 225.16f, 20.0f, 198.0f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 58.0f, 64.0f, 30.84f, 65.83f, 29.72f),
                    PathNode.CurveTo(71.480125f, 26.530424f, 78.64223f, 28.40953f, 81.99868f, 33.962143f),
                    PathNode.CurveTo(85.355125f, 39.51476f, 83.69018f, 46.729652f, 78.24f, 50.25f),
                    PathNode.CurveTo(76.71f, 51.21f, 44.0f, 72.31f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 183.69f, 76.85f, 204.88f, 78.25f, 205.75f),
                    PathNode.CurveTo(83.90565f, 209.17108f, 85.72985f, 216.52156f, 82.33f, 222.19f),
                    PathNode.Close,
                    PathNode.MoveTo(190.17f, 29.72f),
                    PathNode.CurveTo(186.49847f, 27.390306f, 181.85393f, 27.229057f, 178.02965f, 29.298508f),
                    PathNode.CurveTo(174.20538f, 31.36796f, 171.79984f, 35.34429f, 171.7418f, 39.692192f),
                    PathNode.CurveTo(171.68376f, 44.040092f, 173.98233f, 48.079216f, 177.75f, 50.25f),
                    PathNode.CurveTo(179.15f, 51.12f, 212.0f, 72.19f, 212.0f, 128.0f),
                    PathNode.CurveTo(212.0f, 183.81f, 179.15f, 204.88f, 177.83f, 205.7f),
                    PathNode.CurveTo(174.0691f, 207.86368f, 171.76912f, 211.889f, 171.81471f, 216.22763f),
                    PathNode.CurveTo(171.86034f, 220.56627f, 174.24445f, 224.54236f, 178.05f, 226.62648f),
                    PathNode.CurveTo(181.85555f, 228.7106f, 186.48973f, 228.57812f, 190.17f, 226.28f),
                    PathNode.CurveTo(192.0f, 225.16f, 236.0f, 198.0f, 236.0f, 128.0f),
                    PathNode.CurveTo(236.0f, 58.0f, 192.0f, 30.84f, 190.17f, 29.72f),
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
        return _bracketsRound!!
    }

private var _bracketsRound: ImageVector? = null
