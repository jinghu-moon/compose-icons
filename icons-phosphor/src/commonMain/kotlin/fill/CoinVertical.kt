package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CoinVertical: ImageVector
    get() {
        if (_coinVertical != null) return _coinVertical!!
        _coinVertical = phosphorFillIcon(
            name = "CoinVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(198.51f, 56.09f),
                    PathNode.CurveTo(186.44f, 35.4f, 169.92f, 24.0f, 152.0f, 24.0f),
                    PathNode.LineTo(104.0f, 24.0f),
                    PathNode.CurveTo(86.08f, 24.0f, 69.56f, 35.4f, 57.49f, 56.09f),
                    PathNode.CurveTo(46.21f, 75.42f, 40.0f, 101.0f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 155.0f, 46.21f, 180.58f, 57.49f, 199.91f),
                    PathNode.CurveTo(69.56f, 220.6f, 86.08f, 232.0f, 104.0f, 232.0f),
                    PathNode.LineTo(152.0f, 232.0f),
                    PathNode.CurveTo(169.92f, 232.0f, 186.44f, 220.6f, 198.51f, 199.91f),
                    PathNode.CurveTo(209.79f, 180.58f, 216.0f, 155.0f, 216.0f, 128.0f),
                    PathNode.CurveTo(216.0f, 101.0f, 209.79f, 75.42f, 198.51f, 56.09f),
                    PathNode.Close,
                    PathNode.MoveTo(199.79f, 120.0f),
                    PathNode.LineTo(167.79f, 120.0f),
                    PathNode.CurveTo(167.16501f, 103.583626f, 163.89638f, 87.375496f, 158.11f, 72.0f),
                    PathNode.LineTo(188.7f, 72.0f),
                    PathNode.CurveTo(194.82f, 85.38f, 198.86f, 102.0f, 199.79f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(179.19f, 56.0f),
                    PathNode.LineTo(150.46f, 56.0f),
                    PathNode.CurveTo(147.11848f, 50.203175f, 143.08932f, 44.83097f, 138.46f, 40.0f),
                    PathNode.LineTo(152.0f, 40.0f),
                    PathNode.CurveTo(162.0f, 40.0f, 171.4f, 46.0f, 179.19f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 216.0f),
                    PathNode.LineTo(138.49f, 216.0f),
                    PathNode.CurveTo(143.11932f, 211.16902f, 147.14848f, 205.79683f, 150.49f, 200.0f),
                    PathNode.LineTo(179.22f, 200.0f),
                    PathNode.CurveTo(171.4f, 210.0f, 162.0f, 216.0f, 152.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.7f, 184.0f),
                    PathNode.LineTo(158.12f, 184.0f),
                    PathNode.CurveTo(163.90637f, 168.6245f, 167.17502f, 152.41638f, 167.8f, 136.0f),
                    PathNode.LineTo(199.8f, 136.0f),
                    PathNode.CurveTo(198.86f, 154.0f, 194.82f, 170.62f, 188.7f, 184.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _coinVertical!!
    }

private var _coinVertical: ImageVector? = null
