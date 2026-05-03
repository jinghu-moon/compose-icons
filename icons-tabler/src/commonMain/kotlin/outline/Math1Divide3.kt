package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Math1Divide3: ImageVector
    get() {
        if (_math1Divide3 != null) return _math1Divide3!!
        _math1Divide3 = tablerOutlineIcon(
            name = "Math1Divide3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 15.5f),
                    PathNode.CurveTo(10.0f, 15.223858f, 10.223858f, 15.0f, 10.5f, 15.0f),
                    PathNode.LineTo(12.5f, 15.0f),
                    PathNode.CurveTo(13.328427f, 15.0f, 14.0f, 15.671573f, 14.0f, 16.5f),
                    PathNode.CurveTo(14.0f, 17.328426f, 13.328427f, 18.0f, 12.5f, 18.0f),
                    PathNode.LineTo(11.333f, 18.0f),
                    PathNode.LineTo(12.5f, 18.0f),
                    PathNode.CurveTo(13.328427f, 18.0f, 14.0f, 18.671574f, 14.0f, 19.5f),
                    PathNode.CurveTo(14.0f, 20.328426f, 13.328427f, 21.0f, 12.5f, 21.0f),
                    PathNode.LineTo(10.5f, 21.0f),
                    PathNode.CurveTo(10.223858f, 21.0f, 10.0f, 20.776142f, 10.0f, 20.5f)
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
                    PathNode.MoveTo(5.0f, 12.0f),
                    PathNode.LineTo(19.0f, 12.0f)
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
                    PathNode.MoveTo(10.0f, 5.0f),
                    PathNode.LineTo(12.0f, 3.0f),
                    PathNode.LineTo(12.0f, 9.0f)
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
        return _math1Divide3!!
    }

private var _math1Divide3: ImageVector? = null
