package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ZoomCode: ImageVector
    get() {
        if (_zoomCode != null) return _zoomCode!!
        _zoomCode = tablerFilledIcon(
            name = "ZoomCode",
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
                    PathNode.CurveTo(8.3165f, 6.901618f, 7.6835f, 6.901618f, 7.293f, 7.292f),
                    PathNode.LineTo(5.293f, 9.292f),
                    PathNode.CurveTo(5.105223f, 9.479568f, 4.999714f, 9.734091f, 4.999714f, 9.9995f),
                    PathNode.CurveTo(4.999714f, 10.264909f, 5.105223f, 10.519432f, 5.293f, 10.707f),
                    PathNode.LineTo(7.293f, 12.707f),
                    PathNode.CurveTo(7.6835f, 13.097382f, 8.3165f, 13.097382f, 8.707f, 12.707f),
                    PathNode.LineTo(8.79f, 12.613f),
                    PathNode.CurveTo(9.098803f, 12.214914f, 9.063235f, 11.649268f, 8.707f, 11.293f),
                    PathNode.LineTo(7.415f, 10.0f),
                    PathNode.LineTo(8.707f, 8.707f),
                    PathNode.CurveTo(9.097382f, 8.3165f, 9.097382f, 7.6835f, 8.707f, 7.293f),
                    PathNode.MoveTo(12.707f, 7.293f),
                    PathNode.CurveTo(12.3165f, 6.902618f, 11.6835f, 6.902618f, 11.293f, 7.293f),
                    PathNode.LineTo(11.21f, 7.388f),
                    PathNode.CurveTo(10.901197f, 7.786085f, 10.936765f, 8.351732f, 11.293f, 8.708f),
                    PathNode.LineTo(12.585f, 10.0f),
                    PathNode.LineTo(11.293f, 11.293f),
                    PathNode.CurveTo(10.914028f, 11.685379f, 10.919448f, 12.309085f, 11.305182f, 12.694818f),
                    PathNode.CurveTo(11.690915f, 13.080552f, 12.314621f, 13.085972f, 12.707f, 12.707f),
                    PathNode.LineTo(14.707f, 10.707f),
                    PathNode.CurveTo(15.097382f, 10.3165f, 15.097382f, 9.6835f, 14.707f, 9.293f),
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
        return _zoomCode!!
    }

private var _zoomCode: ImageVector? = null
