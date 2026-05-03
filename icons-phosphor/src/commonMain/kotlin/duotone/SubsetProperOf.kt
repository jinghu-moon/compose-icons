package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SubsetProperOf: ImageVector
    get() {
        if (_subsetProperOf != null) return _subsetProperOf!!
        _subsetProperOf = phosphorDuotoneIcon(
            name = "SubsetProperOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 48.0f),
                    PathNode.LineTo(200.0f, 208.0f),
                    PathNode.LineTo(128.0f, 208.0f),
                    PathNode.CurveTo(83.81722f, 208.0f, 48.0f, 172.18279f, 48.0f, 128.0f),
                    PathNode.LineTo(48.0f, 128.0f),
                    PathNode.CurveTo(48.0f, 83.81722f, 83.81722f, 48.0f, 128.0f, 48.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 208.0f),
                    PathNode.CurveTo(208.0f, 212.41827f, 204.41827f, 216.0f, 200.0f, 216.0f),
                    PathNode.LineTo(128.0f, 216.0f),
                    PathNode.CurveTo(79.39894f, 216.0f, 40.0f, 176.60106f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 79.39894f, 79.39894f, 40.0f, 128.0f, 40.0f),
                    PathNode.LineTo(200.0f, 40.0f),
                    PathNode.CurveTo(204.41827f, 40.0f, 208.0f, 43.581722f, 208.0f, 48.0f),
                    PathNode.CurveTo(208.0f, 52.418278f, 204.41827f, 56.0f, 200.0f, 56.0f),
                    PathNode.LineTo(128.0f, 56.0f),
                    PathNode.CurveTo(88.2355f, 56.0f, 56.0f, 88.2355f, 56.0f, 128.0f),
                    PathNode.CurveTo(56.0f, 167.7645f, 88.2355f, 200.0f, 128.0f, 200.0f),
                    PathNode.LineTo(200.0f, 200.0f),
                    PathNode.CurveTo(204.41827f, 200.0f, 208.0f, 203.58173f, 208.0f, 208.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _subsetProperOf!!
    }

private var _subsetProperOf: ImageVector? = null
