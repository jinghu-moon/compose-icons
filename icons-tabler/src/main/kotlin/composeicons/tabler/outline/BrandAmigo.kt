package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAmigo: ImageVector
    get() {
        if (_brandAmigo != null) return _brandAmigo!!
        _brandAmigo = tablerOutlineIcon(
            name = "BrandAmigo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 12.0f),
                    PathNode.CurveTo(10.0f, 13.104569f, 10.895431f, 14.0f, 12.0f, 14.0f),
                    PathNode.CurveTo(13.104569f, 14.0f, 14.0f, 13.104569f, 14.0f, 12.0f),
                    PathNode.CurveTo(14.0f, 10.895431f, 13.104569f, 10.0f, 12.0f, 10.0f),
                    PathNode.CurveTo(10.895431f, 10.0f, 10.0f, 10.895431f, 10.0f, 12.0f)
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
                    PathNode.MoveTo(9.591f, 3.635f),
                    PathNode.LineTo(2.461f, 17.717f),
                    PathNode.CurveTo(0.749f, 21.097f, 4.22f, 23.167f, 6.151f, 21.29f),
                    PathNode.LineTo(8.011f, 19.48f),
                    PathNode.CurveTo(11.153f, 16.426f, 12.97f, 16.49f, 16.05f, 19.59f),
                    PathNode.LineTo(17.379f, 20.927f),
                    PathNode.CurveTo(19.751f, 23.314f, 23.244f, 21.005f, 21.555f, 17.702f),
                    PathNode.LineTo(14.36f, 3.635f),
                    PathNode.CurveTo(13.246f, 1.455f, 10.694f, 1.455f, 9.59f, 3.635f)
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
        return _brandAmigo!!
    }

private var _brandAmigo: ImageVector? = null
