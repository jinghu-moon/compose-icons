package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Pause: ImageVector
    get() {
        if (_pause != null) return _pause!!
        _pause = phosphorLightIcon(
            name = "Pause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 34.0f),
                    PathNode.LineTo(160.0f, 34.0f),
                    PathNode.CurveTo(152.26802f, 34.0f, 146.0f, 40.268013f, 146.0f, 48.0f),
                    PathNode.LineTo(146.0f, 208.0f),
                    PathNode.CurveTo(146.0f, 215.73198f, 152.26802f, 222.0f, 160.0f, 222.0f),
                    PathNode.LineTo(200.0f, 222.0f),
                    PathNode.CurveTo(207.73198f, 222.0f, 214.0f, 215.73198f, 214.0f, 208.0f),
                    PathNode.LineTo(214.0f, 48.0f),
                    PathNode.CurveTo(214.0f, 40.268013f, 207.73198f, 34.0f, 200.0f, 34.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.0f, 208.0f),
                    PathNode.CurveTo(202.0f, 209.10457f, 201.10457f, 210.0f, 200.0f, 210.0f),
                    PathNode.LineTo(160.0f, 210.0f),
                    PathNode.CurveTo(158.89543f, 210.0f, 158.0f, 209.10457f, 158.0f, 208.0f),
                    PathNode.LineTo(158.0f, 48.0f),
                    PathNode.CurveTo(158.0f, 46.89543f, 158.89543f, 46.0f, 160.0f, 46.0f),
                    PathNode.LineTo(200.0f, 46.0f),
                    PathNode.CurveTo(201.10457f, 46.0f, 202.0f, 46.89543f, 202.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 34.0f),
                    PathNode.LineTo(56.0f, 34.0f),
                    PathNode.CurveTo(48.268013f, 34.0f, 42.0f, 40.268013f, 42.0f, 48.0f),
                    PathNode.LineTo(42.0f, 208.0f),
                    PathNode.CurveTo(42.0f, 215.73198f, 48.268013f, 222.0f, 56.0f, 222.0f),
                    PathNode.LineTo(96.0f, 222.0f),
                    PathNode.CurveTo(103.73199f, 222.0f, 110.0f, 215.73198f, 110.0f, 208.0f),
                    PathNode.LineTo(110.0f, 48.0f),
                    PathNode.CurveTo(110.0f, 40.268013f, 103.73199f, 34.0f, 96.0f, 34.0f),
                    PathNode.Close,
                    PathNode.MoveTo(98.0f, 208.0f),
                    PathNode.CurveTo(98.0f, 209.10457f, 97.10457f, 210.0f, 96.0f, 210.0f),
                    PathNode.LineTo(56.0f, 210.0f),
                    PathNode.CurveTo(54.89543f, 210.0f, 54.0f, 209.10457f, 54.0f, 208.0f),
                    PathNode.LineTo(54.0f, 48.0f),
                    PathNode.CurveTo(54.0f, 46.89543f, 54.89543f, 46.0f, 56.0f, 46.0f),
                    PathNode.LineTo(96.0f, 46.0f),
                    PathNode.CurveTo(97.10457f, 46.0f, 98.0f, 46.89543f, 98.0f, 48.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _pause!!
    }

private var _pause: ImageVector? = null
