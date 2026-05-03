package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EscalatorUp: ImageVector
    get() {
        if (_escalatorUp != null) return _escalatorUp!!
        _escalatorUp = tablerOutlineIcon(
            name = "EscalatorUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.5f, 7.0f),
                    PathNode.LineTo(16.828f, 7.0f),
                    PathNode.CurveTo(16.297611f, 7.000114f, 15.788985f, 7.210902f, 15.414f, 7.586f),
                    PathNode.LineTo(7.0f, 16.0f),
                    PathNode.LineTo(4.5f, 16.0f),
                    PathNode.CurveTo(3.119288f, 16.0f, 2.0f, 17.119287f, 2.0f, 18.5f),
                    PathNode.CurveTo(2.0f, 19.880713f, 3.119288f, 21.0f, 4.5f, 21.0f),
                    PathNode.LineTo(8.172f, 21.0f),
                    PathNode.CurveTo(8.70239f, 20.999887f, 9.211015f, 20.789099f, 9.586f, 20.414f),
                    PathNode.LineTo(18.0f, 12.0f),
                    PathNode.LineTo(19.5f, 12.0f),
                    PathNode.CurveTo(20.880713f, 12.0f, 22.0f, 10.880712f, 22.0f, 9.5f),
                    PathNode.CurveTo(22.0f, 8.119289f, 20.880713f, 7.0f, 19.5f, 7.0f)
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
                    PathNode.MoveTo(6.0f, 10.0f),
                    PathNode.LineTo(6.0f, 3.0f)
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
                    PathNode.MoveTo(3.0f, 6.0f),
                    PathNode.LineTo(6.0f, 3.0f),
                    PathNode.LineTo(9.0f, 6.0f)
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
        return _escalatorUp!!
    }

private var _escalatorUp: ImageVector? = null
