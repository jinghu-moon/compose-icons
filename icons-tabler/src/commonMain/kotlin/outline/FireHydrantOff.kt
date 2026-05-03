package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FireHydrantOff: ImageVector
    get() {
        if (_fireHydrantOff != null) return _fireHydrantOff!!
        _fireHydrantOff = tablerOutlineIcon(
            name = "FireHydrantOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 21.0f),
                    PathNode.LineTo(19.0f, 21.0f)
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
                    PathNode.MoveTo(17.0f, 21.0f),
                    PathNode.LineTo(17.0f, 17.0f),
                    PathNode.MoveTo(19.0f, 15.0f),
                    PathNode.LineTo(19.0f, 13.0f),
                    PathNode.CurveTo(19.0f, 12.447715f, 18.552284f, 12.0f, 18.0f, 12.0f),
                    PathNode.LineTo(17.0f, 12.0f),
                    PathNode.LineTo(17.0f, 8.0f),
                    PathNode.CurveTo(16.999973f, 5.978353f, 15.782528f, 4.155649f, 13.915041f, 3.381342f),
                    PathNode.CurveTo(12.047555f, 2.607034f, 9.897544f, 3.033504f, 8.467f, 4.462f),
                    PathNode.MoveTo(7.08f, 7.1f),
                    PathNode.CurveTo(7.026388f, 7.396993f, 6.999614f, 7.698208f, 7.0f, 8.0f),
                    PathNode.LineTo(7.0f, 12.0f),
                    PathNode.LineTo(6.0f, 12.0f),
                    PathNode.CurveTo(5.447716f, 12.0f, 5.0f, 12.447715f, 5.0f, 13.0f),
                    PathNode.LineTo(5.0f, 15.0f),
                    PathNode.CurveTo(5.0f, 15.552285f, 5.447716f, 16.0f, 6.0f, 16.0f),
                    PathNode.LineTo(7.0f, 16.0f),
                    PathNode.LineTo(7.0f, 21.0f)
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
                    PathNode.MoveTo(12.0f, 12.0f),
                    PathNode.CurveTo(10.895431f, 12.0f, 10.0f, 12.895431f, 10.0f, 14.0f),
                    PathNode.CurveTo(10.0f, 15.104569f, 10.895431f, 16.0f, 12.0f, 16.0f),
                    PathNode.CurveTo(13.104569f, 16.0f, 14.0f, 15.104569f, 14.0f, 14.0f)
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
                    PathNode.MoveTo(6.0f, 8.0f),
                    PathNode.LineTo(8.0f, 8.0f),
                    PathNode.MoveTo(12.0f, 8.0f),
                    PathNode.LineTo(18.0f, 8.0f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _fireHydrantOff!!
    }

private var _fireHydrantOff: ImageVector? = null
