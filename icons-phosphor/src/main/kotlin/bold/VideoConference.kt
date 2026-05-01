package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.VideoConference: ImageVector
    get() {
        if (_videoConference != null) return _videoConference!!
        _videoConference = phosphorBoldIcon(
            name = "VideoConference",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 36.0f),
                    PathNode.LineTo(40.0f, 36.0f),
                    PathNode.CurveTo(28.954306f, 36.0f, 20.0f, 44.954304f, 20.0f, 56.0f),
                    PathNode.LineTo(20.0f, 200.0f),
                    PathNode.CurveTo(20.0f, 211.0457f, 28.954306f, 220.0f, 40.0f, 220.0f),
                    PathNode.LineTo(216.0f, 220.0f),
                    PathNode.CurveTo(227.0457f, 220.0f, 236.0f, 211.0457f, 236.0f, 200.0f),
                    PathNode.LineTo(236.0f, 56.0f),
                    PathNode.CurveTo(236.0f, 44.954304f, 227.0457f, 36.0f, 216.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 116.0f),
                    PathNode.LineTo(156.0f, 116.0f),
                    PathNode.LineTo(156.0f, 60.0f),
                    PathNode.LineTo(212.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 120.0f),
                    PathNode.CurveTo(52.0f, 113.37258f, 57.37258f, 108.0f, 64.0f, 108.0f),
                    PathNode.CurveTo(70.62742f, 108.0f, 76.0f, 113.37258f, 76.0f, 120.0f),
                    PathNode.CurveTo(76.0f, 126.62742f, 70.62742f, 132.0f, 64.0f, 132.0f),
                    PathNode.CurveTo(57.37258f, 132.0f, 52.0f, 126.62742f, 52.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 169.77f),
                    PathNode.CurveTo(46.69f, 161.84f, 55.0f, 156.0f, 64.0f, 156.0f),
                    PathNode.CurveTo(73.43f, 156.0f, 82.19f, 162.44f, 84.38f, 171.0f),
                    PathNode.CurveTo(86.03686f, 177.41754f, 92.58245f, 181.27686f, 99.0f, 179.62f),
                    PathNode.CurveTo(105.41755f, 177.96315f, 109.276855f, 171.41754f, 107.62f, 165.0f),
                    PathNode.CurveTo(105.21055f, 155.88504f, 99.88669f, 147.80795f, 92.46f, 142.0f),
                    PathNode.CurveTo(103.17819f, 128.0406f, 102.2323f, 108.378136f, 90.223625f, 95.512054f),
                    PathNode.CurveTo(78.21495f, 82.64597f, 58.664276f, 80.34844f, 44.0f, 90.08f),
                    PathNode.LineTo(44.0f, 60.0f),
                    PathNode.LineTo(132.0f, 60.0f),
                    PathNode.LineTo(132.0f, 196.0f),
                    PathNode.LineTo(44.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 196.0f),
                    PathNode.LineTo(156.0f, 140.0f),
                    PathNode.LineTo(212.0f, 140.0f),
                    PathNode.LineTo(212.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 88.0f),
                    PathNode.CurveTo(168.0f, 79.163445f, 175.16344f, 72.0f, 184.0f, 72.0f),
                    PathNode.CurveTo(192.83656f, 72.0f, 200.0f, 79.163445f, 200.0f, 88.0f),
                    PathNode.CurveTo(200.0f, 96.836555f, 192.83656f, 104.0f, 184.0f, 104.0f),
                    PathNode.CurveTo(175.16344f, 104.0f, 168.0f, 96.836555f, 168.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 168.0f),
                    PathNode.CurveTo(200.0f, 176.83656f, 192.83656f, 184.0f, 184.0f, 184.0f),
                    PathNode.CurveTo(175.16344f, 184.0f, 168.0f, 176.83656f, 168.0f, 168.0f),
                    PathNode.CurveTo(168.0f, 159.16344f, 175.16344f, 152.0f, 184.0f, 152.0f),
                    PathNode.CurveTo(192.83656f, 152.0f, 200.0f, 159.16344f, 200.0f, 168.0f),
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
        return _videoConference!!
    }

private var _videoConference: ImageVector? = null
