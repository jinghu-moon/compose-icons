package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TelescopeOff: ImageVector
    get() {
        if (_telescopeOff != null) return _telescopeOff!!
        _telescopeOff = tablerOutlineIcon(
            name = "TelescopeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 21.0f),
                    PathNode.LineTo(12.0f, 16.0f),
                    PathNode.LineTo(18.0f, 21.0f)
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
                    PathNode.MoveTo(12.0f, 13.0f),
                    PathNode.LineTo(12.0f, 21.0f)
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
                    PathNode.MoveTo(8.238f, 8.264f),
                    PathNode.LineTo(4.055f, 10.774f),
                    PathNode.CurveTo(3.035f, 11.388f, 2.698f, 12.672f, 3.295f, 13.68f),
                    PathNode.LineTo(3.46f, 13.96f),
                    PathNode.CurveTo(3.98f, 14.84f, 5.084f, 15.226f, 6.065f, 14.87f),
                    PathNode.LineTo(12.522f, 12.53f),
                    PathNode.MoveTo(15.429f, 11.475f),
                    PathNode.LineTo(20.307f, 9.705f),
                    PathNode.CurveTo(20.591154f, 9.606828f, 20.817741f, 9.388636f, 20.926567f, 9.108388f),
                    PathNode.CurveTo(21.03539f, 8.828141f, 21.015434f, 8.514212f, 20.872f, 8.25f),
                    PathNode.LineTo(18.252f, 3.545f),
                    PathNode.CurveTo(17.960667f, 3.039199f, 17.321865f, 2.853783f, 16.805f, 3.125f),
                    PathNode.LineTo(16.749f, 3.157f),
                    PathNode.LineTo(10.733f, 6.767f)
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
                    PathNode.MoveTo(14.0f, 5.0f),
                    PathNode.LineTo(17.0f, 10.5f)
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
        return _telescopeOff!!
    }

private var _telescopeOff: ImageVector? = null
