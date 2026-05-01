package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BellRinging2: ImageVector
    get() {
        if (_bellRinging2 != null) return _bellRinging2!!
        _bellRinging2 = tablerFilledIcon(
            name = "BellRinging2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.63f, 17.531f),
                    PathNode.CurveTo(10.242f, 18.142f, 9.841f, 19.189f, 8.978f, 19.237f),
                    PathNode.CurveTo(7.841598f, 19.300913f, 6.731952f, 18.876701f, 5.928f, 18.071f),
                    PathNode.CurveTo(5.122932f, 17.26711f, 4.699115f, 16.15791f, 4.763f, 15.022f),
                    PathNode.CurveTo(4.809f, 14.196f, 5.768f, 13.794f, 6.387f, 14.296f),
                    PathNode.LineTo(6.469f, 14.37f),
                    PathNode.LineTo(9.63f, 17.53f),
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
                    PathNode.MoveTo(20.071f, 3.929f),
                    PathNode.CurveTo(21.031f, 4.889f, 21.205f, 6.339f, 20.591f, 7.476f),
                    PathNode.LineTo(20.501f, 7.629f),
                    PathNode.LineTo(20.477f, 7.665f),
                    PathNode.CurveTo(21.166252f, 10.138273f, 20.62858f, 12.792052f, 19.031f, 14.802f),
                    PathNode.LineTo(18.848f, 15.025f),
                    PathNode.LineTo(18.657f, 15.243f),
                    PathNode.LineTo(16.584f, 17.315f),
                    PathNode.LineTo(16.504f, 17.427f),
                    PathNode.CurveTo(16.079697f, 18.044333f, 15.901696f, 18.79807f, 16.005f, 19.54f),
                    PathNode.LineTo(16.04f, 19.741f),
                    PathNode.LineTo(16.085f, 19.926f),
                    PathNode.CurveTo(16.349f, 20.878f, 15.232f, 21.571f, 14.5f, 20.977f),
                    PathNode.LineTo(14.414f, 20.899f),
                    PathNode.LineTo(3.101f, 9.586f),
                    PathNode.CurveTo(2.374f, 8.859f, 3.084f, 7.641f, 4.074f, 7.915f),
                    PathNode.CurveTo(4.928164f, 8.151839f, 5.84334f, 7.998821f, 6.574f, 7.497f),
                    PathNode.LineTo(6.69f, 7.411f),
                    PathNode.LineTo(8.791f, 5.311f),
                    PathNode.CurveTo(10.754082f, 3.524046f, 13.475723f, 2.827246f, 16.056f, 3.451f),
                    PathNode.LineTo(16.334f, 3.522f),
                    PathNode.LineTo(16.371f, 3.499f),
                    PathNode.CurveTo(17.442127f, 2.837192f, 18.812374f, 2.913849f, 19.803f, 3.691f),
                    PathNode.LineTo(19.943f, 3.808f),
                    PathNode.LineTo(20.071f, 3.928f),
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
        return _bellRinging2!!
    }

private var _bellRinging2: ImageVector? = null
