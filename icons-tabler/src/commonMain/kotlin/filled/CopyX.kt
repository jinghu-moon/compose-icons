package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CopyX: ImageVector
    get() {
        if (_copyX != null) return _copyX!!
        _copyX = tablerFilledIcon(
            name = "CopyX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.333f, 6.0f),
                    PathNode.CurveTo(20.358229f, 6.0f, 22.0f, 7.641772f, 22.0f, 9.667f),
                    PathNode.LineTo(22.0f, 18.333f),
                    PathNode.CurveTo(22.0f, 20.358229f, 20.358229f, 22.0f, 18.333f, 22.0f),
                    PathNode.LineTo(9.667f, 22.0f),
                    PathNode.CurveTo(7.641772f, 22.0f, 6.0f, 20.358229f, 6.0f, 18.333f),
                    PathNode.LineTo(6.0f, 9.667f),
                    PathNode.CurveTo(6.0f, 7.641772f, 7.641772f, 6.0f, 9.667f, 6.0f),
                    PathNode.Close,
                    PathNode.MoveTo(15.0f, 2.0f),
                    PathNode.CurveTo(16.094f, 2.0f, 16.828f, 2.533f, 17.374f, 3.514f),
                    PathNode.CurveTo(17.64241f, 3.996697f, 17.468697f, 4.60559f, 16.986f, 4.874f),
                    PathNode.CurveTo(16.503304f, 5.142411f, 15.89441f, 4.968697f, 15.626f, 4.486f),
                    PathNode.CurveTo(15.405f, 4.088f, 15.284f, 4.0f, 15.0f, 4.0f),
                    PathNode.LineTo(5.0f, 4.0f),
                    PathNode.CurveTo(4.452f, 4.0f, 4.0f, 4.452f, 4.0f, 5.0f),
                    PathNode.LineTo(4.0f, 14.998f),
                    PathNode.CurveTo(4.0f, 15.318f, 4.154f, 15.616f, 4.407f, 15.803f),
                    PathNode.LineTo(4.507f, 15.868f),
                    PathNode.CurveTo(4.986936f, 16.14138f, 5.154381f, 16.752064f, 4.881f, 17.232f),
                    PathNode.CurveTo(4.60762f, 17.711937f, 3.996935f, 17.879381f, 3.517f, 17.606f),
                    PathNode.CurveTo(2.579794f, 17.073034f, 2.000653f, 16.07815f, 2.0f, 15.0f),
                    PathNode.LineTo(2.0f, 5.0f),
                    PathNode.CurveTo(2.0f, 3.348f, 3.348f, 2.0f, 5.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(15.8f, 10.786f),
                    PathNode.LineTo(13.963f, 12.585f),
                    PathNode.LineTo(12.214f, 10.8f),
                    PathNode.CurveTo(11.861274f, 10.440341f, 11.296086f, 10.399205f, 10.895f, 10.704f),
                    PathNode.LineTo(10.8f, 10.786f),
                    PathNode.CurveTo(10.405725f, 11.172624f, 10.399457f, 11.805646f, 10.786f, 12.2f),
                    PathNode.LineTo(12.535f, 13.985f),
                    PathNode.LineTo(10.7f, 15.785f),
                    PathNode.CurveTo(10.339764f, 16.137861f, 10.29861f, 16.70373f, 10.604f, 17.105f),
                    PathNode.LineTo(10.686f, 17.2f),
                    PathNode.CurveTo(11.072623f, 17.594275f, 11.705646f, 17.600542f, 12.1f, 17.214f),
                    PathNode.LineTo(13.936f, 15.414f),
                    PathNode.LineTo(15.686f, 17.2f),
                    PathNode.CurveTo(16.038725f, 17.55966f, 16.603914f, 17.600796f, 17.005f, 17.296f),
                    PathNode.LineTo(17.1f, 17.214f),
                    PathNode.CurveTo(17.494276f, 16.827377f, 17.500544f, 16.194355f, 17.114f, 15.8f),
                    PathNode.LineTo(15.364f, 14.014f),
                    PathNode.LineTo(17.2f, 12.214f),
                    PathNode.CurveTo(17.55966f, 11.861274f, 17.600796f, 11.296086f, 17.296f, 10.895f),
                    PathNode.LineTo(17.214f, 10.8f),
                    PathNode.CurveTo(16.827377f, 10.405725f, 16.194355f, 10.399457f, 15.8f, 10.786f)
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
        return _copyX!!
    }

private var _copyX: ImageVector? = null
