package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandKbin: ImageVector
    get() {
        if (_brandKbin != null) return _brandKbin!!
        _brandKbin = tablerOutlineIcon(
            name = "BrandKbin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.586f, 9.506f),
                    PathNode.LineTo(8.156f, 9.506f),
                    PathNode.CurveTo(7.722f, 8.574f, 7.456f, 8.0f, 6.56f, 8.0f),
                    PathNode.LineTo(4.156f, 8.019f),
                    PathNode.CurveTo(3.494f, 8.019f, 2.803f, 8.611f, 3.053f, 9.506f),
                    PathNode.LineTo(5.269f, 18.942f),
                    PathNode.CurveTo(5.755f, 20.685f, 6.08f, 21.0f, 6.414f, 21.0f),
                    PathNode.LineTo(7.054f, 21.0f)
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
                    PathNode.MoveTo(14.275f, 3.0f),
                    PathNode.LineTo(19.92f, 3.0f),
                    PathNode.CurveTo(20.76f, 3.0f, 21.16f, 3.714f, 20.94f, 4.287f),
                    PathNode.LineTo(16.253f, 19.396f),
                    PathNode.CurveTo(15.833f, 20.529f, 15.094f, 20.999f, 13.899f, 20.999f),
                    PathNode.LineTo(6.414f, 20.999f),
                    PathNode.CurveTo(6.804f, 20.999f, 7.174f, 20.381f, 7.71f, 18.938f),
                    PathNode.LineTo(12.167f, 4.448f),
                    PathNode.CurveTo(12.493f, 3.618f, 12.927f, 3.0f, 14.275f, 3.0f)
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
        return _brandKbin!!
    }

private var _brandKbin: ImageVector? = null
