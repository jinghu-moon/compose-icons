package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) return _paperPlane!!
        _paperPlane = phosphorLightIcon(
            name = "PaperPlane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.17f, 201.09f),
                    PathNode.LineTo(140.1f, 33.16f),
                    PathNode.CurveTo(137.62119f, 28.748787f, 132.95497f, 26.018423f, 127.895f, 26.018423f),
                    PathNode.CurveTo(122.83502f, 26.018423f, 118.168816f, 28.748787f, 115.69f, 33.16f),
                    PathNode.LineTo(19.81f, 201.16f),
                    PathNode.CurveTo(16.959045f, 206.24359f, 17.555878f, 212.56168f, 21.308342f, 217.02148f),
                    PathNode.CurveTo(25.060808f, 221.4813f, 31.183779f, 223.14969f, 36.68f, 221.21f),
                    PathNode.LineTo(128.0f, 190.34f),
                    PathNode.LineTo(219.33f, 221.19f),
                    PathNode.CurveTo(220.83083f, 221.71771f, 222.40913f, 221.99147f, 224.0f, 222.0f),
                    PathNode.CurveTo(228.975f, 221.98372f, 233.56766f, 219.32845f, 236.06406f, 215.02509f),
                    PathNode.CurveTo(238.56046f, 210.72173f, 238.58556f, 205.4168f, 236.13f, 201.09f),
                    PathNode.Close,
                    PathNode.MoveTo(225.51f, 209.27f),
                    PathNode.CurveTo(224.99756f, 209.94572f, 224.09454f, 210.19199f, 223.31f, 209.87f),
                    PathNode.LineTo(223.21f, 209.87f),
                    PathNode.LineTo(134.0f, 179.7f),
                    PathNode.LineTo(134.0f, 120.0f),
                    PathNode.CurveTo(134.0f, 116.686295f, 131.3137f, 114.0f, 128.0f, 114.0f),
                    PathNode.CurveTo(124.686295f, 114.0f, 122.0f, 116.686295f, 122.0f, 120.0f),
                    PathNode.LineTo(122.0f, 179.7f),
                    PathNode.LineTo(32.8f, 209.83f),
                    PathNode.LineTo(32.7f, 209.83f),
                    PathNode.CurveTo(31.915451f, 210.152f, 31.012445f, 209.90572f, 30.5f, 209.23f),
                    PathNode.CurveTo(29.928814f, 208.62866f, 29.830528f, 207.71951f, 30.26f, 207.01f),
                    PathNode.LineTo(126.14f, 39.0f),
                    PathNode.CurveTo(126.487465f, 38.36761f, 127.15867f, 37.981865f, 127.88f, 38.0f),
                    PathNode.CurveTo(128.62653f, 37.9965f, 129.31287f, 38.409077f, 129.66f, 39.07f),
                    PathNode.LineTo(225.73f, 207.0f),
                    PathNode.CurveTo(226.18358f, 207.71814f, 226.09303f, 208.65233f, 225.51f, 209.27f),
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
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
