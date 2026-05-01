package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SubsetOf: ImageVector
    get() {
        if (_subsetOf != null) return _subsetOf!!
        _subsetOf = phosphorDuotoneIcon(
            name = "SubsetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 56.0f),
                    PathNode.LineTo(200.0f, 168.0f),
                    PathNode.LineTo(104.0f, 168.0f),
                    PathNode.CurveTo(73.07206f, 168.0f, 48.0f, 142.92795f, 48.0f, 112.0f),
                    PathNode.CurveTo(48.0f, 81.07206f, 73.07206f, 56.0f, 104.0f, 56.0f),
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
                    PathNode.MoveTo(208.0f, 208.0f),
                    PathNode.CurveTo(208.0f, 212.41827f, 204.41827f, 216.0f, 200.0f, 216.0f),
                    PathNode.LineTo(48.0f, 216.0f),
                    PathNode.CurveTo(43.581722f, 216.0f, 40.0f, 212.41827f, 40.0f, 208.0f),
                    PathNode.CurveTo(40.0f, 203.58173f, 43.581722f, 200.0f, 48.0f, 200.0f),
                    PathNode.LineTo(200.0f, 200.0f),
                    PathNode.CurveTo(204.41827f, 200.0f, 208.0f, 203.58173f, 208.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 160.0f),
                    PathNode.LineTo(104.0f, 160.0f),
                    PathNode.CurveTo(77.49033f, 160.0f, 56.0f, 138.50967f, 56.0f, 112.0f),
                    PathNode.CurveTo(56.0f, 85.49033f, 77.49033f, 64.0f, 104.0f, 64.0f),
                    PathNode.LineTo(200.0f, 64.0f),
                    PathNode.CurveTo(204.41827f, 64.0f, 208.0f, 60.418278f, 208.0f, 56.0f),
                    PathNode.CurveTo(208.0f, 51.581722f, 204.41827f, 48.0f, 200.0f, 48.0f),
                    PathNode.LineTo(104.0f, 48.0f),
                    PathNode.CurveTo(68.65378f, 48.0f, 40.0f, 76.65378f, 40.0f, 112.0f),
                    PathNode.CurveTo(40.0f, 147.34622f, 68.65378f, 176.0f, 104.0f, 176.0f),
                    PathNode.LineTo(200.0f, 176.0f),
                    PathNode.CurveTo(204.41827f, 176.0f, 208.0f, 172.41827f, 208.0f, 168.0f),
                    PathNode.CurveTo(208.0f, 163.58173f, 204.41827f, 160.0f, 200.0f, 160.0f),
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
        return _subsetOf!!
    }

private var _subsetOf: ImageVector? = null
