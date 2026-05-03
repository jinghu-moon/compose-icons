package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CrystalBall: ImageVector
    get() {
        if (_crystalBall != null) return _crystalBall!!
        _crystalBall = tablerOutlineIcon(
            name = "CrystalBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.73f, 17.018f),
                    PathNode.CurveTo(4.222834f, 14.822786f, 3.339037f, 11.303342f, 4.511637f, 8.184071f),
                    PathNode.CurveTo(5.684237f, 5.064799f, 8.667607f, 2.999105f, 12.0f, 2.999105f),
                    PathNode.CurveTo(15.332393f, 2.999105f, 18.315763f, 5.064799f, 19.488363f, 8.184071f),
                    PathNode.CurveTo(20.660963f, 11.303342f, 19.777166f, 14.822786f, 17.27f, 17.018f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 19.0f),
                    PathNode.CurveTo(5.0f, 20.10457f, 5.895431f, 21.0f, 7.0f, 21.0f),
                    PathNode.LineTo(17.0f, 21.0f),
                    PathNode.CurveTo(18.10457f, 21.0f, 19.0f, 20.10457f, 19.0f, 19.0f),
                    PathNode.CurveTo(19.0f, 17.89543f, 18.10457f, 17.0f, 17.0f, 17.0f),
                    PathNode.LineTo(7.0f, 17.0f),
                    PathNode.CurveTo(5.895431f, 17.0f, 5.0f, 17.89543f, 5.0f, 19.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 7.0f),
                    PathNode.CurveTo(9.343145f, 7.0f, 8.0f, 8.343146f, 8.0f, 10.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _crystalBall!!
    }

private var _crystalBall: ImageVector? = null
