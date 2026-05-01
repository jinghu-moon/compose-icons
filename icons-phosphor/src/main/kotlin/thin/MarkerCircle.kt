package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MarkerCircle: ImageVector
    get() {
        if (_markerCircle != null) return _markerCircle!!
        _markerCircle = phosphorThinIcon(
            name = "MarkerCircle",
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
                    PathNode.MoveTo(84.0f, 208.83f),
                    PathNode.LineTo(84.0f, 176.0f),
                    PathNode.CurveTo(84.0f, 173.79086f, 85.79086f, 172.0f, 88.0f, 172.0f),
                    PathNode.LineTo(168.0f, 172.0f),
                    PathNode.CurveTo(170.20914f, 172.0f, 172.0f, 173.79086f, 172.0f, 176.0f),
                    PathNode.LineTo(172.0f, 208.83f),
                    PathNode.CurveTo(144.5569f, 223.72255f, 111.44309f, 223.72255f, 84.0f, 208.83f),
                    PathNode.Close,
                    PathNode.MoveTo(108.15f, 140.0f),
                    PathNode.LineTo(152.0f, 140.0f),
                    PathNode.CurveTo(154.20914f, 140.0f, 156.0f, 141.79086f, 156.0f, 144.0f),
                    PathNode.LineTo(156.0f, 164.0f),
                    PathNode.LineTo(100.0f, 164.0f),
                    PathNode.LineTo(100.0f, 144.0f),
                    PathNode.CurveTo(100.0f, 141.79086f, 101.79086f, 140.0f, 104.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(113.08f, 132.0f),
                    PathNode.LineTo(124.08f, 79.18f),
                    PathNode.CurveTo(124.45856f, 77.31574f, 126.097694f, 75.97599f, 128.0f, 75.97599f),
                    PathNode.CurveTo(129.9023f, 75.97599f, 131.54144f, 77.31574f, 131.92f, 79.18f),
                    PathNode.LineTo(142.92f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(193.08f, 193.05f),
                    PathNode.CurveTo(189.06252f, 197.06075f, 184.684f, 200.69276f, 180.0f, 203.9f),
                    PathNode.LineTo(180.0f, 176.0f),
                    PathNode.CurveTo(180.0f, 169.37259f, 174.62741f, 164.0f, 168.0f, 164.0f),
                    PathNode.LineTo(164.0f, 164.0f),
                    PathNode.LineTo(164.0f, 144.0f),
                    PathNode.CurveTo(164.0f, 137.37259f, 158.62741f, 132.0f, 152.0f, 132.0f),
                    PathNode.LineTo(151.09f, 132.0f),
                    PathNode.LineTo(139.75f, 77.55f),
                    PathNode.CurveTo(138.59496f, 71.98027f, 133.68823f, 67.9867f, 128.0f, 67.9867f),
                    PathNode.CurveTo(122.31177f, 67.9867f, 117.405045f, 71.98027f, 116.25f, 77.55f),
                    PathNode.LineTo(104.91f, 132.0f),
                    PathNode.LineTo(104.0f, 132.0f),
                    PathNode.CurveTo(97.37258f, 132.0f, 92.0f, 137.37259f, 92.0f, 144.0f),
                    PathNode.LineTo(92.0f, 164.0f),
                    PathNode.LineTo(88.0f, 164.0f),
                    PathNode.CurveTo(81.37258f, 164.0f, 76.0f, 169.37259f, 76.0f, 176.0f),
                    PathNode.LineTo(76.0f, 203.9f),
                    PathNode.CurveTo(71.34375f, 200.6888f, 66.99215f, 197.0569f, 63.0f, 193.05f),
                    PathNode.CurveTo(36.685944f, 166.73903f, 28.81283f, 127.16734f, 43.052048f, 92.78797f),
                    PathNode.CurveTo(57.291267f, 58.408604f, 90.838486f, 35.99235f, 128.05f, 35.99235f),
                    PathNode.CurveTo(165.2615f, 35.99235f, 198.80873f, 58.408604f, 213.04796f, 92.78797f),
                    PathNode.CurveTo(227.28717f, 127.16734f, 219.41406f, 166.73903f, 193.1f, 193.05f),
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
        return _markerCircle!!
    }

private var _markerCircle: ImageVector? = null
