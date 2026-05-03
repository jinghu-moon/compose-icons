package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Teapot: ImageVector
    get() {
        if (_teapot != null) return _teapot!!
        _teapot = tablerOutlineIcon(
            name = "Teapot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.29f, 3.0f),
                    PathNode.LineTo(13.71f, 3.0f),
                    PathNode.CurveTo(14.729483f, 2.99993f, 15.585857f, 3.766704f, 15.698f, 4.78f),
                    PathNode.LineTo(17.253f, 18.78f),
                    PathNode.CurveTo(17.315563f, 19.345308f, 17.134481f, 19.910515f, 16.755058f, 20.334217f),
                    PathNode.CurveTo(16.375633f, 20.75792f, 15.833759f, 21.000038f, 15.265f, 21.0f),
                    PathNode.LineTo(8.735f, 21.0f),
                    PathNode.CurveTo(8.166241f, 21.000038f, 7.624367f, 20.75792f, 7.244942f, 20.334217f),
                    PathNode.CurveTo(6.865519f, 19.910515f, 6.684437f, 19.345308f, 6.747f, 18.78f),
                    PathNode.LineTo(8.302f, 4.78f),
                    PathNode.CurveTo(8.414143f, 3.766704f, 9.270517f, 2.99993f, 10.29f, 3.0f)
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
                    PathNode.MoveTo(7.47f, 12.5f),
                    PathNode.LineTo(3.213f, 7.481f),
                    PathNode.CurveTo(2.985611f, 7.213307f, 2.934944f, 6.837702f, 3.083276f, 6.519326f),
                    PathNode.CurveTo(3.231608f, 6.200949f, 3.551771f, 5.998114f, 3.903f, 6.0f),
                    PathNode.LineTo(16.993f, 6.0f),
                    PathNode.CurveTo(17.789862f, 5.998141f, 18.554724f, 6.313391f, 19.118847f, 6.876201f),
                    PathNode.CurveTo(19.68297f, 7.439012f, 20.000002f, 8.203137f, 20.0f, 9.0f),
                    PathNode.LineTo(20.0f, 12.0f),
                    PathNode.CurveTo(20.0f, 13.657f, 18.654f, 15.0f, 16.993f, 15.0f)
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
                    PathNode.MoveTo(7.0f, 17.0f),
                    PathNode.LineTo(17.0f, 17.0f)
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
        return _teapot!!
    }

private var _teapot: ImageVector? = null
