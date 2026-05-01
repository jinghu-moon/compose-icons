package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HeartHalf: ImageVector
    get() {
        if (_heartHalf != null) return _heartHalf!!
        _heartHalf = phosphorThinIcon(
            name = "HeartHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.74f, 52.86f),
                    PathNode.CurveTo(170.8686f, 52.411266f, 172.24835f, 50.343674f, 171.84581f, 48.205853f),
                    PathNode.CurveTo(171.44327f, 46.068027f, 169.40604f, 44.643837f, 167.26f, 45.0f),
                    PathNode.CurveTo(150.09f, 48.21f, 136.19f, 57.57f, 128.0f, 71.12f),
                    PathNode.CurveTo(118.0f, 54.21f, 99.46f, 44.0f, 78.0f, 44.0f),
                    PathNode.CurveTo(45.983475f, 44.03857f, 20.03857f, 69.983475f, 20.0f, 102.0f),
                    PathNode.CurveTo(20.0f, 130.59f, 38.0f, 160.47f, 73.4f, 190.79f),
                    PathNode.CurveTo(89.745056f, 204.69902f, 107.39342f, 216.9993f, 126.1f, 227.52f),
                    PathNode.CurveTo(126.68374f, 227.83507f, 127.33666f, 228.00002f, 128.0f, 228.0f),
                    PathNode.CurveTo(128.6608f, 227.9953f, 129.31015f, 227.82695f, 129.89f, 227.51f),
                    PathNode.LineTo(129.89f, 227.51f),
                    PathNode.CurveTo(144.04814f, 219.56644f, 157.59854f, 210.5852f, 170.43f, 200.64f),
                    PathNode.CurveTo(171.63133f, 199.7931f, 172.27141f, 198.35558f, 172.09702f, 196.89613f),
                    PathNode.CurveTo(171.92262f, 195.43668f, 170.96187f, 194.19043f, 169.59482f, 193.65044f),
                    PathNode.CurveTo(168.22775f, 193.11044f, 166.67468f, 193.3637f, 165.55f, 194.31f),
                    PathNode.CurveTo(154.82477f, 202.55705f, 143.62195f, 210.16362f, 132.0f, 217.09f),
                    PathNode.LineTo(132.0f, 80.85f),
                    PathNode.CurveTo(138.24f, 66.26f, 151.58f, 56.07f, 168.74f, 52.86f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 217.08f),
                    PathNode.CurveTo(102.27f, 204.08f, 28.0f, 155.92f, 28.0f, 102.0f),
                    PathNode.CurveTo(28.033062f, 74.39947f, 50.399467f, 52.03306f, 78.0f, 52.0f),
                    PathNode.CurveTo(98.83f, 52.0f, 116.39f, 63.0f, 124.0f, 80.8f),
                    PathNode.Close,
                    PathNode.MoveTo(232.11f, 100.0f),
                    PathNode.LineTo(231.67f, 100.0f),
                    PathNode.CurveTo(229.62187f, 100.01243f, 227.89526f, 98.47574f, 227.67f, 96.44f),
                    PathNode.CurveTo(226.04121f, 81.79073f, 218.01678f, 68.6119f, 205.75f, 60.44f),
                    PathNode.CurveTo(203.99245f, 59.18448f, 203.54909f, 56.760414f, 204.74846f, 54.964073f),
                    PathNode.CurveTo(205.94781f, 53.167732f, 208.35666f, 52.648f, 210.19f, 53.79f),
                    PathNode.CurveTo(224.42609f, 63.277252f, 233.73587f, 78.57634f, 235.62f, 95.58f),
                    PathNode.CurveTo(235.86615f, 97.76833f, 234.29721f, 99.74404f, 232.11f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(226.88f, 137.81f),
                    PathNode.CurveTo(221.38f, 148.81f, 213.33f, 160.13f, 202.94f, 171.37f),
                    PathNode.CurveTo(201.44054f, 172.99371f, 198.90872f, 173.09445f, 197.285f, 171.595f),
                    PathNode.CurveTo(195.66129f, 170.09555f, 195.56055f, 167.56372f, 197.06f, 165.94f),
                    PathNode.CurveTo(206.94f, 155.26f, 214.56f, 144.59f, 219.72f, 134.23f),
                    PathNode.CurveTo(220.70859f, 132.25282f, 223.11282f, 131.45142f, 225.09f, 132.44f),
                    PathNode.CurveTo(227.06718f, 133.42859f, 227.86859f, 135.83282f, 226.88f, 137.81f),
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
        return _heartHalf!!
    }

private var _heartHalf: ImageVector? = null
