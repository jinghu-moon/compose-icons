package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Barbell: ImageVector
    get() {
        if (_barbell != null) return _barbell!!
        _barbell = phosphorBoldIcon(
            name = "Barbell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.0f, 116.0f),
                    PathNode.LineTo(244.0f, 88.0f),
                    PathNode.CurveTo(244.0f, 76.95431f, 235.0457f, 68.0f, 224.0f, 68.0f),
                    PathNode.LineTo(208.0f, 68.0f),
                    PathNode.LineTo(208.0f, 64.0f),
                    PathNode.CurveTo(208.0f, 52.954304f, 199.0457f, 44.0f, 188.0f, 44.0f),
                    PathNode.LineTo(164.0f, 44.0f),
                    PathNode.CurveTo(152.9543f, 44.0f, 144.0f, 52.954304f, 144.0f, 64.0f),
                    PathNode.LineTo(144.0f, 116.0f),
                    PathNode.LineTo(112.0f, 116.0f),
                    PathNode.LineTo(112.0f, 64.0f),
                    PathNode.CurveTo(112.0f, 52.954304f, 103.04569f, 44.0f, 92.0f, 44.0f),
                    PathNode.LineTo(68.0f, 44.0f),
                    PathNode.CurveTo(56.954304f, 44.0f, 48.0f, 52.954304f, 48.0f, 64.0f),
                    PathNode.LineTo(48.0f, 68.0f),
                    PathNode.LineTo(32.0f, 68.0f),
                    PathNode.CurveTo(20.954306f, 68.0f, 12.0f, 76.95431f, 12.0f, 88.0f),
                    PathNode.LineTo(12.0f, 116.0f),
                    PathNode.CurveTo(5.372583f, 116.0f, 0f, 121.37258f, 0f, 128.0f),
                    PathNode.CurveTo(0f, 134.62741f, 5.372583f, 140.0f, 12.0f, 140.0f),
                    PathNode.LineTo(12.0f, 168.0f),
                    PathNode.CurveTo(12.0f, 179.0457f, 20.954306f, 188.0f, 32.0f, 188.0f),
                    PathNode.LineTo(48.0f, 188.0f),
                    PathNode.LineTo(48.0f, 192.0f),
                    PathNode.CurveTo(48.0f, 203.0457f, 56.954304f, 212.0f, 68.0f, 212.0f),
                    PathNode.LineTo(92.0f, 212.0f),
                    PathNode.CurveTo(103.04569f, 212.0f, 112.0f, 203.0457f, 112.0f, 192.0f),
                    PathNode.LineTo(112.0f, 140.0f),
                    PathNode.LineTo(144.0f, 140.0f),
                    PathNode.LineTo(144.0f, 192.0f),
                    PathNode.CurveTo(144.0f, 203.0457f, 152.9543f, 212.0f, 164.0f, 212.0f),
                    PathNode.LineTo(188.0f, 212.0f),
                    PathNode.CurveTo(199.0457f, 212.0f, 208.0f, 203.0457f, 208.0f, 192.0f),
                    PathNode.LineTo(208.0f, 188.0f),
                    PathNode.LineTo(224.0f, 188.0f),
                    PathNode.CurveTo(235.0457f, 188.0f, 244.0f, 179.0457f, 244.0f, 168.0f),
                    PathNode.LineTo(244.0f, 140.0f),
                    PathNode.CurveTo(250.62741f, 140.0f, 256.0f, 134.62741f, 256.0f, 128.0f),
                    PathNode.CurveTo(256.0f, 121.37258f, 250.62741f, 116.0f, 244.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 164.0f),
                    PathNode.LineTo(36.0f, 92.0f),
                    PathNode.LineTo(48.0f, 92.0f),
                    PathNode.LineTo(48.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 188.0f),
                    PathNode.LineTo(72.0f, 188.0f),
                    PathNode.LineTo(72.0f, 68.0f),
                    PathNode.LineTo(88.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 188.0f),
                    PathNode.LineTo(168.0f, 188.0f),
                    PathNode.LineTo(168.0f, 68.0f),
                    PathNode.LineTo(184.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 164.0f),
                    PathNode.LineTo(208.0f, 164.0f),
                    PathNode.LineTo(208.0f, 92.0f),
                    PathNode.LineTo(220.0f, 92.0f),
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
        return _barbell!!
    }

private var _barbell: ImageVector? = null
