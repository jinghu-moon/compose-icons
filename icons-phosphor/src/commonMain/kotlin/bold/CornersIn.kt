package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CornersIn: ImageVector
    get() {
        if (_cornersIn != null) return _cornersIn!!
        _cornersIn = phosphorBoldIcon(
            name = "CornersIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(148.0f, 96.0f),
                    PathNode.LineTo(148.0f, 48.0f),
                    PathNode.CurveTo(148.0f, 41.37258f, 153.37259f, 36.0f, 160.0f, 36.0f),
                    PathNode.CurveTo(166.62741f, 36.0f, 172.0f, 41.37258f, 172.0f, 48.0f),
                    PathNode.LineTo(172.0f, 84.0f),
                    PathNode.LineTo(208.0f, 84.0f),
                    PathNode.CurveTo(214.62741f, 84.0f, 220.0f, 89.37258f, 220.0f, 96.0f),
                    PathNode.CurveTo(220.0f, 102.62742f, 214.62741f, 108.0f, 208.0f, 108.0f),
                    PathNode.LineTo(160.0f, 108.0f),
                    PathNode.CurveTo(153.37259f, 108.0f, 148.0f, 102.62742f, 148.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 148.0f),
                    PathNode.LineTo(48.0f, 148.0f),
                    PathNode.CurveTo(41.37258f, 148.0f, 36.0f, 153.37259f, 36.0f, 160.0f),
                    PathNode.CurveTo(36.0f, 166.62741f, 41.37258f, 172.0f, 48.0f, 172.0f),
                    PathNode.LineTo(84.0f, 172.0f),
                    PathNode.LineTo(84.0f, 208.0f),
                    PathNode.CurveTo(84.0f, 214.62741f, 89.37258f, 220.0f, 96.0f, 220.0f),
                    PathNode.CurveTo(102.62742f, 220.0f, 108.0f, 214.62741f, 108.0f, 208.0f),
                    PathNode.LineTo(108.0f, 160.0f),
                    PathNode.CurveTo(108.0f, 153.37259f, 102.62742f, 148.0f, 96.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 148.0f),
                    PathNode.LineTo(160.0f, 148.0f),
                    PathNode.CurveTo(153.37259f, 148.0f, 148.0f, 153.37259f, 148.0f, 160.0f),
                    PathNode.LineTo(148.0f, 208.0f),
                    PathNode.CurveTo(148.0f, 214.62741f, 153.37259f, 220.0f, 160.0f, 220.0f),
                    PathNode.CurveTo(166.62741f, 220.0f, 172.0f, 214.62741f, 172.0f, 208.0f),
                    PathNode.LineTo(172.0f, 172.0f),
                    PathNode.LineTo(208.0f, 172.0f),
                    PathNode.CurveTo(214.62741f, 172.0f, 220.0f, 166.62741f, 220.0f, 160.0f),
                    PathNode.CurveTo(220.0f, 153.37259f, 214.62741f, 148.0f, 208.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 36.0f),
                    PathNode.CurveTo(89.37258f, 36.0f, 84.0f, 41.37258f, 84.0f, 48.0f),
                    PathNode.LineTo(84.0f, 84.0f),
                    PathNode.LineTo(48.0f, 84.0f),
                    PathNode.CurveTo(41.37258f, 84.0f, 36.0f, 89.37258f, 36.0f, 96.0f),
                    PathNode.CurveTo(36.0f, 102.62742f, 41.37258f, 108.0f, 48.0f, 108.0f),
                    PathNode.LineTo(96.0f, 108.0f),
                    PathNode.CurveTo(102.62742f, 108.0f, 108.0f, 102.62742f, 108.0f, 96.0f),
                    PathNode.LineTo(108.0f, 48.0f),
                    PathNode.CurveTo(108.0f, 41.37258f, 102.62742f, 36.0f, 96.0f, 36.0f),
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
        return _cornersIn!!
    }

private var _cornersIn: ImageVector? = null
