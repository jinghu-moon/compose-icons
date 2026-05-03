package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Camera: ImageVector
    get() {
        if (_camera != null) return _camera!!
        _camera = tablerFilledIcon(
            name = "Camera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 3.0f),
                    PathNode.CurveTo(16.046625f, 2.999669f, 16.916504f, 3.806323f, 16.995f, 4.85f),
                    PathNode.LineTo(17.0f, 5.0f),
                    PathNode.CurveTo(17.000067f, 5.506975f, 17.379507f, 5.933684f, 17.883f, 5.993f),
                    PathNode.LineTo(18.0f, 6.0f),
                    PathNode.LineTo(19.0f, 6.0f),
                    PathNode.CurveTo(20.588558f, 5.999912f, 21.901804f, 7.238179f, 21.995f, 8.824f),
                    PathNode.LineTo(22.0f, 9.0f),
                    PathNode.LineTo(22.0f, 18.0f),
                    PathNode.CurveTo(22.000088f, 19.588558f, 20.761822f, 20.901804f, 19.176f, 20.995f),
                    PathNode.LineTo(19.0f, 21.0f),
                    PathNode.LineTo(5.0f, 21.0f),
                    PathNode.CurveTo(3.411442f, 21.000088f, 2.098195f, 19.761822f, 2.005f, 18.176f),
                    PathNode.LineTo(2.0f, 18.0f),
                    PathNode.LineTo(2.0f, 9.0f),
                    PathNode.CurveTo(1.999912f, 7.411443f, 3.238179f, 6.098196f, 4.824f, 6.005f),
                    PathNode.LineTo(5.0f, 6.0f),
                    PathNode.LineTo(6.0f, 6.0f),
                    PathNode.CurveTo(6.552285f, 6.0f, 7.0f, 5.552285f, 7.0f, 5.0f),
                    PathNode.CurveTo(6.999669f, 3.953375f, 7.806323f, 3.083497f, 8.85f, 3.005f),
                    PathNode.LineTo(9.0f, 3.0f),
                    PathNode.LineTo(15.0f, 3.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 10.0f),
                    PathNode.CurveTo(10.459996f, 9.999877f, 9.170027f, 11.165819f, 9.015f, 12.698f),
                    PathNode.LineTo(9.004f, 12.85f),
                    PathNode.LineTo(9.0f, 13.0f),
                    PathNode.LineTo(9.004f, 13.15f),
                    PathNode.CurveTo(9.085869f, 14.785337f, 10.46388f, 16.052967f, 12.100353f, 15.998329f),
                    PathNode.CurveTo(13.736827f, 15.943692f, 15.027218f, 14.586973f, 14.999828f, 12.949817f),
                    PathNode.CurveTo(14.972438f, 11.31266f, 13.637385f, 9.999865f, 12.0f, 10.0f),
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
        return _camera!!
    }

private var _camera: ImageVector? = null
