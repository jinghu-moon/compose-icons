package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandWindows: ImageVector
    get() {
        if (_brandWindows != null) return _brandWindows!!
        _brandWindows = tablerOutlineIcon(
            name = "BrandWindows",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.8f, 20.0f),
                    PathNode.LineTo(5.8f, 18.5f),
                    PathNode.CurveTo(4.8f, 18.4f, 4.0f, 17.6f, 4.0f, 16.6f),
                    PathNode.LineTo(4.0f, 7.4f),
                    PathNode.CurveTo(4.0f, 6.4f, 4.8f, 5.6f, 5.8f, 5.5f),
                    PathNode.LineTo(17.8f, 4.0f),
                    PathNode.CurveTo(19.0f, 3.9f, 20.0f, 4.8f, 20.0f, 5.9f),
                    PathNode.LineTo(20.0f, 18.0f),
                    PathNode.CurveTo(20.0f, 19.2f, 18.9f, 20.1f, 17.8f, 19.9f),
                    PathNode.LineTo(17.8f, 20.0f)
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
                    PathNode.MoveTo(12.0f, 5.0f),
                    PathNode.LineTo(12.0f, 19.0f)
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
                    PathNode.MoveTo(4.0f, 12.0f),
                    PathNode.LineTo(20.0f, 12.0f)
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
        return _brandWindows!!
    }

private var _brandWindows: ImageVector? = null
