package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.OrangeSlice: ImageVector
    get() {
        if (_orangeSlice != null) return _orangeSlice!!
        _orangeSlice = phosphorBoldIcon(
            name = "OrangeSlice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.0f, 76.0f),
                    PathNode.LineTo(12.0f, 76.0f),
                    PathNode.CurveTo(5.372583f, 76.0f, 0f, 81.37258f, 0f, 88.0f),
                    PathNode.LineTo(0f, 92.0f),
                    PathNode.CurveTo(0f, 162.69244f, 57.307552f, 220.0f, 128.0f, 220.0f),
                    PathNode.CurveTo(198.69244f, 220.0f, 256.0f, 162.69244f, 256.0f, 92.0f),
                    PathNode.LineTo(256.0f, 88.0f),
                    PathNode.CurveTo(256.0f, 81.37258f, 250.62741f, 76.0f, 244.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.52f, 100.0f),
                    PathNode.LineTo(107.21f, 100.0f),
                    PathNode.LineTo(84.67f, 139.05f),
                    PathNode.CurveTo(73.5461f, 128.82628f, 66.40662f, 114.9902f, 64.52f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 112.0f),
                    PathNode.LineTo(150.94f, 151.73f),
                    PathNode.CurveTo(136.17647f, 157.42296f, 119.82354f, 157.42296f, 105.06f, 151.73f),
                    PathNode.Close,
                    PathNode.MoveTo(171.33f, 139.05f),
                    PathNode.LineTo(148.79f, 100.0f),
                    PathNode.LineTo(191.48f, 100.0f),
                    PathNode.CurveTo(189.59337f, 114.9902f, 182.4539f, 128.82628f, 171.33f, 139.05f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 196.0f),
                    PathNode.CurveTo(73.69056f, 195.93188f, 28.54981f, 154.14294f, 24.3f, 100.0f),
                    PathNode.LineTo(40.37f, 100.0f),
                    PathNode.CurveTo(44.535965f, 145.28645f, 82.52234f, 179.9388f, 128.0f, 179.9388f),
                    PathNode.CurveTo(173.47766f, 179.9388f, 211.46404f, 145.28645f, 215.63f, 100.0f),
                    PathNode.LineTo(231.7f, 100.0f),
                    PathNode.CurveTo(227.4502f, 154.14294f, 182.30943f, 195.93188f, 128.0f, 196.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _orangeSlice!!
    }

private var _orangeSlice: ImageVector? = null
