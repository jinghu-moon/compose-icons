package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Broadcast: ImageVector
    get() {
        if (_broadcast != null) return _broadcast!!
        _broadcast = tablerOutlineIcon(
            name = "Broadcast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.364f, 19.364f),
                    PathNode.CurveTo(21.878687f, 15.84927f, 21.878664f, 10.150805f, 18.363949f, 6.636104f),
                    PathNode.CurveTo(14.849233f, 3.121403f, 9.150767f, 3.121403f, 5.636052f, 6.636104f),
                    PathNode.CurveTo(2.121336f, 10.150805f, 2.121313f, 15.84927f, 5.636f, 19.364f)
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
                    PathNode.MoveTo(15.536f, 16.536f),
                    PathNode.CurveTo(17.488243f, 14.583242f, 17.487965f, 11.417657f, 15.535378f, 9.465243f),
                    PathNode.CurveTo(13.582792f, 7.512829f, 10.417208f, 7.512829f, 8.464622f, 9.465243f),
                    PathNode.CurveTo(6.512036f, 11.417657f, 6.511758f, 14.583242f, 8.464f, 16.536f)
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
                    PathNode.MoveTo(11.0f, 13.0f),
                    PathNode.CurveTo(11.0f, 13.552285f, 11.447715f, 14.0f, 12.0f, 14.0f),
                    PathNode.CurveTo(12.552285f, 14.0f, 13.0f, 13.552285f, 13.0f, 13.0f),
                    PathNode.CurveTo(13.0f, 12.447715f, 12.552285f, 12.0f, 12.0f, 12.0f),
                    PathNode.CurveTo(11.447715f, 12.0f, 11.0f, 12.447715f, 11.0f, 13.0f)
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
        return _broadcast!!
    }

private var _broadcast: ImageVector? = null
