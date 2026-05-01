package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Needle: ImageVector
    get() {
        if (_needle != null) return _needle!!
        _needle = phosphorThinIcon(
            name = "Needle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(186.83f, 69.17f),
                    PathNode.CurveTo(187.58112f, 69.92027f, 188.00314f, 70.93836f, 188.00314f, 72.0f),
                    PathNode.CurveTo(188.00314f, 73.06164f, 187.58112f, 74.07973f, 186.83f, 74.83f),
                    PathNode.LineTo(170.83f, 90.83f),
                    PathNode.CurveTo(169.26703f, 92.39297f, 166.73297f, 92.39297f, 165.17f, 90.83f),
                    PathNode.CurveTo(163.60704f, 89.26704f, 163.60704f, 86.73296f, 165.17f, 85.17f),
                    PathNode.LineTo(181.17f, 69.17f),
                    PathNode.CurveTo(181.92027f, 68.418884f, 182.93837f, 67.99686f, 184.0f, 67.99686f),
                    PathNode.CurveTo(185.06163f, 67.99686f, 186.07973f, 68.418884f, 186.83f, 69.17f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 72.0f),
                    PathNode.CurveTo(220.02878f, 81.5539f, 216.23332f, 90.72205f, 209.46f, 97.46f),
                    PathNode.LineTo(185.46f, 121.46f),
                    PathNode.CurveTo(184.8705f, 122.04224f, 184.1166f, 122.429665f, 183.3f, 122.57f),
                    PathNode.CurveTo(161.65f, 126.29f, 130.56f, 144.03f, 93.39f, 173.9f),
                    PathNode.CurveTo(65.05f, 196.67f, 43.05f, 218.61f, 42.83f, 218.83f),
                    PathNode.LineTo(42.59f, 219.05f),
                    PathNode.LineTo(42.59f, 219.05f),
                    PathNode.CurveTo(40.95733f, 220.47327f, 38.488407f, 220.33846f, 37.020416f, 218.7459f),
                    PathNode.CurveTo(35.552425f, 217.15329f, 35.618732f, 214.68158f, 37.17f, 213.17f),
                    PathNode.LineTo(37.17f, 213.17f),
                    PathNode.CurveTo(37.39f, 213.0f, 59.33f, 191.0f, 82.1f, 162.61f),
                    PathNode.CurveTo(112.0f, 125.44f, 129.71f, 94.35f, 133.43f, 72.7f),
                    PathNode.CurveTo(133.57034f, 71.88341f, 133.95776f, 71.1295f, 134.54f, 70.54f),
                    PathNode.LineTo(158.54f, 46.54f),
                    PathNode.CurveTo(168.83607f, 36.240562f, 184.32326f, 33.158928f, 197.77773f, 38.73249f),
                    PathNode.CurveTo(211.23221f, 44.30605f, 220.00336f, 57.436775f, 220.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 72.0f),
                    PathNode.CurveTo(212.00081f, 60.67443f, 205.17883f, 50.463684f, 194.71541f, 46.129467f),
                    PathNode.CurveTo(184.252f, 41.795246f, 172.20798f, 44.191204f, 164.2f, 52.2f),
                    PathNode.LineTo(141.08f, 75.32f),
                    PathNode.CurveTo(135.75f, 103.32f, 111.6f, 138.74f, 88.57f, 167.43f),
                    PathNode.CurveTo(117.26f, 144.43f, 152.73f, 120.25f, 180.68f, 114.91f),
                    PathNode.LineTo(203.8f, 91.8f),
                    PathNode.CurveTo(209.06873f, 86.56049f, 212.02156f, 79.430435f, 212.0f, 72.0f),
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
        return _needle!!
    }

private var _needle: ImageVector? = null
