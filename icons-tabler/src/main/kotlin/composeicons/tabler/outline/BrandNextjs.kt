package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandNextjs: ImageVector
    get() {
        if (_brandNextjs != null) return _brandNextjs!!
        _brandNextjs = tablerOutlineIcon(
            name = "BrandNextjs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 15.0f),
                    PathNode.LineTo(9.0f, 9.0f),
                    PathNode.LineTo(16.745f, 19.65f),
                    PathNode.CurveTo(12.7713f, 22.118214f, 7.56925f, 21.130775f, 4.776373f, 17.37815f),
                    PathNode.CurveTo(1.983495f, 13.625524f, 2.531038f, 8.358972f, 6.036132f, 5.261122f),
                    PathNode.CurveTo(9.541226f, 2.163271f, 14.835147f, 2.267057f, 18.21613f, 5.499908f),
                    PathNode.CurveTo(21.59711f, 8.732758f, 21.937813f, 14.016724f, 19.0f, 17.657f)
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
                    PathNode.MoveTo(15.0f, 12.0f),
                    PathNode.LineTo(15.0f, 9.0f)
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
        return _brandNextjs!!
    }

private var _brandNextjs: ImageVector? = null
