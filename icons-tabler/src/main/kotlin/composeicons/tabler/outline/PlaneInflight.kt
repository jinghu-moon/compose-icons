package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlaneInflight: ImageVector
    get() {
        if (_planeInflight != null) return _planeInflight!!
        _planeInflight = tablerOutlineIcon(
            name = "PlaneInflight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 11.085f),
                    PathNode.LineTo(20.0f, 11.085f),
                    PathNode.CurveTo(21.10457f, 11.085f, 22.0f, 11.980431f, 22.0f, 13.085f),
                    PathNode.CurveTo(22.0f, 14.189569f, 21.10457f, 15.085f, 20.0f, 15.085f),
                    PathNode.LineTo(5.0f, 15.085f),
                    PathNode.LineTo(2.0f, 9.085f),
                    PathNode.LineTo(5.0f, 9.085f),
                    PathNode.LineTo(7.0f, 11.085f),
                    PathNode.LineTo(10.0f, 11.085f),
                    PathNode.LineTo(8.0f, 4.085f),
                    PathNode.LineTo(11.0f, 4.085f),
                    PathNode.LineTo(15.0f, 11.085f)
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
                    PathNode.MoveTo(3.0f, 21.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _planeInflight!!
    }

private var _planeInflight: ImageVector? = null
