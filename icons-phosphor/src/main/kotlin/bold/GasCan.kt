package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GasCan: ImageVector
    get() {
        if (_gasCan != null) return _gasCan!!
        _gasCan = phosphorBoldIcon(
            name = "GasCan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 20.0f),
                    PathNode.LineTo(131.31f, 20.0f),
                    PathNode.CurveTo(126.00303f, 19.98563f, 120.911064f, 22.095879f, 117.17f, 25.86f),
                    PathNode.LineTo(105.66f, 37.37f),
                    PathNode.LineTo(90.14f, 21.86f),
                    PathNode.CurveTo(82.33f, 14.052361f, 69.67f, 14.052361f, 61.86f, 21.86f),
                    PathNode.LineTo(37.86f, 45.86f),
                    PathNode.CurveTo(30.05236f, 53.67f, 30.05236f, 66.33f, 37.86f, 74.14f),
                    PathNode.LineTo(53.37f, 89.66f),
                    PathNode.LineTo(41.86f, 101.17f),
                    PathNode.CurveTo(38.09588f, 104.911064f, 35.985634f, 110.00303f, 36.0f, 115.31f),
                    PathNode.LineTo(36.0f, 216.0f),
                    PathNode.CurveTo(36.0f, 227.0457f, 44.954304f, 236.0f, 56.0f, 236.0f),
                    PathNode.LineTo(200.0f, 236.0f),
                    PathNode.CurveTo(211.0457f, 236.0f, 220.0f, 227.0457f, 220.0f, 216.0f),
                    PathNode.LineTo(220.0f, 40.0f),
                    PathNode.CurveTo(220.0f, 28.954306f, 211.0457f, 20.0f, 200.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(57.66f, 60.0f),
                    PathNode.LineTo(76.0f, 41.66f),
                    PathNode.LineTo(88.69f, 54.34f),
                    PathNode.LineTo(70.34f, 72.69f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 212.0f),
                    PathNode.LineTo(60.0f, 212.0f),
                    PathNode.LineTo(60.0f, 117.0f),
                    PathNode.LineTo(78.83f, 98.14f),
                    PathNode.LineTo(78.83f, 98.14f),
                    PathNode.LineTo(133.0f, 44.0f),
                    PathNode.LineTo(196.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 68.0f),
                    PathNode.CurveTo(136.0f, 61.37258f, 141.37259f, 56.0f, 148.0f, 56.0f),
                    PathNode.LineTo(168.0f, 56.0f),
                    PathNode.CurveTo(174.62741f, 56.0f, 180.0f, 61.37258f, 180.0f, 68.0f),
                    PathNode.CurveTo(180.0f, 74.62742f, 174.62741f, 80.0f, 168.0f, 80.0f),
                    PathNode.LineTo(148.0f, 80.0f),
                    PathNode.CurveTo(141.37259f, 80.0f, 136.0f, 74.62742f, 136.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(175.5f, 133.37f),
                    PathNode.LineTo(147.21f, 156.0f),
                    PathNode.LineTo(175.5f, 178.63f),
                    PathNode.CurveTo(180.67491f, 182.77214f, 181.51213f, 190.32509f, 177.37f, 195.5f),
                    PathNode.CurveTo(173.22786f, 200.67491f, 165.67491f, 201.51213f, 160.5f, 197.37f),
                    PathNode.LineTo(128.0f, 171.37f),
                    PathNode.LineTo(95.5f, 197.37f),
                    PathNode.CurveTo(90.32509f, 201.51213f, 82.77213f, 200.67491f, 78.63f, 195.5f),
                    PathNode.CurveTo(74.48786f, 190.32509f, 75.32509f, 182.77214f, 80.5f, 178.63f),
                    PathNode.LineTo(108.79f, 156.0f),
                    PathNode.LineTo(80.5f, 133.37f),
                    PathNode.CurveTo(75.32509f, 129.22786f, 74.48786f, 121.67491f, 78.63f, 116.5f),
                    PathNode.CurveTo(82.77213f, 111.32509f, 90.32509f, 110.48786f, 95.5f, 114.63f),
                    PathNode.LineTo(128.0f, 140.63f),
                    PathNode.LineTo(160.5f, 114.63f),
                    PathNode.CurveTo(165.67491f, 110.48786f, 173.22786f, 111.32509f, 177.37f, 116.5f),
                    PathNode.CurveTo(181.51213f, 121.67491f, 180.67491f, 129.22786f, 175.5f, 133.37f),
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
        return _gasCan!!
    }

private var _gasCan: ImageVector? = null
