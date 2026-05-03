package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Sticker: ImageVector
    get() {
        if (_sticker != null) return _sticker!!
        _sticker = tablerOutlineIcon(
            name = "Sticker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 12.0f),
                    PathNode.LineTo(18.0f, 12.5f),
                    PathNode.CurveTo(16.233229f, 12.654539f, 14.488604f, 12.019529f, 13.234537f, 10.765463f),
                    PathNode.CurveTo(11.980471f, 9.511396f, 11.345461f, 7.766772f, 11.5f, 6.0f),
                    PathNode.LineTo(12.0f, 4.0f),
                    PathNode.LineTo(20.0f, 12.0f)
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
                    PathNode.MoveTo(20.0f, 12.0f),
                    PathNode.CurveTo(20.0f, 16.418278f, 16.418278f, 20.0f, 12.0f, 20.0f),
                    PathNode.CurveTo(7.581722f, 20.0f, 4.0f, 16.418278f, 4.0f, 12.0f),
                    PathNode.CurveTo(4.0f, 7.581722f, 7.581722f, 4.0f, 12.0f, 4.0f)
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
        return _sticker!!
    }

private var _sticker: ImageVector? = null
