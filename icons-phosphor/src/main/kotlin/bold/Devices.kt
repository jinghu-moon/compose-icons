package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Devices: ImageVector
    get() {
        if (_devices != null) return _devices!!
        _devices = phosphorBoldIcon(
            name = "Devices",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 72.0f),
                    PathNode.LineTo(212.0f, 72.0f),
                    PathNode.LineTo(212.0f, 64.0f),
                    PathNode.CurveTo(212.0f, 48.53603f, 199.46397f, 36.0f, 184.0f, 36.0f),
                    PathNode.LineTo(40.0f, 36.0f),
                    PathNode.CurveTo(24.536028f, 36.0f, 12.0f, 48.53603f, 12.0f, 64.0f),
                    PathNode.LineTo(12.0f, 152.0f),
                    PathNode.CurveTo(12.0f, 167.46397f, 24.536028f, 180.0f, 40.0f, 180.0f),
                    PathNode.LineTo(136.0f, 180.0f),
                    PathNode.LineTo(136.0f, 192.0f),
                    PathNode.CurveTo(136.0f, 207.46397f, 148.53603f, 220.0f, 164.0f, 220.0f),
                    PathNode.LineTo(224.0f, 220.0f),
                    PathNode.CurveTo(239.46397f, 220.0f, 252.0f, 207.46397f, 252.0f, 192.0f),
                    PathNode.LineTo(252.0f, 100.0f),
                    PathNode.CurveTo(252.0f, 84.536026f, 239.46397f, 72.0f, 224.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 156.0f),
                    PathNode.CurveTo(37.79086f, 156.0f, 36.0f, 154.20914f, 36.0f, 152.0f),
                    PathNode.LineTo(36.0f, 64.0f),
                    PathNode.CurveTo(36.0f, 61.79086f, 37.79086f, 60.0f, 40.0f, 60.0f),
                    PathNode.LineTo(184.0f, 60.0f),
                    PathNode.CurveTo(186.20914f, 60.0f, 188.0f, 61.79086f, 188.0f, 64.0f),
                    PathNode.LineTo(188.0f, 72.0f),
                    PathNode.LineTo(164.0f, 72.0f),
                    PathNode.CurveTo(148.53603f, 72.0f, 136.0f, 84.536026f, 136.0f, 100.0f),
                    PathNode.LineTo(136.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 192.0f),
                    PathNode.CurveTo(228.0f, 194.20914f, 226.20914f, 196.0f, 224.0f, 196.0f),
                    PathNode.LineTo(164.0f, 196.0f),
                    PathNode.CurveTo(161.79086f, 196.0f, 160.0f, 194.20914f, 160.0f, 192.0f),
                    PathNode.LineTo(160.0f, 100.0f),
                    PathNode.CurveTo(160.0f, 97.79086f, 161.79086f, 96.0f, 164.0f, 96.0f),
                    PathNode.LineTo(224.0f, 96.0f),
                    PathNode.CurveTo(226.20914f, 96.0f, 228.0f, 97.79086f, 228.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 208.0f),
                    PathNode.CurveTo(124.0f, 214.62741f, 118.62742f, 220.0f, 112.0f, 220.0f),
                    PathNode.LineTo(88.0f, 220.0f),
                    PathNode.CurveTo(81.37258f, 220.0f, 76.0f, 214.62741f, 76.0f, 208.0f),
                    PathNode.CurveTo(76.0f, 201.37259f, 81.37258f, 196.0f, 88.0f, 196.0f),
                    PathNode.LineTo(112.0f, 196.0f),
                    PathNode.CurveTo(118.62742f, 196.0f, 124.0f, 201.37259f, 124.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 124.0f),
                    PathNode.CurveTo(212.0f, 130.62741f, 206.62741f, 136.0f, 200.0f, 136.0f),
                    PathNode.LineTo(188.0f, 136.0f),
                    PathNode.CurveTo(181.37259f, 136.0f, 176.0f, 130.62741f, 176.0f, 124.0f),
                    PathNode.CurveTo(176.0f, 117.37258f, 181.37259f, 112.0f, 188.0f, 112.0f),
                    PathNode.LineTo(200.0f, 112.0f),
                    PathNode.CurveTo(206.62741f, 112.0f, 212.0f, 117.37258f, 212.0f, 124.0f),
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
        return _devices!!
    }

private var _devices: ImageVector? = null
