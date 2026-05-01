package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Beer: ImageVector
    get() {
        if (_beer != null) return _beer!!
        _beer = tablerOutlineIcon(
            name = "Beer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 21.0f),
                    PathNode.LineTo(15.0f, 21.0f),
                    PathNode.CurveTo(15.552285f, 21.0f, 16.0f, 20.552284f, 16.0f, 20.0f),
                    PathNode.LineTo(16.0f, 16.375f),
                    PathNode.CurveTo(16.0f, 14.978f, 16.29f, 13.6f, 16.845f, 12.35f),
                    PathNode.LineTo(17.155f, 11.65f),
                    PathNode.CurveTo(17.711f, 10.4f, 18.0f, 9.397f, 18.0f, 8.0f),
                    PathNode.LineTo(18.0f, 4.0f),
                    PathNode.CurveTo(18.0f, 3.447715f, 17.552284f, 3.0f, 17.0f, 3.0f),
                    PathNode.LineTo(7.0f, 3.0f),
                    PathNode.CurveTo(6.447716f, 3.0f, 6.0f, 3.447715f, 6.0f, 4.0f),
                    PathNode.LineTo(6.0f, 8.0f),
                    PathNode.CurveTo(6.0f, 9.397f, 6.29f, 10.4f, 6.845f, 11.65f),
                    PathNode.LineTo(7.155f, 12.35f),
                    PathNode.CurveTo(7.714438f, 13.618006f, 8.002276f, 14.989069f, 8.0f, 16.375f),
                    PathNode.LineTo(8.0f, 20.0f),
                    PathNode.CurveTo(8.0f, 20.552284f, 8.447715f, 21.0f, 9.0f, 21.0f)
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
                    PathNode.MoveTo(6.0f, 8.0f),
                    PathNode.LineTo(18.0f, 8.0f)
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
        return _beer!!
    }

private var _beer: ImageVector? = null
