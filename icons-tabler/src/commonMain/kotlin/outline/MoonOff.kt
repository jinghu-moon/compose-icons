package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoonOff: ImageVector
    get() {
        if (_moonOff != null) return _moonOff!!
        _moonOff = tablerOutlineIcon(
            name = "MoonOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.962f, 3.949f),
                    PathNode.CurveTo(9.214691f, 3.318751f, 10.597699f, 2.99098f, 12.0f, 2.992f),
                    PathNode.LineTo(12.0f, 3.0f),
                    PathNode.LineTo(12.393f, 3.0f),
                    PathNode.CurveTo(11.422385f, 3.900027f, 10.708064f, 5.041562f, 10.323f, 6.308f),
                    PathNode.MoveTo(10.182f, 10.148f),
                    PathNode.CurveTo(10.368f, 10.971f, 10.696f, 11.774f, 11.171f, 12.521f),
                    PathNode.CurveTo(12.216379f, 14.165395f, 13.861439f, 15.33767f, 15.757f, 15.789f),
                    PathNode.MoveTo(19.65f, 15.679f),
                    PathNode.CurveTo(19.873f, 15.612f, 20.094f, 15.535f, 20.313f, 15.446f),
                    PathNode.CurveTo(20.228891f, 15.648237f, 20.137497f, 15.847367f, 20.039f, 16.043f),
                    PathNode.MoveTo(18.344f, 18.38f),
                    PathNode.CurveTo(14.823461f, 21.889769f, 9.124269f, 21.881039f, 5.6145f, 18.3605f),
                    PathNode.CurveTo(2.104731f, 14.839961f, 2.113461f, 9.14077f, 5.634f, 5.631f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
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
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _moonOff!!
    }

private var _moonOff: ImageVector? = null
