package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PencilCircle: ImageVector
    get() {
        if (_pencilCircle != null) return _pencilCircle!!
        _pencilCircle = phosphorBoldIcon(
            name = "PencilCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.37f, 51.6f),
                    PathNode.CurveTo(167.92007f, 15.125355f, 110.77971f, 9.480288f, 67.897194f, 38.117447f),
                    PathNode.CurveTo(25.014675f, 66.7546f, 8.334971f, 121.697075f, 28.059746f, 169.34087f),
                    PathNode.CurveTo(47.784523f, 216.98465f, 98.419426f, 244.05852f, 148.99506f, 234.00351f),
                    PathNode.CurveTo(199.57068f, 223.94852f, 235.99915f, 179.56546f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.99937f, 99.34769f, 224.6226f, 71.86789f, 204.37f, 51.6f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 200.0f),
                    PathNode.CurveTo(92.0f, 193.37259f, 97.37258f, 188.0f, 104.0f, 188.0f),
                    PathNode.CurveTo(110.62742f, 188.0f, 116.0f, 193.37259f, 116.0f, 200.0f),
                    PathNode.LineTo(116.0f, 211.11f),
                    PathNode.CurveTo(107.68324f, 209.9203f, 99.592735f, 207.4864f, 92.0f, 203.89f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 200.0f),
                    PathNode.CurveTo(140.0f, 193.37259f, 145.37259f, 188.0f, 152.0f, 188.0f),
                    PathNode.CurveTo(158.62741f, 188.0f, 164.0f, 193.37259f, 164.0f, 200.0f),
                    PathNode.LineTo(164.0f, 203.89f),
                    PathNode.CurveTo(156.40726f, 207.4864f, 148.31676f, 209.9203f, 140.0f, 211.11f),
                    PathNode.Close,
                    PathNode.MoveTo(106.14f, 148.0f),
                    PathNode.LineTo(149.86f, 148.0f),
                    PathNode.LineTo(157.43f, 164.42f),
                    PathNode.CurveTo(146.79756f, 162.8036f, 135.99988f, 166.03227f, 128.0f, 173.22f),
                    PathNode.CurveTo(119.99838f, 166.03586f, 109.20091f, 162.81093f, 98.57f, 164.43f),
                    PathNode.Close,
                    PathNode.MoveTo(117.22f, 124.0f),
                    PathNode.LineTo(128.0f, 100.62f),
                    PathNode.LineTo(138.78f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 186.79f),
                    PathNode.LineTo(188.0f, 176.0f),
                    PathNode.CurveTo(187.99261f, 174.27412f, 187.61763f, 172.56963f, 186.9f, 171.0f),
                    PathNode.LineTo(138.9f, 67.0f),
                    PathNode.CurveTo(136.94072f, 62.744923f, 132.6845f, 60.018963f, 128.0f, 60.018963f),
                    PathNode.CurveTo(123.315506f, 60.018963f, 119.05927f, 62.744923f, 117.1f, 67.0f),
                    PathNode.LineTo(69.1f, 171.0f),
                    PathNode.CurveTo(68.38237f, 172.56963f, 68.007385f, 174.27412f, 68.0f, 176.0f),
                    PathNode.LineTo(68.0f, 186.77f),
                    PathNode.CurveTo(35.6885f, 153.7922f, 36.04821f, 100.918686f, 68.80541f, 68.383575f),
                    PathNode.CurveTo(101.56262f, 35.84847f, 154.43738f, 35.84847f, 187.19458f, 68.383575f),
                    PathNode.CurveTo(219.95178f, 100.918686f, 220.31151f, 153.7922f, 188.0f, 186.77f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _pencilCircle!!
    }

private var _pencilCircle: ImageVector? = null
