package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PhoneCheck: ImageVector
    get() {
        if (_phoneCheck != null) return _phoneCheck!!
        _phoneCheck = tablerFilledIcon(
            name = "PhoneCheck",
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
                    PathNode.MoveTo(21.707f, 3.293f),
                    PathNode.CurveTo(22.097382f, 3.6835f, 22.097382f, 4.3165f, 21.707f, 4.707f),
                    PathNode.LineTo(17.707f, 8.707f),
                    PathNode.CurveTo(17.3165f, 9.097382f, 16.6835f, 9.097382f, 16.293f, 8.707f),
                    PathNode.LineTo(14.293f, 6.707f),
                    PathNode.CurveTo(14.033044f, 6.455926f, 13.928787f, 6.084122f, 14.020303f, 5.734493f),
                    PathNode.CurveTo(14.111818f, 5.384864f, 14.384863f, 5.111819f, 14.734492f, 5.020303f),
                    PathNode.CurveTo(15.084122f, 4.928787f, 15.455926f, 5.033044f, 15.707f, 5.293f),
                    PathNode.LineTo(17.0f, 6.586f),
                    PathNode.LineTo(20.293f, 3.293f),
                    PathNode.CurveTo(20.6835f, 2.902618f, 21.3165f, 2.902618f, 21.707f, 3.293f)
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
        return _phoneCheck!!
    }

private var _phoneCheck: ImageVector? = null
