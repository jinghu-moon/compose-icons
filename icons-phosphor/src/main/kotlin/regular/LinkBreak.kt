package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.LinkBreak: ImageVector
    get() {
        if (_linkBreak != null) return _linkBreak!!
        _linkBreak = phosphorRegularIcon(
            name = "LinkBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(198.63f, 57.37f),
                    PathNode.CurveTo(186.15721f, 44.899784f, 165.94585f, 44.87295f, 153.44f, 57.31f),
                    PathNode.LineTo(141.79f, 69.52f),
                    PathNode.CurveTo(138.69698f, 72.4109f, 133.88716f, 72.39145f, 130.81761f, 69.47565f),
                    PathNode.CurveTo(127.74806f, 66.55984f, 127.48171f, 61.75736f, 130.21f, 58.52f),
                    PathNode.LineTo(141.93f, 46.23f),
                    PathNode.CurveTo(141.9708f, 46.184196f, 142.01419f, 46.14079f, 142.06f, 46.1f),
                    PathNode.CurveTo(160.84846f, 27.615082f, 191.0274f, 27.737967f, 209.66472f, 46.37528f),
                    PathNode.CurveTo(228.30203f, 65.012596f, 228.42491f, 95.19153f, 209.94f, 113.98f),
                    PathNode.CurveTo(209.89922f, 114.0258f, 209.8558f, 114.069214f, 209.81f, 114.11f),
                    PathNode.LineTo(197.52f, 125.83f),
                    PathNode.CurveTo(194.28264f, 128.55829f, 189.48016f, 128.29195f, 186.56435f, 125.22239f),
                    PathNode.CurveTo(183.64854f, 122.15285f, 183.6291f, 117.34302f, 186.52f, 114.25f),
                    PathNode.LineTo(198.73f, 102.6f),
                    PathNode.CurveTo(211.18263f, 90.07849f, 211.1379f, 69.83632f, 198.63f, 57.37f),
                    PathNode.Close,
                    PathNode.MoveTo(114.21f, 186.48f),
                    PathNode.LineTo(102.56f, 198.69f),
                    PathNode.CurveTo(90.01274f, 210.87573f, 70.00612f, 210.7295f, 57.6383f, 198.3617f),
                    PathNode.CurveTo(45.27049f, 185.99388f, 45.124275f, 165.98726f, 57.31f, 153.44f),
                    PathNode.LineTo(69.52f, 141.79f),
                    PathNode.CurveTo(72.4109f, 138.69698f, 72.39145f, 133.88716f, 69.47565f, 130.81761f),
                    PathNode.CurveTo(66.55984f, 127.74806f, 61.75736f, 127.48171f, 58.52f, 130.21f),
                    PathNode.LineTo(46.19f, 141.93f),
                    PathNode.CurveTo(46.144196f, 141.9708f, 46.10079f, 142.01419f, 46.06f, 142.06f),
                    PathNode.CurveTo(27.57508f, 160.84846f, 27.697968f, 191.0274f, 46.33528f, 209.66472f),
                    PathNode.CurveTo(64.972595f, 228.30203f, 95.15153f, 228.42491f, 113.94f, 209.94f),
                    PathNode.CurveTo(113.9858f, 209.89922f, 114.02921f, 209.8558f, 114.07f, 209.81f),
                    PathNode.LineTo(125.79f, 197.52f),
                    PathNode.CurveTo(127.961044f, 195.49083f, 128.82843f, 192.42545f, 128.04247f, 189.55956f),
                    PathNode.CurveTo(127.256516f, 186.69368f, 124.946754f, 184.4996f, 122.044304f, 183.86182f),
                    PathNode.CurveTo(119.14185f, 183.22403f, 116.12504f, 184.24763f, 114.21f, 186.52f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 152.0f),
                    PathNode.LineTo(192.0f, 152.0f),
                    PathNode.CurveTo(187.58173f, 152.0f, 184.0f, 155.58173f, 184.0f, 160.0f),
                    PathNode.CurveTo(184.0f, 164.41827f, 187.58173f, 168.0f, 192.0f, 168.0f),
                    PathNode.LineTo(216.0f, 168.0f),
                    PathNode.CurveTo(220.41827f, 168.0f, 224.0f, 164.41827f, 224.0f, 160.0f),
                    PathNode.CurveTo(224.0f, 155.58173f, 220.41827f, 152.0f, 216.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 104.0f),
                    PathNode.LineTo(64.0f, 104.0f),
                    PathNode.CurveTo(68.41828f, 104.0f, 72.0f, 100.41828f, 72.0f, 96.0f),
                    PathNode.CurveTo(72.0f, 91.58172f, 68.41828f, 88.0f, 64.0f, 88.0f),
                    PathNode.LineTo(40.0f, 88.0f),
                    PathNode.CurveTo(35.581722f, 88.0f, 32.0f, 91.58172f, 32.0f, 96.0f),
                    PathNode.CurveTo(32.0f, 100.41828f, 35.581722f, 104.0f, 40.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 184.0f),
                    PathNode.CurveTo(155.58173f, 184.0f, 152.0f, 187.58173f, 152.0f, 192.0f),
                    PathNode.LineTo(152.0f, 216.0f),
                    PathNode.CurveTo(152.0f, 220.41827f, 155.58173f, 224.0f, 160.0f, 224.0f),
                    PathNode.CurveTo(164.41827f, 224.0f, 168.0f, 220.41827f, 168.0f, 216.0f),
                    PathNode.LineTo(168.0f, 192.0f),
                    PathNode.CurveTo(168.0f, 187.58173f, 164.41827f, 184.0f, 160.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 72.0f),
                    PathNode.CurveTo(100.41828f, 72.0f, 104.0f, 68.41828f, 104.0f, 64.0f),
                    PathNode.LineTo(104.0f, 40.0f),
                    PathNode.CurveTo(104.0f, 35.581722f, 100.41828f, 32.0f, 96.0f, 32.0f),
                    PathNode.CurveTo(91.58172f, 32.0f, 88.0f, 35.581722f, 88.0f, 40.0f),
                    PathNode.LineTo(88.0f, 64.0f),
                    PathNode.CurveTo(88.0f, 68.41828f, 91.58172f, 72.0f, 96.0f, 72.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _linkBreak!!
    }

private var _linkBreak: ImageVector? = null
