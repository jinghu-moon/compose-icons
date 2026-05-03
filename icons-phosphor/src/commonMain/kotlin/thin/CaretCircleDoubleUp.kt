package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CaretCircleDoubleUp: ImageVector
    get() {
        if (_caretCircleDoubleUp != null) return _caretCircleDoubleUp!!
        _caretCircleDoubleUp = phosphorThinIcon(
            name = "CaretCircleDoubleUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(198.71f, 57.29f),
                    PathNode.CurveTo(173.48494f, 31.843018f, 136.57294f, 21.836878f, 101.949455f, 31.06006f),
                    PathNode.CurveTo(67.32597f, 40.28324f, 40.28324f, 67.32597f, 31.06006f, 101.949455f),
                    PathNode.CurveTo(21.836878f, 136.57294f, 31.843018f, 173.48494f, 57.29f, 198.71f),
                    PathNode.CurveTo(82.51506f, 224.15698f, 119.42706f, 234.16312f, 154.05057f, 224.93994f),
                    PathNode.CurveTo(188.67403f, 215.71675f, 215.71675f, 188.67403f, 224.93994f, 154.05057f),
                    PathNode.CurveTo(234.16312f, 119.42706f, 224.15698f, 82.51506f, 198.71f, 57.29f),
                    PathNode.Close,
                    PathNode.MoveTo(193.05f, 193.05f),
                    PathNode.CurveTo(162.01251f, 224.08382f, 113.37507f, 228.87117f, 76.882576f, 204.48424f),
                    PathNode.CurveTo(40.390087f, 180.09732f, 26.20633f, 133.3283f, 43.00558f, 92.77944f),
                    PathNode.CurveTo(59.804836f, 52.2306f, 102.90823f, 29.195456f, 145.95526f, 37.76149f),
                    PathNode.CurveTo(189.00229f, 46.327522f, 220.00365f, 84.108955f, 220.0f, 128.0f),
                    PathNode.CurveTo(220.06773f, 152.41296f, 210.36292f, 175.83777f, 193.05f, 193.05f),
                    PathNode.Close,
                    PathNode.MoveTo(162.83f, 165.17f),
                    PathNode.CurveTo(164.39296f, 166.73297f, 164.39296f, 169.26703f, 162.83f, 170.83f),
                    PathNode.CurveTo(161.26703f, 172.39296f, 158.73297f, 172.39296f, 157.17f, 170.83f),
                    PathNode.LineTo(128.0f, 141.66f),
                    PathNode.LineTo(98.83f, 170.83f),
                    PathNode.CurveTo(97.26704f, 172.39296f, 94.73296f, 172.39296f, 93.17f, 170.83f),
                    PathNode.CurveTo(91.60703f, 169.26703f, 91.60703f, 166.73297f, 93.17f, 165.17f),
                    PathNode.LineTo(125.17f, 133.17f),
                    PathNode.CurveTo(125.92027f, 132.41888f, 126.93836f, 131.99686f, 128.0f, 131.99686f),
                    PathNode.CurveTo(129.06163f, 131.99686f, 130.07973f, 132.41888f, 130.83f, 133.17f),
                    PathNode.Close,
                    PathNode.MoveTo(162.83f, 109.17f),
                    PathNode.CurveTo(164.39296f, 110.73296f, 164.39296f, 113.26704f, 162.83f, 114.83f),
                    PathNode.CurveTo(161.26703f, 116.39297f, 158.73297f, 116.39297f, 157.17f, 114.83f),
                    PathNode.LineTo(128.0f, 85.66f),
                    PathNode.LineTo(98.83f, 114.83f),
                    PathNode.CurveTo(97.26704f, 116.39297f, 94.73296f, 116.39297f, 93.17f, 114.83f),
                    PathNode.CurveTo(91.60703f, 113.26704f, 91.60703f, 110.73296f, 93.17f, 109.17f),
                    PathNode.LineTo(125.17f, 77.17f),
                    PathNode.CurveTo(125.92027f, 76.418884f, 126.93836f, 75.99686f, 128.0f, 75.99686f),
                    PathNode.CurveTo(129.06163f, 75.99686f, 130.07973f, 76.418884f, 130.83f, 77.17f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _caretCircleDoubleUp!!
    }

private var _caretCircleDoubleUp: ImageVector? = null
