package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextStrikethrough: ImageVector
    get() {
        if (_textStrikethrough != null) return _textStrikethrough!!
        _textStrikethrough = phosphorBoldIcon(
            name = "TextStrikethrough",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 128.0f),
                    PathNode.CurveTo(228.0f, 134.62741f, 222.62741f, 140.0f, 216.0f, 140.0f),
                    PathNode.LineTo(185.86f, 140.0f),
                    PathNode.CurveTo(192.5893f, 147.75647f, 196.20233f, 157.73329f, 196.0f, 168.0f),
                    PathNode.CurveTo(196.0f, 182.45f, 188.19f, 196.32f, 174.57f, 206.05f),
                    PathNode.CurveTo(162.0f, 215.05f, 145.44f, 220.0f, 128.0f, 220.0f),
                    PathNode.CurveTo(110.56f, 220.0f, 94.0f, 215.05f, 81.43f, 206.05f),
                    PathNode.CurveTo(67.81f, 196.32f, 60.0f, 182.45f, 60.0f, 168.0f),
                    PathNode.CurveTo(60.0f, 161.37259f, 65.37258f, 156.0f, 72.0f, 156.0f),
                    PathNode.CurveTo(78.62742f, 156.0f, 84.0f, 161.37259f, 84.0f, 168.0f),
                    PathNode.CurveTo(84.0f, 183.18f, 104.15f, 196.0f, 128.0f, 196.0f),
                    PathNode.CurveTo(151.85f, 196.0f, 172.0f, 183.18f, 172.0f, 168.0f),
                    PathNode.CurveTo(172.0f, 155.24f, 162.7f, 147.82f, 136.65f, 140.0f),
                    PathNode.LineTo(40.0f, 140.0f),
                    PathNode.CurveTo(33.37258f, 140.0f, 28.0f, 134.62741f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 121.37258f, 33.37258f, 116.0f, 40.0f, 116.0f),
                    PathNode.LineTo(216.0f, 116.0f),
                    PathNode.CurveTo(222.62741f, 116.0f, 228.0f, 121.37258f, 228.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(75.11f, 100.0f),
                    PathNode.CurveTo(81.73742f, 100.0f, 87.11f, 94.62742f, 87.11f, 88.0f),
                    PathNode.CurveTo(87.11f, 72.0f, 104.69f, 60.0f, 128.0f, 60.0f),
                    PathNode.CurveTo(145.36f, 60.0f, 159.37f, 66.65f, 165.48f, 77.78f),
                    PathNode.CurveTo(168.83585f, 83.22986f, 175.87817f, 85.08689f, 181.485f, 82.00046f),
                    PathNode.CurveTo(187.09186f, 78.91403f, 189.2897f, 71.97051f, 186.48f, 66.22f),
                    PathNode.CurveTo(176.13f, 47.3f, 154.25f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(91.0f, 36.0f, 63.11f, 58.35f, 63.11f, 88.0f),
                    PathNode.CurveTo(63.11f, 94.62742f, 68.48258f, 100.0f, 75.11f, 100.0f),
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
        return _textStrikethrough!!
    }

private var _textStrikethrough: ImageVector? = null
