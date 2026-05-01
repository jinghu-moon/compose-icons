package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandPrisma: ImageVector
    get() {
        if (_brandPrisma != null) return _brandPrisma!!
        _brandPrisma = tablerOutlineIcon(
            name = "BrandPrisma",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.186f, 16.202f),
                    PathNode.LineTo(7.801f, 21.515f),
                    PathNode.CurveTo(8.066f, 21.905f, 8.555f, 22.085f, 9.016f, 21.962f),
                    PathNode.LineTo(19.182f, 19.244f),
                    PathNode.CurveTo(19.494684f, 19.163404f, 19.755287f, 18.947845f, 19.893087f, 18.655819f),
                    PathNode.CurveTo(20.030886f, 18.363794f, 20.031586f, 18.025595f, 19.895f, 17.733f),
                    PathNode.LineTo(12.39f, 2.25f),
                    PathNode.CurveTo(12.317791f, 2.102358f, 12.170534f, 2.006109f, 12.006324f, 1.999223f),
                    PathNode.CurveTo(11.842113f, 1.992337f, 11.687316f, 2.075921f, 11.603f, 2.217f),
                    PathNode.LineTo(4.15f, 15.055f),
                    PathNode.CurveTo(3.938921f, 15.412173f, 3.953341f, 15.859173f, 4.187f, 16.202f),
                    PathNode.LineTo(4.186f, 16.202f)
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
                    PathNode.MoveTo(8.5f, 22.0f),
                    PathNode.LineTo(12.0f, 2.0f)
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
        return _brandPrisma!!
    }

private var _brandPrisma: ImageVector? = null
