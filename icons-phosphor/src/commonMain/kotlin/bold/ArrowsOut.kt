package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsOut: ImageVector
    get() {
        if (_arrowsOut != null) return _arrowsOut!!
        _arrowsOut = phosphorBoldIcon(
            name = "ArrowsOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 48.0f),
                    PathNode.LineTo(220.0f, 96.0f),
                    PathNode.CurveTo(220.0f, 102.62742f, 214.62741f, 108.0f, 208.0f, 108.0f),
                    PathNode.CurveTo(201.37259f, 108.0f, 196.0f, 102.62742f, 196.0f, 96.0f),
                    PathNode.LineTo(196.0f, 77.0f),
                    PathNode.LineTo(160.49f, 112.52f),
                    PathNode.CurveTo(155.79558f, 117.21442f, 148.18442f, 117.21442f, 143.49f, 112.52f),
                    PathNode.CurveTo(138.79558f, 107.82558f, 138.79558f, 100.214424f, 143.49f, 95.52f),
                    PathNode.LineTo(179.0f, 60.0f),
                    PathNode.LineTo(160.0f, 60.0f),
                    PathNode.CurveTo(153.37259f, 60.0f, 148.0f, 54.62742f, 148.0f, 48.0f),
                    PathNode.CurveTo(148.0f, 41.37258f, 153.37259f, 36.0f, 160.0f, 36.0f),
                    PathNode.LineTo(208.0f, 36.0f),
                    PathNode.CurveTo(214.62741f, 36.0f, 220.0f, 41.37258f, 220.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(95.51f, 143.51f),
                    PathNode.LineTo(60.0f, 179.0f),
                    PathNode.LineTo(60.0f, 160.0f),
                    PathNode.CurveTo(60.0f, 153.37259f, 54.62742f, 148.0f, 48.0f, 148.0f),
                    PathNode.CurveTo(41.37258f, 148.0f, 36.0f, 153.37259f, 36.0f, 160.0f),
                    PathNode.LineTo(36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 214.62741f, 41.37258f, 220.0f, 48.0f, 220.0f),
                    PathNode.LineTo(96.0f, 220.0f),
                    PathNode.CurveTo(102.62742f, 220.0f, 108.0f, 214.62741f, 108.0f, 208.0f),
                    PathNode.CurveTo(108.0f, 201.37259f, 102.62742f, 196.0f, 96.0f, 196.0f),
                    PathNode.LineTo(77.0f, 196.0f),
                    PathNode.LineTo(112.52f, 160.49f),
                    PathNode.CurveTo(117.21442f, 155.79558f, 117.21442f, 148.18442f, 112.52f, 143.49f),
                    PathNode.CurveTo(107.82558f, 138.79558f, 100.214424f, 138.79558f, 95.52f, 143.49f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 148.0f),
                    PathNode.CurveTo(201.37259f, 148.0f, 196.0f, 153.37259f, 196.0f, 160.0f),
                    PathNode.LineTo(196.0f, 179.0f),
                    PathNode.LineTo(160.49f, 143.48f),
                    PathNode.CurveTo(155.79558f, 138.78558f, 148.18442f, 138.78558f, 143.49f, 143.48f),
                    PathNode.CurveTo(138.79558f, 148.17442f, 138.79558f, 155.78558f, 143.49f, 160.48f),
                    PathNode.LineTo(179.0f, 196.0f),
                    PathNode.LineTo(160.0f, 196.0f),
                    PathNode.CurveTo(153.37259f, 196.0f, 148.0f, 201.37259f, 148.0f, 208.0f),
                    PathNode.CurveTo(148.0f, 214.62741f, 153.37259f, 220.0f, 160.0f, 220.0f),
                    PathNode.LineTo(208.0f, 220.0f),
                    PathNode.CurveTo(214.62741f, 220.0f, 220.0f, 214.62741f, 220.0f, 208.0f),
                    PathNode.LineTo(220.0f, 160.0f),
                    PathNode.CurveTo(220.0f, 153.37259f, 214.62741f, 148.0f, 208.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(77.0f, 60.0f),
                    PathNode.LineTo(96.0f, 60.0f),
                    PathNode.CurveTo(102.62742f, 60.0f, 108.0f, 54.62742f, 108.0f, 48.0f),
                    PathNode.CurveTo(108.0f, 41.37258f, 102.62742f, 36.0f, 96.0f, 36.0f),
                    PathNode.LineTo(48.0f, 36.0f),
                    PathNode.CurveTo(41.37258f, 36.0f, 36.0f, 41.37258f, 36.0f, 48.0f),
                    PathNode.LineTo(36.0f, 96.0f),
                    PathNode.CurveTo(36.0f, 102.62742f, 41.37258f, 108.0f, 48.0f, 108.0f),
                    PathNode.CurveTo(54.62742f, 108.0f, 60.0f, 102.62742f, 60.0f, 96.0f),
                    PathNode.LineTo(60.0f, 77.0f),
                    PathNode.LineTo(95.51f, 112.52f),
                    PathNode.CurveTo(100.20442f, 117.21442f, 107.81558f, 117.21442f, 112.51f, 112.52f),
                    PathNode.CurveTo(117.20442f, 107.82558f, 117.20442f, 100.214424f, 112.51f, 95.52f),
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
        return _arrowsOut!!
    }

private var _arrowsOut: ImageVector? = null
