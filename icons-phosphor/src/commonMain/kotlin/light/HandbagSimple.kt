package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HandbagSimple: ImageVector
    get() {
        if (_handbagSimple != null) return _handbagSimple!!
        _handbagSimple = phosphorLightIcon(
            name = "HandbagSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(237.9f, 198.36f),
                    PathNode.LineTo(223.65f, 78.36f),
                    PathNode.CurveTo(222.78865f, 71.28813f, 216.7741f, 65.97814f, 209.65f, 66.0f),
                    PathNode.LineTo(174.0f, 66.0f),
                    PathNode.LineTo(174.0f, 64.0f),
                    PathNode.CurveTo(174.0f, 38.594906f, 153.4051f, 18.0f, 128.0f, 18.0f),
                    PathNode.CurveTo(102.5949f, 18.0f, 82.0f, 38.594906f, 82.0f, 64.0f),
                    PathNode.LineTo(82.0f, 66.0f),
                    PathNode.LineTo(46.33f, 66.0f),
                    PathNode.CurveTo(39.2059f, 65.97814f, 33.19135f, 71.28813f, 32.33f, 78.36f),
                    PathNode.LineTo(18.08f, 198.36f),
                    PathNode.CurveTo(17.60951f, 202.3479f, 18.874063f, 206.34584f, 21.552286f, 209.3378f),
                    PathNode.CurveTo(24.23051f, 212.32976f, 28.064537f, 214.02766f, 32.08f, 214.0f),
                    PathNode.LineTo(223.92f, 214.0f),
                    PathNode.CurveTo(227.93546f, 214.02766f, 231.76949f, 212.32976f, 234.44771f, 209.3378f),
                    PathNode.CurveTo(237.12593f, 206.34584f, 238.39047f, 202.3479f, 237.92f, 198.36f),
                    PathNode.Close,
                    PathNode.MoveTo(94.0f, 64.0f),
                    PathNode.CurveTo(94.0f, 45.222317f, 109.22232f, 30.0f, 128.0f, 30.0f),
                    PathNode.CurveTo(146.77768f, 30.0f, 162.0f, 45.222317f, 162.0f, 64.0f),
                    PathNode.LineTo(162.0f, 66.0f),
                    PathNode.LineTo(94.0f, 66.0f),
                    PathNode.Close,
                    PathNode.MoveTo(225.5f, 201.3f),
                    PathNode.CurveTo(225.10057f, 201.75253f, 224.52353f, 202.00818f, 223.92f, 202.0f),
                    PathNode.LineTo(32.08f, 202.0f),
                    PathNode.CurveTo(31.476465f, 202.00818f, 30.899422f, 201.75253f, 30.5f, 201.3f),
                    PathNode.CurveTo(30.120892f, 200.88614f, 29.941856f, 200.3271f, 30.01f, 199.77f),
                    PathNode.LineTo(44.27f, 79.77f),
                    PathNode.CurveTo(44.389374f, 78.732735f, 45.286583f, 77.96183f, 46.33f, 78.0f),
                    PathNode.LineTo(209.67f, 78.0f),
                    PathNode.CurveTo(210.71342f, 77.96183f, 211.61063f, 78.732735f, 211.73f, 79.77f),
                    PathNode.LineTo(225.99f, 199.77f),
                    PathNode.CurveTo(226.05812f, 200.3271f, 225.8791f, 200.88614f, 225.5f, 201.3f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _handbagSimple!!
    }

private var _handbagSimple: ImageVector? = null
