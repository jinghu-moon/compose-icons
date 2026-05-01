package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Feather: ImageVector
    get() {
        if (_feather != null) return _feather!!
        _feather = tablerOutlineIcon(
            name = "Feather",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 20.0f),
                    PathNode.LineTo(14.0f, 10.0f),
                    PathNode.MoveTo(14.0f, 5.0f),
                    PathNode.LineTo(14.0f, 10.0f),
                    PathNode.LineTo(19.0f, 10.0f),
                    PathNode.MoveTo(10.0f, 9.0f),
                    PathNode.LineTo(10.0f, 14.0f),
                    PathNode.LineTo(15.0f, 14.0f),
                    PathNode.MoveTo(6.0f, 13.0f),
                    PathNode.LineTo(6.0f, 18.0f),
                    PathNode.LineTo(11.0f, 18.0f),
                    PathNode.MoveTo(6.0f, 13.0f),
                    PathNode.LineTo(10.0f, 9.0f),
                    PathNode.LineTo(14.0f, 5.0f)
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
                    PathNode.MoveTo(19.0f, 10.0f),
                    PathNode.CurveTo(19.638f, 9.364f, 20.0f, 8.485f, 20.0f, 7.514f),
                    PathNode.CurveTo(19.999735f, 6.581591f, 19.629013f, 5.687491f, 18.96942f, 5.028459f),
                    PathNode.CurveTo(18.309826f, 4.369427f, 17.41541f, 3.99947f, 16.483f, 4.0f),
                    PathNode.CurveTo(15.513f, 4.0f, 14.636f, 4.367f, 14.0f, 5.0f),
                    PathNode.MoveTo(11.0f, 18.0f),
                    PathNode.LineTo(15.0f, 14.0f),
                    PathNode.LineTo(19.0f, 10.0f)
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
        return _feather!!
    }

private var _feather: ImageVector? = null
