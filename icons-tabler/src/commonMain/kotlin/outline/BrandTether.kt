package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTether: ImageVector
    get() {
        if (_brandTether != null) return _brandTether!!
        _brandTether = tablerOutlineIcon(
            name = "BrandTether",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.08f, 20.188f),
                    PathNode.CurveTo(12.93f, 21.271f, 11.06f, 21.271f, 9.91f, 20.188f),
                    PathNode.LineTo(2.98f, 13.64f),
                    PathNode.CurveTo(2.02f, 12.734f, 1.71f, 11.016f, 2.29f, 9.809f),
                    PathNode.LineTo(4.69f, 4.791f),
                    PathNode.CurveTo(5.16f, 3.8f, 6.41f, 3.0f, 7.47f, 3.0f),
                    PathNode.LineTo(16.53f, 3.0f),
                    PathNode.CurveTo(17.59f, 3.0f, 18.84f, 3.802f, 19.31f, 4.79f),
                    PathNode.LineTo(21.71f, 9.809f),
                    PathNode.CurveTo(22.29f, 11.016f, 21.97f, 12.734f, 21.02f, 13.639f),
                    PathNode.CurveTo(17.567f, 16.932f, 17.554f, 16.918f, 14.08f, 20.188f)
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
                    PathNode.MoveTo(12.0f, 15.0f),
                    PathNode.LineTo(12.0f, 8.0f)
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
                    PathNode.MoveTo(8.0f, 8.0f),
                    PathNode.LineTo(16.0f, 8.0f)
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
        return _brandTether!!
    }

private var _brandTether: ImageVector? = null
