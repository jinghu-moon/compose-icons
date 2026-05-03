package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandMongodb: ImageVector
    get() {
        if (_brandMongodb != null) return _brandMongodb!!
        _brandMongodb = tablerOutlineIcon(
            name = "BrandMongodb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 3.0f),
                    PathNode.LineTo(12.0f, 22.0f)
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
                    PathNode.MoveTo(18.0f, 11.227f),
                    PathNode.CurveTo(18.0f, 14.5f, 16.188f, 15.997f, 12.0f, 20.5f),
                    PathNode.CurveTo(7.812f, 15.997f, 6.0f, 14.5f, 6.0f, 11.227f),
                    PathNode.CurveTo(6.0f, 6.773f, 9.071f, 4.3f, 12.0f, 2.0f),
                    PathNode.CurveTo(14.929f, 4.3f, 18.0f, 6.773f, 18.0f, 11.227f)
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
        return _brandMongodb!!
    }

private var _brandMongodb: ImageVector? = null
