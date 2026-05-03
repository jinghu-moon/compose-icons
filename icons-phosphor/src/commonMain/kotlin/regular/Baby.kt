package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Baby: ImageVector
    get() {
        if (_baby != null) return _baby!!
        _baby = phosphorRegularIcon(
            name = "Baby",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(92.0f, 140.0f),
                    PathNode.CurveTo(85.37258f, 140.0f, 80.0f, 134.62741f, 80.0f, 128.0f),
                    PathNode.CurveTo(80.0f, 121.37258f, 85.37258f, 116.0f, 92.0f, 116.0f),
                    PathNode.CurveTo(98.62742f, 116.0f, 104.0f, 121.37258f, 104.0f, 128.0f),
                    PathNode.CurveTo(104.0f, 134.62741f, 98.62742f, 140.0f, 92.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 116.0f),
                    PathNode.CurveTo(157.37259f, 116.0f, 152.0f, 121.37258f, 152.0f, 128.0f),
                    PathNode.CurveTo(152.0f, 134.62741f, 157.37259f, 140.0f, 164.0f, 140.0f),
                    PathNode.CurveTo(170.62741f, 140.0f, 176.0f, 134.62741f, 176.0f, 128.0f),
                    PathNode.CurveTo(176.0f, 121.37258f, 170.62741f, 116.0f, 164.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(151.73f, 161.23f),
                    PathNode.CurveTo(137.19586f, 170.2505f, 118.80414f, 170.2505f, 104.27f, 161.23f),
                    PathNode.CurveTo(100.53103f, 158.87175f, 95.58826f, 159.99103f, 93.23f, 163.73f),
                    PathNode.CurveTo(90.87174f, 167.46896f, 91.991035f, 172.41174f, 95.73f, 174.77f),
                    PathNode.CurveTo(115.481544f, 187.08292f, 140.51846f, 187.08292f, 160.27f, 174.77f),
                    PathNode.CurveTo(164.00897f, 172.41174f, 165.12825f, 167.46896f, 162.77f, 163.73f),
                    PathNode.CurveTo(160.41174f, 159.99103f, 155.46896f, 158.87175f, 151.73f, 161.23f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 128.0f),
                    PathNode.CurveTo(232.0f, 185.4376f, 185.4376f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(70.562386f, 232.0f, 24.0f, 185.4376f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 70.562386f, 70.562386f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(185.41248f, 24.060629f, 231.93938f, 70.58752f, 232.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 128.0f),
                    PathNode.CurveTo(215.94218f, 80.943214f, 178.91783f, 42.236923f, 131.91f, 40.09f),
                    PathNode.CurveTo(120.32f, 56.38f, 120.0f, 71.88f, 120.0f, 72.0f),
                    PathNode.CurveTo(120.0f, 76.41828f, 123.58172f, 80.0f, 128.0f, 80.0f),
                    PathNode.CurveTo(132.41827f, 80.0f, 136.0f, 76.41828f, 136.0f, 72.0f),
                    PathNode.CurveTo(136.0f, 67.58172f, 139.58173f, 64.0f, 144.0f, 64.0f),
                    PathNode.CurveTo(148.41827f, 64.0f, 152.0f, 67.58172f, 152.0f, 72.0f),
                    PathNode.CurveTo(152.0f, 85.25484f, 141.25484f, 96.0f, 128.0f, 96.0f),
                    PathNode.CurveTo(114.74516f, 96.0f, 104.0f, 85.25484f, 104.0f, 72.0f),
                    PathNode.CurveTo(104.0f, 71.27f, 104.13f, 57.7f, 112.46f, 41.37f),
                    PathNode.CurveTo(66.61396f, 49.59526f, 35.117764f, 92.12054f, 40.615044f, 138.37305f),
                    PathNode.CurveTo(46.112328f, 184.62555f, 86.69884f, 218.58354f, 133.19563f, 215.83351f),
                    PathNode.CurveTo(179.69243f, 213.08348f, 215.99313f, 174.57805f, 216.0f, 128.0f),
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
        return _baby!!
    }

private var _baby: ImageVector? = null
