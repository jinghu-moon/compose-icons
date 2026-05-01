package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Playlist: ImageVector
    get() {
        if (_playlist != null) return _playlist!!
        _playlist = phosphorBoldIcon(
            name = "Playlist",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(28.0f, 64.0f),
                    PathNode.CurveTo(28.0f, 57.37258f, 33.37258f, 52.0f, 40.0f, 52.0f),
                    PathNode.LineTo(216.0f, 52.0f),
                    PathNode.CurveTo(222.62741f, 52.0f, 228.0f, 57.37258f, 228.0f, 64.0f),
                    PathNode.CurveTo(228.0f, 70.62742f, 222.62741f, 76.0f, 216.0f, 76.0f),
                    PathNode.LineTo(40.0f, 76.0f),
                    PathNode.CurveTo(33.37258f, 76.0f, 28.0f, 70.62742f, 28.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 140.0f),
                    PathNode.LineTo(156.0f, 140.0f),
                    PathNode.CurveTo(162.62741f, 140.0f, 168.0f, 134.62741f, 168.0f, 128.0f),
                    PathNode.CurveTo(168.0f, 121.37258f, 162.62741f, 116.0f, 156.0f, 116.0f),
                    PathNode.LineTo(40.0f, 116.0f),
                    PathNode.CurveTo(33.37258f, 116.0f, 28.0f, 121.37258f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 134.62741f, 33.37258f, 140.0f, 40.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 180.0f),
                    PathNode.LineTo(40.0f, 180.0f),
                    PathNode.CurveTo(33.37258f, 180.0f, 28.0f, 185.37259f, 28.0f, 192.0f),
                    PathNode.CurveTo(28.0f, 198.62741f, 33.37258f, 204.0f, 40.0f, 204.0f),
                    PathNode.LineTo(108.0f, 204.0f),
                    PathNode.CurveTo(114.62742f, 204.0f, 120.0f, 198.62741f, 120.0f, 192.0f),
                    PathNode.CurveTo(120.0f, 185.37259f, 114.62742f, 180.0f, 108.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(251.49f, 127.45f),
                    PathNode.CurveTo(249.56592f, 133.77843f, 242.88373f, 137.35658f, 236.55f, 135.45f),
                    PathNode.LineTo(212.0f, 128.13f),
                    PathNode.LineTo(212.0f, 192.0f),
                    PathNode.CurveTo(212.0005f, 207.68146f, 201.85004f, 221.55927f, 186.9054f, 226.30962f),
                    PathNode.CurveTo(171.96075f, 231.05997f, 155.66034f, 225.5899f, 146.60645f, 212.7862f),
                    PathNode.CurveTo(137.55255f, 199.98248f, 137.82828f, 182.79094f, 147.2881f, 170.28415f),
                    PathNode.CurveTo(156.74794f, 157.77736f, 173.21538f, 152.83282f, 188.0f, 158.06f),
                    PathNode.LineTo(188.0f, 112.0f),
                    PathNode.CurveTo(188.00107f, 108.206985f, 189.79535f, 104.63777f, 192.83894f, 102.374275f),
                    PathNode.CurveTo(195.88255f, 100.11078f, 199.81712f, 99.41951f, 203.45f, 100.51f),
                    PathNode.LineTo(243.45f, 112.51f),
                    PathNode.CurveTo(249.79454f, 114.41688f, 253.39346f, 121.10445f, 251.49f, 127.45f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 192.0f),
                    PathNode.CurveTo(188.0f, 185.37259f, 182.62741f, 180.0f, 176.0f, 180.0f),
                    PathNode.CurveTo(169.37259f, 180.0f, 164.0f, 185.37259f, 164.0f, 192.0f),
                    PathNode.CurveTo(164.0f, 198.62741f, 169.37259f, 204.0f, 176.0f, 204.0f),
                    PathNode.CurveTo(182.62741f, 204.0f, 188.0f, 198.62741f, 188.0f, 192.0f),
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
        return _playlist!!
    }

private var _playlist: ImageVector? = null
