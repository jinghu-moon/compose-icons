package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FrameCorners: ImageVector
    get() {
        if (_frameCorners != null) return _frameCorners!!
        _frameCorners = phosphorBoldIcon(
            name = "FrameCorners",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(140.0f, 88.0f),
                    PathNode.CurveTo(140.0f, 81.37258f, 145.37259f, 76.0f, 152.0f, 76.0f),
                    PathNode.LineTo(184.0f, 76.0f),
                    PathNode.CurveTo(190.62741f, 76.0f, 196.0f, 81.37258f, 196.0f, 88.0f),
                    PathNode.LineTo(196.0f, 120.0f),
                    PathNode.CurveTo(196.0f, 126.62742f, 190.62741f, 132.0f, 184.0f, 132.0f),
                    PathNode.CurveTo(177.37259f, 132.0f, 172.0f, 126.62742f, 172.0f, 120.0f),
                    PathNode.LineTo(172.0f, 100.0f),
                    PathNode.LineTo(152.0f, 100.0f),
                    PathNode.CurveTo(145.37259f, 100.0f, 140.0f, 94.62742f, 140.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 180.0f),
                    PathNode.LineTo(104.0f, 180.0f),
                    PathNode.CurveTo(110.62742f, 180.0f, 116.0f, 174.62741f, 116.0f, 168.0f),
                    PathNode.CurveTo(116.0f, 161.37259f, 110.62742f, 156.0f, 104.0f, 156.0f),
                    PathNode.LineTo(84.0f, 156.0f),
                    PathNode.LineTo(84.0f, 136.0f),
                    PathNode.CurveTo(84.0f, 129.37259f, 78.62742f, 124.0f, 72.0f, 124.0f),
                    PathNode.CurveTo(65.37258f, 124.0f, 60.0f, 129.37259f, 60.0f, 136.0f),
                    PathNode.LineTo(60.0f, 168.0f),
                    PathNode.CurveTo(60.0f, 174.62741f, 65.37258f, 180.0f, 72.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 56.0f),
                    PathNode.LineTo(236.0f, 200.0f),
                    PathNode.CurveTo(236.0f, 211.0457f, 227.0457f, 220.0f, 216.0f, 220.0f),
                    PathNode.LineTo(40.0f, 220.0f),
                    PathNode.CurveTo(28.954306f, 220.0f, 20.0f, 211.0457f, 20.0f, 200.0f),
                    PathNode.LineTo(20.0f, 56.0f),
                    PathNode.CurveTo(20.0f, 44.954304f, 28.954306f, 36.0f, 40.0f, 36.0f),
                    PathNode.LineTo(216.0f, 36.0f),
                    PathNode.CurveTo(227.0457f, 36.0f, 236.0f, 44.954304f, 236.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 60.0f),
                    PathNode.LineTo(44.0f, 60.0f),
                    PathNode.LineTo(44.0f, 196.0f),
                    PathNode.LineTo(212.0f, 196.0f),
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
        return _frameCorners!!
    }

private var _frameCorners: ImageVector? = null
