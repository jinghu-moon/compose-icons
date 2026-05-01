package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleChevronsRight: ImageVector
    get() {
        if (_circleChevronsRight != null) return _circleChevronsRight!!
        _circleChevronsRight = tablerFilledIcon(
            name = "CircleChevronsRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.073f, 1.868f),
                    PathNode.CurveTo(17.567f, 1.908f, 21.999f, 6.373f, 21.999f, 11.868f),
                    PathNode.CurveTo(21.999f, 17.362f, 17.567f, 21.827f, 12.073f, 21.868f),
                    PathNode.CurveTo(6.579f, 21.908f, 2.081f, 17.508f, 2.0f, 12.015f),
                    PathNode.LineTo(2.0f, 11.72f),
                    PathNode.CurveTo(2.081f, 6.227f, 6.579f, 1.827f, 12.073f, 1.868f),
                    PathNode.MoveTo(9.707f, 8.293f),
                    PathNode.CurveTo(9.3165f, 7.902618f, 8.6835f, 7.902618f, 8.293f, 8.293f),
                    PathNode.LineTo(8.21f, 8.387f),
                    PathNode.CurveTo(7.901198f, 8.785086f, 7.936765f, 9.350732f, 8.293f, 9.707f),
                    PathNode.LineTo(10.585f, 12.0f),
                    PathNode.LineTo(8.293f, 14.293f),
                    PathNode.CurveTo(7.914028f, 14.685379f, 7.919448f, 15.309085f, 8.305182f, 15.694818f),
                    PathNode.CurveTo(8.690915f, 16.080553f, 9.314621f, 16.085972f, 9.707f, 15.707f),
                    PathNode.LineTo(12.707f, 12.707f),
                    PathNode.CurveTo(13.097382f, 12.3165f, 13.097382f, 11.6835f, 12.707f, 11.293f),
                    PathNode.Close,
                    PathNode.MoveTo(13.707f, 8.293f),
                    PathNode.CurveTo(13.3165f, 7.902618f, 12.6835f, 7.902618f, 12.293f, 8.293f),
                    PathNode.LineTo(12.21f, 8.387f),
                    PathNode.CurveTo(11.901197f, 8.785086f, 11.936765f, 9.350732f, 12.293f, 9.707f),
                    PathNode.LineTo(14.585f, 12.0f),
                    PathNode.LineTo(12.293f, 14.293f),
                    PathNode.CurveTo(11.914028f, 14.685379f, 11.919448f, 15.309085f, 12.305182f, 15.694818f),
                    PathNode.CurveTo(12.690915f, 16.080553f, 13.314621f, 16.085972f, 13.707f, 15.707f),
                    PathNode.LineTo(16.707f, 12.707f),
                    PathNode.CurveTo(17.097382f, 12.3165f, 17.097382f, 11.6835f, 16.707f, 11.293f),
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
        return _circleChevronsRight!!
    }

private var _circleChevronsRight: ImageVector? = null
