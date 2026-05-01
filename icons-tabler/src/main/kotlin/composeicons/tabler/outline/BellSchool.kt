package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BellSchool: ImageVector
    get() {
        if (_bellSchool != null) return _bellSchool!!
        _bellSchool = tablerOutlineIcon(
            name = "BellSchool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 10.0f),
                    PathNode.CurveTo(4.0f, 13.313708f, 6.686292f, 16.0f, 10.0f, 16.0f),
                    PathNode.CurveTo(13.313708f, 16.0f, 16.0f, 13.313708f, 16.0f, 10.0f),
                    PathNode.CurveTo(16.0f, 6.686292f, 13.313708f, 4.0f, 10.0f, 4.0f),
                    PathNode.CurveTo(6.686292f, 4.0f, 4.0f, 6.686292f, 4.0f, 10.0f)
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
                    PathNode.MoveTo(13.5f, 15.0f),
                    PathNode.LineTo(14.0f, 15.0f),
                    PathNode.CurveTo(15.104569f, 15.0f, 16.0f, 15.895431f, 16.0f, 17.0f),
                    PathNode.LineTo(16.0f, 18.0f),
                    PathNode.CurveTo(16.0f, 19.10457f, 15.104569f, 20.0f, 14.0f, 20.0f),
                    PathNode.LineTo(6.0f, 20.0f),
                    PathNode.CurveTo(4.895431f, 20.0f, 4.0f, 19.10457f, 4.0f, 18.0f),
                    PathNode.LineTo(4.0f, 17.0f),
                    PathNode.CurveTo(4.0f, 15.895431f, 4.895431f, 15.0f, 6.0f, 15.0f),
                    PathNode.LineTo(6.5f, 15.0f)
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
                    PathNode.MoveTo(16.0f, 17.0f),
                    PathNode.CurveTo(17.77384f, 16.763445f, 19.3335f, 15.707288f, 20.211628f, 14.148006f),
                    PathNode.CurveTo(21.089756f, 12.588724f, 21.184326f, 10.707485f, 20.467f, 9.068f),
                    PathNode.LineTo(20.0f, 8.0f)
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
                    PathNode.MoveTo(10.0f, 10.0f),
                    PathNode.LineTo(10.0f, 10.01f)
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
                    PathNode.MoveTo(19.0f, 8.0f),
                    PathNode.CurveTo(19.0f, 8.552285f, 19.447716f, 9.0f, 20.0f, 9.0f),
                    PathNode.CurveTo(20.552284f, 9.0f, 21.0f, 8.552285f, 21.0f, 8.0f),
                    PathNode.CurveTo(21.0f, 7.447716f, 20.552284f, 7.0f, 20.0f, 7.0f),
                    PathNode.CurveTo(19.447716f, 7.0f, 19.0f, 7.447716f, 19.0f, 8.0f)
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
        return _bellSchool!!
    }

private var _bellSchool: ImageVector? = null
