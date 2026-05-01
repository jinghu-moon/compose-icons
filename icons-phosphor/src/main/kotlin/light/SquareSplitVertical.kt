package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SquareSplitVertical: ImageVector
    get() {
        if (_squareSplitVertical != null) return _squareSplitVertical!!
        _squareSplitVertical = phosphorLightIcon(
            name = "SquareSplitVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 42.0f),
                    PathNode.LineTo(56.0f, 42.0f),
                    PathNode.CurveTo(48.268013f, 42.0f, 42.0f, 48.268013f, 42.0f, 56.0f),
                    PathNode.LineTo(42.0f, 200.0f),
                    PathNode.CurveTo(42.0f, 207.73198f, 48.268013f, 214.0f, 56.0f, 214.0f),
                    PathNode.LineTo(200.0f, 214.0f),
                    PathNode.CurveTo(207.73198f, 214.0f, 214.0f, 207.73198f, 214.0f, 200.0f),
                    PathNode.LineTo(214.0f, 56.0f),
                    PathNode.CurveTo(214.0f, 48.268013f, 207.73198f, 42.0f, 200.0f, 42.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 54.0f),
                    PathNode.LineTo(200.0f, 54.0f),
                    PathNode.CurveTo(201.10457f, 54.0f, 202.0f, 54.89543f, 202.0f, 56.0f),
                    PathNode.LineTo(202.0f, 122.0f),
                    PathNode.LineTo(54.0f, 122.0f),
                    PathNode.LineTo(54.0f, 56.0f),
                    PathNode.CurveTo(54.0f, 54.89543f, 54.89543f, 54.0f, 56.0f, 54.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 202.0f),
                    PathNode.LineTo(56.0f, 202.0f),
                    PathNode.CurveTo(54.89543f, 202.0f, 54.0f, 201.10457f, 54.0f, 200.0f),
                    PathNode.LineTo(54.0f, 134.0f),
                    PathNode.LineTo(202.0f, 134.0f),
                    PathNode.LineTo(202.0f, 200.0f),
                    PathNode.CurveTo(202.0f, 201.10457f, 201.10457f, 202.0f, 200.0f, 202.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _squareSplitVertical!!
    }

private var _squareSplitVertical: ImageVector? = null
