package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandFlickr: ImageVector
    get() {
        if (_brandFlickr != null) return _brandFlickr!!
        _brandFlickr = tablerOutlineIcon(
            name = "BrandFlickr",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 12.0f),
                    PathNode.CurveTo(4.0f, 13.656855f, 5.343146f, 15.0f, 7.0f, 15.0f),
                    PathNode.CurveTo(8.656855f, 15.0f, 10.0f, 13.656855f, 10.0f, 12.0f),
                    PathNode.CurveTo(10.0f, 10.343145f, 8.656855f, 9.0f, 7.0f, 9.0f),
                    PathNode.CurveTo(5.343146f, 9.0f, 4.0f, 10.343145f, 4.0f, 12.0f)
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
                    PathNode.MoveTo(14.0f, 12.0f),
                    PathNode.CurveTo(14.0f, 13.656855f, 15.343145f, 15.0f, 17.0f, 15.0f),
                    PathNode.CurveTo(18.656855f, 15.0f, 20.0f, 13.656855f, 20.0f, 12.0f),
                    PathNode.CurveTo(20.0f, 10.343145f, 18.656855f, 9.0f, 17.0f, 9.0f),
                    PathNode.CurveTo(15.343145f, 9.0f, 14.0f, 10.343145f, 14.0f, 12.0f)
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
        return _brandFlickr!!
    }

private var _brandFlickr: ImageVector? = null
