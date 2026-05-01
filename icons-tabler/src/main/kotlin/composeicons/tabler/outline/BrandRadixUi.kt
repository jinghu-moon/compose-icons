package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandRadixUi: ImageVector
    get() {
        if (_brandRadixUi != null) return _brandRadixUi!!
        _brandRadixUi = tablerOutlineIcon(
            name = "BrandRadixUi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 5.5f),
                    PathNode.CurveTo(14.0f, 6.880712f, 15.119288f, 8.0f, 16.5f, 8.0f),
                    PathNode.CurveTo(17.880713f, 8.0f, 19.0f, 6.880712f, 19.0f, 5.5f),
                    PathNode.CurveTo(19.0f, 4.119288f, 17.880713f, 3.0f, 16.5f, 3.0f),
                    PathNode.CurveTo(15.119288f, 3.0f, 14.0f, 4.119288f, 14.0f, 5.5f)
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
                    PathNode.MoveTo(6.0f, 3.0f),
                    PathNode.LineTo(11.0f, 3.0f),
                    PathNode.LineTo(11.0f, 8.0f),
                    PathNode.LineTo(6.0f, 8.0f),
                    PathNode.LineTo(6.0f, 3.0f)
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
                    PathNode.MoveTo(11.0f, 11.0f),
                    PathNode.LineTo(11.0f, 21.0f),
                    PathNode.CurveTo(8.283381f, 20.99649f, 6.066602f, 18.824514f, 6.007636f, 16.108532f),
                    PathNode.CurveTo(5.94867f, 13.392551f, 8.069093f, 11.12641f, 10.783f, 11.005f),
                    PathNode.LineTo(11.0f, 11.0f)
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
        return _brandRadixUi!!
    }

private var _brandRadixUi: ImageVector? = null
