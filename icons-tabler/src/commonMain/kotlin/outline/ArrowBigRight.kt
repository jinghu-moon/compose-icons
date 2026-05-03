package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowBigRight: ImageVector
    get() {
        if (_arrowBigRight != null) return _arrowBigRight!!
        _arrowBigRight = tablerOutlineIcon(
            name = "ArrowBigRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 9.0f),
                    PathNode.LineTo(12.0f, 9.0f),
                    PathNode.LineTo(12.0f, 5.414f),
                    PathNode.CurveTo(12.000087f, 5.009604f, 12.243728f, 4.645066f, 12.617346f, 4.490322f),
                    PathNode.CurveTo(12.990963f, 4.335578f, 13.421006f, 4.421092f, 13.707f, 4.707f),
                    PathNode.LineTo(20.293f, 11.293f),
                    PathNode.CurveTo(20.683382f, 11.6835f, 20.683382f, 12.3165f, 20.293f, 12.707f),
                    PathNode.LineTo(13.707f, 19.293f),
                    PathNode.CurveTo(13.421006f, 19.578909f, 12.990963f, 19.664421f, 12.617346f, 19.509678f),
                    PathNode.CurveTo(12.243728f, 19.354935f, 12.000087f, 18.990396f, 12.0f, 18.586f),
                    PathNode.LineTo(12.0f, 15.0f),
                    PathNode.LineTo(4.0f, 15.0f),
                    PathNode.CurveTo(3.447715f, 15.0f, 3.0f, 14.552285f, 3.0f, 14.0f),
                    PathNode.LineTo(3.0f, 10.0f),
                    PathNode.CurveTo(3.0f, 9.447715f, 3.447715f, 9.0f, 4.0f, 9.0f)
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
        return _arrowBigRight!!
    }

private var _arrowBigRight: ImageVector? = null
