package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.HandPointing: ImageVector
    get() {
        if (_handPointing != null) return _handPointing!!
        _handPointing = phosphorRegularIcon(
            name = "HandPointing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(196.0f, 88.0f),
                    PathNode.CurveTo(191.33641f, 87.994835f, 186.74612f, 89.16045f, 182.65f, 91.39f),
                    PathNode.CurveTo(180.17207f, 83.71791f, 174.50731f, 77.48626f, 167.1056f, 74.29003f),
                    PathNode.CurveTo(159.7039f, 71.093796f, 151.28366f, 71.2432f, 144.0f, 74.7f),
                    PathNode.LineTo(144.0f, 44.0f),
                    PathNode.CurveTo(144.0f, 28.536028f, 131.46397f, 16.0f, 116.0f, 16.0f),
                    PathNode.CurveTo(100.536026f, 16.0f, 88.0f, 28.536028f, 88.0f, 44.0f),
                    PathNode.LineTo(88.0f, 124.0f),
                    PathNode.LineTo(84.18f, 117.87f),
                    PathNode.CurveTo(76.41212f, 104.4909f, 59.269096f, 99.942116f, 45.89f, 107.71f),
                    PathNode.CurveTo(32.510902f, 115.47788f, 27.962114f, 132.6209f, 35.73f, 146.0f),
                    PathNode.LineTo(40.4f, 154.23f),
                    PathNode.CurveTo(74.81f, 214.89f, 89.05f, 240.0f, 136.0f, 240.0f),
                    PathNode.CurveTo(184.57822f, 239.94489f, 223.94489f, 200.57822f, 224.0f, 152.0f),
                    PathNode.LineTo(224.0f, 116.0f),
                    PathNode.CurveTo(224.0f, 100.536026f, 211.46397f, 88.0f, 196.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 152.0f),
                    PathNode.CurveTo(207.95592f, 191.74623f, 175.74623f, 223.95592f, 136.0f, 224.0f),
                    PathNode.CurveTo(98.37f, 224.0f, 88.16f, 206.0f, 54.32f, 146.32f),
                    PathNode.LineTo(49.63f, 138.05f),
                    PathNode.LineTo(49.63f, 138.0f),
                    PathNode.CurveTo(46.314114f, 132.26685f, 48.269962f, 124.93128f, 54.0f, 121.61f),
                    PathNode.CurveTo(55.822777f, 120.55415f, 57.89352f, 120.00196f, 60.0f, 120.01f),
                    PathNode.CurveTo(64.29351f, 120.00367f, 68.26325f, 122.29171f, 70.41f, 126.01f),
                    PathNode.CurveTo(70.45072f, 126.090126f, 70.49753f, 126.16702f, 70.55f, 126.24f),
                    PathNode.LineTo(89.22f, 156.24f),
                    PathNode.CurveTo(91.112976f, 159.26245f, 94.77798f, 160.66689f, 98.20602f, 159.68347f),
                    PathNode.CurveTo(101.634056f, 158.70006f, 103.99716f, 155.5663f, 104.0f, 152.0f),
                    PathNode.LineTo(104.0f, 44.0f),
                    PathNode.CurveTo(104.0f, 37.37258f, 109.37258f, 32.0f, 116.0f, 32.0f),
                    PathNode.CurveTo(122.62742f, 32.0f, 128.0f, 37.37258f, 128.0f, 44.0f),
                    PathNode.LineTo(128.0f, 112.0f),
                    PathNode.CurveTo(128.0f, 116.41828f, 131.58173f, 120.0f, 136.0f, 120.0f),
                    PathNode.CurveTo(140.41827f, 120.0f, 144.0f, 116.41828f, 144.0f, 112.0f),
                    PathNode.LineTo(144.0f, 100.0f),
                    PathNode.CurveTo(144.0f, 93.37258f, 149.37259f, 88.0f, 156.0f, 88.0f),
                    PathNode.CurveTo(162.62741f, 88.0f, 168.0f, 93.37258f, 168.0f, 100.0f),
                    PathNode.LineTo(168.0f, 120.0f),
                    PathNode.CurveTo(168.0f, 124.41828f, 171.58173f, 128.0f, 176.0f, 128.0f),
                    PathNode.CurveTo(180.41827f, 128.0f, 184.0f, 124.41828f, 184.0f, 120.0f),
                    PathNode.LineTo(184.0f, 116.0f),
                    PathNode.CurveTo(184.0f, 109.37258f, 189.37259f, 104.0f, 196.0f, 104.0f),
                    PathNode.CurveTo(202.62741f, 104.0f, 208.0f, 109.37258f, 208.0f, 116.0f),
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
        return _handPointing!!
    }

private var _handPointing: ImageVector? = null
