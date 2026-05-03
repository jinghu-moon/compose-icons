package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NotionLogo: ImageVector
    get() {
        if (_notionLogo != null) return _notionLogo!!
        _notionLogo = phosphorThinIcon(
            name = "NotionLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 44.0f),
                    PathNode.LineTo(168.0f, 44.0f),
                    PathNode.CurveTo(165.79086f, 44.0f, 164.0f, 45.79086f, 164.0f, 48.0f),
                    PathNode.CurveTo(164.0f, 50.20914f, 165.79086f, 52.0f, 168.0f, 52.0f),
                    PathNode.LineTo(188.0f, 52.0f),
                    PathNode.LineTo(188.0f, 192.43f),
                    PathNode.LineTo(107.5f, 46.07f),
                    PathNode.CurveTo(106.797226f, 44.79423f, 105.45653f, 44.001305f, 104.0f, 44.0f),
                    PathNode.LineTo(40.0f, 44.0f),
                    PathNode.CurveTo(37.79086f, 44.0f, 36.0f, 45.79086f, 36.0f, 48.0f),
                    PathNode.CurveTo(36.0f, 50.20914f, 37.79086f, 52.0f, 40.0f, 52.0f),
                    PathNode.LineTo(60.0f, 52.0f),
                    PathNode.LineTo(60.0f, 204.0f),
                    PathNode.LineTo(40.0f, 204.0f),
                    PathNode.CurveTo(37.79086f, 204.0f, 36.0f, 205.79086f, 36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 210.20914f, 37.79086f, 212.0f, 40.0f, 212.0f),
                    PathNode.LineTo(88.0f, 212.0f),
                    PathNode.CurveTo(90.20914f, 212.0f, 92.0f, 210.20914f, 92.0f, 208.0f),
                    PathNode.CurveTo(92.0f, 205.79086f, 90.20914f, 204.0f, 88.0f, 204.0f),
                    PathNode.LineTo(68.0f, 204.0f),
                    PathNode.LineTo(68.0f, 63.57f),
                    PathNode.LineTo(148.5f, 209.93f),
                    PathNode.CurveTo(149.20277f, 211.20576f, 150.54347f, 211.99869f, 152.0f, 212.0f),
                    PathNode.LineTo(192.0f, 212.0f),
                    PathNode.CurveTo(194.20914f, 212.0f, 196.0f, 210.20914f, 196.0f, 208.0f),
                    PathNode.LineTo(196.0f, 52.0f),
                    PathNode.LineTo(216.0f, 52.0f),
                    PathNode.CurveTo(218.20914f, 52.0f, 220.0f, 50.20914f, 220.0f, 48.0f),
                    PathNode.CurveTo(220.0f, 45.79086f, 218.20914f, 44.0f, 216.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(70.77f, 52.0f),
                    PathNode.LineTo(101.63f, 52.0f),
                    PathNode.LineTo(185.23f, 204.0f),
                    PathNode.LineTo(154.37f, 204.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _notionLogo!!
    }

private var _notionLogo: ImageVector? = null
