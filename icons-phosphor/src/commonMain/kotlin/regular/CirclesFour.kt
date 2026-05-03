package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CirclesFour: ImageVector
    get() {
        if (_circlesFour != null) return _circlesFour!!
        _circlesFour = phosphorRegularIcon(
            name = "CirclesFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(80.0f, 40.0f),
                    PathNode.CurveTo(57.90861f, 40.0f, 40.0f, 57.90861f, 40.0f, 80.0f),
                    PathNode.CurveTo(40.0f, 102.09139f, 57.90861f, 120.0f, 80.0f, 120.0f),
                    PathNode.CurveTo(102.09139f, 120.0f, 120.0f, 102.09139f, 120.0f, 80.0f),
                    PathNode.CurveTo(120.0f, 57.90861f, 102.09139f, 40.0f, 80.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 104.0f),
                    PathNode.CurveTo(66.74516f, 104.0f, 56.0f, 93.25484f, 56.0f, 80.0f),
                    PathNode.CurveTo(56.0f, 66.74516f, 66.74516f, 56.0f, 80.0f, 56.0f),
                    PathNode.CurveTo(93.25484f, 56.0f, 104.0f, 66.74516f, 104.0f, 80.0f),
                    PathNode.CurveTo(104.0f, 93.25484f, 93.25484f, 104.0f, 80.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 120.0f),
                    PathNode.CurveTo(198.09138f, 120.0f, 216.0f, 102.09139f, 216.0f, 80.0f),
                    PathNode.CurveTo(216.0f, 57.90861f, 198.09138f, 40.0f, 176.0f, 40.0f),
                    PathNode.CurveTo(153.90862f, 40.0f, 136.0f, 57.90861f, 136.0f, 80.0f),
                    PathNode.CurveTo(136.0f, 102.09139f, 153.90862f, 120.0f, 176.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 56.0f),
                    PathNode.CurveTo(189.25484f, 56.0f, 200.0f, 66.74516f, 200.0f, 80.0f),
                    PathNode.CurveTo(200.0f, 93.25484f, 189.25484f, 104.0f, 176.0f, 104.0f),
                    PathNode.CurveTo(162.74516f, 104.0f, 152.0f, 93.25484f, 152.0f, 80.0f),
                    PathNode.CurveTo(152.0f, 66.74516f, 162.74516f, 56.0f, 176.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 136.0f),
                    PathNode.CurveTo(57.90861f, 136.0f, 40.0f, 153.90862f, 40.0f, 176.0f),
                    PathNode.CurveTo(40.0f, 198.09138f, 57.90861f, 216.0f, 80.0f, 216.0f),
                    PathNode.CurveTo(102.09139f, 216.0f, 120.0f, 198.09138f, 120.0f, 176.0f),
                    PathNode.CurveTo(120.0f, 153.90862f, 102.09139f, 136.0f, 80.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 200.0f),
                    PathNode.CurveTo(66.74516f, 200.0f, 56.0f, 189.25484f, 56.0f, 176.0f),
                    PathNode.CurveTo(56.0f, 162.74516f, 66.74516f, 152.0f, 80.0f, 152.0f),
                    PathNode.CurveTo(93.25484f, 152.0f, 104.0f, 162.74516f, 104.0f, 176.0f),
                    PathNode.CurveTo(104.0f, 189.25484f, 93.25484f, 200.0f, 80.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 136.0f),
                    PathNode.CurveTo(153.90862f, 136.0f, 136.0f, 153.90862f, 136.0f, 176.0f),
                    PathNode.CurveTo(136.0f, 198.09138f, 153.90862f, 216.0f, 176.0f, 216.0f),
                    PathNode.CurveTo(198.09138f, 216.0f, 216.0f, 198.09138f, 216.0f, 176.0f),
                    PathNode.CurveTo(216.0f, 153.90862f, 198.09138f, 136.0f, 176.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 200.0f),
                    PathNode.CurveTo(162.74516f, 200.0f, 152.0f, 189.25484f, 152.0f, 176.0f),
                    PathNode.CurveTo(152.0f, 162.74516f, 162.74516f, 152.0f, 176.0f, 152.0f),
                    PathNode.CurveTo(189.25484f, 152.0f, 200.0f, 162.74516f, 200.0f, 176.0f),
                    PathNode.CurveTo(200.0f, 189.25484f, 189.25484f, 200.0f, 176.0f, 200.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _circlesFour!!
    }

private var _circlesFour: ImageVector? = null
