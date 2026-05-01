package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Moneybag: ImageVector
    get() {
        if (_moneybag != null) return _moneybag!!
        _moneybag = tablerOutlineIcon(
            name = "Moneybag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.5f, 3.0f),
                    PathNode.LineTo(14.5f, 3.0f),
                    PathNode.CurveTo(15.328427f, 3.0f, 16.0f, 3.671573f, 16.0f, 4.5f),
                    PathNode.CurveTo(16.0f, 6.432997f, 14.432997f, 8.0f, 12.5f, 8.0f),
                    PathNode.LineTo(11.5f, 8.0f),
                    PathNode.CurveTo(9.567003f, 8.0f, 8.0f, 6.432997f, 8.0f, 4.5f),
                    PathNode.CurveTo(8.0f, 3.671573f, 8.671573f, 3.0f, 9.5f, 3.0f)
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
                    PathNode.MoveTo(4.0f, 17.0f),
                    PathNode.LineTo(4.0f, 16.0f),
                    PathNode.CurveTo(4.0f, 11.581722f, 7.581722f, 8.0f, 12.0f, 8.0f),
                    PathNode.CurveTo(16.418278f, 8.0f, 20.0f, 11.581722f, 20.0f, 16.0f),
                    PathNode.LineTo(20.0f, 17.0f),
                    PathNode.CurveTo(20.0f, 19.209139f, 18.209139f, 21.0f, 16.0f, 21.0f),
                    PathNode.LineTo(8.0f, 21.0f),
                    PathNode.CurveTo(5.790861f, 21.0f, 4.0f, 19.209139f, 4.0f, 17.0f)
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
        return _moneybag!!
    }

private var _moneybag: ImageVector? = null
