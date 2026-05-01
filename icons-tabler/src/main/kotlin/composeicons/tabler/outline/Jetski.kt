package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Jetski: ImageVector
    get() {
        if (_jetski != null) return _jetski!!
        _jetski = tablerOutlineIcon(
            name = "Jetski",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 5.0f),
                    PathNode.LineTo(11.4f, 5.0f),
                    PathNode.CurveTo(11.769312f, 5.000246f, 12.108423f, 5.204021f, 12.282f, 5.53f),
                    PathNode.LineTo(14.0f, 8.75f)
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
                    PathNode.MoveTo(3.485f, 16.94f),
                    PathNode.LineTo(3.621f, 17.485f),
                    PathNode.CurveTo(3.84353f, 18.37526f, 4.64335f, 18.99986f, 5.561f, 19.0f),
                    PathNode.LineTo(13.0f, 19.0f),
                    PathNode.CurveTo(16.147573f, 19.0f, 19.111456f, 17.518059f, 21.0f, 15.0f),
                    PathNode.CurveTo(21.0f, 9.0f, 16.0f, 7.0f, 16.0f, 7.0f),
                    PathNode.CurveTo(14.111f, 9.518f, 10.148f, 11.0f, 7.0f, 11.0f),
                    PathNode.LineTo(5.0f, 11.0f),
                    PathNode.CurveTo(3.895431f, 11.0f, 3.0f, 11.895431f, 3.0f, 13.0f),
                    PathNode.CurveTo(3.0f, 14.328f, 3.163f, 15.652f, 3.485f, 16.94f)
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
                    PathNode.MoveTo(3.25f, 15.0f),
                    PathNode.LineTo(21.0f, 15.0f)
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
        return _jetski!!
    }

private var _jetski: ImageVector? = null
