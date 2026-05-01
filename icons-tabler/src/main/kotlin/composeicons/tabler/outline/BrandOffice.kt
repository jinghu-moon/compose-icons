package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandOffice: ImageVector
    get() {
        if (_brandOffice != null) return _brandOffice!!
        _brandOffice = tablerOutlineIcon(
            name = "BrandOffice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 18.0f),
                    PathNode.LineTo(13.0f, 18.0f),
                    PathNode.LineTo(13.0f, 6.0f),
                    PathNode.LineTo(8.0f, 8.0f),
                    PathNode.LineTo(8.0f, 13.0f),
                    PathNode.LineTo(4.0f, 15.0f),
                    PathNode.LineTo(4.0f, 7.0f),
                    PathNode.LineTo(13.0f, 3.0f),
                    PathNode.LineTo(20.0f, 5.0f),
                    PathNode.LineTo(20.0f, 18.0f),
                    PathNode.LineTo(13.0f, 21.0f),
                    PathNode.LineTo(4.0f, 18.0f)
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
        return _brandOffice!!
    }

private var _brandOffice: ImageVector? = null
