package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PhoneX: ImageVector
    get() {
        if (_phoneX != null) return _phoneX!!
        _phoneX = tablerFilledIcon(
            name = "PhoneX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.928f, 3.629f),
                    PathNode.LineTo(11.928f, 8.629f),
                    PathNode.CurveTo(12.109778f, 9.084473f, 11.934441f, 9.604556f, 11.514f, 9.857f),
                    PathNode.LineTo(9.844f, 10.86f),
                    PathNode.CurveTo(10.664551f, 12.205703f, 11.794546f, 13.33604f, 13.14f, 14.157f),
                    PathNode.LineTo(14.143f, 12.486f),
                    PathNode.CurveTo(14.395444f, 12.065559f, 14.915527f, 11.890222f, 15.371f, 12.072f),
                    PathNode.LineTo(20.371f, 14.072f),
                    PathNode.CurveTo(20.75065f, 14.223675f, 20.99974f, 14.591173f, 21.0f, 15.0f),
                    PathNode.LineTo(21.0f, 19.0f),
                    PathNode.CurveTo(21.0f, 20.657f, 19.657f, 22.0f, 17.94f, 21.998f),
                    PathNode.CurveTo(9.361f, 21.477f, 2.522f, 14.638f, 2.0f, 6.0f),
                    PathNode.CurveTo(2.0f, 4.343146f, 3.343146f, 3.0f, 5.0f, 3.0f),
                    PathNode.LineTo(9.0f, 3.0f),
                    PathNode.CurveTo(9.408827f, 3.000259f, 9.776325f, 3.24935f, 9.928f, 3.629f)
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
                    PathNode.MoveTo(20.707f, 3.293f),
                    PathNode.CurveTo(21.097382f, 3.6835f, 21.097382f, 4.3165f, 20.707f, 4.707f),
                    PathNode.LineTo(19.414f, 6.0f),
                    PathNode.LineTo(20.707f, 7.293f),
                    PathNode.CurveTo(20.966957f, 7.544075f, 21.071213f, 7.915878f, 20.979696f, 8.265508f),
                    PathNode.CurveTo(20.888182f, 8.615137f, 20.615137f, 8.888182f, 20.265507f, 8.979697f),
                    PathNode.CurveTo(19.915878f, 9.071213f, 19.544077f, 8.966956f, 19.293f, 8.707f),
                    PathNode.LineTo(18.0f, 7.414f),
                    PathNode.LineTo(16.707f, 8.707f),
                    PathNode.CurveTo(16.314621f, 9.085972f, 15.690915f, 9.080552f, 15.305182f, 8.694818f),
                    PathNode.CurveTo(14.919448f, 8.309085f, 14.914028f, 7.685379f, 15.293f, 7.293f),
                    PathNode.LineTo(16.586f, 6.0f),
                    PathNode.LineTo(15.293f, 4.707f),
                    PathNode.CurveTo(15.033044f, 4.455926f, 14.928787f, 4.084122f, 15.020303f, 3.734493f),
                    PathNode.CurveTo(15.111818f, 3.384863f, 15.384863f, 3.111818f, 15.734492f, 3.020303f),
                    PathNode.CurveTo(16.084122f, 2.928788f, 16.455925f, 3.033044f, 16.707f, 3.293f),
                    PathNode.LineTo(18.0f, 4.586f),
                    PathNode.LineTo(19.293f, 3.293f),
                    PathNode.CurveTo(19.6835f, 2.902618f, 20.3165f, 2.902618f, 20.707f, 3.293f)
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
        return _phoneX!!
    }

private var _phoneX: ImageVector? = null
