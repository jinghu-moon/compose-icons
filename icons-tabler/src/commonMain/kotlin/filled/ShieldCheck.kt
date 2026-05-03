package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ShieldCheck: ImageVector
    get() {
        if (_shieldCheck != null) return _shieldCheck!!
        _shieldCheck = tablerFilledIcon(
            name = "ShieldCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.998f, 2.0f),
                    PathNode.LineTo(12.116f, 2.007f),
                    PathNode.LineTo(12.175f, 2.015f),
                    PathNode.LineTo(12.236f, 2.028f),
                    PathNode.LineTo(12.347f, 2.062f),
                    PathNode.CurveTo(12.423666f, 2.090263f, 12.496551f, 2.127881f, 12.564f, 2.174f),
                    PathNode.LineTo(12.668f, 2.256f),
                    PathNode.LineTo(12.923f, 2.474f),
                    PathNode.CurveTo(14.94031f, 4.149565f, 17.489864f, 5.049303f, 20.112f, 5.011f),
                    PathNode.LineTo(20.454f, 5.001f),
                    PathNode.CurveTo(20.914154f, 4.980007f, 21.32912f, 5.276058f, 21.459f, 5.718f),
                    PathNode.CurveTo(22.451826f, 9.095279f, 22.032593f, 12.730811f, 20.297144f, 15.793478f),
                    PathNode.CurveTo(18.561699f, 18.856146f, 15.658408f, 21.084097f, 12.251f, 21.968f),
                    PathNode.CurveTo(12.086389f, 22.010683f, 11.913611f, 22.010683f, 11.749f, 21.968f),
                    PathNode.CurveTo(8.341408f, 21.084318f, 5.437877f, 18.856457f, 3.702225f, 15.793764f),
                    PathNode.CurveTo(1.966573f, 12.731071f, 1.547205f, 9.095416f, 2.54f, 5.718f),
                    PathNode.CurveTo(2.669881f, 5.276058f, 3.084847f, 4.980007f, 3.545f, 5.001f),
                    PathNode.CurveTo(6.282463f, 5.126134f, 8.968063f, 4.22499f, 11.076f, 2.474f),
                    PathNode.LineTo(11.339f, 2.249f),
                    PathNode.LineTo(11.435f, 2.174f),
                    PathNode.CurveTo(11.50245f, 2.127881f, 11.575335f, 2.090263f, 11.652f, 2.062f),
                    PathNode.LineTo(11.764f, 2.028f),
                    PathNode.CurveTo(11.803192f, 2.018534f, 11.842936f, 2.01152f, 11.883f, 2.007f),
                    PathNode.LineTo(11.998f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(15.708f, 9.293f),
                    PathNode.CurveTo(15.520432f, 9.105223f, 15.265909f, 8.999713f, 15.0005f, 8.999713f),
                    PathNode.CurveTo(14.735091f, 8.999713f, 14.480568f, 9.105223f, 14.293f, 9.293f),
                    PathNode.LineTo(11.0f, 12.585f),
                    PathNode.LineTo(9.707f, 11.293f),
                    PathNode.LineTo(9.613f, 11.21f),
                    PathNode.CurveTo(9.19587f, 10.887465f, 8.599978f, 10.94423f, 8.251249f, 11.339722f),
                    PathNode.CurveTo(7.902519f, 11.735212f, 7.920789f, 12.333524f, 8.293f, 12.707f),
                    PathNode.LineTo(10.293f, 14.707f),
                    PathNode.LineTo(10.387f, 14.79f),
                    PathNode.CurveTo(10.785086f, 15.098803f, 11.350732f, 15.063235f, 11.707f, 14.707f),
                    PathNode.LineTo(15.707f, 10.707f),
                    PathNode.LineTo(15.79f, 10.613f),
                    PathNode.CurveTo(16.098803f, 10.214914f, 16.063234f, 9.649268f, 15.707f, 9.293f),
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
        return _shieldCheck!!
    }

private var _shieldCheck: ImageVector? = null
