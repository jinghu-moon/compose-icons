package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Feather: ImageVector
    get() {
        if (_feather != null) return _feather!!
        _feather = tablerFilledIcon(
            name = "Feather",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 9.585f),
                    PathNode.LineTo(8.0f, 16.0f),
                    PathNode.LineTo(14.414f, 16.0f),
                    PathNode.LineTo(11.707f, 18.707f),
                    PathNode.CurveTo(11.672116f, 18.742058f, 11.634681f, 18.77448f, 11.595f, 18.804f),
                    PathNode.LineTo(11.485f, 18.875f),
                    PathNode.LineTo(11.371f, 18.929f),
                    PathNode.LineTo(11.266f, 18.964f),
                    PathNode.LineTo(11.117f, 18.994f),
                    PathNode.LineTo(11.0f, 19.0f),
                    PathNode.LineTo(6.414f, 19.0f),
                    PathNode.LineTo(4.707f, 20.707f),
                    PathNode.CurveTo(4.455926f, 20.966957f, 4.084122f, 21.071213f, 3.734493f, 20.979696f),
                    PathNode.CurveTo(3.384863f, 20.888182f, 3.111818f, 20.615137f, 3.020303f, 20.265507f),
                    PathNode.CurveTo(2.928788f, 19.915878f, 3.033044f, 19.544077f, 3.293f, 19.293f),
                    PathNode.LineTo(5.0f, 17.584f),
                    PathNode.LineTo(5.0f, 13.0f),
                    PathNode.LineTo(5.003f, 12.925f),
                    PathNode.LineTo(5.02f, 12.799f),
                    PathNode.LineTo(5.05f, 12.688f),
                    PathNode.LineTo(5.094f, 12.577f),
                    PathNode.LineTo(5.146f, 12.479f),
                    PathNode.LineTo(5.213f, 12.383f),
                    PathNode.LineTo(5.293f, 12.293f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.414f, 11.0f),
                    PathNode.LineTo(16.414f, 14.0f),
                    PathNode.LineTo(11.5f, 14.0f),
                    PathNode.LineTo(14.414f, 11.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 4.586f),
                    PathNode.LineTo(13.0f, 9.584f),
                    PathNode.LineTo(10.0f, 12.584f),
                    PathNode.LineTo(10.0f, 7.585f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.482f, 3.0f),
                    PathNode.CurveTo(17.679798f, 2.999204f, 18.828827f, 3.474402f, 19.676172f, 4.320998f),
                    PathNode.CurveTo(20.52352f, 5.167595f, 20.999735f, 6.316201f, 21.0f, 7.514f),
                    PathNode.CurveTo(21.000784f, 8.019292f, 20.920082f, 8.521403f, 20.761f, 9.001f),
                    PathNode.LineTo(15.0f, 9.0f),
                    PathNode.LineTo(15.0f, 3.24f),
                    PathNode.CurveTo(15.469f, 3.082f, 15.968f, 3.0f, 16.482f, 3.0f)
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
        return _feather!!
    }

private var _feather: ImageVector? = null
