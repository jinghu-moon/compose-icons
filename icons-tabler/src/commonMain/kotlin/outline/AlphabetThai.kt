package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AlphabetThai: ImageVector
    get() {
        if (_alphabetThai != null) return _alphabetThai!!
        _alphabetThai = tablerOutlineIcon(
            name = "AlphabetThai",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 18.0f),
                    PathNode.LineTo(8.0f, 14.556f),
                    PathNode.CurveTo(8.0f, 14.066f, 8.165f, 13.632f, 8.494f, 13.193f),
                    PathNode.CurveTo(8.82f, 12.744f, 9.503f, 12.433f, 10.0f, 12.259f),
                    PathNode.CurveTo(10.032f, 12.248f, 10.035f, 12.18f, 10.004f, 12.164f),
                    PathNode.CurveTo(9.57f, 11.944f, 8.71f, 11.644f, 8.378001f, 11.132f),
                    PathNode.LineTo(8.364001f, 11.111f),
                    PathNode.LineTo(8.281f, 10.986f),
                    PathNode.CurveTo(8.0f, 10.566f, 8.0f, 9.74f, 8.0f, 9.74f),
                    PathNode.CurveTo(8.0f, 8.284001f, 8.849f, 7.12f, 9.837f, 6.541f),
                    PathNode.QuadTo(10.737f, 6.001f, 11.974f, 6.0f),
                    PathNode.QuadTo(13.051f, 6.0f, 13.969f, 6.47f),
                    PathNode.CurveTo(15.297f, 7.117f, 16.0f, 8.672f, 16.0f, 10.446f),
                    PathNode.LineTo(16.0f, 18.0f)
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
        return _alphabetThai!!
    }

private var _alphabetThai: ImageVector? = null
