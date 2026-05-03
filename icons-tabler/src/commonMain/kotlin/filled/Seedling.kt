package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Seedling: ImageVector
    get() {
        if (_seedling != null) return _seedling!!
        _seedling = tablerFilledIcon(
            name = "Seedling",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 3.0f),
                    PathNode.CurveTo(9.539642f, 2.999399f, 12.522715f, 5.641242f, 12.95f, 9.155f),
                    PathNode.CurveTo(14.267583f, 7.775978f, 16.09272f, 6.997132f, 18.0f, 7.0f),
                    PathNode.LineTo(21.0f, 7.0f),
                    PathNode.CurveTo(21.552284f, 7.0f, 22.0f, 7.447716f, 22.0f, 8.0f),
                    PathNode.LineTo(22.0f, 9.0f),
                    PathNode.CurveTo(22.0f, 12.865993f, 18.865993f, 16.0f, 15.0f, 16.0f),
                    PathNode.LineTo(13.0f, 16.0f),
                    PathNode.LineTo(13.0f, 20.0f),
                    PathNode.CurveTo(13.0f, 20.552284f, 12.552285f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(11.447715f, 21.0f, 11.0f, 20.552284f, 11.0f, 20.0f),
                    PathNode.LineTo(11.0f, 13.0f),
                    PathNode.LineTo(9.0f, 13.0f),
                    PathNode.CurveTo(5.134007f, 13.0f, 2.0f, 9.865993f, 2.0f, 6.0f),
                    PathNode.LineTo(2.0f, 4.0f),
                    PathNode.CurveTo(2.0f, 3.447715f, 2.447715f, 3.0f, 3.0f, 3.0f),
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
        return _seedling!!
    }

private var _seedling: ImageVector? = null
