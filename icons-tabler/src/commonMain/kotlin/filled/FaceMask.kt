package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FaceMask: ImageVector
    get() {
        if (_faceMask != null) return _faceMask!!
        _faceMask = tablerFilledIcon(
            name = "FaceMask",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.825f, 4.196f),
                    PathNode.LineTo(17.825f, 5.626f),
                    PathNode.CurveTo(19.11237f, 5.994224f, 19.999851f, 7.171005f, 20.0f, 8.51f),
                    PathNode.LineTo(20.0f, 8.575f),
                    PathNode.CurveTo(21.7f, 8.905f, 23.0f, 10.295f, 23.0f, 12.0f),
                    PathNode.CurveTo(23.0f, 13.705f, 21.7f, 15.095f, 20.0f, 15.425f),
                    PathNode.LineTo(20.0f, 15.491f),
                    PathNode.CurveTo(20.000298f, 16.830366f, 19.112726f, 18.007675f, 17.825f, 18.376f),
                    PathNode.LineTo(12.825f, 19.804f),
                    PathNode.CurveTo(12.285811f, 19.958223f, 11.714189f, 19.958223f, 11.175f, 19.804f),
                    PathNode.LineTo(6.175f, 18.375f),
                    PathNode.CurveTo(4.951997f, 18.025442f, 4.082375f, 16.942623f, 4.005f, 15.673f),
                    PathNode.LineTo(4.0f, 15.426f),
                    PathNode.CurveTo(2.3f, 15.096f, 1.0f, 13.706f, 1.0f, 12.0f),
                    PathNode.CurveTo(1.0f, 10.295f, 2.3f, 8.904f, 4.0f, 8.574f),
                    PathNode.LineTo(4.0f, 8.51f),
                    PathNode.CurveTo(4.000148f, 7.171005f, 4.887631f, 5.994224f, 6.175f, 5.626f),
                    PathNode.LineTo(11.175f, 4.198f),
                    PathNode.CurveTo(11.714189f, 4.043777f, 12.285811f, 4.043777f, 12.825f, 4.198f),
                    PathNode.MoveTo(15.0f, 13.0f),
                    PathNode.LineTo(9.0f, 13.0f),
                    PathNode.CurveTo(8.447715f, 13.0f, 8.0f, 13.447715f, 8.0f, 14.0f),
                    PathNode.CurveTo(8.0f, 14.552285f, 8.447715f, 15.0f, 9.0f, 15.0f),
                    PathNode.LineTo(15.0f, 15.0f),
                    PathNode.CurveTo(15.552285f, 15.0f, 16.0f, 14.552285f, 16.0f, 14.0f),
                    PathNode.CurveTo(16.0f, 13.447715f, 15.552285f, 13.0f, 15.0f, 13.0f),
                    PathNode.MoveTo(4.0f, 10.651f),
                    PathNode.CurveTo(3.4f, 10.899f, 3.0f, 11.421f, 3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 12.578f, 3.4f, 13.101f, 4.0f, 13.349f),
                    PathNode.Close,
                    PathNode.MoveTo(20.001f, 10.651f),
                    PathNode.LineTo(20.001f, 13.348f),
                    PathNode.CurveTo(20.6f, 13.1f, 21.0f, 12.578f, 21.0f, 12.0f),
                    PathNode.CurveTo(21.0f, 11.422f, 20.6f, 10.9f, 20.001f, 10.652f),
                    PathNode.MoveTo(15.0f, 9.0f),
                    PathNode.LineTo(9.0f, 9.0f),
                    PathNode.CurveTo(8.447715f, 9.0f, 8.0f, 9.447715f, 8.0f, 10.0f),
                    PathNode.CurveTo(8.0f, 10.552285f, 8.447715f, 11.0f, 9.0f, 11.0f),
                    PathNode.LineTo(15.0f, 11.0f),
                    PathNode.CurveTo(15.552285f, 11.0f, 16.0f, 10.552285f, 16.0f, 10.0f),
                    PathNode.CurveTo(16.0f, 9.447715f, 15.552285f, 9.0f, 15.0f, 9.0f)
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
        return _faceMask!!
    }

private var _faceMask: ImageVector? = null
