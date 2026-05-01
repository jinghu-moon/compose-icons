package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Umbrella2: ImageVector
    get() {
        if (_umbrella2 != null) return _umbrella2!!
        _umbrella2 = tablerOutlineIcon(
            name = "Umbrella2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.343f, 7.343f),
                    PathNode.CurveTo(8.467275f, 4.218725f, 13.532725f, 4.218725f, 16.657f, 7.343f),
                    PathNode.CurveTo(19.781275f, 10.467275f, 19.781275f, 15.532725f, 16.657f, 18.657f),
                    PathNode.LineTo(5.343f, 7.343f)
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
                    PathNode.MoveTo(10.828f, 13.34f),
                    PathNode.LineTo(6.586f, 17.583f),
                    PathNode.CurveTo(6.066087f, 18.08515f, 5.857575f, 18.828756f, 6.040606f, 19.528015f),
                    PathNode.CurveTo(6.223637f, 20.227274f, 6.769727f, 20.773363f, 7.468986f, 20.956394f),
                    PathNode.CurveTo(8.168245f, 21.139425f, 8.911851f, 20.930914f, 9.414f, 20.411f)
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
        return _umbrella2!!
    }

private var _umbrella2: ImageVector? = null
