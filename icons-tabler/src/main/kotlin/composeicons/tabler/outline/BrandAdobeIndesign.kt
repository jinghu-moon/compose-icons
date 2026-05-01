package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAdobeIndesign: ImageVector
    get() {
        if (_brandAdobeIndesign != null) return _brandAdobeIndesign!!
        _brandAdobeIndesign = tablerOutlineIcon(
            name = "BrandAdobeIndesign",
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
                    PathNode.MoveTo(15.0f, 11.0f),
                    PathNode.LineTo(15.0f, 15.0f),
                    PathNode.CurveTo(15.0f, 16.1f, 14.343f, 15.997f, 13.4f, 15.997f),
                    PathNode.CurveTo(12.758249f, 15.995269f, 12.145124f, 15.731159f, 11.703f, 15.266f),
                    PathNode.CurveTo(11.249588f, 14.789682f, 10.997722f, 14.156613f, 11.0f, 13.499f),
                    PathNode.CurveTo(11.0f, 12.836f, 11.253f, 12.2f, 11.703f, 11.732f),
                    PathNode.CurveTo(12.144954f, 11.266473f, 12.758101f, 11.001992f, 13.4f, 11.0f),
                    PathNode.LineTo(15.0f, 11.0f)
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
                    PathNode.MoveTo(15.0f, 11.0f),
                    PathNode.LineTo(15.0f, 8.0f)
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
                    PathNode.MoveTo(8.0f, 8.0f),
                    PathNode.LineTo(8.0f, 16.0f)
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
        return _brandAdobeIndesign!!
    }

private var _brandAdobeIndesign: ImageVector? = null
