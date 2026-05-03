package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RefreshOff: ImageVector
    get() {
        if (_refreshOff != null) return _refreshOff!!
        _refreshOff = tablerOutlineIcon(
            name = "RefreshOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 11.0f),
                    PathNode.CurveTo(19.650803f, 8.487871f, 18.145086f, 6.284335f, 15.931599f, 5.04611f),
                    PathNode.CurveTo(13.718111f, 3.807884f, 11.052427f, 3.677938f, 8.729f, 4.695f),
                    PathNode.MoveTo(6.319f, 6.319f),
                    PathNode.CurveTo(5.537945f, 7.080748f, 4.919184f, 7.992731f, 4.5f, 9.0f),
                    PathNode.MoveTo(4.0f, 5.0f),
                    PathNode.LineTo(4.0f, 9.0f),
                    PathNode.LineTo(8.0f, 9.0f)
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
                    PathNode.MoveTo(4.0f, 13.0f),
                    PathNode.CurveTo(4.420308f, 16.02445f, 6.505751f, 18.55552f, 9.393967f, 19.546568f),
                    PathNode.CurveTo(12.282182f, 20.537615f, 15.482292f, 19.820206f, 17.671f, 17.691f),
                    PathNode.MoveTo(20.0f, 16.0f),
                    PathNode.LineTo(20.0f, 15.0f),
                    PathNode.LineTo(19.0f, 15.0f)
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
        return _refreshOff!!
    }

private var _refreshOff: ImageVector? = null
