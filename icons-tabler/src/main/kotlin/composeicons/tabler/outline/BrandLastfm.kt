package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandLastfm: ImageVector
    get() {
        if (_brandLastfm != null) return _brandLastfm!!
        _brandLastfm = tablerOutlineIcon(
            name = "BrandLastfm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 8.0f),
                    PathNode.CurveTo(19.17f, 7.0f, 18.612f, 7.0f, 18.0f, 7.0f),
                    PathNode.CurveTo(17.388f, 7.0f, 16.0f, 7.271f, 16.0f, 9.0f),
                    PathNode.CurveTo(16.0f, 10.729f, 17.384f, 11.233f, 19.0f, 12.0f),
                    PathNode.CurveTo(20.616f, 12.767f, 21.125f, 13.812f, 21.0f, 15.0f),
                    PathNode.CurveTo(20.875f, 16.188f, 20.0f, 17.0f, 18.0f, 17.0f),
                    PathNode.CurveTo(16.0f, 17.0f, 15.0f, 16.0f, 14.5f, 15.0f),
                    PathNode.CurveTo(14.0f, 14.0f, 12.915f, 10.22f, 12.003f, 9.0f),
                    PathNode.CurveTo(10.346146f, 6.790861f, 7.212139f, 6.343146f, 5.003f, 8.0f),
                    PathNode.CurveTo(2.793861f, 9.656855f, 2.346146f, 12.790861f, 4.003f, 15.0f),
                    PathNode.CurveTo(5.659855f, 17.209139f, 8.793861f, 17.656855f, 11.003f, 16.0f)
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
        return _brandLastfm!!
    }

private var _brandLastfm: ImageVector? = null
