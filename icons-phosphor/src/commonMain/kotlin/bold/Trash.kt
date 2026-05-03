package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Trash: ImageVector
    get() {
        if (_trash != null) return _trash!!
        _trash = phosphorBoldIcon(
            name = "Trash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 48.0f),
                    PathNode.LineTo(180.0f, 48.0f),
                    PathNode.LineTo(180.0f, 36.0f),
                    PathNode.CurveTo(180.0f, 20.536028f, 167.46397f, 8.0f, 152.0f, 8.0f),
                    PathNode.LineTo(104.0f, 8.0f),
                    PathNode.CurveTo(88.536026f, 8.0f, 76.0f, 20.536028f, 76.0f, 36.0f),
                    PathNode.LineTo(76.0f, 48.0f),
                    PathNode.LineTo(40.0f, 48.0f),
                    PathNode.CurveTo(33.37258f, 48.0f, 28.0f, 53.37258f, 28.0f, 60.0f),
                    PathNode.CurveTo(28.0f, 66.62742f, 33.37258f, 72.0f, 40.0f, 72.0f),
                    PathNode.LineTo(44.0f, 72.0f),
                    PathNode.LineTo(44.0f, 208.0f),
                    PathNode.CurveTo(44.0f, 219.0457f, 52.954304f, 228.0f, 64.0f, 228.0f),
                    PathNode.LineTo(192.0f, 228.0f),
                    PathNode.CurveTo(203.0457f, 228.0f, 212.0f, 219.0457f, 212.0f, 208.0f),
                    PathNode.LineTo(212.0f, 72.0f),
                    PathNode.LineTo(216.0f, 72.0f),
                    PathNode.CurveTo(222.62741f, 72.0f, 228.0f, 66.62742f, 228.0f, 60.0f),
                    PathNode.CurveTo(228.0f, 53.37258f, 222.62741f, 48.0f, 216.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 36.0f),
                    PathNode.CurveTo(100.0f, 33.79086f, 101.79086f, 32.0f, 104.0f, 32.0f),
                    PathNode.LineTo(152.0f, 32.0f),
                    PathNode.CurveTo(154.20914f, 32.0f, 156.0f, 33.79086f, 156.0f, 36.0f),
                    PathNode.LineTo(156.0f, 48.0f),
                    PathNode.LineTo(100.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 204.0f),
                    PathNode.LineTo(68.0f, 204.0f),
                    PathNode.LineTo(68.0f, 72.0f),
                    PathNode.LineTo(188.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 104.0f),
                    PathNode.LineTo(116.0f, 168.0f),
                    PathNode.CurveTo(116.0f, 174.62741f, 110.62742f, 180.0f, 104.0f, 180.0f),
                    PathNode.CurveTo(97.37258f, 180.0f, 92.0f, 174.62741f, 92.0f, 168.0f),
                    PathNode.LineTo(92.0f, 104.0f),
                    PathNode.CurveTo(92.0f, 97.37258f, 97.37258f, 92.0f, 104.0f, 92.0f),
                    PathNode.CurveTo(110.62742f, 92.0f, 116.0f, 97.37258f, 116.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 104.0f),
                    PathNode.LineTo(164.0f, 168.0f),
                    PathNode.CurveTo(164.0f, 174.62741f, 158.62741f, 180.0f, 152.0f, 180.0f),
                    PathNode.CurveTo(145.37259f, 180.0f, 140.0f, 174.62741f, 140.0f, 168.0f),
                    PathNode.LineTo(140.0f, 104.0f),
                    PathNode.CurveTo(140.0f, 97.37258f, 145.37259f, 92.0f, 152.0f, 92.0f),
                    PathNode.CurveTo(158.62741f, 92.0f, 164.0f, 97.37258f, 164.0f, 104.0f),
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
        return _trash!!
    }

private var _trash: ImageVector? = null
