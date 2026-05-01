package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowBadgeRight: ImageVector
    get() {
        if (_arrowBadgeRight != null) return _arrowBadgeRight!!
        _arrowBadgeRight = tablerFilledIcon(
            name = "ArrowBadgeRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 6.0f),
                    PathNode.LineTo(6.888f, 6.006f),
                    PathNode.CurveTo(6.525822f, 6.046615f, 6.214419f, 6.281049f, 6.075237f, 6.617873f),
                    PathNode.CurveTo(5.936055f, 6.954698f, 5.991137f, 7.34057f, 6.219f, 7.625f),
                    PathNode.LineTo(9.72f, 12.0f),
                    PathNode.LineTo(6.22f, 16.375f),
                    PathNode.CurveTo(5.979773f, 16.675043f, 5.932776f, 17.08622f, 6.099102f, 17.432732f),
                    PathNode.CurveTo(6.265427f, 17.779243f, 6.615638f, 17.99976f, 7.0f, 18.0f),
                    PathNode.LineTo(13.0f, 18.0f),
                    PathNode.CurveTo(13.303428f, 17.999811f, 13.590358f, 17.861864f, 13.78f, 17.625f),
                    PathNode.LineTo(17.78f, 12.625f),
                    PathNode.CurveTo(18.0725f, 12.259667f, 18.0725f, 11.740333f, 17.78f, 11.375f),
                    PathNode.LineTo(13.78f, 6.375f),
                    PathNode.CurveTo(13.590358f, 6.138137f, 13.303428f, 6.00019f, 13.0f, 6.0f),
                    PathNode.LineTo(7.0f, 6.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _arrowBadgeRight!!
    }

private var _arrowBadgeRight: ImageVector? = null
