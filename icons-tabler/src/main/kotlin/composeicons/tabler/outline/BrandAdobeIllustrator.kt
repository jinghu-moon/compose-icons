package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAdobeIllustrator: ImageVector
    get() {
        if (_brandAdobeIllustrator != null) return _brandAdobeIllustrator!!
        _brandAdobeIllustrator = tablerOutlineIcon(
            name = "BrandAdobeIllustrator",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 7.757f, 3.0f, 5.636f, 4.318f, 4.318f),
                    PathNode.CurveTo(5.636f, 3.0f, 7.758f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(16.242f, 3.0f, 18.364f, 3.0f, 19.682f, 4.318f),
                    PathNode.CurveTo(21.0f, 5.636f, 21.0f, 7.758f, 21.0f, 12.0f),
                    PathNode.CurveTo(21.0f, 16.242f, 21.0f, 18.364f, 19.682f, 19.682f),
                    PathNode.CurveTo(18.364f, 21.0f, 16.242f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(7.758f, 21.0f, 5.636f, 21.0f, 4.318f, 19.682f),
                    PathNode.CurveTo(3.0f, 18.364f, 3.0f, 16.242f, 3.0f, 12.0f)
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
                    PathNode.MoveTo(12.947f, 15.79f),
                    PathNode.LineTo(12.127f, 13.137f),
                    PathNode.MoveTo(7.263f, 15.789f),
                    PathNode.LineTo(8.083f, 13.137f),
                    PathNode.MoveTo(8.083f, 13.137f),
                    PathNode.LineTo(8.77f, 10.919f),
                    PathNode.CurveTo(9.328f, 9.113f, 9.608f, 8.211001f, 10.105f, 8.211001f),
                    PathNode.CurveTo(10.603f, 8.211001f, 10.882f, 9.113f, 11.441f, 10.919f),
                    PathNode.LineTo(12.127f, 13.137f),
                    PathNode.MoveTo(8.084f, 13.137f),
                    PathNode.LineTo(12.127f, 13.137f)
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
                    PathNode.MoveTo(15.789f, 15.789f),
                    PathNode.LineTo(15.789f, 11.053f)
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
                    PathNode.MoveTo(15.789f, 8.684f),
                    PathNode.LineTo(15.789f, 8.211001f)
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
        return _brandAdobeIllustrator!!
    }

private var _brandAdobeIllustrator: ImageVector? = null
