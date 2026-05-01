package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAirbnb: ImageVector
    get() {
        if (_brandAirbnb != null) return _brandAirbnb!!
        _brandAirbnb = tablerOutlineIcon(
            name = "BrandAirbnb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 10.0f),
                    PathNode.CurveTo(10.0f, 10.0f, 9.0f, 11.0f, 9.0f, 13.0f),
                    PathNode.CurveTo(9.0f, 14.5f, 10.494f, 16.535f, 12.0f, 18.5f),
                    PathNode.CurveTo(13.0f, 19.5f, 13.5f, 20.0f, 14.5f, 20.5f),
                    PathNode.CurveTo(15.5f, 21.0f, 17.0f, 21.5f, 19.0f, 20.0f),
                    PathNode.CurveTo(21.0f, 18.5f, 20.5f, 16.5f, 19.5f, 14.0f),
                    PathNode.CurveTo(18.5f, 11.5f, 17.167f, 8.5f, 14.5f, 4.5f),
                    PathNode.CurveTo(13.666f, 3.5f, 13.0f, 3.0f, 11.997f, 3.0f),
                    PathNode.CurveTo(10.997f, 3.0f, 10.374f, 3.45f, 9.5f, 4.5f),
                    PathNode.CurveTo(6.833f, 8.5f, 5.5f, 11.5f, 4.5f, 14.0f),
                    PathNode.CurveTo(3.5f, 16.5f, 3.0f, 18.5f, 5.0f, 20.0f),
                    PathNode.CurveTo(7.0f, 21.5f, 8.5f, 21.0f, 9.5f, 20.5f),
                    PathNode.CurveTo(10.5f, 20.0f, 11.0f, 19.5f, 12.0f, 18.5f),
                    PathNode.CurveTo(13.506f, 16.535f, 15.0f, 14.5f, 15.0f, 13.0f),
                    PathNode.CurveTo(15.0f, 11.0f, 14.0f, 10.0f, 12.0f, 10.0f)
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
        return _brandAirbnb!!
    }

private var _brandAirbnb: ImageVector? = null
