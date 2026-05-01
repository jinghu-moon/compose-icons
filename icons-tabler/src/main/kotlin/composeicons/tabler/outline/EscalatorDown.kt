package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EscalatorDown: ImageVector
    get() {
        if (_escalatorDown != null) return _escalatorDown!!
        _escalatorDown = tablerOutlineIcon(
            name = "EscalatorDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.5f, 7.0f),
                    PathNode.LineTo(7.233f, 7.0f),
                    PathNode.CurveTo(7.726709f, 7.000117f, 8.202928f, 7.18284f, 8.57f, 7.513f),
                    PathNode.LineTo(18.0f, 16.0f),
                    PathNode.LineTo(19.5f, 16.0f),
                    PathNode.CurveTo(20.880713f, 16.0f, 22.0f, 17.119287f, 22.0f, 18.5f),
                    PathNode.CurveTo(22.0f, 19.880713f, 20.880713f, 21.0f, 19.5f, 21.0f),
                    PathNode.LineTo(16.767f, 21.0f),
                    PathNode.CurveTo(16.27329f, 20.999884f, 15.797072f, 20.817162f, 15.43f, 20.487f),
                    PathNode.LineTo(6.0f, 12.0f),
                    PathNode.LineTo(4.5f, 12.0f),
                    PathNode.CurveTo(3.119288f, 12.0f, 2.0f, 10.880712f, 2.0f, 9.5f),
                    PathNode.CurveTo(2.0f, 8.119289f, 3.119288f, 7.0f, 4.5f, 7.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 3.0f),
                    PathNode.LineTo(18.0f, 10.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 7.0f),
                    PathNode.LineTo(18.0f, 10.0f),
                    PathNode.LineTo(21.0f, 7.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _escalatorDown!!
    }

private var _escalatorDown: ImageVector? = null
