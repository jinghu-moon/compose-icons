package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FastForward: ImageVector
    get() {
        if (_fastForward != null) return _fastForward!!
        _fastForward = lucideOutlineIcon(
            name = "FastForward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 6.0f),
                    PathNode.CurveTo(12.000173f, 5.191209f, 12.487455f, 4.462132f, 13.234691f, 4.152644f),
                    PathNode.CurveTo(13.981927f, 3.843156f, 14.842011f, 4.014184f, 15.414f, 4.586f),
                    PathNode.LineTo(21.414f, 10.586f),
                    PathNode.CurveTo(22.194763f, 11.367f, 22.194763f, 12.633f, 21.414f, 13.414f),
                    PathNode.LineTo(15.414f, 19.414f),
                    PathNode.CurveTo(14.842011f, 19.985815f, 13.981927f, 20.156843f, 13.234691f, 19.847357f),
                    PathNode.CurveTo(12.487455f, 19.537868f, 12.000173f, 18.808792f, 12.0f, 18.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 6.0f),
                    PathNode.CurveTo(2.000173f, 5.191209f, 2.487455f, 4.462132f, 3.234691f, 4.152644f),
                    PathNode.CurveTo(3.981927f, 3.843156f, 4.842012f, 4.014184f, 5.414f, 4.586f),
                    PathNode.LineTo(11.414f, 10.586f),
                    PathNode.CurveTo(12.194764f, 11.367f, 12.194764f, 12.633f, 11.414f, 13.414f),
                    PathNode.LineTo(5.414f, 19.414f),
                    PathNode.CurveTo(4.842012f, 19.985815f, 3.981927f, 20.156843f, 3.234691f, 19.847357f),
                    PathNode.CurveTo(2.487455f, 19.537868f, 2.000173f, 18.808792f, 2.0f, 18.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _fastForward!!
    }

private var _fastForward: ImageVector? = null
