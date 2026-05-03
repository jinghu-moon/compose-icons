package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HighHeel: ImageVector
    get() {
        if (_highHeel != null) return _highHeel!!
        _highHeel = phosphorBoldIcon(
            name = "HighHeel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(227.93f, 152.31f),
                    PathNode.LineTo(182.11f, 141.14f),
                    PathNode.LineTo(72.49f, 31.51f),
                    PathNode.CurveTo(70.17351f, 29.194473f, 67.011185f, 27.926449f, 63.73667f, 28.000095f),
                    PathNode.CurveTo(60.462166f, 28.073744f, 57.36005f, 29.482664f, 55.15f, 31.9f),
                    PathNode.CurveTo(32.48f, 56.68f, 20.0f, 88.0f, 20.0f, 120.0f),
                    PathNode.LineTo(20.0f, 192.0f),
                    PathNode.CurveTo(20.0f, 203.0457f, 28.954306f, 212.0f, 40.0f, 212.0f),
                    PathNode.LineTo(72.0f, 212.0f),
                    PathNode.CurveTo(83.04569f, 212.0f, 92.0f, 203.0457f, 92.0f, 192.0f),
                    PathNode.LineTo(92.0f, 150.29f),
                    PathNode.LineTo(93.07f, 151.0f),
                    PathNode.CurveTo(110.58553f, 163.01956f, 124.18502f, 179.91895f, 132.18f, 199.6f),
                    PathNode.CurveTo(135.24525f, 207.13374f, 142.58667f, 212.04385f, 150.72f, 212.0f),
                    PathNode.LineTo(236.0f, 212.0f),
                    PathNode.CurveTo(247.0457f, 212.0f, 256.0f, 203.0457f, 256.0f, 192.0f),
                    PathNode.LineTo(256.0f, 187.27f),
                    PathNode.CurveTo(256.04758f, 170.45909f, 244.35417f, 155.89546f, 227.93f, 152.31f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 188.0f),
                    PathNode.LineTo(44.0f, 188.0f),
                    PathNode.LineTo(44.0f, 132.67f),
                    PathNode.CurveTo(52.185852f, 133.5742f, 60.23948f, 135.42319f, 68.0f, 138.18f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 188.0f),
                    PathNode.LineTo(153.35f, 188.0f),
                    PathNode.CurveTo(143.46024f, 165.05295f, 127.28058f, 145.37181f, 106.68f, 131.23f),
                    PathNode.CurveTo(88.2818f, 118.52197f, 66.93856f, 110.7317f, 44.68f, 108.6f),
                    PathNode.CurveTo(46.89082f, 90.21456f, 53.848907f, 72.721115f, 64.87f, 57.84f),
                    PathNode.LineTo(167.51f, 160.49f),
                    PathNode.CurveTo(169.06895f, 162.0422f, 171.0228f, 163.13844f, 173.16f, 163.66f),
                    PathNode.LineTo(222.36f, 175.66f),
                    PathNode.LineTo(222.61f, 175.72f),
                    PathNode.CurveTo(228.0897f, 176.87897f, 232.00769f, 181.71907f, 232.0f, 187.32f),
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
        return _highHeel!!
    }

private var _highHeel: ImageVector? = null
