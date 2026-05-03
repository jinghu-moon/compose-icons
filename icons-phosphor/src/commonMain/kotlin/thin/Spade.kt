package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Spade: ImageVector
    get() {
        if (_spade != null) return _spade!!
        _spade = phosphorThinIcon(
            name = "Spade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(178.56f, 52.93f),
                    PathNode.CurveTo(163.4807f, 40.423347f, 147.1352f, 29.527456f, 129.79f, 20.42f),
                    PathNode.CurveTo(128.66327f, 19.85618f, 127.33674f, 19.85618f, 126.21f, 20.42f),
                    PathNode.CurveTo(108.86481f, 29.527456f, 92.519295f, 40.423347f, 77.44f, 52.93f),
                    PathNode.CurveTo(45.1f, 79.88f, 28.0f, 108.61f, 28.0f, 136.0f),
                    PathNode.CurveTo(27.999296f, 154.26389f, 37.58033f, 171.18924f, 53.24022f, 180.58803f),
                    PathNode.CurveTo(68.90011f, 189.98683f, 88.34283f, 190.48105f, 104.46f, 181.89f),
                    PathNode.LineTo(92.17f, 222.89f),
                    PathNode.CurveTo(91.82175f, 224.09564f, 92.0595f, 225.39484f, 92.81214f, 226.39902f),
                    PathNode.CurveTo(93.56479f, 227.4032f, 94.74507f, 227.99596f, 96.0f, 228.0f),
                    PathNode.LineTo(160.0f, 228.0f),
                    PathNode.CurveTo(161.26434f, 227.99965f, 162.45407f, 227.40155f, 163.20857f, 226.38702f),
                    PathNode.CurveTo(163.96307f, 225.37248f, 164.1935f, 224.06096f, 163.83f, 222.85f),
                    PathNode.LineTo(151.54f, 181.85f),
                    PathNode.CurveTo(167.6509f, 190.4377f, 187.08525f, 189.94745f, 202.74265f, 180.55833f),
                    PathNode.CurveTo(218.40002f, 171.16922f, 227.98665f, 154.25674f, 228.0f, 136.0f),
                    PathNode.CurveTo(228.0f, 108.61f, 210.9f, 79.88f, 178.56f, 52.93f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 180.0f),
                    PathNode.CurveTo(165.36687f, 179.9998f, 155.09352f, 176.14906f, 147.08f, 169.16f),
                    PathNode.CurveTo(145.7364f, 167.98672f, 143.7783f, 167.8449f, 142.27966f, 168.81229f),
                    PathNode.CurveTo(140.781f, 169.7797f, 140.10402f, 171.6225f, 140.62f, 173.33f),
                    PathNode.LineTo(154.62f, 220.0f),
                    PathNode.LineTo(101.38f, 220.0f),
                    PathNode.LineTo(115.38f, 173.33f),
                    PathNode.CurveTo(115.89598f, 171.6225f, 115.218994f, 169.7797f, 113.72034f, 168.81229f),
                    PathNode.CurveTo(112.22169f, 167.8449f, 110.263596f, 167.98672f, 108.92f, 169.16f),
                    PathNode.CurveTo(95.91842f, 180.49889f, 77.48998f, 183.19368f, 61.78605f, 176.05238f),
                    PathNode.CurveTo(46.08212f, 168.9111f, 36.000282f, 153.25142f, 36.0f, 136.0f),
                    PathNode.CurveTo(36.0f, 79.94f, 115.0f, 35.44f, 128.0f, 28.51f),
                    PathNode.CurveTo(141.0f, 35.44f, 220.0f, 79.89f, 220.0f, 136.0f),
                    PathNode.CurveTo(219.97244f, 160.28911f, 200.28911f, 179.97244f, 176.0f, 180.0f),
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
        return _spade!!
    }

private var _spade: ImageVector? = null
