package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAdonisJs: ImageVector
    get() {
        if (_brandAdonisJs != null) return _brandAdonisJs!!
        _brandAdonisJs = tablerOutlineIcon(
            name = "BrandAdonisJs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 3.0f),
                    PathNode.CurveTo(19.2f, 3.0f, 21.0f, 4.8f, 21.0f, 12.0f),
                    PathNode.CurveTo(21.0f, 19.2f, 19.2f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(4.8f, 21.0f, 3.0f, 19.2f, 3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 4.8f, 4.8f, 3.0f, 12.0f, 3.0f)
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
                    PathNode.MoveTo(8.863f, 16.922f),
                    PathNode.CurveTo(10.0f, 16.5f, 10.5f, 16.0f, 12.0f, 16.0f),
                    PathNode.CurveTo(13.5f, 16.0f, 14.0f, 16.5f, 15.138f, 16.922f),
                    PathNode.CurveTo(15.851f, 17.186f, 16.654f, 16.82f, 16.916f, 16.15f),
                    PathNode.CurveTo(17.042f, 15.83f, 17.026f, 15.477f, 16.872f, 15.167f),
                    PathNode.LineTo(13.164f, 7.693f),
                    PathNode.CurveTo(12.867f, 7.095f, 12.106f, 6.834f, 11.464f, 7.11f),
                    PathNode.CurveTo(11.192411f, 7.223729f, 10.970155f, 7.430389f, 10.837f, 7.693f),
                    PathNode.LineTo(7.128f, 15.167f),
                    PathNode.CurveTo(6.807f, 15.815f, 7.111f, 16.582f, 7.807f, 16.881f),
                    PathNode.CurveTo(8.139f, 17.024f, 8.522f, 17.048f, 8.863f, 16.921f),
                    PathNode.LineTo(8.863f, 16.922f)
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
        return _brandAdonisJs!!
    }

private var _brandAdonisJs: ImageVector? = null
