package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandFeedly: ImageVector
    get() {
        if (_brandFeedly != null) return _brandFeedly!!
        _brandFeedly = tablerOutlineIcon(
            name = "BrandFeedly",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.833f, 12.278f),
                    PathNode.LineTo(12.278f, 7.833f)
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
                    PathNode.MoveTo(10.055f, 14.5f),
                    PathNode.LineTo(12.278f, 12.278f)
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
                    PathNode.MoveTo(12.278f, 16.722f),
                    PathNode.LineTo(12.833f, 16.167f)
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
                    PathNode.MoveTo(19.828f, 14.828f),
                    PathNode.CurveTo(21.389528f, 13.266001f, 21.389528f, 10.733999f, 19.828f, 9.172f),
                    PathNode.LineTo(14.828f, 4.172f),
                    PathNode.CurveTo(13.266001f, 2.610472f, 10.733999f, 2.610472f, 9.172f, 4.172f),
                    PathNode.LineTo(4.172f, 9.172f),
                    PathNode.CurveTo(2.610472f, 10.733999f, 2.610472f, 13.266001f, 4.172f, 14.828f),
                    PathNode.LineTo(10.343f, 21.0f),
                    PathNode.LineTo(13.657f, 21.0f),
                    PathNode.LineTo(19.828f, 14.828f)
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
        return _brandFeedly!!
    }

private var _brandFeedly: ImageVector? = null
