package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Windmill: ImageVector
    get() {
        if (_windmill != null) return _windmill!!
        _windmill = tablerFilledIcon(
            name = "Windmill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(15.292f, 2.0f, 18.0f, 4.435f, 18.0f, 7.5f),
                    PathNode.CurveTo(18.0f, 8.837f, 17.485f, 10.054f, 16.631f, 11.0f),
                    PathNode.LineTo(21.0f, 11.0f),
                    PathNode.CurveTo(21.552284f, 11.0f, 22.0f, 11.447715f, 22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 15.292f, 19.565f, 18.0f, 16.5f, 18.0f),
                    PathNode.CurveTo(15.164f, 18.0f, 13.947f, 17.485f, 13.0f, 16.632f),
                    PathNode.LineTo(13.0f, 21.0f),
                    PathNode.CurveTo(13.0f, 21.552284f, 12.552285f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(8.708f, 22.0f, 6.0f, 19.565f, 6.0f, 16.5f),
                    PathNode.CurveTo(6.0f, 15.164f, 6.515f, 13.947f, 7.368f, 13.0f),
                    PathNode.LineTo(3.0f, 13.0f),
                    PathNode.CurveTo(2.447715f, 13.0f, 2.0f, 12.552285f, 2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 8.708f, 4.435f, 6.0f, 7.5f, 6.0f),
                    PathNode.CurveTo(8.837f, 6.0f, 10.054f, 6.515f, 11.0f, 7.369f),
                    PathNode.LineTo(11.0f, 3.0f),
                    PathNode.CurveTo(11.0f, 2.447715f, 11.447715f, 2.0f, 12.0f, 2.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _windmill!!
    }

private var _windmill: ImageVector? = null
