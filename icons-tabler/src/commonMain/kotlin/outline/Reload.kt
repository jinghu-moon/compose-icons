package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Reload: ImageVector
    get() {
        if (_reload != null) return _reload!!
        _reload = tablerOutlineIcon(
            name = "Reload",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.933f, 13.041f),
                    PathNode.CurveTo(19.409601f, 17.032173f, 16.002178f, 20.012865f, 11.97685f, 20.000757f),
                    PathNode.CurveTo(7.951522f, 19.988647f, 4.562094f, 16.98751f, 4.062716f, 12.993259f),
                    PathNode.CurveTo(3.563338f, 8.999008f, 6.109556f, 5.255772f, 10.008f, 4.253f),
                    PathNode.CurveTo(13.907f, 3.253f, 17.943f, 5.26f, 19.433f, 9.0f)
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
                    PathNode.MoveTo(20.0f, 4.0f),
                    PathNode.LineTo(20.0f, 9.0f),
                    PathNode.LineTo(15.0f, 9.0f)
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
        return _reload!!
    }

private var _reload: ImageVector? = null
