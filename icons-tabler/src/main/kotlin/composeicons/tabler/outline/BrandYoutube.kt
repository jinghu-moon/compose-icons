package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandYoutube: ImageVector
    get() {
        if (_brandYoutube != null) return _brandYoutube!!
        _brandYoutube = tablerOutlineIcon(
            name = "BrandYoutube",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 8.0f),
                    PathNode.CurveTo(2.0f, 5.790861f, 3.790861f, 4.0f, 6.0f, 4.0f),
                    PathNode.LineTo(18.0f, 4.0f),
                    PathNode.CurveTo(20.209139f, 4.0f, 22.0f, 5.790861f, 22.0f, 8.0f),
                    PathNode.LineTo(22.0f, 16.0f),
                    PathNode.CurveTo(22.0f, 18.209139f, 20.209139f, 20.0f, 18.0f, 20.0f),
                    PathNode.LineTo(6.0f, 20.0f),
                    PathNode.CurveTo(3.790861f, 20.0f, 2.0f, 18.209139f, 2.0f, 16.0f),
                    PathNode.LineTo(2.0f, 8.0f)
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
                    PathNode.MoveTo(10.0f, 9.0f),
                    PathNode.LineTo(15.0f, 12.0f),
                    PathNode.LineTo(10.0f, 15.0f),
                    PathNode.LineTo(10.0f, 9.0f)
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
        return _brandYoutube!!
    }

private var _brandYoutube: ImageVector? = null
