package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Pepper: ImageVector
    get() {
        if (_pepper != null) return _pepper!!
        _pepper = tablerOutlineIcon(
            name = "Pepper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 11.0f),
                    PathNode.CurveTo(13.0f, 13.21f, 10.761f, 15.0f, 8.0f, 15.0f),
                    PathNode.CurveTo(5.239f, 15.0f, 3.0f, 13.21f, 3.0f, 11.0f),
                    PathNode.CurveTo(3.0f, 15.418278f, 6.581722f, 19.0f, 11.0f, 19.0f),
                    PathNode.CurveTo(15.418278f, 19.0f, 19.0f, 15.418278f, 19.0f, 11.0f),
                    PathNode.CurveTo(19.0f, 9.343145f, 17.656855f, 8.0f, 16.0f, 8.0f),
                    PathNode.CurveTo(14.343145f, 8.0f, 13.0f, 9.343145f, 13.0f, 11.0f)
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
                    PathNode.MoveTo(16.0f, 8.0f),
                    PathNode.CurveTo(16.0f, 6.0f, 18.0f, 4.0f, 20.0f, 4.0f)
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
        return _pepper!!
    }

private var _pepper: ImageVector? = null
