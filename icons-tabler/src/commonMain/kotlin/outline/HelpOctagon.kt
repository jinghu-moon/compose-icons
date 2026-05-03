package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HelpOctagon: ImageVector
    get() {
        if (_helpOctagon != null) return _helpOctagon!!
        _helpOctagon = tablerOutlineIcon(
            name = "HelpOctagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.802f, 2.165f),
                    PathNode.LineTo(18.377f, 4.554f),
                    PathNode.CurveTo(18.857f, 4.76f, 19.24f, 5.143f, 19.447f, 5.624f),
                    PathNode.LineTo(21.835f, 11.198f),
                    PathNode.CurveTo(22.055f, 11.71f, 22.055f, 12.29f, 21.835f, 12.802f),
                    PathNode.LineTo(19.446f, 18.377f),
                    PathNode.CurveTo(19.24f, 18.857f, 18.857f, 19.24f, 18.376f, 19.447f),
                    PathNode.LineTo(12.802f, 21.835f),
                    PathNode.CurveTo(12.29f, 22.055f, 11.71f, 22.055f, 11.198f, 21.835f),
                    PathNode.LineTo(5.623f, 19.446f),
                    PathNode.CurveTo(5.142114f, 19.240042f, 4.758958f, 18.856886f, 4.553f, 18.376f),
                    PathNode.LineTo(2.165f, 12.802f),
                    PathNode.CurveTo(1.945517f, 12.289858f, 1.945517f, 11.710142f, 2.165f, 11.198f),
                    PathNode.LineTo(4.554f, 5.623f),
                    PathNode.CurveTo(4.76f, 5.143f, 5.143f, 4.76f, 5.624f, 4.553f),
                    PathNode.LineTo(11.198f, 2.165f),
                    PathNode.CurveTo(11.710142f, 1.945517f, 12.289858f, 1.945517f, 12.802f, 2.165f)
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
                    PathNode.MoveTo(12.0f, 16.0f),
                    PathNode.LineTo(12.0f, 16.01f)
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
                    PathNode.MoveTo(12.0f, 13.0f),
                    PathNode.CurveTo(12.925836f, 13.002783f, 13.732558f, 12.369759f, 13.950047f, 11.469826f),
                    PathNode.CurveTo(14.167534f, 10.569893f, 13.738928f, 9.638327f, 12.914f, 9.218f),
                    PathNode.CurveTo(12.094872f, 8.798393f, 11.094618f, 8.998527f, 10.5f, 9.701f)
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
        return _helpOctagon!!
    }

private var _helpOctagon: ImageVector? = null
