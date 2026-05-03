package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TumblrLogo: ImageVector
    get() {
        if (_tumblrLogo != null) return _tumblrLogo!!
        _tumblrLogo = phosphorLightIcon(
            name = "TumblrLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 118.0f),
                    PathNode.CurveTo(195.3137f, 118.0f, 198.0f, 115.313705f, 198.0f, 112.0f),
                    PathNode.LineTo(198.0f, 72.0f),
                    PathNode.CurveTo(198.0f, 68.686295f, 195.3137f, 66.0f, 192.0f, 66.0f),
                    PathNode.LineTo(150.0f, 66.0f),
                    PathNode.LineTo(150.0f, 24.0f),
                    PathNode.CurveTo(150.0f, 20.68629f, 147.3137f, 18.0f, 144.0f, 18.0f),
                    PathNode.LineTo(112.0f, 18.0f),
                    PathNode.CurveTo(108.686295f, 18.0f, 106.0f, 20.68629f, 106.0f, 24.0f),
                    PathNode.CurveTo(106.0f, 47.19596f, 87.19596f, 66.0f, 64.0f, 66.0f),
                    PathNode.CurveTo(60.68629f, 66.0f, 58.0f, 68.686295f, 58.0f, 72.0f),
                    PathNode.LineTo(58.0f, 112.0f),
                    PathNode.CurveTo(58.0f, 115.313705f, 60.68629f, 118.0f, 64.0f, 118.0f),
                    PathNode.LineTo(90.0f, 118.0f),
                    PathNode.LineTo(90.0f, 176.0f),
                    PathNode.CurveTo(90.038574f, 210.22566f, 117.77434f, 237.96143f, 152.0f, 238.0f),
                    PathNode.LineTo(192.0f, 238.0f),
                    PathNode.CurveTo(195.3137f, 238.0f, 198.0f, 235.3137f, 198.0f, 232.0f),
                    PathNode.LineTo(198.0f, 184.0f),
                    PathNode.CurveTo(198.0f, 180.6863f, 195.3137f, 178.0f, 192.0f, 178.0f),
                    PathNode.LineTo(160.0f, 178.0f),
                    PathNode.CurveTo(154.47716f, 178.0f, 150.0f, 173.52284f, 150.0f, 168.0f),
                    PathNode.LineTo(150.0f, 118.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 190.0f),
                    PathNode.LineTo(186.0f, 190.0f),
                    PathNode.LineTo(186.0f, 226.0f),
                    PathNode.LineTo(152.0f, 226.0f),
                    PathNode.CurveTo(124.39947f, 225.96693f, 102.03306f, 203.60052f, 102.0f, 176.0f),
                    PathNode.LineTo(102.0f, 112.0f),
                    PathNode.CurveTo(102.0f, 108.686295f, 99.313705f, 106.0f, 96.0f, 106.0f),
                    PathNode.LineTo(70.0f, 106.0f),
                    PathNode.LineTo(70.0f, 77.67f),
                    PathNode.CurveTo(95.055f, 74.82571f, 114.82571f, 55.055f, 117.67f, 30.0f),
                    PathNode.LineTo(138.0f, 30.0f),
                    PathNode.LineTo(138.0f, 72.0f),
                    PathNode.CurveTo(138.0f, 75.313705f, 140.6863f, 78.0f, 144.0f, 78.0f),
                    PathNode.LineTo(186.0f, 78.0f),
                    PathNode.LineTo(186.0f, 106.0f),
                    PathNode.LineTo(144.0f, 106.0f),
                    PathNode.CurveTo(140.6863f, 106.0f, 138.0f, 108.686295f, 138.0f, 112.0f),
                    PathNode.LineTo(138.0f, 168.0f),
                    PathNode.CurveTo(138.0f, 180.15027f, 147.84973f, 190.0f, 160.0f, 190.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _tumblrLogo!!
    }

private var _tumblrLogo: ImageVector? = null
