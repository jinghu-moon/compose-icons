package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Ampersand: ImageVector
    get() {
        if (_ampersand != null) return _ampersand!!
        _ampersand = tablerOutlineIcon(
            name = "Ampersand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 20.0f),
                    PathNode.LineTo(8.597f, 9.028f),
                    PathNode.CurveTo(7.448467f, 7.877205f, 7.448467f, 6.013795f, 8.597f, 4.863f),
                    PathNode.CurveTo(9.148487f, 4.31066f, 9.896976f, 4.000287f, 10.6775f, 4.000287f),
                    PathNode.CurveTo(11.458024f, 4.000287f, 12.206513f, 4.31066f, 12.758f, 4.863f),
                    PathNode.CurveTo(13.906534f, 6.013795f, 13.906534f, 7.877205f, 12.758f, 9.028f),
                    PathNode.LineTo(8.078f, 13.715f),
                    PathNode.CurveTo(6.641834f, 15.15358f, 6.641834f, 17.48342f, 8.078f, 18.922f),
                    PathNode.CurveTo(8.767308f, 19.612041f, 9.702652f, 19.999765f, 10.678f, 19.999765f),
                    PathNode.CurveTo(11.653348f, 19.999765f, 12.588692f, 19.612041f, 13.278f, 18.922f),
                    PathNode.LineTo(19.0f, 13.0f)
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
        return _ampersand!!
    }

private var _ampersand: ImageVector? = null
