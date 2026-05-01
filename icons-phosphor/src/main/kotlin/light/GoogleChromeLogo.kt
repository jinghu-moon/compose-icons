package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GoogleChromeLogo: ImageVector
    get() {
        if (_googleChromeLogo != null) return _googleChromeLogo!!
        _googleChromeLogo = phosphorLightIcon(
            name = "GoogleChromeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 26.0f),
                    PathNode.CurveTo(71.666954f, 26.0f, 26.0f, 71.666954f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 184.33304f, 71.666954f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(184.33304f, 230.0f, 230.0f, 184.33304f, 230.0f, 128.0f),
                    PathNode.CurveTo(229.93387f, 71.69437f, 184.30563f, 26.066126f, 128.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 38.0f),
                    PathNode.CurveTo(159.73079f, 38.00928f, 189.11205f, 54.72692f, 205.33f, 82.0f),
                    PathNode.LineTo(128.0f, 82.0f),
                    PathNode.CurveTo(106.394875f, 82.029884f, 87.712715f, 97.06959f, 83.07f, 118.17f),
                    PathNode.LineTo(56.91f, 72.87f),
                    PathNode.CurveTo(73.93726f, 50.876137f, 100.185295f, 38.001347f, 128.0f, 38.0f),
                    PathNode.Close,
                    PathNode.MoveTo(162.0f, 128.0f),
                    PathNode.CurveTo(162.0f, 146.77768f, 146.77768f, 162.0f, 128.0f, 162.0f),
                    PathNode.CurveTo(109.22232f, 162.0f, 94.0f, 146.77768f, 94.0f, 128.0f),
                    PathNode.CurveTo(94.0f, 109.22232f, 109.22232f, 94.0f, 128.0f, 94.0f),
                    PathNode.CurveTo(146.77768f, 94.0f, 162.0f, 109.22232f, 162.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(38.0f, 128.0f),
                    PathNode.CurveTo(37.976387f, 112.58723f, 41.9379f, 97.43014f, 49.5f, 84.0f),
                    PathNode.LineTo(88.16f, 151.0f),
                    PathNode.CurveTo(88.22f, 151.1f, 88.29f, 151.18f, 88.35f, 151.27f),
                    PathNode.CurveTo(99.212944f, 169.8403f, 121.508606f, 178.38454f, 142.0f, 171.83f),
                    PathNode.LineTo(115.83f, 217.17f),
                    PathNode.CurveTo(71.27071f, 211.03162f, 38.05828f, 172.98009f, 38.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(129.16f, 218.0f),
                    PathNode.LineTo(167.84f, 151.0f),
                    PathNode.LineTo(168.05f, 150.59f),
                    PathNode.CurveTo(178.6265f, 131.92923f, 174.8687f, 108.431595f, 159.0f, 94.0f),
                    PathNode.LineTo(211.37f, 94.0f),
                    PathNode.CurveTo(222.61845f, 121.56169f, 219.51057f, 152.90242f, 203.06813f, 177.71815f),
                    PathNode.CurveTo(186.6257f, 202.5339f, 158.97618f, 217.61382f, 129.21f, 218.0f),
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
        return _googleChromeLogo!!
    }

private var _googleChromeLogo: ImageVector? = null
