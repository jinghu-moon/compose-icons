package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Plus: ImageVector
    get() {
        if (_plus != null) return _plus!!
        _plus = tablerFilledIcon(
            name = "Plus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 4.0f),
                    PathNode.CurveTo(12.552285f, 4.0f, 13.0f, 4.447716f, 13.0f, 5.0f),
                    PathNode.LineTo(13.0f, 11.0f),
                    PathNode.LineTo(19.0f, 11.0f),
                    PathNode.CurveTo(19.552284f, 11.0f, 20.0f, 11.447715f, 20.0f, 12.0f),
                    PathNode.CurveTo(20.0f, 12.552285f, 19.552284f, 13.0f, 19.0f, 13.0f),
                    PathNode.LineTo(13.0f, 13.0f),
                    PathNode.LineTo(13.0f, 19.0f),
                    PathNode.CurveTo(13.0f, 19.552284f, 12.552285f, 20.0f, 12.0f, 20.0f),
                    PathNode.CurveTo(11.447715f, 20.0f, 11.0f, 19.552284f, 11.0f, 19.0f),
                    PathNode.LineTo(11.0f, 13.0f),
                    PathNode.LineTo(5.0f, 13.0f),
                    PathNode.CurveTo(4.447716f, 13.0f, 4.0f, 12.552285f, 4.0f, 12.0f),
                    PathNode.CurveTo(4.0f, 11.447715f, 4.447716f, 11.0f, 5.0f, 11.0f),
                    PathNode.LineTo(11.0f, 11.0f),
                    PathNode.LineTo(11.0f, 5.0f),
                    PathNode.CurveTo(11.0f, 4.447716f, 11.447715f, 4.0f, 12.0f, 4.0f)
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
        return _plus!!
    }

private var _plus: ImageVector? = null
