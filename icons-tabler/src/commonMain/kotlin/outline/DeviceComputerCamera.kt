package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceComputerCamera: ImageVector
    get() {
        if (_deviceComputerCamera != null) return _deviceComputerCamera!!
        _deviceComputerCamera = tablerOutlineIcon(
            name = "DeviceComputerCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 10.0f),
                    PathNode.CurveTo(5.0f, 13.865993f, 8.134007f, 17.0f, 12.0f, 17.0f),
                    PathNode.CurveTo(15.865993f, 17.0f, 19.0f, 13.865993f, 19.0f, 10.0f),
                    PathNode.CurveTo(19.0f, 6.134007f, 15.865993f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(8.134007f, 3.0f, 5.0f, 6.134007f, 5.0f, 10.0f)
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
                    PathNode.MoveTo(9.0f, 10.0f),
                    PathNode.CurveTo(9.0f, 11.656855f, 10.343145f, 13.0f, 12.0f, 13.0f),
                    PathNode.CurveTo(13.656855f, 13.0f, 15.0f, 11.656855f, 15.0f, 10.0f),
                    PathNode.CurveTo(15.0f, 8.343146f, 13.656855f, 7.0f, 12.0f, 7.0f),
                    PathNode.CurveTo(10.343145f, 7.0f, 9.0f, 8.343146f, 9.0f, 10.0f)
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
                    PathNode.MoveTo(8.0f, 16.0f),
                    PathNode.LineTo(5.909f, 19.486f),
                    PathNode.CurveTo(5.723946f, 19.794828f, 5.719186f, 20.179293f, 5.896538f, 20.492607f),
                    PathNode.CurveTo(6.07389f, 20.805922f, 6.405973f, 20.999716f, 6.766f, 21.0f),
                    PathNode.LineTo(17.234f, 21.0f),
                    PathNode.CurveTo(17.594027f, 20.999716f, 17.926111f, 20.805922f, 18.103462f, 20.492607f),
                    PathNode.CurveTo(18.280813f, 20.179293f, 18.276054f, 19.794828f, 18.091f, 19.486f),
                    PathNode.LineTo(16.0f, 16.0f)
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
        return _deviceComputerCamera!!
    }

private var _deviceComputerCamera: ImageVector? = null
