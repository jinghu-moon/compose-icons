package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DoorOpen: ImageVector
    get() {
        if (_doorOpen != null) return _doorOpen!!
        _doorOpen = phosphorThinIcon(
            name = "DoorOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 220.0f),
                    PathNode.LineTo(204.0f, 220.0f),
                    PathNode.LineTo(204.0f, 40.0f),
                    PathNode.CurveTo(204.0f, 33.37258f, 198.62741f, 28.0f, 192.0f, 28.0f),
                    PathNode.LineTo(64.0f, 28.0f),
                    PathNode.CurveTo(57.37258f, 28.0f, 52.0f, 33.37258f, 52.0f, 40.0f),
                    PathNode.LineTo(52.0f, 220.0f),
                    PathNode.LineTo(24.0f, 220.0f),
                    PathNode.CurveTo(21.790861f, 220.0f, 20.0f, 221.79086f, 20.0f, 224.0f),
                    PathNode.CurveTo(20.0f, 226.20914f, 21.790861f, 228.0f, 24.0f, 228.0f),
                    PathNode.LineTo(232.0f, 228.0f),
                    PathNode.CurveTo(234.20914f, 228.0f, 236.0f, 226.20914f, 236.0f, 224.0f),
                    PathNode.CurveTo(236.0f, 221.79086f, 234.20914f, 220.0f, 232.0f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 40.0f),
                    PathNode.LineTo(196.0f, 220.0f),
                    PathNode.LineTo(172.0f, 220.0f),
                    PathNode.LineTo(172.0f, 36.0f),
                    PathNode.LineTo(192.0f, 36.0f),
                    PathNode.CurveTo(194.20914f, 36.0f, 196.0f, 37.79086f, 196.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 40.0f),
                    PathNode.CurveTo(60.0f, 37.79086f, 61.79086f, 36.0f, 64.0f, 36.0f),
                    PathNode.LineTo(164.0f, 36.0f),
                    PathNode.LineTo(164.0f, 220.0f),
                    PathNode.LineTo(60.0f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 132.0f),
                    PathNode.CurveTo(140.0f, 136.41827f, 136.41827f, 140.0f, 132.0f, 140.0f),
                    PathNode.CurveTo(127.58172f, 140.0f, 124.0f, 136.41827f, 124.0f, 132.0f),
                    PathNode.CurveTo(124.0f, 127.58172f, 127.58172f, 124.0f, 132.0f, 124.0f),
                    PathNode.CurveTo(136.41827f, 124.0f, 140.0f, 127.58172f, 140.0f, 132.0f),
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
        return _doorOpen!!
    }

private var _doorOpen: ImageVector? = null
