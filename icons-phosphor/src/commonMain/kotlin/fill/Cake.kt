package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Cake: ImageVector
    get() {
        if (_cake != null) return _cake!!
        _cake = phosphorFillIcon(
            name = "Cake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 88.0f),
                    PathNode.LineTo(136.0f, 88.0f),
                    PathNode.LineTo(136.0f, 79.0f),
                    PathNode.CurveTo(150.1221f, 75.33185f, 159.9862f, 62.590717f, 160.0f, 48.0f),
                    PathNode.CurveTo(160.0f, 20.0f, 133.56f, 2.09f, 132.44f, 1.34f),
                    PathNode.CurveTo(129.75171f, -0.453596f, 126.2483f, -0.453596f, 123.56f, 1.34f),
                    PathNode.CurveTo(122.44f, 2.09f, 96.0f, 20.0f, 96.0f, 48.0f),
                    PathNode.CurveTo(96.013794f, 62.590717f, 105.87789f, 75.33185f, 120.0f, 79.0f),
                    PathNode.LineTo(120.0f, 88.0f),
                    PathNode.LineTo(48.0f, 88.0f),
                    PathNode.CurveTo(34.745167f, 88.0f, 24.0f, 98.74516f, 24.0f, 112.0f),
                    PathNode.LineTo(24.0f, 135.33f),
                    PathNode.CurveTo(24.008207f, 144.05722f, 26.811869f, 152.55232f, 32.0f, 159.57f),
                    PathNode.LineTo(32.0f, 200.0f),
                    PathNode.CurveTo(32.0f, 213.25484f, 42.745167f, 224.0f, 56.0f, 224.0f),
                    PathNode.LineTo(200.0f, 224.0f),
                    PathNode.CurveTo(213.25484f, 224.0f, 224.0f, 213.25484f, 224.0f, 200.0f),
                    PathNode.LineTo(224.0f, 159.57f),
                    PathNode.CurveTo(229.18813f, 152.55232f, 231.99179f, 144.05722f, 232.0f, 135.33f),
                    PathNode.LineTo(232.0f, 112.0f),
                    PathNode.CurveTo(232.0f, 98.74516f, 221.25484f, 88.0f, 208.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 48.0f),
                    PathNode.CurveTo(112.0f, 34.43f, 122.0f, 23.54f, 128.0f, 18.21f),
                    PathNode.CurveTo(134.0f, 23.54f, 144.0f, 34.43f, 144.0f, 48.0f),
                    PathNode.CurveTo(144.0f, 56.836555f, 136.83656f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(119.163445f, 64.0f, 112.0f, 56.836555f, 112.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 135.33f),
                    PathNode.CurveTo(216.0f, 148.58f, 205.54f, 159.64f, 192.68f, 159.99f),
                    PathNode.CurveTo(186.19955f, 160.17369f, 179.92044f, 157.72783f, 175.27171f, 153.20906f),
                    PathNode.CurveTo(170.62299f, 148.69029f, 168.00009f, 142.48305f, 168.0f, 136.0f),
                    PathNode.CurveTo(168.0f, 131.58173f, 164.41827f, 128.0f, 160.0f, 128.0f),
                    PathNode.CurveTo(155.58173f, 128.0f, 152.0f, 131.58173f, 152.0f, 136.0f),
                    PathNode.CurveTo(152.0f, 149.25484f, 141.25484f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(114.74516f, 160.0f, 104.0f, 149.25484f, 104.0f, 136.0f),
                    PathNode.CurveTo(104.0f, 131.58173f, 100.41828f, 128.0f, 96.0f, 128.0f),
                    PathNode.CurveTo(91.58172f, 128.0f, 88.0f, 131.58173f, 88.0f, 136.0f),
                    PathNode.CurveTo(88.0026f, 142.48479f, 85.38091f, 148.69464f, 80.73187f, 153.21559f),
                    PathNode.CurveTo(76.08284f, 157.73651f, 69.802185f, 160.18373f, 63.32f, 160.0f),
                    PathNode.CurveTo(50.46f, 159.64f, 40.0f, 148.58f, 40.0f, 135.33f),
                    PathNode.LineTo(40.0f, 112.0f),
                    PathNode.CurveTo(40.0f, 107.58172f, 43.581722f, 104.0f, 48.0f, 104.0f),
                    PathNode.LineTo(208.0f, 104.0f),
                    PathNode.CurveTo(212.41827f, 104.0f, 216.0f, 107.58172f, 216.0f, 112.0f),
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
        return _cake!!
    }

private var _cake: ImageVector? = null
