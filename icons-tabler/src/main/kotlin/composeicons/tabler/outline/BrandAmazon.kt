package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAmazon: ImageVector
    get() {
        if (_brandAmazon != null) return _brandAmazon!!
        _brandAmazon = tablerOutlineIcon(
            name = "BrandAmazon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 12.5f),
                    PathNode.CurveTo(14.702459f, 13.58892f, 12.168444f, 14.084033f, 9.63f, 13.94f),
                    PathNode.CurveTo(7.208144f, 13.532419f, 4.927986f, 12.521309f, 3.0f, 11.0f)
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
                    PathNode.MoveTo(19.5f, 15.0f),
                    PathNode.CurveTo(20.407f, 13.589f, 20.951f, 11.677f, 21.0f, 10.0f),
                    PathNode.CurveTo(19.803f, 9.227f, 18.423f, 9.065f, 17.0f, 9.0f)
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
        return _brandAmazon!!
    }

private var _brandAmazon: ImageVector? = null
