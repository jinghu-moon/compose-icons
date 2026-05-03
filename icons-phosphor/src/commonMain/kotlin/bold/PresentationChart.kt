package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PresentationChart: ImageVector
    get() {
        if (_presentationChart != null) return _presentationChart!!
        _presentationChart = phosphorBoldIcon(
            name = "PresentationChart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 36.0f),
                    PathNode.LineTo(140.0f, 36.0f),
                    PathNode.LineTo(140.0f, 24.0f),
                    PathNode.CurveTo(140.0f, 17.372583f, 134.62741f, 12.0f, 128.0f, 12.0f),
                    PathNode.CurveTo(121.37258f, 12.0f, 116.0f, 17.372583f, 116.0f, 24.0f),
                    PathNode.LineTo(116.0f, 36.0f),
                    PathNode.LineTo(40.0f, 36.0f),
                    PathNode.CurveTo(28.954306f, 36.0f, 20.0f, 44.954304f, 20.0f, 56.0f),
                    PathNode.LineTo(20.0f, 176.0f),
                    PathNode.CurveTo(20.0f, 187.0457f, 28.954306f, 196.0f, 40.0f, 196.0f),
                    PathNode.LineTo(71.0f, 196.0f),
                    PathNode.LineTo(54.6f, 216.5f),
                    PathNode.CurveTo(50.457863f, 221.67491f, 51.295094f, 229.22786f, 56.47f, 233.37f),
                    PathNode.CurveTo(61.64491f, 237.51213f, 69.19786f, 236.67491f, 73.34f, 231.5f),
                    PathNode.LineTo(101.74f, 196.0f),
                    PathNode.LineTo(154.2f, 196.0f),
                    PathNode.LineTo(182.6f, 231.5f),
                    PathNode.CurveTo(186.74214f, 236.67491f, 194.29509f, 237.51213f, 199.47f, 233.37f),
                    PathNode.CurveTo(204.64491f, 229.22786f, 205.48213f, 221.67491f, 201.34f, 216.5f),
                    PathNode.LineTo(185.0f, 196.0f),
                    PathNode.LineTo(216.0f, 196.0f),
                    PathNode.CurveTo(227.0457f, 196.0f, 236.0f, 187.0457f, 236.0f, 176.0f),
                    PathNode.LineTo(236.0f, 56.0f),
                    PathNode.CurveTo(236.0f, 44.954304f, 227.0457f, 36.0f, 216.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 172.0f),
                    PathNode.LineTo(44.0f, 172.0f),
                    PathNode.LineTo(44.0f, 60.0f),
                    PathNode.LineTo(212.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 120.0f),
                    PathNode.LineTo(104.0f, 144.0f),
                    PathNode.CurveTo(104.0f, 150.62741f, 98.62742f, 156.0f, 92.0f, 156.0f),
                    PathNode.CurveTo(85.37258f, 156.0f, 80.0f, 150.62741f, 80.0f, 144.0f),
                    PathNode.LineTo(80.0f, 120.0f),
                    PathNode.CurveTo(80.0f, 113.37258f, 85.37258f, 108.0f, 92.0f, 108.0f),
                    PathNode.CurveTo(98.62742f, 108.0f, 104.0f, 113.37258f, 104.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 92.0f),
                    PathNode.CurveTo(134.62741f, 92.0f, 140.0f, 97.37258f, 140.0f, 104.0f),
                    PathNode.LineTo(140.0f, 144.0f),
                    PathNode.CurveTo(140.0f, 150.62741f, 134.62741f, 156.0f, 128.0f, 156.0f),
                    PathNode.CurveTo(121.37258f, 156.0f, 116.0f, 150.62741f, 116.0f, 144.0f),
                    PathNode.LineTo(116.0f, 104.0f),
                    PathNode.CurveTo(116.0f, 97.37258f, 121.37258f, 92.0f, 128.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 144.0f),
                    PathNode.LineTo(152.0f, 88.0f),
                    PathNode.CurveTo(152.0f, 81.37258f, 157.37259f, 76.0f, 164.0f, 76.0f),
                    PathNode.CurveTo(170.62741f, 76.0f, 176.0f, 81.37258f, 176.0f, 88.0f),
                    PathNode.LineTo(176.0f, 144.0f),
                    PathNode.CurveTo(176.0f, 150.62741f, 170.62741f, 156.0f, 164.0f, 156.0f),
                    PathNode.CurveTo(157.37259f, 156.0f, 152.0f, 150.62741f, 152.0f, 144.0f),
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
        return _presentationChart!!
    }

private var _presentationChart: ImageVector? = null
