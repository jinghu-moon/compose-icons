package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.EscalatorDown: ImageVector
    get() {
        if (_escalatorDown != null) return _escalatorDown!!
        _escalatorDown = phosphorBoldIcon(
            name = "EscalatorDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(167.51f, 88.49f),
                    PathNode.CurveTo(162.81558f, 83.79558f, 162.81558f, 76.18442f, 167.51f, 71.49f),
                    PathNode.CurveTo(172.20442f, 66.79558f, 179.81558f, 66.79558f, 184.51f, 71.49f),
                    PathNode.LineTo(188.0f, 75.0f),
                    PathNode.LineTo(188.0f, 48.0f),
                    PathNode.CurveTo(188.0f, 41.37258f, 193.37259f, 36.0f, 200.0f, 36.0f),
                    PathNode.CurveTo(206.62741f, 36.0f, 212.0f, 41.37258f, 212.0f, 48.0f),
                    PathNode.LineTo(212.0f, 75.0f),
                    PathNode.LineTo(215.51f, 71.48f),
                    PathNode.CurveTo(220.20442f, 66.78558f, 227.81558f, 66.78558f, 232.51f, 71.48f),
                    PathNode.CurveTo(237.20442f, 76.17442f, 237.20442f, 83.785576f, 232.51f, 88.48f),
                    PathNode.LineTo(208.51f, 112.48f),
                    PathNode.CurveTo(206.25838f, 114.739456f, 203.19981f, 116.00946f, 200.01f, 116.00946f),
                    PathNode.CurveTo(196.82018f, 116.00946f, 193.76163f, 114.739456f, 191.51f, 112.48f),
                    PathNode.Close,
                    PathNode.MoveTo(244.0f, 160.0f),
                    PathNode.LineTo(244.0f, 200.0f),
                    PathNode.CurveTo(244.0f, 211.0457f, 235.0457f, 220.0f, 224.0f, 220.0f),
                    PathNode.LineTo(168.0f, 220.0f),
                    PathNode.CurveTo(164.6501f, 220.00081f, 161.45235f, 218.60135f, 159.18f, 216.14f),
                    PathNode.LineTo(66.75f, 116.0f),
                    PathNode.LineTo(32.0f, 116.0f),
                    PathNode.CurveTo(20.954306f, 116.0f, 12.0f, 107.04569f, 12.0f, 96.0f),
                    PathNode.LineTo(12.0f, 56.0f),
                    PathNode.CurveTo(12.0f, 44.954304f, 20.954306f, 36.0f, 32.0f, 36.0f),
                    PathNode.LineTo(88.0f, 36.0f),
                    PathNode.CurveTo(91.3499f, 35.999176f, 94.54765f, 37.398647f, 96.82f, 39.86f),
                    PathNode.LineTo(189.25f, 140.0f),
                    PathNode.LineTo(224.0f, 140.0f),
                    PathNode.CurveTo(235.0457f, 140.0f, 244.0f, 148.9543f, 244.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 164.0f),
                    PathNode.LineTo(184.0f, 164.0f),
                    PathNode.CurveTo(180.6501f, 164.00081f, 177.45235f, 162.60135f, 175.18f, 160.14f),
                    PathNode.LineTo(82.75f, 60.0f),
                    PathNode.LineTo(36.0f, 60.0f),
                    PathNode.LineTo(36.0f, 92.0f),
                    PathNode.LineTo(72.0f, 92.0f),
                    PathNode.CurveTo(75.3499f, 91.999176f, 78.54765f, 93.39864f, 80.82f, 95.86f),
                    PathNode.LineTo(173.25f, 196.0f),
                    PathNode.LineTo(220.0f, 196.0f),
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
        return _escalatorDown!!
    }

private var _escalatorDown: ImageVector? = null
