package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HandOff: ImageVector
    get() {
        if (_handOff != null) return _handOff!!
        _handOff = tablerOutlineIcon(
            name = "HandOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 13.5f),
                    PathNode.LineTo(8.0f, 8.0f),
                    PathNode.MoveTo(8.44f, 4.438f),
                    PathNode.CurveTo(8.869231f, 4.009303f, 9.514426f, 3.881354f, 10.074771f, 4.11381f),
                    PathNode.CurveTo(10.635115f, 4.346265f, 11.000275f, 4.893353f, 11.0f, 5.5f),
                    PathNode.LineTo(11.0f, 7.0f),
                    PathNode.MoveTo(11.0f, 11.008f),
                    PathNode.LineTo(11.0f, 12.0f),
                    PathNode.MoveTo(11.0f, 5.5f),
                    PathNode.LineTo(11.0f, 3.5f),
                    PathNode.CurveTo(11.0f, 2.671573f, 11.671573f, 2.0f, 12.5f, 2.0f),
                    PathNode.CurveTo(13.328427f, 2.0f, 14.0f, 2.671573f, 14.0f, 3.5f),
                    PathNode.LineTo(14.0f, 10.0f),
                    PathNode.MoveTo(14.0f, 5.5f),
                    PathNode.CurveTo(14.0f, 4.671573f, 14.671573f, 4.0f, 15.5f, 4.0f),
                    PathNode.CurveTo(16.328426f, 4.0f, 17.0f, 4.671573f, 17.0f, 5.5f),
                    PathNode.LineTo(17.0f, 12.0f),
                    PathNode.MoveTo(17.0f, 7.5f),
                    PathNode.CurveTo(17.0f, 6.671573f, 17.671574f, 6.0f, 18.5f, 6.0f),
                    PathNode.CurveTo(19.328426f, 6.0f, 20.0f, 6.671573f, 20.0f, 7.5f),
                    PathNode.LineTo(20.0f, 16.0f),
                    PathNode.CurveTo(20.0f, 19.31371f, 17.31371f, 22.0f, 14.0f, 22.0f),
                    PathNode.LineTo(12.0f, 22.0f),
                    PathNode.CurveTo(9.886f, 21.708f, 8.044f, 20.603f, 7.0f, 19.0f),
                    PathNode.LineTo(4.3f, 13.75f),
                    PathNode.CurveTo(3.747715f, 12.990608f, 3.915609f, 11.927285f, 4.675f, 11.375f),
                    PathNode.CurveTo(5.434392f, 10.822715f, 6.497716f, 10.990608f, 7.05f, 11.75f),
                    PathNode.LineTo(7.95f, 13.5f)
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
        return _handOff!!
    }

private var _handOff: ImageVector? = null
