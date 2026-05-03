package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberSquareTwo: ImageVector
    get() {
        if (_numberSquareTwo != null) return _numberSquareTwo!!
        _numberSquareTwo = phosphorThinIcon(
            name = "NumberSquareTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 36.0f),
                    PathNode.LineTo(48.0f, 36.0f),
                    PathNode.CurveTo(41.37258f, 36.0f, 36.0f, 41.37258f, 36.0f, 48.0f),
                    PathNode.LineTo(36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 214.62741f, 41.37258f, 220.0f, 48.0f, 220.0f),
                    PathNode.LineTo(208.0f, 220.0f),
                    PathNode.CurveTo(214.62741f, 220.0f, 220.0f, 214.62741f, 220.0f, 208.0f),
                    PathNode.LineTo(220.0f, 48.0f),
                    PathNode.CurveTo(220.0f, 41.37258f, 214.62741f, 36.0f, 208.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 208.0f),
                    PathNode.CurveTo(212.0f, 210.20914f, 210.20914f, 212.0f, 208.0f, 212.0f),
                    PathNode.LineTo(48.0f, 212.0f),
                    PathNode.CurveTo(45.79086f, 212.0f, 44.0f, 210.20914f, 44.0f, 208.0f),
                    PathNode.LineTo(44.0f, 48.0f),
                    PathNode.CurveTo(44.0f, 45.79086f, 45.79086f, 44.0f, 48.0f, 44.0f),
                    PathNode.LineTo(208.0f, 44.0f),
                    PathNode.CurveTo(210.20914f, 44.0f, 212.0f, 45.79086f, 212.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 176.0f),
                    PathNode.CurveTo(156.0f, 178.20914f, 154.20914f, 180.0f, 152.0f, 180.0f),
                    PathNode.LineTo(104.0f, 180.0f),
                    PathNode.CurveTo(102.48491f, 180.0f, 101.09986f, 179.144f, 100.422295f, 177.78885f),
                    PathNode.CurveTo(99.74472f, 176.43372f, 99.890945f, 174.81207f, 100.8f, 173.6f),
                    PathNode.LineTo(144.0f, 116.0f),
                    PathNode.CurveTo(150.62741f, 107.163445f, 148.83656f, 94.62742f, 140.0f, 88.0f),
                    PathNode.CurveTo(131.16344f, 81.37258f, 118.62742f, 83.163445f, 112.0f, 92.0f),
                    PathNode.CurveTo(110.77086f, 93.63368f, 109.796455f, 95.44426f, 109.11f, 97.37f),
                    PathNode.CurveTo(108.37546f, 99.45487f, 106.089874f, 100.54954f, 104.005f, 99.815f),
                    PathNode.CurveTo(101.92013f, 99.08046f, 100.82546f, 96.79488f, 101.56f, 94.71f),
                    PathNode.CurveTo(102.506874f, 92.016136f, 103.85544f, 89.48084f, 105.56f, 87.19f),
                    PathNode.CurveTo(111.53258f, 79.06785f, 121.41047f, 74.78363f, 131.42175f, 75.97329f),
                    PathNode.CurveTo(141.43303f, 77.16296f, 150.0318f, 83.6428f, 153.93457f, 92.93846f),
                    PathNode.CurveTo(157.83736f, 102.23412f, 156.44148f, 112.91021f, 150.28f, 120.89f),
                    PathNode.LineTo(112.0f, 172.0f),
                    PathNode.LineTo(152.0f, 172.0f),
                    PathNode.CurveTo(154.20914f, 172.0f, 156.0f, 173.79086f, 156.0f, 176.0f),
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
        return _numberSquareTwo!!
    }

private var _numberSquareTwo: ImageVector? = null
