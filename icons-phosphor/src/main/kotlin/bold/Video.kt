package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Video: ImageVector
    get() {
        if (_video != null) return _video!!
        _video = phosphorBoldIcon(
            name = "Video",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 36.0f),
                    PathNode.LineTo(40.0f, 36.0f),
                    PathNode.CurveTo(28.954306f, 36.0f, 20.0f, 44.954304f, 20.0f, 56.0f),
                    PathNode.LineTo(20.0f, 160.0f),
                    PathNode.CurveTo(20.0f, 171.0457f, 28.954306f, 180.0f, 40.0f, 180.0f),
                    PathNode.LineTo(216.0f, 180.0f),
                    PathNode.CurveTo(227.0457f, 180.0f, 236.0f, 171.0457f, 236.0f, 160.0f),
                    PathNode.LineTo(236.0f, 56.0f),
                    PathNode.CurveTo(236.0f, 44.954304f, 227.0457f, 36.0f, 216.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 156.0f),
                    PathNode.LineTo(44.0f, 156.0f),
                    PathNode.LineTo(44.0f, 60.0f),
                    PathNode.LineTo(212.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 208.0f),
                    PathNode.CurveTo(236.0f, 214.62741f, 230.62741f, 220.0f, 224.0f, 220.0f),
                    PathNode.LineTo(32.0f, 220.0f),
                    PathNode.CurveTo(25.372583f, 220.0f, 20.0f, 214.62741f, 20.0f, 208.0f),
                    PathNode.CurveTo(20.0f, 201.37259f, 25.372583f, 196.0f, 32.0f, 196.0f),
                    PathNode.LineTo(224.0f, 196.0f),
                    PathNode.CurveTo(230.62741f, 196.0f, 236.0f, 201.37259f, 236.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 128.0f),
                    PathNode.LineTo(104.0f, 88.0f),
                    PathNode.CurveTo(103.998535f, 83.63697f, 106.36529f, 79.61693f, 110.18102f, 77.50123f),
                    PathNode.CurveTo(113.99676f, 75.38554f, 118.66016f, 75.5076f, 122.36f, 77.82f),
                    PathNode.LineTo(154.36f, 97.82f),
                    PathNode.CurveTo(157.87225f, 100.01207f, 160.00645f, 103.85982f, 160.00645f, 108.0f),
                    PathNode.CurveTo(160.00645f, 112.14018f, 157.87225f, 115.98793f, 154.36f, 118.18f),
                    PathNode.LineTo(122.36f, 138.18f),
                    PathNode.CurveTo(118.66016f, 140.4924f, 113.99676f, 140.61447f, 110.18102f, 138.49876f),
                    PathNode.CurveTo(106.36529f, 136.38307f, 103.998535f, 132.36302f, 104.0f, 128.0f),
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
        return _video!!
    }

private var _video: ImageVector? = null
