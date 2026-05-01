package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PhoneOff: ImageVector
    get() {
        if (_phoneOff != null) return _phoneOff!!
        _phoneOff = lucideOutlineIcon(
            name = "PhoneOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.1f, 13.9f),
                    PathNode.CurveTo(11.188835f, 14.98849f, 12.44976f, 15.889923f, 13.832f, 16.568f),
                    PathNode.CurveTo(14.257413f, 16.76337f, 14.761431f, 16.63747f, 15.045f, 16.265f),
                    PathNode.LineTo(15.4f, 15.8f),
                    PathNode.CurveTo(15.777709f, 15.296389f, 16.370485f, 15.0f, 17.0f, 15.0f),
                    PathNode.LineTo(20.0f, 15.0f),
                    PathNode.CurveTo(21.10457f, 15.0f, 22.0f, 15.895431f, 22.0f, 17.0f),
                    PathNode.LineTo(22.0f, 20.0f),
                    PathNode.CurveTo(22.0f, 21.10457f, 21.10457f, 22.0f, 20.0f, 22.0f),
                    PathNode.CurveTo(15.226088f, 22.000042f, 10.647687f, 20.103645f, 7.272f, 16.728f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(22.0f, 2.0f),
                    PathNode.LineTo(2.0f, 22.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.76f, 13.582f),
                    PathNode.CurveTo(2.956004f, 10.711646f, 1.999289f, 7.390182f, 2.0f, 4.0f),
                    PathNode.CurveTo(2.0f, 2.895431f, 2.895431f, 2.0f, 4.0f, 2.0f),
                    PathNode.LineTo(7.0f, 2.0f),
                    PathNode.CurveTo(8.10457f, 2.0f, 9.0f, 2.895431f, 9.0f, 4.0f),
                    PathNode.LineTo(9.0f, 7.0f),
                    PathNode.CurveTo(9.0f, 7.629515f, 8.703611f, 8.222291f, 8.2f, 8.6f),
                    PathNode.LineTo(7.732f, 8.951f),
                    PathNode.CurveTo(7.353473f, 9.240028f, 7.231303f, 9.755904f, 7.44f, 10.184f),
                    PathNode.CurveTo(7.518329f, 10.343199f, 7.599677f, 10.500894f, 7.684f, 10.657f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _phoneOff!!
    }

private var _phoneOff: ImageVector? = null
