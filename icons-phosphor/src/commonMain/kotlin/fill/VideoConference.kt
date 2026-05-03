package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.VideoConference: ImageVector
    get() {
        if (_videoConference != null) return _videoConference!!
        _videoConference = phosphorFillIcon(
            name = "VideoConference",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.0f, 88.0f),
                    PathNode.CurveTo(204.0f, 94.62742f, 198.62741f, 100.0f, 192.0f, 100.0f),
                    PathNode.CurveTo(185.37259f, 100.0f, 180.0f, 94.62742f, 180.0f, 88.0f),
                    PathNode.CurveTo(180.0f, 81.37258f, 185.37259f, 76.0f, 192.0f, 76.0f),
                    PathNode.CurveTo(198.62741f, 76.0f, 204.0f, 81.37258f, 204.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 156.0f),
                    PathNode.CurveTo(185.37259f, 156.0f, 180.0f, 161.37259f, 180.0f, 168.0f),
                    PathNode.CurveTo(180.0f, 174.62741f, 185.37259f, 180.0f, 192.0f, 180.0f),
                    PathNode.CurveTo(198.62741f, 180.0f, 204.0f, 174.62741f, 204.0f, 168.0f),
                    PathNode.CurveTo(204.0f, 161.37259f, 198.62741f, 156.0f, 192.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 104.0f),
                    PathNode.CurveTo(87.163445f, 104.0f, 80.0f, 111.163445f, 80.0f, 120.0f),
                    PathNode.CurveTo(80.0f, 128.83656f, 87.163445f, 136.0f, 96.0f, 136.0f),
                    PathNode.CurveTo(104.836555f, 136.0f, 112.0f, 128.83656f, 112.0f, 120.0f),
                    PathNode.CurveTo(112.0f, 111.163445f, 104.836555f, 104.0f, 96.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 56.0f),
                    PathNode.LineTo(232.0f, 200.0f),
                    PathNode.CurveTo(232.0f, 208.83656f, 224.83656f, 216.0f, 216.0f, 216.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(31.163445f, 216.0f, 24.0f, 208.83656f, 24.0f, 200.0f),
                    PathNode.LineTo(24.0f, 56.0f),
                    PathNode.CurveTo(24.0f, 47.163445f, 31.163445f, 40.0f, 40.0f, 40.0f),
                    PathNode.LineTo(216.0f, 40.0f),
                    PathNode.CurveTo(224.83656f, 40.0f, 232.0f, 47.163445f, 232.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 120.0f),
                    PathNode.LineTo(216.0f, 120.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.LineTo(168.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(135.75f, 166.0f),
                    PathNode.CurveTo(133.16121f, 156.33405f, 127.0229f, 147.99965f, 118.56f, 142.66f),
                    PathNode.CurveTo(127.75141f, 133.52312f, 130.52414f, 119.74444f, 125.58233f, 107.76349f),
                    PathNode.CurveTo(120.64052f, 95.78253f, 108.96012f, 87.96536f, 96.0f, 87.96536f),
                    PathNode.CurveTo(83.03988f, 87.96536f, 71.35948f, 95.78253f, 66.41767f, 107.76349f),
                    PathNode.CurveTo(61.475864f, 119.74444f, 64.24859f, 133.52312f, 73.44f, 142.66f),
                    PathNode.CurveTo(64.98255f, 148.00551f, 58.846f, 156.33751f, 56.25f, 166.0f),
                    PathNode.CurveTo(55.14543f, 170.28021f, 57.71979f, 174.64543f, 62.0f, 175.75f),
                    PathNode.CurveTo(66.280205f, 176.85457f, 70.64543f, 174.28021f, 71.75f, 170.0f),
                    PathNode.CurveTo(74.39f, 159.75f, 84.81f, 152.0f, 96.0f, 152.0f),
                    PathNode.CurveTo(107.19f, 152.0f, 117.62f, 159.73f, 120.25f, 170.0f),
                    PathNode.CurveTo(121.35457f, 174.28021f, 125.719795f, 176.85457f, 130.0f, 175.75f),
                    PathNode.CurveTo(134.28021f, 174.64543f, 136.85457f, 170.28021f, 135.75f, 166.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 200.0f),
                    PathNode.LineTo(216.0f, 136.0f),
                    PathNode.LineTo(168.0f, 136.0f),
                    PathNode.LineTo(168.0f, 200.0f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _videoConference!!
    }

private var _videoConference: ImageVector? = null
