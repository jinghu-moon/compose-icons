package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SphereOff: ImageVector
    get() {
        if (_sphereOff != null) return _sphereOff!!
        _sphereOff = tablerOutlineIcon(
            name = "SphereOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 13.657f, 7.03f, 15.0f, 12.0f, 15.0f),
                    PathNode.CurveTo(12.987f, 15.0f, 13.936f, 14.947f, 14.825f, 14.85f),
                    PathNode.MoveTo(18.182f, 14.18f),
                    PathNode.CurveTo(19.917f, 13.633f, 21.0f, 12.86f, 21.0f, 12.0f)
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
                    PathNode.MoveTo(20.051f, 16.027f),
                    PathNode.CurveTo(21.787514f, 12.560234f, 21.108536f, 8.370999f, 18.365917f, 5.630196f),
                    PathNode.CurveTo(15.6233f, 2.889394f, 11.433616f, 2.21319f, 7.968f, 3.952f),
                    PathNode.MoveTo(5.628f, 5.644f),
                    PathNode.CurveTo(2.116574f, 9.162054f, 2.121946f, 14.860574f, 5.640001f, 18.372f),
                    PathNode.CurveTo(9.158054f, 21.883427f, 14.856573f, 21.878054f, 18.368f, 18.36f)
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
        return _sphereOff!!
    }

private var _sphereOff: ImageVector? = null
