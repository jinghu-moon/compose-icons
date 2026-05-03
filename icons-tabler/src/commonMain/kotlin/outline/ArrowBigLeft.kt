package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowBigLeft: ImageVector
    get() {
        if (_arrowBigLeft != null) return _arrowBigLeft!!
        _arrowBigLeft = tablerOutlineIcon(
            name = "ArrowBigLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 15.0f),
                    PathNode.LineTo(12.0f, 15.0f),
                    PathNode.LineTo(12.0f, 18.586f),
                    PathNode.CurveTo(11.999913f, 18.990396f, 11.756272f, 19.354935f, 11.382654f, 19.509678f),
                    PathNode.CurveTo(11.009037f, 19.664421f, 10.578994f, 19.578909f, 10.293f, 19.293f),
                    PathNode.LineTo(3.707f, 12.707f),
                    PathNode.CurveTo(3.316618f, 12.3165f, 3.316618f, 11.6835f, 3.707f, 11.293f),
                    PathNode.LineTo(10.293f, 4.707f),
                    PathNode.CurveTo(10.578994f, 4.421092f, 11.009037f, 4.335578f, 11.382654f, 4.490322f),
                    PathNode.CurveTo(11.756272f, 4.645066f, 11.999913f, 5.009604f, 12.0f, 5.414f),
                    PathNode.LineTo(12.0f, 9.0f),
                    PathNode.LineTo(20.0f, 9.0f),
                    PathNode.CurveTo(20.552284f, 9.0f, 21.0f, 9.447715f, 21.0f, 10.0f),
                    PathNode.LineTo(21.0f, 14.0f),
                    PathNode.CurveTo(21.0f, 14.552285f, 20.552284f, 15.0f, 20.0f, 15.0f)
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
        return _arrowBigLeft!!
    }

private var _arrowBigLeft: ImageVector? = null
