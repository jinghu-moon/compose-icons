package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextStrikethrough: ImageVector
    get() {
        if (_textStrikethrough != null) return _textStrikethrough!!
        _textStrikethrough = phosphorLightIcon(
            name = "TextStrikethrough",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.0f, 128.0f),
                    PathNode.CurveTo(222.0f, 131.3137f, 219.3137f, 134.0f, 216.0f, 134.0f),
                    PathNode.LineTo(169.45f, 134.0f),
                    PathNode.CurveTo(180.73f, 140.92f, 190.0f, 151.38f, 190.0f, 168.0f),
                    PathNode.CurveTo(190.0f, 193.36f, 162.19f, 214.0f, 128.0f, 214.0f),
                    PathNode.CurveTo(93.81f, 214.0f, 66.0f, 193.36f, 66.0f, 168.0f),
                    PathNode.CurveTo(66.0f, 164.6863f, 68.686295f, 162.0f, 72.0f, 162.0f),
                    PathNode.CurveTo(75.313705f, 162.0f, 78.0f, 164.6863f, 78.0f, 168.0f),
                    PathNode.CurveTo(78.0f, 186.75f, 100.43f, 202.0f, 128.0f, 202.0f),
                    PathNode.CurveTo(155.57f, 202.0f, 178.0f, 186.75f, 178.0f, 168.0f),
                    PathNode.CurveTo(178.0f, 149.77f, 162.54f, 141.41f, 137.53f, 134.0f),
                    PathNode.LineTo(40.0f, 134.0f),
                    PathNode.CurveTo(36.68629f, 134.0f, 34.0f, 131.3137f, 34.0f, 128.0f),
                    PathNode.CurveTo(34.0f, 124.686295f, 36.68629f, 122.0f, 40.0f, 122.0f),
                    PathNode.LineTo(216.0f, 122.0f),
                    PathNode.CurveTo(219.3137f, 122.0f, 222.0f, 124.686295f, 222.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.33f, 102.0f),
                    PathNode.CurveTo(76.968376f, 101.99738f, 77.60252f, 101.89619f, 78.21f, 101.7f),
                    PathNode.CurveTo(81.34159f, 100.64997f, 83.03562f, 97.26638f, 82.0f, 94.13f),
                    PathNode.CurveTo(81.38259f, 92.14623f, 81.08223f, 90.07744f, 81.11f, 88.0f),
                    PathNode.CurveTo(81.11f, 68.62f, 101.27f, 54.0f, 128.0f, 54.0f),
                    PathNode.CurveTo(147.58f, 54.0f, 163.56f, 61.81f, 170.74f, 74.89f),
                    PathNode.CurveTo(172.3361f, 77.79502f, 175.98499f, 78.8561f, 178.89f, 77.26f),
                    PathNode.CurveTo(181.79501f, 75.663895f, 182.85611f, 72.015015f, 181.26f, 69.11f),
                    PathNode.CurveTo(171.94f, 52.13f, 152.0f, 42.0f, 128.0f, 42.0f),
                    PathNode.CurveTo(94.43f, 42.0f, 69.11f, 61.77f, 69.11f, 88.0f),
                    PathNode.CurveTo(69.09067f, 91.34975f, 69.60372f, 94.68128f, 70.63f, 97.87f),
                    PathNode.CurveTo(71.43808f, 100.33363f, 73.73723f, 101.999504f, 76.33f, 102.0f),
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
        return _textStrikethrough!!
    }

private var _textStrikethrough: ImageVector? = null
