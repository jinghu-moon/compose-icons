package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ShirtFolded: ImageVector
    get() {
        if (_shirtFolded != null) return _shirtFolded!!
        _shirtFolded = phosphorRegularIcon(
            name = "ShirtFolded",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 40.0f),
                    PathNode.LineTo(179.31f, 40.0f),
                    PathNode.LineTo(165.66f, 26.34f),
                    PathNode.LineTo(165.66f, 26.34f),
                    PathNode.CurveTo(164.15842f, 24.840092f, 162.12238f, 23.998331f, 160.0f, 24.0f),
                    PathNode.LineTo(96.0f, 24.0f),
                    PathNode.CurveTo(93.87763f, 23.998331f, 91.841576f, 24.840092f, 90.34f, 26.34f),
                    PathNode.LineTo(90.34f, 26.34f),
                    PathNode.LineTo(76.69f, 40.0f),
                    PathNode.LineTo(56.0f, 40.0f),
                    PathNode.CurveTo(47.163445f, 40.0f, 40.0f, 47.163445f, 40.0f, 56.0f),
                    PathNode.LineTo(40.0f, 208.0f),
                    PathNode.CurveTo(40.0f, 216.83656f, 47.163445f, 224.0f, 56.0f, 224.0f),
                    PathNode.LineTo(200.0f, 224.0f),
                    PathNode.CurveTo(208.83656f, 224.0f, 216.0f, 216.83656f, 216.0f, 208.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.CurveTo(216.0f, 47.163445f, 208.83656f, 40.0f, 200.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 65.58f),
                    PathNode.LineTo(111.0f, 40.0f),
                    PathNode.LineTo(145.1f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(161.24f, 44.58f),
                    PathNode.LineTo(168.0f, 51.31f),
                    PathNode.LineTo(168.0f, 104.0f),
                    PathNode.LineTo(138.57f, 78.56f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 51.31f),
                    PathNode.LineTo(94.76f, 44.56f),
                    PathNode.LineTo(117.43f, 78.56f),
                    PathNode.LineTo(88.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 56.0f),
                    PathNode.LineTo(72.0f, 56.0f),
                    PathNode.LineTo(72.0f, 104.0f),
                    PathNode.CurveTo(71.96165f, 110.21852f, 75.56329f, 115.88496f, 81.21f, 118.49f),
                    PathNode.CurveTo(83.336266f, 119.482086f, 85.65368f, 119.99745f, 88.0f, 120.0f),
                    PathNode.CurveTo(91.73256f, 119.99325f, 95.34362f, 118.67274f, 98.2f, 116.27f),
                    PathNode.CurveTo(98.241264f, 116.2421f, 98.27831f, 116.20843f, 98.31f, 116.17f),
                    PathNode.LineTo(120.0f, 97.48f),
                    PathNode.LineTo(120.0f, 208.0f),
                    PathNode.LineTo(56.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 208.0f),
                    PathNode.LineTo(136.0f, 208.0f),
                    PathNode.LineTo(136.0f, 97.48f),
                    PathNode.LineTo(157.65f, 116.18f),
                    PathNode.CurveTo(157.68169f, 116.21843f, 157.71873f, 116.252106f, 157.76f, 116.28f),
                    PathNode.CurveTo(160.62828f, 118.68797f, 164.25494f, 120.00546f, 168.0f, 120.0f),
                    PathNode.CurveTo(170.36208f, 119.993904f, 172.69386f, 119.46814f, 174.83f, 118.46f),
                    PathNode.CurveTo(180.45117f, 115.847725f, 184.03375f, 110.19842f, 184.0f, 104.0f),
                    PathNode.LineTo(184.0f, 56.0f),
                    PathNode.LineTo(200.0f, 56.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _shirtFolded!!
    }

private var _shirtFolded: ImageVector? = null
