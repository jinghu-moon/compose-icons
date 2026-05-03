package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ZoomPan: ImageVector
    get() {
        if (_zoomPan != null) return _zoomPan!!
        _zoomPan = tablerFilledIcon(
            name = "ZoomPan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 8.0f),
                    PathNode.CurveTo(13.435651f, 7.999648f, 14.761384f, 8.768703f, 15.473778f, 10.015134f),
                    PathNode.CurveTo(16.18617f, 11.261564f, 16.175951f, 12.794181f, 15.447f, 14.031f),
                    PathNode.LineTo(17.707f, 16.293f),
                    PathNode.CurveTo(18.085972f, 16.685379f, 18.080553f, 17.309084f, 17.694818f, 17.694818f),
                    PathNode.CurveTo(17.309084f, 18.080553f, 16.685379f, 18.085972f, 16.293f, 17.707f),
                    PathNode.LineTo(14.031f, 15.447f),
                    PathNode.CurveTo(12.794181f, 16.175951f, 11.261564f, 16.18617f, 10.015134f, 15.473778f),
                    PathNode.CurveTo(8.768703f, 14.761384f, 7.999648f, 13.435651f, 8.0f, 12.0f),
                    PathNode.LineTo(8.005f, 11.8f),
                    PathNode.CurveTo(8.111571f, 9.671265f, 9.868599f, 7.999999f, 12.0f, 8.0f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.293f, 1.293f),
                    PathNode.CurveTo(11.6835f, 0.902618f, 12.3165f, 0.902618f, 12.707f, 1.293f),
                    PathNode.LineTo(14.707f, 3.293f),
                    PathNode.CurveTo(14.966956f, 3.544075f, 15.071213f, 3.915878f, 14.979697f, 4.265507f),
                    PathNode.CurveTo(14.888182f, 4.615137f, 14.615137f, 4.888182f, 14.265508f, 4.979697f),
                    PathNode.CurveTo(13.915878f, 5.071213f, 13.544074f, 4.966957f, 13.293f, 4.707f),
                    PathNode.LineTo(12.0f, 3.415f),
                    PathNode.LineTo(10.707f, 4.707f),
                    PathNode.CurveTo(10.350732f, 5.063236f, 9.785086f, 5.098802f, 9.387f, 4.79f),
                    PathNode.LineTo(9.293f, 4.707f),
                    PathNode.CurveTo(8.902618f, 4.3165f, 8.902618f, 3.6835f, 9.293f, 3.293f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.293f, 9.293f),
                    PathNode.CurveTo(19.6835f, 8.902618f, 20.3165f, 8.902618f, 20.707f, 9.293f),
                    PathNode.LineTo(22.707f, 11.293f),
                    PathNode.CurveTo(23.097382f, 11.6835f, 23.097382f, 12.3165f, 22.707f, 12.707f),
                    PathNode.LineTo(20.707f, 14.707f),
                    PathNode.CurveTo(20.31462f, 15.085972f, 19.690916f, 15.080552f, 19.305182f, 14.694818f),
                    PathNode.CurveTo(18.919447f, 14.309085f, 18.914028f, 13.685379f, 19.293f, 13.293f),
                    PathNode.LineTo(20.585f, 12.0f),
                    PathNode.LineTo(19.293f, 10.707f),
                    PathNode.CurveTo(18.936766f, 10.350732f, 18.901197f, 9.785086f, 19.21f, 9.387f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.293f, 9.293f),
                    PathNode.CurveTo(3.544075f, 9.033044f, 3.915878f, 8.928787f, 4.265507f, 9.020303f),
                    PathNode.CurveTo(4.615137f, 9.111818f, 4.888182f, 9.384863f, 4.979697f, 9.734492f),
                    PathNode.CurveTo(5.071213f, 10.084122f, 4.966957f, 10.455926f, 4.707f, 10.707f),
                    PathNode.LineTo(3.415f, 12.0f),
                    PathNode.LineTo(4.707f, 13.293f),
                    PathNode.CurveTo(5.063236f, 13.649268f, 5.098802f, 14.214914f, 4.79f, 14.613f),
                    PathNode.LineTo(4.707f, 14.707f),
                    PathNode.CurveTo(4.3165f, 15.097382f, 3.6835f, 15.097382f, 3.293f, 14.707f),
                    PathNode.LineTo(1.293f, 12.707f),
                    PathNode.CurveTo(0.902618f, 12.3165f, 0.902618f, 11.6835f, 1.293f, 11.293f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.293f, 19.293f),
                    PathNode.CurveTo(9.6835f, 18.902618f, 10.3165f, 18.902618f, 10.707f, 19.293f),
                    PathNode.LineTo(12.0f, 20.585f),
                    PathNode.LineTo(13.294f, 19.293f),
                    PathNode.CurveTo(13.650269f, 18.936766f, 14.215915f, 18.901197f, 14.614f, 19.21f),
                    PathNode.LineTo(14.708f, 19.293f),
                    PathNode.CurveTo(15.098382f, 19.6835f, 15.098382f, 20.3165f, 14.708f, 20.707f),
                    PathNode.LineTo(12.708f, 22.707f),
                    PathNode.CurveTo(12.3175f, 23.097382f, 11.6845f, 23.097382f, 11.294f, 22.707f),
                    PathNode.LineTo(9.294f, 20.707f),
                    PathNode.CurveTo(8.903618f, 20.3165f, 8.903618f, 19.6835f, 9.294f, 19.293f)
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
        return _zoomPan!!
    }

private var _zoomPan: ImageVector? = null
