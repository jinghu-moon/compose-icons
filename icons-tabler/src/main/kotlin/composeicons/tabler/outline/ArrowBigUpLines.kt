package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowBigUpLines: ImageVector
    get() {
        if (_arrowBigUpLines != null) return _arrowBigUpLines!!
        _arrowBigUpLines = tablerOutlineIcon(
            name = "ArrowBigUpLines",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 12.0f),
                    PathNode.LineTo(5.414f, 12.0f),
                    PathNode.CurveTo(5.009604f, 11.999913f, 4.645066f, 11.756272f, 4.490322f, 11.382654f),
                    PathNode.CurveTo(4.335578f, 11.009037f, 4.421092f, 10.578994f, 4.707f, 10.293f),
                    PathNode.LineTo(11.293f, 3.707f),
                    PathNode.CurveTo(11.6835f, 3.316618f, 12.3165f, 3.316618f, 12.707f, 3.707f),
                    PathNode.LineTo(19.293f, 10.293f),
                    PathNode.CurveTo(19.578909f, 10.578994f, 19.664421f, 11.009037f, 19.509678f, 11.382654f),
                    PathNode.CurveTo(19.354935f, 11.756272f, 18.990396f, 11.999913f, 18.586f, 12.0f),
                    PathNode.LineTo(15.0f, 12.0f),
                    PathNode.LineTo(15.0f, 15.0f),
                    PathNode.LineTo(9.0f, 15.0f),
                    PathNode.LineTo(9.0f, 12.0f)
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
                    PathNode.MoveTo(9.0f, 21.0f),
                    PathNode.LineTo(15.0f, 21.0f)
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
                    PathNode.MoveTo(9.0f, 18.0f),
                    PathNode.LineTo(15.0f, 18.0f)
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
        return _arrowBigUpLines!!
    }

private var _arrowBigUpLines: ImageVector? = null
