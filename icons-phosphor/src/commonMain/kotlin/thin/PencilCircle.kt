package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PencilCircle: ImageVector
    get() {
        if (_pencilCircle != null) return _pencilCircle!!
        _pencilCircle = phosphorThinIcon(
            name = "PencilCircle",
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
                    PathNode.MoveTo(104.71f, 132.0f),
                    PathNode.LineTo(151.29f, 132.0f),
                    PathNode.LineTo(168.57f, 169.45f),
                    PathNode.CurveTo(162.2224f, 164.79025f, 154.20609f, 163.0187f, 146.48596f, 164.56958f),
                    PathNode.CurveTo(138.76585f, 166.12045f, 132.0556f, 170.85039f, 128.0f, 177.6f),
                    PathNode.CurveTo(123.94439f, 170.85039f, 117.234146f, 166.12045f, 109.51403f, 164.56958f),
                    PathNode.CurveTo(101.79392f, 163.0187f, 93.7776f, 164.79025f, 87.43f, 169.45f),
                    PathNode.Close,
                    PathNode.MoveTo(108.41f, 124.0f),
                    PathNode.LineTo(128.0f, 81.55f),
                    PathNode.LineTo(147.59f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 192.0f),
                    PathNode.CurveTo(132.0f, 180.9543f, 140.9543f, 172.0f, 152.0f, 172.0f),
                    PathNode.CurveTo(163.0457f, 172.0f, 172.0f, 180.9543f, 172.0f, 192.0f),
                    PathNode.LineTo(172.0f, 208.83f),
                    PathNode.CurveTo(159.69316f, 215.54149f, 146.0063f, 219.32932f, 132.0f, 219.9f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 192.0f),
                    PathNode.CurveTo(84.0f, 180.9543f, 92.95431f, 172.0f, 104.0f, 172.0f),
                    PathNode.CurveTo(115.04569f, 172.0f, 124.0f, 180.9543f, 124.0f, 192.0f),
                    PathNode.LineTo(124.0f, 219.9f),
                    PathNode.CurveTo(109.9937f, 219.32932f, 96.30684f, 215.54149f, 84.0f, 208.83f),
                    PathNode.Close,
                    PathNode.MoveTo(193.05f, 193.05f),
                    PathNode.CurveTo(189.04202f, 197.0593f, 184.6736f, 200.69128f, 180.0f, 203.9f),
                    PathNode.LineTo(180.0f, 176.0f),
                    PathNode.CurveTo(179.99777f, 175.42003f, 179.87163f, 174.84724f, 179.63f, 174.32f),
                    PathNode.LineTo(131.63f, 70.32f),
                    PathNode.CurveTo(130.9753f, 68.905556f, 129.55862f, 68.000206f, 128.0f, 68.000206f),
                    PathNode.CurveTo(126.44138f, 68.000206f, 125.024704f, 68.905556f, 124.37f, 70.32f),
                    PathNode.LineTo(76.37f, 174.32f),
                    PathNode.CurveTo(76.12837f, 174.84724f, 76.00223f, 175.42003f, 76.0f, 176.0f),
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
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _pencilCircle!!
    }

private var _pencilCircle: ImageVector? = null
