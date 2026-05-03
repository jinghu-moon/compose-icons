package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleChevronsUp: ImageVector
    get() {
        if (_circleChevronsUp != null) return _circleChevronsUp!!
        _circleChevronsUp = tablerFilledIcon(
            name = "CircleChevronsUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.867f, 2.001f),
                    PathNode.CurveTo(17.362f, 2.001f, 21.827f, 6.433f, 21.867f, 11.927f),
                    PathNode.CurveTo(21.907f, 17.421f, 17.508f, 21.92f, 12.015f, 22.0f),
                    PathNode.LineTo(11.72f, 22.0f),
                    PathNode.CurveTo(6.227f, 21.919f, 1.827f, 17.421f, 1.868f, 11.927f),
                    PathNode.CurveTo(1.908f, 6.433f, 6.373f, 2.001f, 11.868f, 2.001f),
                    PathNode.MoveTo(12.708f, 11.293f),
                    PathNode.CurveTo(12.3175f, 10.902618f, 11.6845f, 10.902618f, 11.294f, 11.293f),
                    PathNode.LineTo(8.294f, 14.293f),
                    PathNode.CurveTo(7.903618f, 14.6835f, 7.903618f, 15.3165f, 8.294f, 15.707f),
                    PathNode.LineTo(8.388f, 15.79f),
                    PathNode.CurveTo(8.786085f, 16.098803f, 9.351731f, 16.063234f, 9.708f, 15.707f),
                    PathNode.LineTo(12.0f, 13.415f),
                    PathNode.LineTo(14.293f, 15.707f),
                    PathNode.CurveTo(14.685379f, 16.085972f, 15.309085f, 16.080553f, 15.694818f, 15.694818f),
                    PathNode.CurveTo(16.080553f, 15.309085f, 16.085972f, 14.685379f, 15.707f, 14.293f),
                    PathNode.Close,
                    PathNode.MoveTo(12.708f, 7.293f),
                    PathNode.CurveTo(12.3175f, 6.902618f, 11.6845f, 6.902618f, 11.294f, 7.293f),
                    PathNode.LineTo(8.294f, 10.293f),
                    PathNode.CurveTo(7.903618f, 10.6835f, 7.903618f, 11.3165f, 8.294f, 11.707f),
                    PathNode.LineTo(8.388f, 11.79f),
                    PathNode.CurveTo(8.786085f, 12.098803f, 9.351731f, 12.063235f, 9.708f, 11.707f),
                    PathNode.LineTo(12.0f, 9.415f),
                    PathNode.LineTo(14.293f, 11.707f),
                    PathNode.CurveTo(14.685379f, 12.085972f, 15.309085f, 12.080552f, 15.694818f, 11.694818f),
                    PathNode.CurveTo(16.080553f, 11.309085f, 16.085972f, 10.685379f, 15.707f, 10.293f),
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
        return _circleChevronsUp!!
    }

private var _circleChevronsUp: ImageVector? = null
