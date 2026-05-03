package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Trolley: ImageVector
    get() {
        if (_trolley != null) return _trolley!!
        _trolley = tablerFilledIcon(
            name = "Trolley",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.555f, 4.168f),
                    PathNode.CurveTo(20.775686f, 4.315173f, 20.928858f, 4.543998f, 20.980808f, 4.804122f),
                    PathNode.CurveTo(21.032757f, 5.064245f, 20.979227f, 5.33435f, 20.832f, 5.555f),
                    PathNode.LineTo(18.211f, 9.487f),
                    PathNode.LineTo(19.447f, 10.106f),
                    PathNode.CurveTo(19.92252f, 10.362426f, 20.108395f, 10.950176f, 19.866785f, 11.433393f),
                    PathNode.CurveTo(19.625177f, 11.91661f, 19.043453f, 12.12056f, 18.553f, 11.894f),
                    PathNode.LineTo(17.093f, 11.164f),
                    PathNode.LineTo(13.217f, 16.979f),
                    PathNode.CurveTo(14.120226f, 17.969765f, 14.256429f, 19.439554f, 13.550645f, 20.579424f),
                    PathNode.CurveTo(12.844861f, 21.719294f, 11.468446f, 22.252499f, 10.178949f, 21.885576f),
                    PathNode.CurveTo(8.889453f, 21.518652f, 7.999948f, 20.340685f, 8.0f, 19.0f),
                    PathNode.LineTo(8.005f, 18.824f),
                    PathNode.QuadTo(8.013f, 18.689f, 8.032f, 18.557f),
                    PathNode.LineTo(5.445f, 16.832f),
                    PathNode.CurveTo(4.985499f, 16.525482f, 4.861482f, 15.904501f, 5.168f, 15.445f),
                    PathNode.CurveTo(5.474518f, 14.985499f, 6.095499f, 14.861482f, 6.555f, 15.168f),
                    PathNode.LineTo(8.979f, 16.783f),
                    PathNode.CurveTo(9.645043f, 16.17393f, 10.550567f, 15.898304f, 11.443f, 16.033f),
                    PathNode.LineTo(19.168f, 4.445f),
                    PathNode.CurveTo(19.315174f, 4.224314f, 19.543999f, 4.071142f, 19.804123f, 4.019192f),
                    PathNode.CurveTo(20.064243f, 3.967243f, 20.33435f, 4.020772f, 20.555f, 4.168f),
                    PathNode.MoveTo(9.988f, 3.769f),
                    PathNode.LineTo(10.128f, 3.851f),
                    PathNode.LineTo(13.435f, 5.955f),
                    PathNode.CurveTo(13.951432f, 6.283469f, 14.315648f, 6.804226f, 14.447027f, 7.402f),
                    PathNode.CurveTo(14.578405f, 7.999773f, 14.466111f, 8.625258f, 14.135f, 9.14f),
                    PathNode.LineTo(11.041f, 13.95f),
                    PathNode.CurveTo(10.35675f, 15.015785f, 8.939615f, 15.327823f, 7.871f, 14.648f),
                    PathNode.LineTo(4.565f, 12.544f),
                    PathNode.CurveTo(4.048568f, 12.215531f, 3.684352f, 11.694774f, 3.552973f, 11.097f),
                    PathNode.CurveTo(3.421594f, 10.499227f, 3.533889f, 9.873742f, 3.865f, 9.359f),
                    PathNode.LineTo(6.959f, 4.549f),
                    PathNode.CurveTo(7.609279f, 3.536822f, 8.929726f, 3.196793f, 9.988f, 3.769f)
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
        return _trolley!!
    }

private var _trolley: ImageVector? = null
