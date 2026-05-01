package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.RelationManyToMany: ImageVector
    get() {
        if (_relationManyToMany != null) return _relationManyToMany!!
        _relationManyToMany = tablerFilledIcon(
            name = "RelationManyToMany",
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
                    PathNode.MoveTo(15.8f, 9.4f),
                    PathNode.CurveTo(15.223f, 8.631f, 14.0f, 9.039f, 14.0f, 10.0f),
                    PathNode.LineTo(14.0f, 14.0f),
                    PathNode.CurveTo(14.0f, 14.552285f, 14.447715f, 15.0f, 15.0f, 15.0f),
                    PathNode.LineTo(15.117f, 14.993f),
                    PathNode.CurveTo(15.620493f, 14.933684f, 15.999933f, 14.506975f, 16.0f, 14.0f),
                    PathNode.LineTo(16.0f, 13.0f),
                    PathNode.LineTo(17.2f, 14.6f),
                    PathNode.CurveTo(17.777f, 15.369f, 19.0f, 14.961f, 19.0f, 14.0f),
                    PathNode.LineTo(19.0f, 10.0f),
                    PathNode.CurveTo(19.0f, 9.447715f, 18.552284f, 9.0f, 18.0f, 9.0f),
                    PathNode.LineTo(17.883f, 9.007f),
                    PathNode.CurveTo(17.379507f, 9.066316f, 17.000067f, 9.493025f, 17.0f, 10.0f),
                    PathNode.LineTo(17.0f, 11.0f),
                    PathNode.Close,
                    PathNode.MoveTo(6.8f, 9.4f),
                    PathNode.CurveTo(6.223f, 8.631f, 5.0f, 9.039f, 5.0f, 10.0f),
                    PathNode.LineTo(5.0f, 14.0f),
                    PathNode.CurveTo(5.0f, 14.552285f, 5.447716f, 15.0f, 6.0f, 15.0f),
                    PathNode.LineTo(6.117f, 14.993f),
                    PathNode.CurveTo(6.620493f, 14.933684f, 6.999933f, 14.506975f, 7.0f, 14.0f),
                    PathNode.LineTo(7.0f, 13.0f),
                    PathNode.LineTo(8.2f, 14.6f),
                    PathNode.CurveTo(8.777f, 15.369f, 10.0f, 14.961f, 10.0f, 14.0f),
                    PathNode.LineTo(10.0f, 10.0f),
                    PathNode.CurveTo(10.0f, 9.447715f, 9.552285f, 9.0f, 9.0f, 9.0f),
                    PathNode.LineTo(8.883f, 9.007f),
                    PathNode.CurveTo(8.379507f, 9.066316f, 8.000067f, 9.493025f, 8.0f, 10.0f),
                    PathNode.LineTo(8.0f, 11.0f),
                    PathNode.Close,
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
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _relationManyToMany!!
    }

private var _relationManyToMany: ImageVector? = null
