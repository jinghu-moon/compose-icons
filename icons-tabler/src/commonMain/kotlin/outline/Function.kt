package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Function: ImageVector
    get() {
        if (_function != null) return _function!!
        _function = tablerOutlineIcon(
            name = "Function",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 6.667f),
                    PathNode.CurveTo(4.0f, 5.194057f, 5.194057f, 4.0f, 6.667f, 4.0f),
                    PathNode.LineTo(17.333f, 4.0f),
                    PathNode.CurveTo(18.805943f, 4.0f, 20.0f, 5.194057f, 20.0f, 6.667f),
                    PathNode.LineTo(20.0f, 17.333f),
                    PathNode.CurveTo(20.0f, 18.805943f, 18.805943f, 20.0f, 17.333f, 20.0f),
                    PathNode.LineTo(6.667f, 20.0f),
                    PathNode.CurveTo(5.194057f, 20.0f, 4.0f, 18.805943f, 4.0f, 17.333f),
                    PathNode.LineTo(4.0f, 6.667f)
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
                    PathNode.MoveTo(9.0f, 15.5f),
                    PathNode.LineTo(9.0f, 15.75f),
                    PathNode.CurveTo(9.0f, 16.44f, 9.56f, 17.0f, 10.25f, 17.0f),
                    PathNode.CurveTo(10.96f, 17.0f, 11.554f, 16.462f, 11.624f, 15.756f),
                    PathNode.LineTo(12.376f, 8.244001f),
                    PathNode.CurveTo(12.446393f, 7.537922f, 13.040421f, 7.000097f, 13.75f, 7.0f),
                    PathNode.CurveTo(14.44f, 7.0f, 15.0f, 7.56f, 15.0f, 8.25f),
                    PathNode.LineTo(15.0f, 8.5f)
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
                    PathNode.MoveTo(9.0f, 12.0f),
                    PathNode.LineTo(15.0f, 12.0f)
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
        return _function!!
    }

private var _function: ImageVector? = null
