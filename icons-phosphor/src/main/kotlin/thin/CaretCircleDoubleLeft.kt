package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CaretCircleDoubleLeft: ImageVector
    get() {
        if (_caretCircleDoubleLeft != null) return _caretCircleDoubleLeft!!
        _caretCircleDoubleLeft = phosphorThinIcon(
            name = "CaretCircleDoubleLeft",
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
                    PathNode.MoveTo(170.83f, 98.83f),
                    PathNode.LineTo(141.66f, 128.0f),
                    PathNode.LineTo(170.83f, 157.17f),
                    PathNode.CurveTo(172.39296f, 158.73297f, 172.39296f, 161.26703f, 170.83f, 162.83f),
                    PathNode.CurveTo(169.26703f, 164.39296f, 166.73297f, 164.39296f, 165.17f, 162.83f),
                    PathNode.LineTo(133.17f, 130.83f),
                    PathNode.CurveTo(132.41888f, 130.07973f, 131.99686f, 129.06163f, 131.99686f, 128.0f),
                    PathNode.CurveTo(131.99686f, 126.93836f, 132.41888f, 125.92027f, 133.17f, 125.17f),
                    PathNode.LineTo(165.17f, 93.17f),
                    PathNode.CurveTo(166.73297f, 91.60703f, 169.26703f, 91.60703f, 170.83f, 93.17f),
                    PathNode.CurveTo(172.39296f, 94.73296f, 172.39296f, 97.26704f, 170.83f, 98.83f),
                    PathNode.Close,
                    PathNode.MoveTo(114.83f, 98.83f),
                    PathNode.LineTo(85.66f, 128.0f),
                    PathNode.LineTo(114.83f, 157.17f),
                    PathNode.CurveTo(116.39297f, 158.73297f, 116.39297f, 161.26703f, 114.83f, 162.83f),
                    PathNode.CurveTo(113.26704f, 164.39296f, 110.73296f, 164.39296f, 109.17f, 162.83f),
                    PathNode.LineTo(77.17f, 130.83f),
                    PathNode.CurveTo(76.418884f, 130.07973f, 75.99686f, 129.06163f, 75.99686f, 128.0f),
                    PathNode.CurveTo(75.99686f, 126.93836f, 76.418884f, 125.92027f, 77.17f, 125.17f),
                    PathNode.LineTo(109.17f, 93.17f),
                    PathNode.CurveTo(110.73296f, 91.60703f, 113.26704f, 91.60703f, 114.83f, 93.17f),
                    PathNode.CurveTo(116.39297f, 94.73296f, 116.39297f, 97.26704f, 114.83f, 98.83f),
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
        return _caretCircleDoubleLeft!!
    }

private var _caretCircleDoubleLeft: ImageVector? = null
