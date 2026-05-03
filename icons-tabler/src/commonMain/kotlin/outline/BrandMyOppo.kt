package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandMyOppo: ImageVector
    get() {
        if (_brandMyOppo != null) return _brandMyOppo!!
        _brandMyOppo = tablerOutlineIcon(
            name = "BrandMyOppo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.316f, 5.0f),
                    PathNode.LineTo(5.684f, 5.0f),
                    PathNode.LineTo(2.266f, 9.019f),
                    PathNode.CurveTo(1.904604f, 9.43641f, 1.912769f, 10.058224f, 2.285f, 10.466f),
                    PathNode.LineTo(11.999f, 21.0f),
                    PathNode.LineTo(21.714f, 10.51f),
                    PathNode.CurveTo(22.085468f, 10.103777f, 22.095764f, 9.484343f, 21.738f, 9.066f),
                    PathNode.LineTo(18.316f, 5.0f)
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
                    PathNode.MoveTo(9.0f, 11.0f),
                    PathNode.LineTo(12.0f, 14.0f),
                    PathNode.LineTo(15.0f, 11.0f)
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
        return _brandMyOppo!!
    }

private var _brandMyOppo: ImageVector? = null
