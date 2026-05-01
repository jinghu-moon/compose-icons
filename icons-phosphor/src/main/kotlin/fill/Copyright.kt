package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Copyright: ImageVector
    get() {
        if (_copyright != null) return _copyright!!
        _copyright = phosphorFillIcon(
            name = "Copyright",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 56.0f),
                    PathNode.CurveTo(88.2355f, 56.0f, 56.0f, 88.2355f, 56.0f, 128.0f),
                    PathNode.CurveTo(56.0f, 167.7645f, 88.2355f, 200.0f, 128.0f, 200.0f),
                    PathNode.CurveTo(167.7645f, 200.0f, 200.0f, 167.7645f, 200.0f, 128.0f),
                    PathNode.CurveTo(199.95592f, 88.25378f, 167.74623f, 56.04409f, 128.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 160.0f),
                    PathNode.CurveTo(138.0832f, 160.0349f, 147.58546f, 155.28563f, 153.61f, 147.2f),
                    PathNode.CurveTo(155.30829f, 144.86383f, 158.13396f, 143.62445f, 161.00293f, 143.95734f),
                    PathNode.CurveTo(163.8719f, 144.29024f, 166.3387f, 146.1437f, 167.45694f, 148.80669f),
                    PathNode.CurveTo(168.57516f, 151.46965f, 168.17119f, 154.52861f, 166.4f, 156.81f),
                    PathNode.CurveTo(153.99922f, 173.33092f, 132.4193f, 180.06506f, 112.823425f, 173.52884f),
                    PathNode.CurveTo(93.227554f, 166.99261f, 80.01125f, 148.6522f, 80.01125f, 127.995f),
                    PathNode.CurveTo(80.01125f, 107.33779f, 93.227554f, 88.997375f, 112.823425f, 82.46117f),
                    PathNode.CurveTo(132.4193f, 75.92496f, 153.99922f, 82.65908f, 166.4f, 99.18f),
                    PathNode.CurveTo(168.17119f, 101.46139f, 168.57516f, 104.52035f, 167.45694f, 107.18332f),
                    PathNode.CurveTo(166.3387f, 109.84629f, 163.8719f, 111.69976f, 161.00293f, 112.03265f),
                    PathNode.CurveTo(158.13396f, 112.36555f, 155.30829f, 111.12617f, 153.61f, 108.79f),
                    PathNode.CurveTo(144.57857f, 96.75786f, 128.38522f, 92.64178f, 114.70444f, 98.900826f),
                    PathNode.CurveTo(101.02365f, 105.159874f, 93.55032f, 120.103615f, 96.74925f, 134.80417f),
                    PathNode.CurveTo(99.94819f, 149.50473f, 112.955414f, 159.99178f, 128.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 216.0f),
                    PathNode.CurveTo(79.39894f, 216.0f, 40.0f, 176.60106f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 79.39894f, 79.39894f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(176.60106f, 40.0f, 216.0f, 79.39894f, 216.0f, 128.0f),
                    PathNode.CurveTo(215.94489f, 176.57822f, 176.57822f, 215.94489f, 128.0f, 216.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _copyright!!
    }

private var _copyright: ImageVector? = null
