package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsInSimple: ImageVector
    get() {
        if (_arrowsInSimple != null) return _arrowsInSimple!!
        _arrowsInSimple = phosphorBoldIcon(
            name = "ArrowsInSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.49f, 56.48f),
                    PathNode.LineTo(177.0f, 96.0f),
                    PathNode.LineTo(196.0f, 96.0f),
                    PathNode.CurveTo(202.62741f, 96.0f, 208.0f, 101.37258f, 208.0f, 108.0f),
                    PathNode.CurveTo(208.0f, 114.62742f, 202.62741f, 120.0f, 196.0f, 120.0f),
                    PathNode.LineTo(148.0f, 120.0f),
                    PathNode.CurveTo(141.37259f, 120.0f, 136.0f, 114.62742f, 136.0f, 108.0f),
                    PathNode.LineTo(136.0f, 60.0f),
                    PathNode.CurveTo(136.0f, 53.37258f, 141.37259f, 48.0f, 148.0f, 48.0f),
                    PathNode.CurveTo(154.62741f, 48.0f, 160.0f, 53.37258f, 160.0f, 60.0f),
                    PathNode.LineTo(160.0f, 79.0f),
                    PathNode.LineTo(199.51f, 39.48f),
                    PathNode.CurveTo(204.20442f, 34.78558f, 211.81558f, 34.78558f, 216.51f, 39.48f),
                    PathNode.CurveTo(221.20442f, 44.17442f, 221.20442f, 51.78558f, 216.51f, 56.48f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 136.0f),
                    PathNode.LineTo(60.0f, 136.0f),
                    PathNode.CurveTo(53.37258f, 136.0f, 48.0f, 141.37259f, 48.0f, 148.0f),
                    PathNode.CurveTo(48.0f, 154.62741f, 53.37258f, 160.0f, 60.0f, 160.0f),
                    PathNode.LineTo(79.0f, 160.0f),
                    PathNode.LineTo(39.51f, 199.51f),
                    PathNode.CurveTo(34.81558f, 204.20442f, 34.81558f, 211.81558f, 39.51f, 216.51f),
                    PathNode.CurveTo(44.20442f, 221.20442f, 51.81558f, 221.20442f, 56.51f, 216.51f),
                    PathNode.LineTo(96.0f, 177.0f),
                    PathNode.LineTo(96.0f, 196.0f),
                    PathNode.CurveTo(96.0f, 202.62741f, 101.37258f, 208.0f, 108.0f, 208.0f),
                    PathNode.CurveTo(114.62742f, 208.0f, 120.0f, 202.62741f, 120.0f, 196.0f),
                    PathNode.LineTo(120.0f, 148.0f),
                    PathNode.CurveTo(120.0f, 141.37259f, 114.62742f, 136.0f, 108.0f, 136.0f),
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
        return _arrowsInSimple!!
    }

private var _arrowsInSimple: ImageVector? = null
