package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Cursor: ImageVector
    get() {
        if (_cursor != null) return _cursor!!
        _cursor = phosphorLightIcon(
            name = "Cursor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(166.59f, 134.1f),
                    PathNode.CurveTo(166.10669f, 133.6403f, 165.89821f, 132.96178f, 166.04f, 132.31f),
                    PathNode.CurveTo(166.15726f, 131.69344f, 166.55713f, 131.16766f, 167.12f, 130.89f),
                    PathNode.LineTo(213.37f, 113.13f),
                    PathNode.LineTo(213.61f, 113.03f),
                    PathNode.CurveTo(218.8609f, 110.67408f, 222.13507f, 105.34472f, 221.86343f, 99.59594f),
                    PathNode.CurveTo(221.59178f, 93.84715f, 217.82965f, 88.85028f, 212.38f, 87.0f),
                    PathNode.LineTo(52.29f, 34.7f),
                    PathNode.CurveTo(47.296787f, 33.070213f, 41.811367f, 34.383263f, 38.097317f, 38.097317f),
                    PathNode.CurveTo(34.383263f, 41.811367f, 33.070213f, 47.296787f, 34.7f, 52.29f),
                    PathNode.LineTo(87.0f, 212.38f),
                    PathNode.CurveTo(88.76745f, 217.90834f, 93.80083f, 221.7433f, 99.6f, 221.98f),
                    PathNode.CurveTo(99.83f, 221.98f, 100.06f, 221.98f, 100.29f, 221.98f),
                    PathNode.CurveTo(105.81806f, 221.97873f, 110.81514f, 218.68797f, 113.0f, 213.61f),
                    PathNode.CurveTo(113.037575f, 213.53183f, 113.07095f, 213.45172f, 113.1f, 213.37f),
                    PathNode.LineTo(130.86f, 167.12f),
                    PathNode.CurveTo(131.14496f, 166.54085f, 131.6919f, 166.13483f, 132.32874f, 166.02968f),
                    PathNode.CurveTo(132.96556f, 165.92453f, 133.614f, 166.1332f, 134.07f, 166.59f),
                    PathNode.LineTo(185.38f, 217.9f),
                    PathNode.CurveTo(188.00555f, 220.52582f, 191.56673f, 222.001f, 195.28f, 222.001f),
                    PathNode.CurveTo(198.99327f, 222.001f, 202.55444f, 220.52582f, 205.18f, 217.9f),
                    PathNode.LineTo(217.87f, 205.21f),
                    PathNode.CurveTo(220.49582f, 202.58444f, 221.97101f, 199.02328f, 221.97101f, 195.31f),
                    PathNode.CurveTo(221.97101f, 191.59673f, 220.49582f, 188.03555f, 217.87f, 185.41f),
                    PathNode.Close,
                    PathNode.MoveTo(209.41f, 196.73f),
                    PathNode.LineTo(196.73f, 209.41f),
                    PathNode.CurveTo(196.35486f, 209.78555f, 195.84583f, 209.99657f, 195.315f, 209.99657f),
                    PathNode.CurveTo(194.78418f, 209.99657f, 194.27513f, 209.78555f, 193.9f, 209.41f),
                    PathNode.LineTo(142.59f, 158.1f),
                    PathNode.CurveTo(139.31392f, 154.82376f, 134.62914f, 153.38051f, 130.07735f, 154.24524f),
                    PathNode.CurveTo(125.52557f, 155.10995f, 121.6964f, 158.17062f, 119.85f, 162.42f),
                    PathNode.CurveTo(119.81242f, 162.49817f, 119.779045f, 162.57828f, 119.75f, 162.66f),
                    PathNode.LineTo(102.0f, 208.91f),
                    PathNode.CurveTo(101.62063f, 209.58553f, 100.885254f, 209.98117f, 100.112495f, 209.92552f),
                    PathNode.CurveTo(99.339745f, 209.86986f, 98.66865f, 209.37291f, 98.39f, 208.65f),
                    PathNode.LineTo(46.11f, 48.57f),
                    PathNode.CurveTo(45.85362f, 47.86927f, 46.03835f, 47.083195f, 46.58f, 46.57f),
                    PathNode.CurveTo(46.936943f, 46.208992f, 47.42234f, 46.004047f, 47.93f, 46.0f),
                    PathNode.CurveTo(48.147076f, 46.00186f, 48.362705f, 46.035553f, 48.57f, 46.1f),
                    PathNode.LineTo(208.65f, 98.38f),
                    PathNode.CurveTo(209.37291f, 98.658646f, 209.86986f, 99.32974f, 209.92552f, 100.1025f),
                    PathNode.CurveTo(209.98117f, 100.87525f, 209.58553f, 101.610634f, 208.91f, 101.99f),
                    PathNode.LineTo(162.66f, 119.75f),
                    PathNode.LineTo(162.42f, 119.85f),
                    PathNode.CurveTo(158.17062f, 121.6964f, 155.10995f, 125.52557f, 154.24524f, 130.07735f),
                    PathNode.CurveTo(153.38051f, 134.62914f, 154.82376f, 139.31392f, 158.1f, 142.59f),
                    PathNode.LineTo(158.1f, 142.59f),
                    PathNode.LineTo(209.41f, 193.9f),
                    PathNode.CurveTo(209.78555f, 194.27513f, 209.99657f, 194.78418f, 209.99657f, 195.315f),
                    PathNode.CurveTo(209.99657f, 195.84583f, 209.78555f, 196.35486f, 209.41f, 196.73f),
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
        return _cursor!!
    }

private var _cursor: ImageVector? = null
