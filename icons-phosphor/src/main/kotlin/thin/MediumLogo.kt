package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MediumLogo: ImageVector
    get() {
        if (_mediumLogo != null) return _mediumLogo!!
        _mediumLogo = phosphorThinIcon(
            name = "MediumLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(72.0f, 68.0f),
                    PathNode.CurveTo(38.862915f, 68.0f, 12.0f, 94.862915f, 12.0f, 128.0f),
                    PathNode.CurveTo(12.0f, 161.13708f, 38.862915f, 188.0f, 72.0f, 188.0f),
                    PathNode.CurveTo(105.137085f, 188.0f, 132.0f, 161.13708f, 132.0f, 128.0f),
                    PathNode.CurveTo(131.96143f, 94.87891f, 105.12109f, 68.038574f, 72.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 180.0f),
                    PathNode.CurveTo(43.281193f, 180.0f, 20.0f, 156.71881f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 99.2812f, 43.281193f, 76.0f, 72.0f, 76.0f),
                    PathNode.CurveTo(100.7188f, 76.0f, 124.0f, 99.2812f, 124.0f, 128.0f),
                    PathNode.CurveTo(123.966934f, 156.7051f, 100.7051f, 179.96693f, 72.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 68.0f),
                    PathNode.CurveTo(168.0f, 68.0f, 156.0f, 93.79f, 156.0f, 128.0f),
                    PathNode.CurveTo(156.0f, 162.21f, 168.0f, 188.0f, 184.0f, 188.0f),
                    PathNode.CurveTo(200.0f, 188.0f, 212.0f, 162.21f, 212.0f, 128.0f),
                    PathNode.CurveTo(212.0f, 93.79f, 200.0f, 68.0f, 184.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 180.0f),
                    PathNode.CurveTo(174.54f, 180.0f, 164.0f, 158.64f, 164.0f, 128.0f),
                    PathNode.CurveTo(164.0f, 97.36f, 174.54f, 76.0f, 184.0f, 76.0f),
                    PathNode.CurveTo(193.46f, 76.0f, 204.0f, 97.36f, 204.0f, 128.0f),
                    PathNode.CurveTo(204.0f, 158.64f, 193.46f, 180.0f, 184.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(244.0f, 72.0f),
                    PathNode.LineTo(244.0f, 184.0f),
                    PathNode.CurveTo(244.0f, 186.20914f, 242.20914f, 188.0f, 240.0f, 188.0f),
                    PathNode.CurveTo(237.79086f, 188.0f, 236.0f, 186.20914f, 236.0f, 184.0f),
                    PathNode.LineTo(236.0f, 72.0f),
                    PathNode.CurveTo(236.0f, 69.79086f, 237.79086f, 68.0f, 240.0f, 68.0f),
                    PathNode.CurveTo(242.20914f, 68.0f, 244.0f, 69.79086f, 244.0f, 72.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _mediumLogo!!
    }

private var _mediumLogo: ImageVector? = null
