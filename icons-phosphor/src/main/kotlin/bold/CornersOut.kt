package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CornersOut: ImageVector
    get() {
        if (_cornersOut != null) return _cornersOut!!
        _cornersOut = phosphorBoldIcon(
            name = "CornersOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 48.0f),
                    PathNode.LineTo(220.0f, 88.0f),
                    PathNode.CurveTo(220.0f, 94.62742f, 214.62741f, 100.0f, 208.0f, 100.0f),
                    PathNode.CurveTo(201.37259f, 100.0f, 196.0f, 94.62742f, 196.0f, 88.0f),
                    PathNode.LineTo(196.0f, 60.0f),
                    PathNode.LineTo(168.0f, 60.0f),
                    PathNode.CurveTo(161.37259f, 60.0f, 156.0f, 54.62742f, 156.0f, 48.0f),
                    PathNode.CurveTo(156.0f, 41.37258f, 161.37259f, 36.0f, 168.0f, 36.0f),
                    PathNode.LineTo(208.0f, 36.0f),
                    PathNode.CurveTo(214.62741f, 36.0f, 220.0f, 41.37258f, 220.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 196.0f),
                    PathNode.LineTo(60.0f, 196.0f),
                    PathNode.LineTo(60.0f, 168.0f),
                    PathNode.CurveTo(60.0f, 161.37259f, 54.62742f, 156.0f, 48.0f, 156.0f),
                    PathNode.CurveTo(41.37258f, 156.0f, 36.0f, 161.37259f, 36.0f, 168.0f),
                    PathNode.LineTo(36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 214.62741f, 41.37258f, 220.0f, 48.0f, 220.0f),
                    PathNode.LineTo(88.0f, 220.0f),
                    PathNode.CurveTo(94.62742f, 220.0f, 100.0f, 214.62741f, 100.0f, 208.0f),
                    PathNode.CurveTo(100.0f, 201.37259f, 94.62742f, 196.0f, 88.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 156.0f),
                    PathNode.CurveTo(201.37259f, 156.0f, 196.0f, 161.37259f, 196.0f, 168.0f),
                    PathNode.LineTo(196.0f, 196.0f),
                    PathNode.LineTo(168.0f, 196.0f),
                    PathNode.CurveTo(161.37259f, 196.0f, 156.0f, 201.37259f, 156.0f, 208.0f),
                    PathNode.CurveTo(156.0f, 214.62741f, 161.37259f, 220.0f, 168.0f, 220.0f),
                    PathNode.LineTo(208.0f, 220.0f),
                    PathNode.CurveTo(214.62741f, 220.0f, 220.0f, 214.62741f, 220.0f, 208.0f),
                    PathNode.LineTo(220.0f, 168.0f),
                    PathNode.CurveTo(220.0f, 161.37259f, 214.62741f, 156.0f, 208.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 36.0f),
                    PathNode.LineTo(48.0f, 36.0f),
                    PathNode.CurveTo(41.37258f, 36.0f, 36.0f, 41.37258f, 36.0f, 48.0f),
                    PathNode.LineTo(36.0f, 88.0f),
                    PathNode.CurveTo(36.0f, 94.62742f, 41.37258f, 100.0f, 48.0f, 100.0f),
                    PathNode.CurveTo(54.62742f, 100.0f, 60.0f, 94.62742f, 60.0f, 88.0f),
                    PathNode.LineTo(60.0f, 60.0f),
                    PathNode.LineTo(88.0f, 60.0f),
                    PathNode.CurveTo(94.62742f, 60.0f, 100.0f, 54.62742f, 100.0f, 48.0f),
                    PathNode.CurveTo(100.0f, 41.37258f, 94.62742f, 36.0f, 88.0f, 36.0f),
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
        return _cornersOut!!
    }

private var _cornersOut: ImageVector? = null
