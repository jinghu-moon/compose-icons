package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LinkSimpleBreak: ImageVector
    get() {
        if (_linkSimpleBreak != null) return _linkSimpleBreak!!
        _linkSimpleBreak = phosphorBoldIcon(
            name = "LinkSimpleBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(218.45f, 122.43f),
                    PathNode.LineTo(188.37f, 152.49f),
                    PathNode.CurveTo(183.67558f, 157.18442f, 176.06442f, 157.18442f, 171.37f, 152.49f),
                    PathNode.CurveTo(166.67558f, 147.79558f, 166.67558f, 140.18442f, 171.37f, 135.49f),
                    PathNode.LineTo(201.45f, 105.42f),
                    PathNode.CurveTo(215.51117f, 91.35607f, 215.50893f, 68.55617f, 201.44499f, 54.495f),
                    PathNode.CurveTo(187.38107f, 40.43383f, 164.58118f, 40.43607f, 150.52f, 54.5f),
                    PathNode.LineTo(120.48f, 84.59f),
                    PathNode.CurveTo(115.785576f, 89.284424f, 108.17442f, 89.284424f, 103.48f, 84.59f),
                    PathNode.CurveTo(98.78558f, 79.89558f, 98.78558f, 72.284424f, 103.48f, 67.59f),
                    PathNode.LineTo(133.55f, 37.53f),
                    PathNode.CurveTo(156.98895f, 14.093797f, 194.9888f, 14.096036f, 218.425f, 37.535f),
                    PathNode.CurveTo(241.8612f, 60.973965f, 241.85896f, 98.97379f, 218.42f, 122.41f),
                    PathNode.Close,
                    PathNode.MoveTo(135.52f, 171.43f),
                    PathNode.LineTo(105.45f, 201.51f),
                    PathNode.CurveTo(91.38607f, 215.57117f, 68.58617f, 215.56892f, 54.525f, 201.505f),
                    PathNode.CurveTo(40.463833f, 187.44107f, 40.46607f, 164.64117f, 54.53f, 150.58f),
                    PathNode.LineTo(84.59f, 120.51f),
                    PathNode.CurveTo(89.284424f, 115.81558f, 89.284424f, 108.20442f, 84.59f, 103.51f),
                    PathNode.CurveTo(79.89558f, 98.81558f, 72.284424f, 98.81558f, 67.59f, 103.51f),
                    PathNode.LineTo(37.55f, 133.58f),
                    PathNode.CurveTo(14.113797f, 157.01897f, 14.116035f, 195.0188f, 37.555f, 218.455f),
                    PathNode.CurveTo(60.993965f, 241.8912f, 98.9938f, 241.88896f, 122.43f, 218.45f),
                    PathNode.LineTo(152.49f, 188.38f),
                    PathNode.CurveTo(157.18442f, 183.68558f, 157.18442f, 176.07442f, 152.49f, 171.38f),
                    PathNode.CurveTo(147.79558f, 166.68558f, 140.18442f, 166.68558f, 135.49f, 171.38f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _linkSimpleBreak!!
    }

private var _linkSimpleBreak: ImageVector? = null
