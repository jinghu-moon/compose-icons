package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Hand: ImageVector
    get() {
        if (_hand != null) return _hand!!
        _hand = phosphorDuotoneIcon(
            name = "Hand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 76.0f),
                    PathNode.LineTo(208.0f, 152.0f),
                    PathNode.CurveTo(208.0f, 196.18279f, 172.18279f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(83.82f, 232.0f, 67.25f, 210.72f, 34.68f, 142.0f),
                    PathNode.CurveTo(29.246195f, 132.4428f, 32.54517f, 120.29158f, 42.066113f, 114.79451f),
                    PathNode.CurveTo(51.58706f, 109.297424f, 63.759884f, 112.51573f, 69.32f, 122.0f),
                    PathNode.LineTo(88.0f, 152.0f),
                    PathNode.LineTo(88.0f, 60.0f),
                    PathNode.CurveTo(88.0f, 48.954304f, 96.95431f, 40.0f, 108.0f, 40.0f),
                    PathNode.CurveTo(119.04569f, 40.0f, 128.0f, 48.954304f, 128.0f, 60.0f),
                    PathNode.LineTo(128.0f, 44.0f),
                    PathNode.CurveTo(128.0f, 32.954304f, 136.9543f, 24.0f, 148.0f, 24.0f),
                    PathNode.CurveTo(159.0457f, 24.0f, 168.0f, 32.954304f, 168.0f, 44.0f),
                    PathNode.LineTo(168.0f, 76.0f),
                    PathNode.CurveTo(168.0f, 64.95431f, 176.9543f, 56.0f, 188.0f, 56.0f),
                    PathNode.CurveTo(199.0457f, 56.0f, 208.0f, 64.95431f, 208.0f, 76.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(188.0f, 48.0f),
                    PathNode.CurveTo(183.84763f, 47.994144f, 179.74686f, 48.92023f, 176.0f, 50.71f),
                    PathNode.LineTo(176.0f, 44.0f),
                    PathNode.CurveTo(176.00523f, 30.212437f, 165.97261f, 18.473064f, 152.35266f, 16.32976f),
                    PathNode.CurveTo(138.7327f, 14.186456f, 125.57952f, 22.277191f, 121.35f, 35.4f),
                    PathNode.CurveTo(112.67561f, 30.694958f, 102.16497f, 30.903528f, 93.684074f, 35.948997f),
                    PathNode.CurveTo(85.20318f, 40.994465f, 80.004425f, 50.131752f, 80.0f, 60.0f),
                    PathNode.LineTo(80.0f, 124.0f),
                    PathNode.LineTo(76.18f, 117.87f),
                    PathNode.CurveTo(68.45575f, 104.54006f, 51.413902f, 99.9544f, 38.043324f, 107.60809f),
                    PathNode.CurveTo(24.672747f, 115.26179f, 19.99708f, 132.27916f, 27.58f, 145.69f),
                    PathNode.CurveTo(43.58f, 179.46f, 56.51f, 203.41f, 71.3f, 218.38f),
                    PathNode.CurveTo(86.24f, 233.54f, 103.2f, 240.0f, 128.0f, 240.0f),
                    PathNode.CurveTo(176.57822f, 239.94489f, 215.94489f, 200.57822f, 216.0f, 152.0f),
                    PathNode.LineTo(216.0f, 76.0f),
                    PathNode.CurveTo(216.0f, 60.53603f, 203.46397f, 48.0f, 188.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 152.0f),
                    PathNode.CurveTo(199.95592f, 191.74623f, 167.74623f, 223.95592f, 128.0f, 224.0f),
                    PathNode.CurveTo(107.62f, 224.0f, 94.49f, 219.12f, 82.67f, 207.15f),
                    PathNode.CurveTo(69.44f, 193.74f, 57.26f, 171.0f, 41.9f, 138.58f),
                    PathNode.CurveTo(41.809998f, 138.38165f, 41.709866f, 138.18806f, 41.6f, 138.0f),
                    PathNode.CurveTo(38.286293f, 132.259f, 40.254f, 124.91871f, 45.995f, 121.605f),
                    PathNode.CurveTo(51.736f, 118.29129f, 59.07629f, 120.259f, 62.39f, 126.0f),
                    PathNode.CurveTo(62.430725f, 126.08013f, 62.477528f, 126.15702f, 62.53f, 126.23f),
                    PathNode.LineTo(81.2f, 156.23f),
                    PathNode.CurveTo(83.08451f, 159.27081f, 86.75878f, 160.69086f, 90.19847f, 159.70776f),
                    PathNode.CurveTo(93.63816f, 158.72466f, 96.00705f, 155.57742f, 96.0f, 152.0f),
                    PathNode.LineTo(96.0f, 60.0f),
                    PathNode.CurveTo(96.0f, 53.37258f, 101.37258f, 48.0f, 108.0f, 48.0f),
                    PathNode.CurveTo(114.62742f, 48.0f, 120.0f, 53.37258f, 120.0f, 60.0f),
                    PathNode.LineTo(120.0f, 120.0f),
                    PathNode.CurveTo(120.0f, 124.41828f, 123.58172f, 128.0f, 128.0f, 128.0f),
                    PathNode.CurveTo(132.41827f, 128.0f, 136.0f, 124.41828f, 136.0f, 120.0f),
                    PathNode.LineTo(136.0f, 44.0f),
                    PathNode.CurveTo(136.0f, 37.37258f, 141.37259f, 32.0f, 148.0f, 32.0f),
                    PathNode.CurveTo(154.62741f, 32.0f, 160.0f, 37.37258f, 160.0f, 44.0f),
                    PathNode.LineTo(160.0f, 120.0f),
                    PathNode.CurveTo(160.0f, 124.41828f, 163.58173f, 128.0f, 168.0f, 128.0f),
                    PathNode.CurveTo(172.41827f, 128.0f, 176.0f, 124.41828f, 176.0f, 120.0f),
                    PathNode.LineTo(176.0f, 76.0f),
                    PathNode.CurveTo(176.0f, 69.37258f, 181.37259f, 64.0f, 188.0f, 64.0f),
                    PathNode.CurveTo(194.62741f, 64.0f, 200.0f, 69.37258f, 200.0f, 76.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _hand!!
    }

private var _hand: ImageVector? = null
