package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DeviceMobileSpeaker: ImageVector
    get() {
        if (_deviceMobileSpeaker != null) return _deviceMobileSpeaker!!
        _deviceMobileSpeaker = phosphorThinIcon(
            name = "DeviceMobileSpeaker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 20.0f),
                    PathNode.LineTo(80.0f, 20.0f),
                    PathNode.CurveTo(68.95431f, 20.0f, 60.0f, 28.954306f, 60.0f, 40.0f),
                    PathNode.LineTo(60.0f, 216.0f),
                    PathNode.CurveTo(60.0f, 227.0457f, 68.95431f, 236.0f, 80.0f, 236.0f),
                    PathNode.LineTo(176.0f, 236.0f),
                    PathNode.CurveTo(187.0457f, 236.0f, 196.0f, 227.0457f, 196.0f, 216.0f),
                    PathNode.LineTo(196.0f, 40.0f),
                    PathNode.CurveTo(196.0f, 28.954306f, 187.0457f, 20.0f, 176.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 216.0f),
                    PathNode.CurveTo(188.0f, 222.62741f, 182.62741f, 228.0f, 176.0f, 228.0f),
                    PathNode.LineTo(80.0f, 228.0f),
                    PathNode.CurveTo(73.37258f, 228.0f, 68.0f, 222.62741f, 68.0f, 216.0f),
                    PathNode.LineTo(68.0f, 40.0f),
                    PathNode.CurveTo(68.0f, 33.37258f, 73.37258f, 28.0f, 80.0f, 28.0f),
                    PathNode.LineTo(176.0f, 28.0f),
                    PathNode.CurveTo(182.62741f, 28.0f, 188.0f, 33.37258f, 188.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 56.0f),
                    PathNode.CurveTo(164.0f, 58.20914f, 162.20914f, 60.0f, 160.0f, 60.0f),
                    PathNode.LineTo(96.0f, 60.0f),
                    PathNode.CurveTo(93.79086f, 60.0f, 92.0f, 58.20914f, 92.0f, 56.0f),
                    PathNode.CurveTo(92.0f, 53.79086f, 93.79086f, 52.0f, 96.0f, 52.0f),
                    PathNode.LineTo(160.0f, 52.0f),
                    PathNode.CurveTo(162.20914f, 52.0f, 164.0f, 53.79086f, 164.0f, 56.0f),
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
        return _deviceMobileSpeaker!!
    }

private var _deviceMobileSpeaker: ImageVector? = null
