package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.RelationOneToOne: ImageVector
    get() {
        if (_relationOneToOne != null) return _relationOneToOne!!
        _relationOneToOne = tablerFilledIcon(
            name = "RelationOneToOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 4.0f),
                    PathNode.CurveTo(20.656855f, 4.0f, 22.0f, 5.343146f, 22.0f, 7.0f),
                    PathNode.LineTo(22.0f, 17.0f),
                    PathNode.CurveTo(22.0f, 18.656855f, 20.656855f, 20.0f, 19.0f, 20.0f),
                    PathNode.LineTo(5.0f, 20.0f),
                    PathNode.CurveTo(3.343146f, 20.0f, 2.0f, 18.656855f, 2.0f, 17.0f),
                    PathNode.LineTo(2.0f, 7.0f),
                    PathNode.CurveTo(2.0f, 5.343146f, 3.343146f, 4.0f, 5.0f, 4.0f),
                    PathNode.Close,
                    PathNode.MoveTo(9.0f, 9.0f),
                    PathNode.LineTo(8.0f, 9.0f),
                    PathNode.CurveTo(7.447716f, 9.0f, 7.0f, 9.447715f, 7.0f, 10.0f),
                    PathNode.CurveTo(7.0f, 10.552285f, 7.447716f, 11.0f, 8.0f, 11.0f),
                    PathNode.LineTo(8.0f, 14.0f),
                    PathNode.CurveTo(8.0f, 14.552285f, 8.447715f, 15.0f, 9.0f, 15.0f),
                    PathNode.CurveTo(9.552285f, 15.0f, 10.0f, 14.552285f, 10.0f, 14.0f),
                    PathNode.LineTo(10.0f, 10.0f),
                    PathNode.CurveTo(10.0f, 9.447715f, 9.552285f, 9.0f, 9.0f, 9.0f),
                    PathNode.MoveTo(16.0f, 9.0f),
                    PathNode.LineTo(15.0f, 9.0f),
                    PathNode.CurveTo(14.447715f, 9.0f, 14.0f, 9.447715f, 14.0f, 10.0f),
                    PathNode.CurveTo(14.0f, 10.552285f, 14.447715f, 11.0f, 15.0f, 11.0f),
                    PathNode.LineTo(15.0f, 14.0f),
                    PathNode.CurveTo(15.0f, 14.552285f, 15.447715f, 15.0f, 16.0f, 15.0f),
                    PathNode.CurveTo(16.552284f, 15.0f, 17.0f, 14.552285f, 17.0f, 14.0f),
                    PathNode.LineTo(17.0f, 10.0f),
                    PathNode.CurveTo(17.0f, 9.447715f, 16.552284f, 9.0f, 16.0f, 9.0f),
                    PathNode.MoveTo(12.0f, 12.5f),
                    PathNode.CurveTo(11.447715f, 12.5f, 11.0f, 12.947715f, 11.0f, 13.5f),
                    PathNode.LineTo(11.0f, 13.51f),
                    PathNode.CurveTo(11.0f, 14.062284f, 11.447715f, 14.51f, 12.0f, 14.51f),
                    PathNode.CurveTo(12.552285f, 14.51f, 13.0f, 14.062284f, 13.0f, 13.51f),
                    PathNode.LineTo(13.0f, 13.5f),
                    PathNode.CurveTo(13.0f, 12.947715f, 12.552285f, 12.5f, 12.0f, 12.5f),
                    PathNode.MoveTo(12.0f, 9.5f),
                    PathNode.CurveTo(11.447715f, 9.5f, 11.0f, 9.947715f, 11.0f, 10.5f),
                    PathNode.LineTo(11.0f, 10.51f),
                    PathNode.CurveTo(11.0f, 11.062284f, 11.447715f, 11.51f, 12.0f, 11.51f),
                    PathNode.CurveTo(12.552285f, 11.51f, 13.0f, 11.062284f, 13.0f, 10.51f),
                    PathNode.LineTo(13.0f, 10.5f),
                    PathNode.CurveTo(13.0f, 9.947715f, 12.552285f, 9.5f, 12.0f, 9.5f)
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
        return _relationOneToOne!!
    }

private var _relationOneToOne: ImageVector? = null
