package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShieldStar: ImageVector
    get() {
        if (_shieldStar != null) return _shieldStar!!
        _shieldStar = phosphorLightIcon(
            name = "ShieldStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(173.57f, 117.77f),
                    PathNode.CurveTo(174.80148f, 120.84622f, 173.30617f, 124.338326f, 170.23f, 125.57f),
                    PathNode.LineTo(137.5f, 138.66f),
                    PathNode.LineTo(156.8f, 164.4f),
                    PathNode.CurveTo(158.78822f, 167.05096f, 158.25096f, 170.81177f, 155.6f, 172.8f),
                    PathNode.CurveTo(152.94904f, 174.78822f, 149.18823f, 174.25096f, 147.2f, 171.6f),
                    PathNode.LineTo(128.0f, 146.0f),
                    PathNode.LineTo(108.8f, 171.6f),
                    PathNode.CurveTo(106.811775f, 174.25096f, 103.050964f, 174.78822f, 100.4f, 172.8f),
                    PathNode.CurveTo(97.74903f, 170.81177f, 97.21178f, 167.05096f, 99.2f, 164.4f),
                    PathNode.LineTo(118.5f, 138.66f),
                    PathNode.LineTo(85.77f, 125.57f),
                    PathNode.CurveTo(82.72034f, 124.32129f, 81.24854f, 120.846695f, 82.47337f, 117.78737f),
                    PathNode.CurveTo(83.69821f, 114.728035f, 87.16119f, 113.229126f, 90.23f, 114.43f),
                    PathNode.LineTo(122.0f, 127.14f),
                    PathNode.LineTo(122.0f, 96.0f),
                    PathNode.CurveTo(122.0f, 92.686295f, 124.686295f, 90.0f, 128.0f, 90.0f),
                    PathNode.CurveTo(131.3137f, 90.0f, 134.0f, 92.686295f, 134.0f, 96.0f),
                    PathNode.LineTo(134.0f, 127.14f),
                    PathNode.LineTo(165.77f, 114.43f),
                    PathNode.CurveTo(168.84622f, 113.19852f, 172.33833f, 114.69385f, 173.57f, 117.77f),
                    PathNode.Close,
                    PathNode.MoveTo(222.0f, 56.0f),
                    PathNode.LineTo(222.0f, 112.0f),
                    PathNode.CurveTo(222.0f, 163.94f, 196.88f, 195.4f, 175.8f, 212.64f),
                    PathNode.CurveTo(153.07f, 231.24f, 130.53f, 237.53f, 129.58f, 237.79f),
                    PathNode.CurveTo(128.5456f, 238.07236f, 127.454414f, 238.07236f, 126.42f, 237.79f),
                    PathNode.CurveTo(125.42f, 237.53f, 102.93f, 231.24f, 80.2f, 212.64f),
                    PathNode.CurveTo(59.12f, 195.4f, 34.0f, 163.94f, 34.0f, 112.0f),
                    PathNode.LineTo(34.0f, 56.0f),
                    PathNode.CurveTo(34.0f, 48.268013f, 40.268013f, 42.0f, 48.0f, 42.0f),
                    PathNode.LineTo(208.0f, 42.0f),
                    PathNode.CurveTo(215.73198f, 42.0f, 222.0f, 48.268013f, 222.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 56.0f),
                    PathNode.CurveTo(210.0f, 54.89543f, 209.10457f, 54.0f, 208.0f, 54.0f),
                    PathNode.LineTo(48.0f, 54.0f),
                    PathNode.CurveTo(46.89543f, 54.0f, 46.0f, 54.89543f, 46.0f, 56.0f),
                    PathNode.LineTo(46.0f, 112.0f),
                    PathNode.CurveTo(46.0f, 149.75f, 59.94f, 180.39f, 87.44f, 203.06f),
                    PathNode.CurveTo(99.501144f, 212.97073f, 113.23733f, 220.64484f, 128.0f, 225.72f),
                    PathNode.CurveTo(142.76065f, 220.64032f, 156.49606f, 212.96664f, 168.56f, 203.06f),
                    PathNode.CurveTo(196.06f, 180.39f, 210.0f, 149.75f, 210.0f, 112.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _shieldStar!!
    }

private var _shieldStar: ImageVector? = null
