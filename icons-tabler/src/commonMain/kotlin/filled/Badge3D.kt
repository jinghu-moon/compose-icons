package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Badge3D: ImageVector
    get() {
        if (_badge3D != null) return _badge3D!!
        _badge3D = tablerFilledIcon(
            name = "Badge3D",
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
                    PathNode.MoveTo(8.5f, 8.0f),
                    PathNode.LineTo(7.0f, 8.0f),
                    PathNode.CurveTo(6.447716f, 8.0f, 6.0f, 8.447715f, 6.0f, 9.0f),
                    PathNode.CurveTo(6.0f, 9.552285f, 6.447716f, 10.0f, 7.0f, 10.0f),
                    PathNode.LineTo(8.5f, 10.0f),
                    PathNode.CurveTo(8.758989f, 9.999523f, 8.975474f, 10.196892f, 8.998876f, 10.454822f),
                    PathNode.CurveTo(9.022276f, 10.712752f, 8.844846f, 10.945859f, 8.59f, 10.992f),
                    PathNode.LineTo(8.5f, 11.0f),
                    PathNode.LineTo(8.0f, 11.0f),
                    PathNode.CurveTo(6.713f, 11.0f, 6.668f, 12.864f, 7.867f, 12.993f),
                    PathNode.LineTo(8.0f, 13.0f),
                    PathNode.LineTo(8.5f, 13.0f),
                    PathNode.CurveTo(8.776142f, 13.0f, 9.0f, 13.223858f, 9.0f, 13.5f),
                    PathNode.CurveTo(9.0f, 13.776142f, 8.776142f, 14.0f, 8.5f, 14.0f),
                    PathNode.LineTo(7.0f, 14.0f),
                    PathNode.CurveTo(6.447716f, 14.0f, 6.0f, 14.447715f, 6.0f, 15.0f),
                    PathNode.CurveTo(6.0f, 15.552285f, 6.447716f, 16.0f, 7.0f, 16.0f),
                    PathNode.LineTo(8.5f, 16.0f),
                    PathNode.CurveTo(9.880712f, 16.0f, 11.0f, 14.880712f, 11.0f, 13.5f),
                    PathNode.LineTo(10.995f, 13.336f),
                    PathNode.CurveTo(10.963808f, 12.862245f, 10.798357f, 12.407166f, 10.518f, 12.024f),
                    PathNode.LineTo(10.499f, 12.0f),
                    PathNode.LineTo(10.518f, 11.976f),
                    PathNode.CurveTo(11.073916f, 11.21603f, 11.155676f, 10.208167f, 10.729523f, 9.368529f),
                    PathNode.CurveTo(10.303369f, 8.528893f, 9.441593f, 7.999916f, 8.5f, 8.0f),
                    PathNode.MoveTo(15.0f, 8.0f),
                    PathNode.LineTo(14.0f, 8.0f),
                    PathNode.CurveTo(13.447715f, 8.0f, 13.0f, 8.447715f, 13.0f, 9.0f),
                    PathNode.LineTo(13.0f, 15.0f),
                    PathNode.CurveTo(13.0f, 15.552285f, 13.447715f, 16.0f, 14.0f, 16.0f),
                    PathNode.LineTo(15.0f, 16.0f),
                    PathNode.CurveTo(16.656855f, 16.0f, 18.0f, 14.656855f, 18.0f, 13.0f),
                    PathNode.LineTo(18.0f, 11.0f),
                    PathNode.CurveTo(18.0f, 9.343145f, 16.656855f, 8.0f, 15.0f, 8.0f),
                    PathNode.MoveTo(15.0f, 10.0f),
                    PathNode.CurveTo(15.552285f, 10.0f, 16.0f, 10.447715f, 16.0f, 11.0f),
                    PathNode.LineTo(16.0f, 13.0f),
                    PathNode.CurveTo(15.999933f, 13.506975f, 15.620493f, 13.933684f, 15.117f, 13.993f),
                    PathNode.LineTo(15.0f, 14.0f),
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
        return _badge3D!!
    }

private var _badge3D: ImageVector? = null
