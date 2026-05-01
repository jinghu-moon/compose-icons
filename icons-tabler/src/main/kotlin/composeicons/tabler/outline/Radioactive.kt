package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Radioactive: ImageVector
    get() {
        if (_radioactive != null) return _radioactive!!
        _radioactive = tablerOutlineIcon(
            name = "Radioactive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.5f, 14.6f),
                    PathNode.LineTo(16.5f, 19.79f),
                    PathNode.CurveTo(19.283302f, 18.18306f, 20.99849f, 15.21388f, 21.0f, 12.0f),
                    PathNode.LineTo(15.0f, 12.0f),
                    PathNode.CurveTo(15.000688f, 13.072484f, 14.428799f, 14.063758f, 13.5f, 14.6f)
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
                    PathNode.MoveTo(13.5f, 9.4f),
                    PathNode.LineTo(16.5f, 4.21f),
                    PathNode.CurveTo(13.71539f, 2.602305f, 10.28461f, 2.602305f, 7.5f, 4.21f),
                    PathNode.LineTo(10.5f, 9.4f),
                    PathNode.CurveTo(11.428204f, 8.864101f, 12.571796f, 8.864101f, 13.5f, 9.4f)
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
                    PathNode.MoveTo(10.5f, 14.6f),
                    PathNode.LineTo(7.5f, 19.79f),
                    PathNode.CurveTo(4.716698f, 18.18306f, 3.00151f, 15.21388f, 3.0f, 12.0f),
                    PathNode.LineTo(9.0f, 12.0f),
                    PathNode.CurveTo(8.999312f, 13.072484f, 9.571201f, 14.063758f, 10.5f, 14.6f)
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
        return _radioactive!!
    }

private var _radioactive: ImageVector? = null
