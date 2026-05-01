package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandCupra: ImageVector
    get() {
        if (_brandCupra != null) return _brandCupra!!
        _brandCupra = tablerOutlineIcon(
            name = "BrandCupra",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.5f, 10.0f),
                    PathNode.LineTo(2.0f, 6.0f),
                    PathNode.LineTo(17.298f, 12.909f),
                    PathNode.CurveTo(17.34954f, 12.932403f, 17.388752f, 12.97655f, 17.405907f, 13.030494f),
                    PathNode.CurveTo(17.423063f, 13.084437f, 17.416555f, 13.143125f, 17.388f, 13.192f),
                    PathNode.LineTo(14.0f, 19.0f)
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
                    PathNode.MoveTo(10.0f, 19.0f),
                    PathNode.LineTo(6.612f, 13.192f),
                    PathNode.CurveTo(6.583444f, 13.143125f, 6.576937f, 13.084437f, 6.594093f, 13.030494f),
                    PathNode.CurveTo(6.611248f, 12.97655f, 6.650459f, 12.932403f, 6.702f, 12.909f),
                    PathNode.LineTo(22.0f, 6.0f),
                    PathNode.LineTo(19.5f, 10.0f)
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
        return _brandCupra!!
    }

private var _brandCupra: ImageVector? = null
