package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Signpost: ImageVector
    get() {
        if (_signpost != null) return _signpost!!
        _signpost = phosphorBoldIcon(
            name = "Signpost",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.92f, 104.0f),
                    PathNode.LineTo(215.3f, 66.62f),
                    PathNode.CurveTo(211.5084f, 62.40751f, 206.10757f, 60.001488f, 200.44f, 60.0f),
                    PathNode.LineTo(140.0f, 60.0f),
                    PathNode.LineTo(140.0f, 32.0f),
                    PathNode.CurveTo(140.0f, 25.372583f, 134.62741f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(121.37258f, 20.0f, 116.0f, 25.372583f, 116.0f, 32.0f),
                    PathNode.LineTo(116.0f, 60.0f),
                    PathNode.LineTo(40.0f, 60.0f),
                    PathNode.CurveTo(28.954306f, 60.0f, 20.0f, 68.95431f, 20.0f, 80.0f),
                    PathNode.LineTo(20.0f, 144.0f),
                    PathNode.CurveTo(20.0f, 155.0457f, 28.954306f, 164.0f, 40.0f, 164.0f),
                    PathNode.LineTo(116.0f, 164.0f),
                    PathNode.LineTo(116.0f, 224.0f),
                    PathNode.CurveTo(116.0f, 230.62741f, 121.37258f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(134.62741f, 236.0f, 140.0f, 230.62741f, 140.0f, 224.0f),
                    PathNode.LineTo(140.0f, 164.0f),
                    PathNode.LineTo(200.44f, 164.0f),
                    PathNode.CurveTo(206.10757f, 163.9985f, 211.5084f, 161.5925f, 215.3f, 157.38f),
                    PathNode.LineTo(248.92f, 120.0f),
                    PathNode.CurveTo(252.99431f, 115.444786f, 252.99431f, 108.555214f, 248.92f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(198.66f, 140.0f),
                    PathNode.LineTo(44.0f, 140.0f),
                    PathNode.LineTo(44.0f, 84.0f),
                    PathNode.LineTo(198.66f, 84.0f),
                    PathNode.LineTo(223.86f, 112.0f),
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
        return _signpost!!
    }

private var _signpost: ImageVector? = null
