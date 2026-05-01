package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RadiusTopRight: ImageVector
    get() {
        if (_radiusTopRight != null) return _radiusTopRight!!
        _radiusTopRight = tablerOutlineIcon(
            name = "RadiusTopRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 5.0f),
                    PathNode.LineTo(11.0f, 5.0f),
                    PathNode.CurveTo(15.418278f, 5.0f, 19.0f, 8.581722f, 19.0f, 13.0f),
                    PathNode.LineTo(19.0f, 19.0f)
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
        return _radiusTopRight!!
    }

private var _radiusTopRight: ImageVector? = null
