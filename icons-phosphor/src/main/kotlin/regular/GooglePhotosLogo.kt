package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GooglePhotosLogo: ImageVector
    get() {
        if (_googlePhotosLogo != null) return _googlePhotosLogo!!
        _googlePhotosLogo = phosphorRegularIcon(
            name = "GooglePhotosLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 120.0f),
                    PathNode.LineTo(192.49f, 120.0f),
                    PathNode.CurveTo(203.56224f, 97.6832f, 202.31117f, 71.2284f, 189.1823f, 50.056095f),
                    PathNode.CurveTo(176.05342f, 28.883781f, 152.91252f, 16.002789f, 128.0f, 16.0f),
                    PathNode.CurveTo(123.58172f, 16.0f, 120.0f, 19.581722f, 120.0f, 24.0f),
                    PathNode.LineTo(120.0f, 63.51f),
                    PathNode.CurveTo(97.6832f, 52.437767f, 71.2284f, 53.688835f, 50.056095f, 66.8177f),
                    PathNode.CurveTo(28.883781f, 79.94657f, 16.002789f, 103.08747f, 16.0f, 128.0f),
                    PathNode.CurveTo(16.0f, 132.41827f, 19.581722f, 136.0f, 24.0f, 136.0f),
                    PathNode.LineTo(63.51f, 136.0f),
                    PathNode.CurveTo(52.437767f, 158.3168f, 53.688835f, 184.77159f, 66.8177f, 205.94391f),
                    PathNode.CurveTo(79.94657f, 227.11621f, 103.08747f, 239.9972f, 128.0f, 240.0f),
                    PathNode.CurveTo(132.41827f, 240.0f, 136.0f, 236.41827f, 136.0f, 232.0f),
                    PathNode.LineTo(136.0f, 192.49f),
                    PathNode.CurveTo(158.3168f, 203.56224f, 184.77159f, 202.31117f, 205.94391f, 189.1823f),
                    PathNode.CurveTo(227.11621f, 176.05342f, 239.9972f, 152.91252f, 240.0f, 128.0f),
                    PathNode.CurveTo(240.0f, 123.58172f, 236.41827f, 120.0f, 232.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 88.0f),
                    PathNode.CurveTo(184.05759f, 99.44436f, 180.5637f, 110.624794f, 174.0f, 120.0f),
                    PathNode.LineTo(136.0f, 120.0f),
                    PathNode.LineTo(136.0f, 32.57f),
                    PathNode.CurveTo(163.5339f, 36.58322f, 183.96353f, 60.175182f, 184.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 72.0f),
                    PathNode.CurveTo(99.44436f, 71.942406f, 110.624794f, 75.436295f, 120.0f, 82.0f),
                    PathNode.LineTo(120.0f, 120.0f),
                    PathNode.LineTo(32.57f, 120.0f),
                    PathNode.CurveTo(36.58322f, 92.466095f, 60.175182f, 72.03647f, 88.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 168.0f),
                    PathNode.CurveTo(71.942406f, 156.55563f, 75.436295f, 145.3752f, 82.0f, 136.0f),
                    PathNode.LineTo(120.0f, 136.0f),
                    PathNode.LineTo(120.0f, 223.43f),
                    PathNode.CurveTo(92.466095f, 219.41678f, 72.03647f, 195.82481f, 72.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 184.0f),
                    PathNode.CurveTo(156.55563f, 184.05759f, 145.3752f, 180.5637f, 136.0f, 174.0f),
                    PathNode.LineTo(136.0f, 136.0f),
                    PathNode.LineTo(223.43f, 136.0f),
                    PathNode.CurveTo(219.41678f, 163.5339f, 195.82481f, 183.96353f, 168.0f, 184.0f),
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
        return _googlePhotosLogo!!
    }

private var _googlePhotosLogo: ImageVector? = null
