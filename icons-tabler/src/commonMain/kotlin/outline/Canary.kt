package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Canary: ImageVector
    get() {
        if (_canary != null) return _canary!!
        _canary = tablerOutlineIcon(
            name = "Canary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 20.0f),
                    PathNode.LineTo(12.0f, 18.0f)
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
                    PathNode.MoveTo(15.0f, 8.01f),
                    PathNode.LineTo(15.0f, 8.020001f)
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
                    PathNode.MoveTo(3.0f, 17.0f),
                    PathNode.LineTo(11.0f, 9.0f),
                    PathNode.LineTo(11.0f, 8.0f),
                    PathNode.CurveTo(11.0f, 5.790861f, 12.790861f, 4.0f, 15.0f, 4.0f),
                    PathNode.CurveTo(17.209139f, 4.0f, 19.0f, 5.790861f, 19.0f, 8.0f),
                    PathNode.LineTo(21.0f, 8.0f),
                    PathNode.LineTo(19.0f, 10.0f),
                    PathNode.LineTo(19.0f, 11.0f),
                    PathNode.CurveTo(19.001f, 14.227919f, 16.79461f, 17.037992f, 13.65861f, 17.802828f),
                    PathNode.CurveTo(10.522613f, 18.567665f, 7.270228f, 17.088932f, 5.785f, 14.223f)
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
        return _canary!!
    }

private var _canary: ImageVector? = null
