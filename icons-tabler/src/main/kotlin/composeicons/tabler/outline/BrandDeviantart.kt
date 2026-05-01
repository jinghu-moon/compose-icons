package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandDeviantart: ImageVector
    get() {
        if (_brandDeviantart != null) return _brandDeviantart!!
        _brandDeviantart = tablerOutlineIcon(
            name = "BrandDeviantart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 3.0f),
                    PathNode.LineTo(18.0f, 7.0f),
                    PathNode.LineTo(14.143f, 13.0f),
                    PathNode.LineTo(18.0f, 13.0f),
                    PathNode.LineTo(18.0f, 17.0f),
                    PathNode.LineTo(11.571f, 17.0f),
                    PathNode.LineTo(9.0f, 21.0f),
                    PathNode.LineTo(6.0f, 21.0f),
                    PathNode.LineTo(6.0f, 17.0f),
                    PathNode.LineTo(9.857f, 11.0f),
                    PathNode.LineTo(6.0f, 11.0f),
                    PathNode.LineTo(6.0f, 7.0f),
                    PathNode.LineTo(12.429f, 7.0f),
                    PathNode.LineTo(15.0f, 3.0f),
                    PathNode.LineTo(18.0f, 3.0f)
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
        return _brandDeviantart!!
    }

private var _brandDeviantart: ImageVector? = null
