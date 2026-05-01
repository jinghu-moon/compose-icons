package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FirstAidKit: ImageVector
    get() {
        if (_firstAidKit != null) return _firstAidKit!!
        _firstAidKit = phosphorBoldIcon(
            name = "FirstAidKit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 52.0f),
                    PathNode.LineTo(180.0f, 52.0f),
                    PathNode.LineTo(180.0f, 44.0f),
                    PathNode.CurveTo(180.0f, 28.536028f, 167.46397f, 16.0f, 152.0f, 16.0f),
                    PathNode.LineTo(104.0f, 16.0f),
                    PathNode.CurveTo(88.536026f, 16.0f, 76.0f, 28.536028f, 76.0f, 44.0f),
                    PathNode.LineTo(76.0f, 52.0f),
                    PathNode.LineTo(40.0f, 52.0f),
                    PathNode.CurveTo(28.954306f, 52.0f, 20.0f, 60.954304f, 20.0f, 72.0f),
                    PathNode.LineTo(20.0f, 200.0f),
                    PathNode.CurveTo(20.0f, 211.0457f, 28.954306f, 220.0f, 40.0f, 220.0f),
                    PathNode.LineTo(216.0f, 220.0f),
                    PathNode.CurveTo(227.0457f, 220.0f, 236.0f, 211.0457f, 236.0f, 200.0f),
                    PathNode.LineTo(236.0f, 72.0f),
                    PathNode.CurveTo(236.0f, 60.954304f, 227.0457f, 52.0f, 216.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 44.0f),
                    PathNode.CurveTo(100.0f, 41.79086f, 101.79086f, 40.0f, 104.0f, 40.0f),
                    PathNode.LineTo(152.0f, 40.0f),
                    PathNode.CurveTo(154.20914f, 40.0f, 156.0f, 41.79086f, 156.0f, 44.0f),
                    PathNode.LineTo(156.0f, 52.0f),
                    PathNode.LineTo(100.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 196.0f),
                    PathNode.LineTo(44.0f, 196.0f),
                    PathNode.LineTo(44.0f, 76.0f),
                    PathNode.LineTo(212.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 136.0f),
                    PathNode.CurveTo(164.0f, 142.62741f, 158.62741f, 148.0f, 152.0f, 148.0f),
                    PathNode.LineTo(140.0f, 148.0f),
                    PathNode.LineTo(140.0f, 160.0f),
                    PathNode.CurveTo(140.0f, 166.62741f, 134.62741f, 172.0f, 128.0f, 172.0f),
                    PathNode.CurveTo(121.37258f, 172.0f, 116.0f, 166.62741f, 116.0f, 160.0f),
                    PathNode.LineTo(116.0f, 148.0f),
                    PathNode.LineTo(104.0f, 148.0f),
                    PathNode.CurveTo(97.37258f, 148.0f, 92.0f, 142.62741f, 92.0f, 136.0f),
                    PathNode.CurveTo(92.0f, 129.37259f, 97.37258f, 124.0f, 104.0f, 124.0f),
                    PathNode.LineTo(116.0f, 124.0f),
                    PathNode.LineTo(116.0f, 112.0f),
                    PathNode.CurveTo(116.0f, 105.37258f, 121.37258f, 100.0f, 128.0f, 100.0f),
                    PathNode.CurveTo(134.62741f, 100.0f, 140.0f, 105.37258f, 140.0f, 112.0f),
                    PathNode.LineTo(140.0f, 124.0f),
                    PathNode.LineTo(152.0f, 124.0f),
                    PathNode.CurveTo(158.62741f, 124.0f, 164.0f, 129.37259f, 164.0f, 136.0f),
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
        return _firstAidKit!!
    }

private var _firstAidKit: ImageVector? = null
