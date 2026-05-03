package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAdobeXd: ImageVector
    get() {
        if (_brandAdobeXd != null) return _brandAdobeXd!!
        _brandAdobeXd = tablerOutlineIcon(
            name = "BrandAdobeXd",
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
                    PathNode.MoveTo(6.0f, 8.0f),
                    PathNode.LineTo(11.0f, 16.0f)
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
                    PathNode.MoveTo(6.0f, 16.0f),
                    PathNode.LineTo(11.0f, 8.0f)
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
                    PathNode.MoveTo(18.0f, 11.0f),
                    PathNode.LineTo(18.0f, 15.0f),
                    PathNode.CurveTo(18.0f, 16.1f, 17.483f, 15.997f, 16.5f, 15.997f),
                    PathNode.CurveTo(15.120459f, 15.997001f, 14.001656f, 14.87954f, 14.0f, 13.5f),
                    PathNode.CurveTo(14.0f, 12.119288f, 15.119288f, 11.0f, 16.5f, 11.0f),
                    PathNode.LineTo(18.0f, 11.0f),
                    PathNode.LineTo(18.0f, 8.0f)
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
        return _brandAdobeXd!!
    }

private var _brandAdobeXd: ImageVector? = null
