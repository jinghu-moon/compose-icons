package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGatsby: ImageVector
    get() {
        if (_brandGatsby != null) return _brandGatsby!!
        _brandGatsby = tablerOutlineIcon(
            name = "BrandGatsby",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.296f, 14.297f),
                    PathNode.LineTo(9.703f, 20.704f),
                    PathNode.CurveTo(6.67572f, 19.901896f, 4.281337f, 17.58663f, 3.378f, 14.588f),
                    PathNode.LineTo(3.296f, 14.297f)
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
                    PathNode.MoveTo(16.0f, 13.0f),
                    PathNode.LineTo(21.0f, 13.0f),
                    PathNode.CurveTo(20.59f, 16.603f, 17.993f, 19.59f, 14.614f, 20.614f),
                    PathNode.LineTo(3.386f, 9.385f),
                    PathNode.CurveTo(4.357484f, 6.182406f, 7.025788f, 3.783348f, 10.313296f, 3.156707f),
                    PathNode.CurveTo(13.600804f, 2.530065f, 16.964527f, 3.779339f, 19.046f, 6.4f)
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
        return _brandGatsby!!
    }

private var _brandGatsby: ImageVector? = null
