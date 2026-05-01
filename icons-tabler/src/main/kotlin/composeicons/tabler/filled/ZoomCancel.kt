package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ZoomCancel: ImageVector
    get() {
        if (_zoomCancel != null) return _zoomCancel!!
        _zoomCancel = tablerFilledIcon(
            name = "ZoomCancel",
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
                    PathNode.MoveTo(8.707f, 7.292f),
                    PathNode.CurveTo(8.316259f, 6.901535f, 7.682966f, 6.901759f, 7.2925f, 7.2925f),
                    PathNode.CurveTo(6.902035f, 7.683242f, 6.902259f, 8.316535f, 7.293f, 8.707f),
                    PathNode.LineTo(8.585f, 10.0f),
                    PathNode.LineTo(7.293f, 11.293f),
                    PathNode.CurveTo(6.914028f, 11.685379f, 6.919448f, 12.309085f, 7.305182f, 12.694818f),
                    PathNode.CurveTo(7.690915f, 13.080552f, 8.314621f, 13.085972f, 8.707f, 12.707f),
                    PathNode.LineTo(10.0f, 11.415f),
                    PathNode.LineTo(11.293f, 12.707f),
                    PathNode.CurveTo(11.685379f, 13.085972f, 12.309085f, 13.080552f, 12.694818f, 12.694818f),
                    PathNode.CurveTo(13.080552f, 12.309085f, 13.085972f, 11.685379f, 12.707f, 11.293f),
                    PathNode.LineTo(11.415f, 10.0f),
                    PathNode.LineTo(12.707f, 8.707f),
                    PathNode.CurveTo(12.966956f, 8.455926f, 13.071213f, 8.084122f, 12.979697f, 7.734493f),
                    PathNode.CurveTo(12.888182f, 7.384864f, 12.615137f, 7.111819f, 12.265508f, 7.020303f),
                    PathNode.CurveTo(11.915878f, 6.928787f, 11.544074f, 7.033044f, 11.293f, 7.293f),
                    PathNode.LineTo(10.0f, 8.585f),
                    PathNode.Close
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
        return _zoomCancel!!
    }

private var _zoomCancel: ImageVector? = null
