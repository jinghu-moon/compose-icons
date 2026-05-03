package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.EaseInControlPoint: ImageVector
    get() {
        if (_easeInControlPoint != null) return _easeInControlPoint!!
        _easeInControlPoint = tablerFilledIcon(
            name = "EaseInControlPoint",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 16.0f),
                    PathNode.CurveTo(20.52557f, 16.000292f, 21.80799f, 17.145454f, 21.980242f, 18.661268f),
                    PathNode.CurveTo(22.152496f, 20.177084f, 21.159723f, 21.580793f, 19.673115f, 21.923378f),
                    PathNode.CurveTo(18.186508f, 22.265965f, 16.679523f, 21.438322f, 16.171f, 20.0f),
                    PathNode.LineTo(15.0f, 20.0f),
                    PathNode.CurveTo(14.447715f, 20.0f, 14.0f, 19.552284f, 14.0f, 19.0f),
                    PathNode.CurveTo(14.0f, 18.447716f, 14.447715f, 18.0f, 15.0f, 18.0f),
                    PathNode.LineTo(16.17f, 18.0f),
                    PathNode.CurveTo(16.593975f, 16.800816f, 17.728073f, 15.999333f, 19.0f, 16.0f),
                    PathNode.MoveTo(21.53f, 2.152f),
                    PathNode.CurveTo(21.754904f, 2.292565f, 21.914757f, 2.516715f, 21.974394f, 2.77514f),
                    PathNode.CurveTo(22.03403f, 3.033565f, 21.988565f, 3.305097f, 21.848f, 3.53f),
                    PathNode.LineTo(21.562f, 3.975f),
                    PathNode.LineTo(21.389f, 4.239f),
                    PathNode.CurveTo(20.978384f, 4.858378f, 20.558336f, 5.471449f, 20.129f, 6.078f),
                    PathNode.CurveTo(18.765541f, 8.010738f, 17.305002f, 9.873126f, 15.753f, 11.658f),
                    PathNode.CurveTo(12.958f, 14.853f, 10.209f, 17.296f, 7.582f, 18.698f),
                    PathNode.CurveTo(5.989f, 19.546f, 4.459f, 20.0f, 3.0f, 20.0f),
                    PathNode.CurveTo(2.447715f, 20.0f, 2.0f, 19.552284f, 2.0f, 19.0f),
                    PathNode.CurveTo(2.0f, 18.447716f, 2.447715f, 18.0f, 3.0f, 18.0f),
                    PathNode.CurveTo(4.097f, 18.0f, 5.317f, 17.639f, 6.64f, 16.932f),
                    PathNode.CurveTo(9.013f, 15.667f, 11.598f, 13.37f, 14.247f, 10.342f),
                    PathNode.CurveTo(15.754313f, 8.608285f, 17.172798f, 6.799299f, 18.497f, 4.922f),
                    PathNode.CurveTo(18.837538f, 4.440971f, 19.171898f, 3.955597f, 19.5f, 3.466f),
                    PathNode.LineTo(19.955f, 2.776f),
                    PathNode.QuadTo(20.088f, 2.572f, 20.151f, 2.47f),
                    PathNode.CurveTo(20.291565f, 2.245096f, 20.515715f, 2.085243f, 20.77414f, 2.025606f),
                    PathNode.CurveTo(21.032566f, 1.96597f, 21.304096f, 2.011435f, 21.529f, 2.152f),
                    PathNode.MoveTo(12.0f, 18.0f),
                    PathNode.CurveTo(12.552285f, 18.0f, 13.0f, 18.447716f, 13.0f, 19.0f),
                    PathNode.CurveTo(13.0f, 19.552284f, 12.552285f, 20.0f, 12.0f, 20.0f),
                    PathNode.LineTo(10.0f, 20.0f),
                    PathNode.CurveTo(9.447715f, 20.0f, 9.0f, 19.552284f, 9.0f, 19.0f),
                    PathNode.CurveTo(9.0f, 18.447716f, 9.447715f, 18.0f, 10.0f, 18.0f),
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
        return _easeInControlPoint!!
    }

private var _easeInControlPoint: ImageVector? = null
