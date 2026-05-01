package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsOutSimple: ImageVector
    get() {
        if (_arrowsOutSimple != null) return _arrowsOutSimple!!
        _arrowsOutSimple = phosphorBoldIcon(
            name = "ArrowsOutSimple",
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
                    PathNode.LineTo(156.49f, 116.52f),
                    PathNode.CurveTo(151.79558f, 121.21442f, 144.18442f, 121.21442f, 139.49f, 116.52f),
                    PathNode.CurveTo(134.79558f, 111.82558f, 134.79558f, 104.214424f, 139.49f, 99.52f),
                    PathNode.LineTo(179.0f, 60.0f),
                    PathNode.LineTo(160.0f, 60.0f),
                    PathNode.CurveTo(153.37259f, 60.0f, 148.0f, 54.62742f, 148.0f, 48.0f),
                    PathNode.CurveTo(148.0f, 41.37258f, 153.37259f, 36.0f, 160.0f, 36.0f),
                    PathNode.LineTo(208.0f, 36.0f),
                    PathNode.CurveTo(214.62741f, 36.0f, 220.0f, 41.37258f, 220.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(99.51f, 139.51f),
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
                    PathNode.LineTo(116.52f, 156.49f),
                    PathNode.CurveTo(121.21442f, 151.79558f, 121.21442f, 144.18442f, 116.52f, 139.49f),
                    PathNode.CurveTo(111.82558f, 134.79558f, 104.214424f, 134.79558f, 99.52f, 139.49f),
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
        return _arrowsOutSimple!!
    }

private var _arrowsOutSimple: ImageVector? = null
