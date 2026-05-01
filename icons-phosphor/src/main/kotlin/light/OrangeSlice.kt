package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.OrangeSlice: ImageVector
    get() {
        if (_orangeSlice != null) return _orangeSlice!!
        _orangeSlice = phosphorLightIcon(
            name = "OrangeSlice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 82.0f),
                    PathNode.LineTo(8.0f, 82.0f),
                    PathNode.CurveTo(4.686292f, 82.0f, 2.0f, 84.686295f, 2.0f, 88.0f),
                    PathNode.CurveTo(2.0f, 157.58788f, 58.41212f, 214.0f, 128.0f, 214.0f),
                    PathNode.CurveTo(197.58788f, 214.0f, 254.0f, 157.58788f, 254.0f, 88.0f),
                    PathNode.CurveTo(254.0f, 84.686295f, 251.3137f, 82.0f, 248.0f, 82.0f),
                    PathNode.Close,
                    PathNode.MoveTo(74.46f, 150.0f),
                    PathNode.LineTo(122.0f, 102.48f),
                    PathNode.LineTo(122.0f, 169.76f),
                    PathNode.CurveTo(104.43725f, 168.47162f, 87.76152f, 161.54036f, 74.46f, 150.0f),
                    PathNode.Close,
                    PathNode.MoveTo(66.0f, 141.54f),
                    PathNode.CurveTo(54.459644f, 128.23848f, 47.528378f, 111.56275f, 46.24f, 94.0f),
                    PathNode.LineTo(113.52f, 94.0f),
                    PathNode.Close,
                    PathNode.MoveTo(134.0f, 102.48f),
                    PathNode.LineTo(181.54f, 150.0f),
                    PathNode.CurveTo(168.23848f, 161.54036f, 151.56276f, 168.47162f, 134.0f, 169.76f),
                    PathNode.Close,
                    PathNode.MoveTo(190.0f, 141.54f),
                    PathNode.LineTo(142.48f, 94.0f),
                    PathNode.LineTo(209.76f, 94.0f),
                    PathNode.CurveTo(208.47162f, 111.56275f, 201.54036f, 128.23848f, 190.0f, 141.54f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 202.0f),
                    PathNode.CurveTo(67.40009f, 201.92847f, 17.419846f, 154.5122f, 14.16f, 94.0f),
                    PathNode.LineTo(34.16f, 94.0f),
                    PathNode.CurveTo(37.389626f, 143.43016f, 78.424446f, 181.87137f, 127.96f, 181.87137f),
                    PathNode.CurveTo(177.49554f, 181.87137f, 218.53038f, 143.43016f, 221.76f, 94.0f),
                    PathNode.LineTo(241.76f, 94.0f),
                    PathNode.CurveTo(238.50188f, 154.4814f, 188.56898f, 201.88605f, 128.0f, 202.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _orangeSlice!!
    }

private var _orangeSlice: ImageVector? = null
