package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ZoomMoney: ImageVector
    get() {
        if (_zoomMoney != null) return _zoomMoney!!
        _zoomMoney = tablerFilledIcon(
            name = "ZoomMoney",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 3.072f),
                    PathNode.CurveTo(16.002062f, 4.227697f, 17.406334f, 6.192927f, 17.851065f, 8.46143f),
                    PathNode.CurveTo(18.295794f, 10.729933f, 17.737497f, 13.079914f, 16.32f, 14.906f),
                    PathNode.LineTo(21.707f, 20.293f),
                    PathNode.CurveTo(22.085972f, 20.68538f, 22.080553f, 21.309084f, 21.694818f, 21.694818f),
                    PathNode.CurveTo(21.309084f, 22.080553f, 20.68538f, 22.085972f, 20.293f, 21.707f),
                    PathNode.LineTo(14.905f, 16.32f),
                    PathNode.CurveTo(12.492383f, 18.192484f, 9.224178f, 18.52801f, 6.481427f, 17.184793f),
                    PathNode.CurveTo(3.738675f, 15.841578f, 1.999957f, 13.054f, 2.0f, 10.0f),
                    PathNode.LineTo(2.005f, 9.715f),
                    PathNode.CurveTo(2.105063f, 6.90953f, 3.668295f, 4.361783f, 6.124089f, 3.001729f),
                    PathNode.CurveTo(8.579884f, 1.641675f, 11.568864f, 1.668344f, 14.0f, 3.072f),
                    PathNode.MoveTo(12.0f, 6.0f),
                    PathNode.LineTo(9.5f, 6.0f),
                    PathNode.CurveTo(8.119289f, 6.0f, 7.0f, 7.119288f, 7.0f, 8.5f),
                    PathNode.CurveTo(7.0f, 9.880712f, 8.119289f, 11.0f, 9.5f, 11.0f),
                    PathNode.LineTo(10.5f, 11.0f),
                    PathNode.CurveTo(10.776142f, 11.0f, 11.0f, 11.223858f, 11.0f, 11.5f),
                    PathNode.CurveTo(11.0f, 11.776142f, 10.776142f, 12.0f, 10.5f, 12.0f),
                    PathNode.LineTo(8.0f, 12.0f),
                    PathNode.CurveTo(7.447716f, 12.0f, 7.0f, 12.447715f, 7.0f, 13.0f),
                    PathNode.CurveTo(7.0f, 13.552285f, 7.447716f, 14.0f, 8.0f, 14.0f),
                    PathNode.LineTo(10.5f, 14.0f),
                    PathNode.CurveTo(11.880712f, 14.0f, 13.0f, 12.880712f, 13.0f, 11.5f),
                    PathNode.CurveTo(13.0f, 10.119288f, 11.880712f, 9.0f, 10.5f, 9.0f),
                    PathNode.LineTo(9.5f, 9.0f),
                    PathNode.CurveTo(9.223858f, 9.0f, 9.0f, 8.776142f, 9.0f, 8.5f),
                    PathNode.CurveTo(9.0f, 8.223858f, 9.223858f, 8.0f, 9.5f, 8.0f),
                    PathNode.LineTo(12.0f, 8.0f),
                    PathNode.CurveTo(12.552285f, 8.0f, 13.0f, 7.552285f, 13.0f, 7.0f),
                    PathNode.CurveTo(13.0f, 6.447716f, 12.552285f, 6.0f, 12.0f, 6.0f)
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
        return _zoomMoney!!
    }

private var _zoomMoney: ImageVector? = null
