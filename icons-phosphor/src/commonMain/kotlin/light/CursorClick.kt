package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CursorClick: ImageVector
    get() {
        if (_cursorClick != null) return _cursorClick!!
        _cursorClick = phosphorLightIcon(
            name = "CursorClick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(90.0f, 24.0f),
                    PathNode.LineTo(90.0f, 16.0f),
                    PathNode.CurveTo(90.0f, 12.686292f, 92.686295f, 10.0f, 96.0f, 10.0f),
                    PathNode.CurveTo(99.313705f, 10.0f, 102.0f, 12.686292f, 102.0f, 16.0f),
                    PathNode.LineTo(102.0f, 24.0f),
                    PathNode.CurveTo(102.0f, 27.31371f, 99.313705f, 30.0f, 96.0f, 30.0f),
                    PathNode.CurveTo(92.686295f, 30.0f, 90.0f, 27.31371f, 90.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(16.0f, 102.0f),
                    PathNode.LineTo(24.0f, 102.0f),
                    PathNode.CurveTo(27.31371f, 102.0f, 30.0f, 99.313705f, 30.0f, 96.0f),
                    PathNode.CurveTo(30.0f, 92.686295f, 27.31371f, 90.0f, 24.0f, 90.0f),
                    PathNode.LineTo(16.0f, 90.0f),
                    PathNode.CurveTo(12.686292f, 90.0f, 10.0f, 92.686295f, 10.0f, 96.0f),
                    PathNode.CurveTo(10.0f, 99.313705f, 12.686292f, 102.0f, 16.0f, 102.0f),
                    PathNode.Close,
                    PathNode.MoveTo(125.32f, 37.37f),
                    PathNode.CurveTo(126.74414f, 38.08122f, 128.39253f, 38.197357f, 129.90233f, 37.69284f),
                    PathNode.CurveTo(131.41212f, 37.188328f, 132.65955f, 36.10452f, 133.37f, 34.68f),
                    PathNode.LineTo(141.37f, 18.68f),
                    PathNode.CurveTo(142.85289f, 15.714231f, 141.65077f, 12.107884f, 138.685f, 10.625f),
                    PathNode.CurveTo(135.71924f, 9.142116f, 132.11288f, 10.344231f, 130.63f, 13.31f),
                    PathNode.LineTo(122.63f, 29.31f),
                    PathNode.CurveTo(121.91561f, 30.735155f, 121.79776f, 32.386024f, 122.302444f, 33.89821f),
                    PathNode.CurveTo(122.80713f, 35.410397f, 123.892876f, 36.65957f, 125.32f, 37.37f),
                    PathNode.Close,
                    PathNode.MoveTo(29.32f, 122.63f),
                    PathNode.LineTo(13.32f, 130.63f),
                    PathNode.CurveTo(10.354231f, 132.11012f, 9.149877f, 135.71423f, 10.63f, 138.68f),
                    PathNode.CurveTo(12.110124f, 141.64577f, 15.714231f, 142.85013f, 18.68f, 141.37f),
                    PathNode.LineTo(34.68f, 133.37f),
                    PathNode.CurveTo(37.64577f, 131.88988f, 38.850124f, 128.28577f, 37.37f, 125.32f),
                    PathNode.CurveTo(35.889877f, 122.35423f, 32.28577f, 121.14988f, 29.32f, 122.63f),
                    PathNode.Close,
                    PathNode.MoveTo(217.9f, 185.41f),
                    PathNode.CurveTo(220.52582f, 188.03555f, 222.001f, 191.59673f, 222.001f, 195.31f),
                    PathNode.CurveTo(222.001f, 199.02328f, 220.52582f, 202.58444f, 217.9f, 205.21f),
                    PathNode.LineTo(205.21f, 217.9f),
                    PathNode.CurveTo(202.58444f, 220.52582f, 199.02328f, 222.001f, 195.31f, 222.001f),
                    PathNode.CurveTo(191.59673f, 222.001f, 188.03555f, 220.52582f, 185.41f, 217.9f),
                    PathNode.LineTo(134.1f, 166.59f),
                    PathNode.CurveTo(133.64258f, 166.13388f, 132.99304f, 165.9268f, 132.35603f, 166.03397f),
                    PathNode.CurveTo(131.71904f, 166.14113f, 131.173f, 166.54935f, 130.89f, 167.13f),
                    PathNode.LineTo(113.14f, 213.37f),
                    PathNode.CurveTo(113.102425f, 213.44817f, 113.069046f, 213.52827f, 113.04f, 213.61f),
                    PathNode.CurveTo(110.84914f, 218.71745f, 105.817474f, 222.0207f, 100.26f, 222.0f),
                    PathNode.CurveTo(100.03f, 222.0f, 99.81f, 222.0f, 99.58f, 222.0f),
                    PathNode.CurveTo(93.78612f, 221.74348f, 88.765594f, 217.90427f, 87.0f, 212.38f),
                    PathNode.LineTo(34.7f, 52.3f),
                    PathNode.CurveTo(33.10291f, 47.30758f, 34.428406f, 41.841232f, 38.13482f, 38.13482f),
                    PathNode.CurveTo(41.841232f, 34.428406f, 47.30758f, 33.10291f, 52.3f, 34.7f),
                    PathNode.LineTo(212.38f, 87.0f),
                    PathNode.CurveTo(217.81026f, 88.86103f, 221.55424f, 93.84836f, 221.8255f, 99.58225f),
                    PathNode.CurveTo(222.09676f, 105.31615f, 218.84032f, 110.63463f, 213.61f, 113.0f),
                    PathNode.LineTo(213.37f, 113.09f),
                    PathNode.LineTo(167.12f, 130.85f),
                    PathNode.CurveTo(166.54085f, 131.13496f, 166.13483f, 131.6819f, 166.02968f, 132.31873f),
                    PathNode.CurveTo(165.92453f, 132.95557f, 166.1332f, 133.604f, 166.59f, 134.06f),
                    PathNode.Close,
                    PathNode.MoveTo(209.41f, 193.9f),
                    PathNode.LineTo(158.1f, 142.59f),
                    PathNode.LineTo(158.1f, 142.59f),
                    PathNode.CurveTo(154.82376f, 139.31392f, 153.38051f, 134.62914f, 154.24524f, 130.07735f),
                    PathNode.CurveTo(155.10995f, 125.52557f, 158.17062f, 121.6964f, 162.42f, 119.85f),
                    PathNode.LineTo(162.66f, 119.75f),
                    PathNode.LineTo(208.91f, 102.0f),
                    PathNode.CurveTo(209.58553f, 101.62063f, 209.98117f, 100.885254f, 209.92552f, 100.112495f),
                    PathNode.CurveTo(209.86986f, 99.339745f, 209.37291f, 98.66865f, 208.65f, 98.39f),
                    PathNode.LineTo(48.58f, 46.11f),
                    PathNode.CurveTo(48.36964f, 46.042713f, 48.150784f, 46.005676f, 47.93f, 46.0f),
                    PathNode.CurveTo(47.31351f, 46.02882f, 46.744858f, 46.34064f, 46.389103f, 46.844948f),
                    PathNode.CurveTo(46.03335f, 47.34926f, 45.93035f, 47.989563f, 46.11f, 48.58f),
                    PathNode.LineTo(98.38f, 208.65f),
                    PathNode.CurveTo(98.60001f, 209.44633f, 99.32383f, 209.9984f, 100.15f, 210.0f),
                    PathNode.CurveTo(100.93536f, 210.0766f, 101.67983f, 209.63557f, 101.99f, 208.91f),
                    PathNode.LineTo(119.75f, 162.66f),
                    PathNode.LineTo(119.85f, 162.42f),
                    PathNode.CurveTo(121.6964f, 158.17062f, 125.52557f, 155.10995f, 130.07735f, 154.24524f),
                    PathNode.CurveTo(134.62914f, 153.38051f, 139.31392f, 154.82376f, 142.59f, 158.1f),
                    PathNode.LineTo(193.9f, 209.41f),
                    PathNode.CurveTo(194.27513f, 209.78555f, 194.78418f, 209.99657f, 195.315f, 209.99657f),
                    PathNode.CurveTo(195.84583f, 209.99657f, 196.35486f, 209.78555f, 196.73f, 209.41f),
                    PathNode.LineTo(209.41f, 196.73f),
                    PathNode.CurveTo(209.78555f, 196.35486f, 209.99657f, 195.84583f, 209.99657f, 195.315f),
                    PathNode.CurveTo(209.99657f, 194.78418f, 209.78555f, 194.27513f, 209.41f, 193.9f),
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
        return _cursorClick!!
    }

private var _cursorClick: ImageVector? = null
