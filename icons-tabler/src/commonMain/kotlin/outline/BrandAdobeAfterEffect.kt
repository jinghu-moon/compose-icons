package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAdobeAfterEffect: ImageVector
    get() {
        if (_brandAdobeAfterEffect != null) return _brandAdobeAfterEffect!!
        _brandAdobeAfterEffect = tablerOutlineIcon(
            name = "BrandAdobeAfterEffect",
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
                    PathNode.MoveTo(12.0f, 15.79f),
                    PathNode.LineTo(11.18f, 13.137f),
                    PathNode.MoveTo(6.316f, 15.789f),
                    PathNode.LineTo(7.136f, 13.137f),
                    PathNode.MoveTo(7.136f, 13.137f),
                    PathNode.LineTo(7.822f, 10.919f),
                    PathNode.CurveTo(8.381f, 9.113f, 8.66f, 8.211001f, 9.158f, 8.211001f),
                    PathNode.CurveTo(9.656f, 8.211001f, 9.935f, 9.113f, 10.493f, 10.919f),
                    PathNode.LineTo(11.179f, 13.137f),
                    PathNode.MoveTo(7.136f, 13.137f),
                    PathNode.LineTo(11.179f, 13.137f)
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
                    PathNode.MoveTo(13.895f, 12.824f),
                    PathNode.LineTo(13.895f, 13.894f),
                    PathNode.CurveTo(13.89443f, 14.753369f, 14.472225f, 15.505539f, 15.302695f, 15.726529f),
                    PathNode.CurveTo(16.133165f, 15.947518f, 17.008377f, 15.581997f, 17.435f, 14.836f),
                    PathNode.MoveTo(13.895f, 12.824f),
                    PathNode.LineTo(13.895f, 12.0f),
                    PathNode.CurveTo(13.895f, 10.953421f, 14.743421f, 10.105f, 15.79f, 10.105f),
                    PathNode.CurveTo(16.83658f, 10.105f, 17.685f, 10.953421f, 17.685f, 12.0f),
                    PathNode.LineTo(17.685f, 12.824f),
                    PathNode.LineTo(13.895f, 12.824f)
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
        return _brandAdobeAfterEffect!!
    }

private var _brandAdobeAfterEffect: ImageVector? = null
