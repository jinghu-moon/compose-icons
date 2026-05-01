package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandDisqus: ImageVector
    get() {
        if (_brandDisqus != null) return _brandDisqus!!
        _brandDisqus = tablerOutlineIcon(
            name = "BrandDisqus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.847f, 21.0f),
                    PathNode.CurveTo(9.588f, 21.0f, 7.524f, 20.333f, 5.928f, 19.0f),
                    PathNode.LineTo(2.0f, 19.0f),
                    PathNode.LineTo(3.708f, 15.734f),
                    PathNode.CurveTo(3.163f, 14.56f, 2.949f, 13.288f, 2.95f, 12.0f),
                    PathNode.CurveTo(2.95f, 7.03f, 6.79f, 3.0f, 11.848f, 3.0f),
                    PathNode.CurveTo(16.9f, 3.0f, 21.0f, 7.03f, 21.0f, 12.0f),
                    PathNode.CurveTo(21.0f, 16.972f, 16.902f, 21.0f, 11.847f, 21.0f)
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
                    PathNode.MoveTo(11.485f, 15.0f),
                    PathNode.LineTo(10.0f, 15.0f),
                    PathNode.LineTo(10.0f, 9.0f),
                    PathNode.LineTo(11.485f, 9.0f),
                    PathNode.CurveTo(13.597f, 9.0f, 15.0f, 9.823f, 15.0f, 11.981f),
                    PathNode.LineTo(15.0f, 12.016f),
                    PathNode.CurveTo(15.0f, 14.196f, 13.597f, 15.0f, 11.485f, 15.0f)
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
        return _brandDisqus!!
    }

private var _brandDisqus: ImageVector? = null
