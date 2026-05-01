package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Exclude: ImageVector
    get() {
        if (_exclude != null) return _exclude!!
        _exclude = phosphorBoldIcon(
            name = "Exclude",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(178.0f, 78.0f),
                    PathNode.CurveTo(169.08406f, 37.210495f, 131.56235f, 9.161108f, 89.91714f, 12.153585f),
                    PathNode.CurveTo(48.27194f, 15.146063f, 15.146063f, 48.27194f, 12.153585f, 89.91714f),
                    PathNode.CurveTo(9.161108f, 131.56235f, 37.210495f, 169.08406f, 78.0f, 178.0f),
                    PathNode.CurveTo(86.91595f, 218.7895f, 124.43766f, 246.8389f, 166.08286f, 243.84642f),
                    PathNode.CurveTo(207.72806f, 240.85394f, 240.85394f, 207.72806f, 243.84642f, 166.08286f),
                    PathNode.CurveTo(246.8389f, 124.43766f, 218.7895f, 86.91595f, 178.0f, 78.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 160.0f),
                    PathNode.CurveTo(219.99504f, 162.22195f, 219.86818f, 164.44196f, 219.62f, 166.65f),
                    PathNode.LineTo(175.62f, 122.65f),
                    PathNode.CurveTo(177.71544f, 116.384735f, 179.0582f, 109.89246f, 179.62f, 103.31f),
                    PathNode.CurveTo(203.76768f, 111.69449f, 219.96786f, 134.43813f, 220.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.16f, 155.84f),
                    PathNode.CurveTo(102.271095f, 126.00693f, 126.00693f, 102.271095f, 155.84f, 100.16f),
                    PathNode.CurveTo(153.72891f, 129.99307f, 129.99307f, 153.72891f, 100.16f, 155.84f),
                    PathNode.Close,
                    PathNode.MoveTo(152.67f, 76.34f),
                    PathNode.CurveTo(146.08754f, 76.901794f, 139.59526f, 78.24456f, 133.33f, 80.34f),
                    PathNode.LineTo(89.33f, 36.34f),
                    PathNode.CurveTo(91.54542f, 36.104446f, 93.77212f, 35.990944f, 96.0f, 36.0f),
                    PathNode.CurveTo(121.54408f, 36.034702f, 144.27435f, 52.215027f, 152.67f, 76.34f),
                    PathNode.Close,
                    PathNode.MoveTo(64.19f, 45.16f),
                    PathNode.LineTo(110.92f, 91.89f),
                    PathNode.CurveTo(103.619354f, 97.1759f, 97.2059f, 103.589355f, 91.92f, 110.89f),
                    PathNode.LineTo(45.16f, 64.19f),
                    PathNode.CurveTo(49.99277f, 56.497284f, 56.497284f, 49.99277f, 64.19f, 45.16f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 96.0f),
                    PathNode.CurveTo(36.00496f, 93.77805f, 36.131817f, 91.55806f, 36.38f, 89.35f),
                    PathNode.LineTo(80.38f, 133.35f),
                    PathNode.CurveTo(78.28456f, 139.61526f, 76.941795f, 146.10753f, 76.38f, 152.69f),
                    PathNode.CurveTo(52.23231f, 144.30551f, 36.03213f, 121.561874f, 36.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(103.33f, 179.66f),
                    PathNode.CurveTo(109.91246f, 179.0982f, 116.40473f, 177.75545f, 122.67f, 175.66f),
                    PathNode.LineTo(166.67f, 219.66f),
                    PathNode.CurveTo(164.45459f, 219.89555f, 162.22789f, 220.00905f, 160.0f, 220.0f),
                    PathNode.CurveTo(134.45592f, 219.9653f, 111.725655f, 203.78497f, 103.33f, 179.66f),
                    PathNode.Close,
                    PathNode.MoveTo(191.81f, 210.84f),
                    PathNode.LineTo(145.08f, 164.11f),
                    PathNode.CurveTo(152.38065f, 158.8241f, 158.7941f, 152.41064f, 164.08f, 145.11f),
                    PathNode.LineTo(210.81f, 191.84f),
                    PathNode.CurveTo(205.98228f, 199.51854f, 199.48854f, 206.01228f, 191.81f, 210.84f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _exclude!!
    }

private var _exclude: ImageVector? = null
