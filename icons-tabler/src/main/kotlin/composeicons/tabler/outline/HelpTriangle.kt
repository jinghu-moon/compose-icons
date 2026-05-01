package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HelpTriangle: ImageVector
    get() {
        if (_helpTriangle != null) return _helpTriangle!!
        _helpTriangle = tablerOutlineIcon(
            name = "HelpTriangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 16.0f),
                    PathNode.LineTo(12.0f, 16.01f)
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
                    PathNode.MoveTo(10.363f, 3.591f),
                    PathNode.LineTo(2.257f, 17.125f),
                    PathNode.CurveTo(1.916961f, 17.713865f, 1.914885f, 18.43893f, 2.251546f, 19.029734f),
                    PathNode.CurveTo(2.588207f, 19.620537f, 3.213051f, 19.988361f, 3.893f, 19.996f),
                    PathNode.LineTo(20.107f, 19.996f),
                    PathNode.CurveTo(20.786638f, 19.988161f, 21.41114f, 19.620476f, 21.747738f, 19.02999f),
                    PathNode.CurveTo(22.084335f, 18.439505f, 22.082533f, 17.714804f, 21.743f, 17.126f),
                    PathNode.LineTo(13.637f, 3.59f),
                    PathNode.CurveTo(13.290141f, 3.017486f, 12.66939f, 2.66778f, 12.0f, 2.66778f),
                    PathNode.CurveTo(11.33061f, 2.66778f, 10.709859f, 3.017486f, 10.363f, 3.59f)
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
                    PathNode.MoveTo(12.0f, 13.0f),
                    PathNode.CurveTo(12.925836f, 13.002783f, 13.732558f, 12.369759f, 13.950047f, 11.469826f),
                    PathNode.CurveTo(14.167534f, 10.569893f, 13.738928f, 9.638327f, 12.914f, 9.218f),
                    PathNode.CurveTo(12.094872f, 8.798393f, 11.094618f, 8.998527f, 10.5f, 9.701f)
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
        return _helpTriangle!!
    }

private var _helpTriangle: ImageVector? = null
