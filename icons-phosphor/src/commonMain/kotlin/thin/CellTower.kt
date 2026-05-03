package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CellTower: ImageVector
    get() {
        if (_cellTower != null) return _cellTower!!
        _cellTower = phosphorThinIcon(
            name = "CellTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(131.58f, 86.21f),
                    PathNode.CurveTo(130.90335f, 84.85234f, 129.51694f, 83.99426f, 128.0f, 83.99426f),
                    PathNode.CurveTo(126.48306f, 83.99426f, 125.09666f, 84.85234f, 124.42f, 86.21f),
                    PathNode.LineTo(52.42f, 230.21f),
                    PathNode.CurveTo(51.43141f, 232.18718f, 52.232822f, 234.59142f, 54.21f, 235.58f),
                    PathNode.CurveTo(56.18718f, 236.56859f, 58.59141f, 235.76718f, 59.58f, 233.79f),
                    PathNode.LineTo(74.47f, 204.0f),
                    PathNode.LineTo(181.53f, 204.0f),
                    PathNode.LineTo(196.42f, 233.79f),
                    PathNode.CurveTo(197.09825f, 235.14543f, 198.48434f, 236.00108f, 200.0f, 236.0f),
                    PathNode.CurveTo(200.62068f, 235.99663f, 201.23259f, 235.85304f, 201.79f, 235.58f),
                    PathNode.CurveTo(202.73994f, 235.10577f, 203.46242f, 234.27333f, 203.79817f, 233.26605f),
                    PathNode.CurveTo(204.13393f, 232.25879f, 204.05544f, 231.15936f, 203.58f, 230.21f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 96.94f),
                    PathNode.LineTo(161.53f, 164.0f),
                    PathNode.LineTo(94.47f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(78.47f, 196.0f),
                    PathNode.LineTo(90.47f, 172.0f),
                    PathNode.LineTo(165.53f, 172.0f),
                    PathNode.LineTo(177.53f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(163.42f, 94.45f),
                    PathNode.CurveTo(163.80905f, 92.322105f, 164.00319f, 90.16316f, 164.0f, 88.0f),
                    PathNode.CurveTo(164.0f, 68.11775f, 147.88223f, 52.0f, 128.0f, 52.0f),
                    PathNode.CurveTo(108.11775f, 52.0f, 92.0f, 68.11775f, 92.0f, 88.0f),
                    PathNode.CurveTo(91.9968f, 90.16316f, 92.19094f, 92.322105f, 92.58f, 94.45f),
                    PathNode.CurveTo(92.97489f, 96.626f, 91.531f, 98.71011f, 89.355f, 99.105f),
                    PathNode.CurveTo(87.179f, 99.499886f, 85.09489f, 98.056f, 84.7f, 95.88f),
                    PathNode.CurveTo(84.23671f, 93.278854f, 84.00248f, 90.64208f, 84.0f, 88.0f),
                    PathNode.CurveTo(84.0f, 63.69947f, 103.69947f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(152.30052f, 44.0f, 172.0f, 63.69947f, 172.0f, 88.0f),
                    PathNode.CurveTo(171.99754f, 90.64208f, 171.76329f, 93.278854f, 171.3f, 95.88f),
                    PathNode.CurveTo(170.95625f, 97.78584f, 169.29662f, 99.1717f, 167.36f, 99.17f),
                    PathNode.CurveTo(167.12183f, 99.166016f, 166.88437f, 99.1426f, 166.65f, 99.1f),
                    PathNode.CurveTo(165.60461f, 98.91255f, 164.67668f, 98.31705f, 164.07077f, 97.44477f),
                    PathNode.CurveTo(163.46487f, 96.572495f, 163.23074f, 95.49506f, 163.42f, 94.45f),
                    PathNode.Close,
                    PathNode.MoveTo(67.34f, 133.79f),
                    PathNode.CurveTo(43.692574f, 102.46054f, 47.793713f, 58.277054f, 76.803505f, 31.835266f),
                    PathNode.CurveTo(105.81329f, 5.393482f, 150.1867f, 5.393482f, 179.1965f, 31.835266f),
                    PathNode.CurveTo(208.20628f, 58.277054f, 212.30743f, 102.46054f, 188.66f, 133.79f),
                    PathNode.CurveTo(187.8175f, 134.98123f, 186.39323f, 135.61923f, 184.94348f, 135.45482f),
                    PathNode.CurveTo(183.49373f, 135.2904f, 182.2485f, 134.34966f, 181.69418f, 133.0f),
                    PathNode.CurveTo(181.13983f, 131.65036f, 181.36433f, 130.10596f, 182.28f, 128.97f),
                    PathNode.CurveTo(203.43327f, 100.93744f, 199.76073f, 61.408176f, 173.80524f, 37.752354f),
                    PathNode.CurveTo(147.84975f, 14.096533f, 108.15025f, 14.096533f, 82.19476f, 37.752354f),
                    PathNode.CurveTo(56.23927f, 61.408176f, 52.566723f, 100.93744f, 73.72f, 128.97f),
                    PathNode.CurveTo(74.63566f, 130.10596f, 74.86017f, 131.65036f, 74.30583f, 133.0f),
                    PathNode.CurveTo(73.7515f, 134.34966f, 72.50628f, 135.2904f, 71.05652f, 135.45482f),
                    PathNode.CurveTo(69.606766f, 135.61923f, 68.182495f, 134.98123f, 67.34f, 133.79f),
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
        return _cellTower!!
    }

private var _cellTower: ImageVector? = null
