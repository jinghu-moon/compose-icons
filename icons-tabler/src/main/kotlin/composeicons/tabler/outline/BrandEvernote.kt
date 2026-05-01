package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandEvernote: ImageVector
    get() {
        if (_brandEvernote != null) return _brandEvernote!!
        _brandEvernote = tablerOutlineIcon(
            name = "BrandEvernote",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 8.0f),
                    PathNode.LineTo(9.0f, 8.0f),
                    PathNode.LineTo(9.0f, 3.0f)
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
                    PathNode.MoveTo(17.9f, 19.0f),
                    PathNode.CurveTo(18.5f, 16.5f, 19.0f, 13.529f, 19.0f, 10.0f),
                    PathNode.CurveTo(19.0f, 5.5f, 17.0f, 5.0f, 16.0f, 5.0f),
                    PathNode.CurveTo(14.094f, 5.0f, 13.0f, 4.5f, 12.5f, 4.0f),
                    PathNode.CurveTo(12.146f, 3.646f, 12.0f, 3.0f, 11.0f, 3.0f),
                    PathNode.LineTo(9.0f, 3.0f),
                    PathNode.LineTo(4.0f, 8.0f),
                    PathNode.CurveTo(4.0f, 14.0f, 6.5f, 16.0f, 9.0f, 16.0f),
                    PathNode.CurveTo(10.0f, 16.0f, 10.5f, 15.5f, 11.0f, 14.5f),
                    PathNode.CurveTo(11.5f, 13.5f, 12.414f, 14.174f, 13.5f, 14.5f),
                    PathNode.CurveTo(14.544f, 14.813f, 15.51f, 14.755f, 16.0f, 15.0f),
                    PathNode.CurveTo(17.0f, 15.5f, 18.0f, 16.5f, 18.0f, 18.0f),
                    PathNode.CurveTo(18.0f, 18.5f, 18.0f, 21.0f, 15.0f, 21.0f),
                    PathNode.CurveTo(12.0f, 21.0f, 12.0f, 18.0f, 14.0f, 18.0f)
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
                    PathNode.MoveTo(15.0f, 10.0f),
                    PathNode.LineTo(16.0f, 10.0f)
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
        return _brandEvernote!!
    }

private var _brandEvernote: ImageVector? = null
