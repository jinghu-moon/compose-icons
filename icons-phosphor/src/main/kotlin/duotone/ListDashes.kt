package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ListDashes: ImageVector
    get() {
        if (_listDashes != null) return _listDashes!!
        _listDashes = phosphorDuotoneIcon(
            name = "ListDashes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 64.0f),
                    PathNode.LineTo(216.0f, 192.0f),
                    PathNode.LineTo(96.0f, 192.0f),
                    PathNode.LineTo(96.0f, 64.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(88.0f, 64.0f),
                    PathNode.CurveTo(88.0f, 59.581722f, 91.58172f, 56.0f, 96.0f, 56.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.CurveTo(220.41827f, 56.0f, 224.0f, 59.581722f, 224.0f, 64.0f),
                    PathNode.CurveTo(224.0f, 68.41828f, 220.41827f, 72.0f, 216.0f, 72.0f),
                    PathNode.LineTo(96.0f, 72.0f),
                    PathNode.CurveTo(91.58172f, 72.0f, 88.0f, 68.41828f, 88.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 120.0f),
                    PathNode.LineTo(96.0f, 120.0f),
                    PathNode.CurveTo(91.58172f, 120.0f, 88.0f, 123.58172f, 88.0f, 128.0f),
                    PathNode.CurveTo(88.0f, 132.41827f, 91.58172f, 136.0f, 96.0f, 136.0f),
                    PathNode.LineTo(216.0f, 136.0f),
                    PathNode.CurveTo(220.41827f, 136.0f, 224.0f, 132.41827f, 224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 123.58172f, 220.41827f, 120.0f, 216.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 184.0f),
                    PathNode.LineTo(96.0f, 184.0f),
                    PathNode.CurveTo(91.58172f, 184.0f, 88.0f, 187.58173f, 88.0f, 192.0f),
                    PathNode.CurveTo(88.0f, 196.41827f, 91.58172f, 200.0f, 96.0f, 200.0f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.CurveTo(220.41827f, 200.0f, 224.0f, 196.41827f, 224.0f, 192.0f),
                    PathNode.CurveTo(224.0f, 187.58173f, 220.41827f, 184.0f, 216.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 56.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.CurveTo(35.581722f, 56.0f, 32.0f, 59.581722f, 32.0f, 64.0f),
                    PathNode.CurveTo(32.0f, 68.41828f, 35.581722f, 72.0f, 40.0f, 72.0f),
                    PathNode.LineTo(56.0f, 72.0f),
                    PathNode.CurveTo(60.418278f, 72.0f, 64.0f, 68.41828f, 64.0f, 64.0f),
                    PathNode.CurveTo(64.0f, 59.581722f, 60.418278f, 56.0f, 56.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 120.0f),
                    PathNode.LineTo(40.0f, 120.0f),
                    PathNode.CurveTo(35.581722f, 120.0f, 32.0f, 123.58172f, 32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 132.41827f, 35.581722f, 136.0f, 40.0f, 136.0f),
                    PathNode.LineTo(56.0f, 136.0f),
                    PathNode.CurveTo(60.418278f, 136.0f, 64.0f, 132.41827f, 64.0f, 128.0f),
                    PathNode.CurveTo(64.0f, 123.58172f, 60.418278f, 120.0f, 56.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 184.0f),
                    PathNode.LineTo(40.0f, 184.0f),
                    PathNode.CurveTo(35.581722f, 184.0f, 32.0f, 187.58173f, 32.0f, 192.0f),
                    PathNode.CurveTo(32.0f, 196.41827f, 35.581722f, 200.0f, 40.0f, 200.0f),
                    PathNode.LineTo(56.0f, 200.0f),
                    PathNode.CurveTo(60.418278f, 200.0f, 64.0f, 196.41827f, 64.0f, 192.0f),
                    PathNode.CurveTo(64.0f, 187.58173f, 60.418278f, 184.0f, 56.0f, 184.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _listDashes!!
    }

private var _listDashes: ImageVector? = null
