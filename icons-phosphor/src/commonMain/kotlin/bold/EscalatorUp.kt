package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.EscalatorUp: ImageVector
    get() {
        if (_escalatorUp != null) return _escalatorUp!!
        _escalatorUp = phosphorBoldIcon(
            name = "EscalatorUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 36.0f),
                    PathNode.LineTo(168.0f, 36.0f),
                    PathNode.CurveTo(164.6501f, 35.999176f, 161.45235f, 37.398647f, 159.18f, 39.86f),
                    PathNode.LineTo(66.75f, 140.0f),
                    PathNode.LineTo(32.0f, 140.0f),
                    PathNode.CurveTo(20.954306f, 140.0f, 12.0f, 148.9543f, 12.0f, 160.0f),
                    PathNode.LineTo(12.0f, 200.0f),
                    PathNode.CurveTo(12.0f, 211.0457f, 20.954306f, 220.0f, 32.0f, 220.0f),
                    PathNode.LineTo(88.0f, 220.0f),
                    PathNode.CurveTo(91.3499f, 220.00081f, 94.54765f, 218.60135f, 96.82f, 216.14f),
                    PathNode.LineTo(189.25f, 116.0f),
                    PathNode.LineTo(224.0f, 116.0f),
                    PathNode.CurveTo(235.0457f, 116.0f, 244.0f, 107.04569f, 244.0f, 96.0f),
                    PathNode.LineTo(244.0f, 56.0f),
                    PathNode.CurveTo(244.0f, 44.954304f, 235.0457f, 36.0f, 224.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 92.0f),
                    PathNode.LineTo(184.0f, 92.0f),
                    PathNode.CurveTo(180.6501f, 91.999176f, 177.45235f, 93.39864f, 175.18f, 95.86f),
                    PathNode.LineTo(82.75f, 196.0f),
                    PathNode.LineTo(36.0f, 196.0f),
                    PathNode.LineTo(36.0f, 164.0f),
                    PathNode.LineTo(72.0f, 164.0f),
                    PathNode.CurveTo(75.3499f, 164.00081f, 78.54765f, 162.60135f, 80.82f, 160.14f),
                    PathNode.LineTo(173.25f, 60.0f),
                    PathNode.LineTo(220.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.49f, 167.51f),
                    PathNode.CurveTo(237.18442f, 172.20442f, 237.18442f, 179.81558f, 232.49f, 184.51f),
                    PathNode.CurveTo(227.79558f, 189.20442f, 220.18442f, 189.20442f, 215.49f, 184.51f),
                    PathNode.LineTo(212.0f, 181.0f),
                    PathNode.LineTo(212.0f, 208.0f),
                    PathNode.CurveTo(212.0f, 214.62741f, 206.62741f, 220.0f, 200.0f, 220.0f),
                    PathNode.CurveTo(193.37259f, 220.0f, 188.0f, 214.62741f, 188.0f, 208.0f),
                    PathNode.LineTo(188.0f, 181.0f),
                    PathNode.LineTo(184.49f, 184.52f),
                    PathNode.CurveTo(179.79558f, 189.21442f, 172.18442f, 189.21442f, 167.49f, 184.52f),
                    PathNode.CurveTo(162.79558f, 179.82558f, 162.79558f, 172.21442f, 167.49f, 167.52f),
                    PathNode.LineTo(191.49f, 143.52f),
                    PathNode.CurveTo(193.74162f, 141.26054f, 196.80019f, 139.99054f, 199.99f, 139.99054f),
                    PathNode.CurveTo(203.17982f, 139.99054f, 206.23837f, 141.26054f, 208.49f, 143.52f),
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
        return _escalatorUp!!
    }

private var _escalatorUp: ImageVector? = null
