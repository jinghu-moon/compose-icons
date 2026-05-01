package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChatCenteredText: ImageVector
    get() {
        if (_chatCenteredText != null) return _chatCenteredText!!
        _chatCenteredText = phosphorThinIcon(
            name = "ChatCenteredText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(164.0f, 104.0f),
                    PathNode.CurveTo(164.0f, 106.20914f, 162.20914f, 108.0f, 160.0f, 108.0f),
                    PathNode.LineTo(96.0f, 108.0f),
                    PathNode.CurveTo(93.79086f, 108.0f, 92.0f, 106.20914f, 92.0f, 104.0f),
                    PathNode.CurveTo(92.0f, 101.79086f, 93.79086f, 100.0f, 96.0f, 100.0f),
                    PathNode.LineTo(160.0f, 100.0f),
                    PathNode.CurveTo(162.20914f, 100.0f, 164.0f, 101.79086f, 164.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 132.0f),
                    PathNode.LineTo(96.0f, 132.0f),
                    PathNode.CurveTo(93.79086f, 132.0f, 92.0f, 133.79086f, 92.0f, 136.0f),
                    PathNode.CurveTo(92.0f, 138.20914f, 93.79086f, 140.0f, 96.0f, 140.0f),
                    PathNode.LineTo(160.0f, 140.0f),
                    PathNode.CurveTo(162.20914f, 140.0f, 164.0f, 138.20914f, 164.0f, 136.0f),
                    PathNode.CurveTo(164.0f, 133.79086f, 162.20914f, 132.0f, 160.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 56.0f),
                    PathNode.LineTo(228.0f, 184.0f),
                    PathNode.CurveTo(228.0f, 190.62741f, 222.62741f, 196.0f, 216.0f, 196.0f),
                    PathNode.LineTo(153.25f, 196.0f),
                    PathNode.LineTo(138.42f, 222.0f),
                    PathNode.CurveTo(136.28378f, 225.73994f, 132.30707f, 228.04823f, 128.0f, 228.04823f),
                    PathNode.CurveTo(123.69294f, 228.04823f, 119.716225f, 225.73994f, 117.58f, 222.0f),
                    PathNode.LineTo(102.75f, 196.0f),
                    PathNode.LineTo(40.0f, 196.0f),
                    PathNode.CurveTo(33.37258f, 196.0f, 28.0f, 190.62741f, 28.0f, 184.0f),
                    PathNode.LineTo(28.0f, 56.0f),
                    PathNode.CurveTo(28.0f, 49.37258f, 33.37258f, 44.0f, 40.0f, 44.0f),
                    PathNode.LineTo(216.0f, 44.0f),
                    PathNode.CurveTo(222.62741f, 44.0f, 228.0f, 49.37258f, 228.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 56.0f),
                    PathNode.CurveTo(220.0f, 53.79086f, 218.20914f, 52.0f, 216.0f, 52.0f),
                    PathNode.LineTo(40.0f, 52.0f),
                    PathNode.CurveTo(37.79086f, 52.0f, 36.0f, 53.79086f, 36.0f, 56.0f),
                    PathNode.LineTo(36.0f, 184.0f),
                    PathNode.CurveTo(36.0f, 186.20914f, 37.79086f, 188.0f, 40.0f, 188.0f),
                    PathNode.LineTo(105.07f, 188.0f),
                    PathNode.CurveTo(106.50117f, 187.9979f, 107.82442f, 188.76057f, 108.54f, 190.0f),
                    PathNode.LineTo(124.54f, 218.0f),
                    PathNode.CurveTo(125.25297f, 219.24338f, 126.57671f, 220.01025f, 128.01f, 220.01025f),
                    PathNode.CurveTo(129.44328f, 220.01025f, 130.76703f, 219.24338f, 131.48f, 218.0f),
                    PathNode.LineTo(147.48f, 190.0f),
                    PathNode.CurveTo(148.19559f, 188.76057f, 149.51883f, 187.9979f, 150.95f, 188.0f),
                    PathNode.LineTo(216.0f, 188.0f),
                    PathNode.CurveTo(218.20914f, 188.0f, 220.0f, 186.20914f, 220.0f, 184.0f),
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
        return _chatCenteredText!!
    }

private var _chatCenteredText: ImageVector? = null
