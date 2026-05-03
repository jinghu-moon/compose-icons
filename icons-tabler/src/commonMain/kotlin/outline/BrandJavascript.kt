package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandJavascript: ImageVector
    get() {
        if (_brandJavascript != null) return _brandJavascript!!
        _brandJavascript = tablerOutlineIcon(
            name = "BrandJavascript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 4.0f),
                    PathNode.LineTo(18.0f, 18.5f),
                    PathNode.LineTo(12.0f, 20.5f),
                    PathNode.LineTo(6.0f, 18.5f),
                    PathNode.LineTo(4.0f, 4.0f),
                    PathNode.LineTo(20.0f, 4.0f)
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
                    PathNode.MoveTo(7.5f, 8.0f),
                    PathNode.LineTo(10.5f, 8.0f),
                    PathNode.LineTo(10.5f, 16.0f),
                    PathNode.LineTo(8.5f, 15.0f)
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
                    PathNode.MoveTo(16.5f, 8.0f),
                    PathNode.LineTo(14.0f, 8.0f),
                    PathNode.CurveTo(13.723858f, 8.0f, 13.5f, 8.223858f, 13.5f, 8.5f),
                    PathNode.LineTo(13.5f, 11.5f),
                    PathNode.CurveTo(13.5f, 11.776142f, 13.723858f, 12.0f, 14.0f, 12.0f),
                    PathNode.LineTo(15.423f, 12.0f),
                    PathNode.CurveTo(15.567807f, 12.000022f, 15.705493f, 12.062822f, 15.800441f, 12.172156f),
                    PathNode.CurveTo(15.895389f, 12.281491f, 15.938273f, 12.426619f, 15.918f, 12.57f),
                    PathNode.LineTo(15.5f, 15.5f),
                    PathNode.LineTo(13.5f, 16.0f)
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
        return _brandJavascript!!
    }

private var _brandJavascript: ImageVector? = null
