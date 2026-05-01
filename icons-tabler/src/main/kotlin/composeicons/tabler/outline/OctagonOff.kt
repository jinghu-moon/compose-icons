package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.OctagonOff: ImageVector
    get() {
        if (_octagonOff != null) return _octagonOff!!
        _octagonOff = tablerOutlineIcon(
            name = "OctagonOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.027f, 19.002f),
                    PathNode.CurveTo(18.84138f, 19.190992f, 18.620562f, 19.341827f, 18.377f, 19.446f),
                    PathNode.LineTo(12.802f, 21.836f),
                    PathNode.CurveTo(12.289762f, 22.055016f, 11.710238f, 22.055016f, 11.198f, 21.836f),
                    PathNode.LineTo(5.623f, 19.446f),
                    PathNode.CurveTo(5.142114f, 19.240042f, 4.758958f, 18.856886f, 4.553f, 18.376f),
                    PathNode.LineTo(2.165f, 12.802f),
                    PathNode.CurveTo(1.945517f, 12.289858f, 1.945517f, 11.710142f, 2.165f, 11.198f),
                    PathNode.LineTo(4.554f, 5.623f),
                    PathNode.CurveTo(4.657f, 5.383f, 4.804f, 5.166f, 4.987f, 4.984f),
                    PathNode.MoveTo(7.676f, 3.674f),
                    PathNode.LineTo(11.198f, 2.164f),
                    PathNode.CurveTo(11.710142f, 1.944517f, 12.289858f, 1.944517f, 12.802f, 2.164f),
                    PathNode.LineTo(18.377f, 4.554f),
                    PathNode.CurveTo(18.857f, 4.76f, 19.24f, 5.143f, 19.447f, 5.624f),
                    PathNode.LineTo(21.835f, 11.198f),
                    PathNode.CurveTo(22.055f, 11.71f, 22.055f, 12.29f, 21.835f, 12.802f),
                    PathNode.LineTo(20.326f, 16.324f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _octagonOff!!
    }

private var _octagonOff: ImageVector? = null
