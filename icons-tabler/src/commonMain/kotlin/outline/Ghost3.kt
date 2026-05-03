package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Ghost3: ImageVector
    get() {
        if (_ghost3 != null) return _ghost3!!
        _ghost3 = tablerOutlineIcon(
            name = "Ghost3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 11.0f),
                    PathNode.CurveTo(5.0f, 7.134007f, 8.134007f, 4.0f, 12.0f, 4.0f),
                    PathNode.CurveTo(15.865993f, 4.0f, 19.0f, 7.134007f, 19.0f, 11.0f),
                    PathNode.LineTo(19.0f, 18.0f),
                    PathNode.CurveTo(19.097063f, 18.77468f, 18.677975f, 19.52219f, 17.966434f, 19.84353f),
                    PathNode.CurveTo(17.254892f, 20.164873f, 16.417f, 19.985031f, 15.9f, 19.4f),
                    PathNode.CurveTo(15.58729f, 18.999926f, 15.107786f, 18.76612f, 14.6f, 18.76612f),
                    PathNode.CurveTo(14.092215f, 18.76612f, 13.61271f, 18.999926f, 13.3f, 19.4f),
                    PathNode.CurveTo(12.98729f, 19.800074f, 12.507786f, 20.03388f, 12.0f, 20.03388f),
                    PathNode.CurveTo(11.492214f, 20.03388f, 11.01271f, 19.800074f, 10.7f, 19.4f),
                    PathNode.CurveTo(10.38729f, 18.999926f, 9.907785f, 18.76612f, 9.4f, 18.76612f),
                    PathNode.CurveTo(8.892214f, 18.76612f, 8.41271f, 18.999926f, 8.100001f, 19.4f),
                    PathNode.CurveTo(7.582999f, 19.985031f, 6.745107f, 20.164873f, 6.033567f, 19.84353f),
                    PathNode.CurveTo(5.322026f, 19.52219f, 4.902938f, 18.77468f, 5.0f, 18.0f),
                    PathNode.LineTo(5.0f, 11.0f)
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
                    PathNode.MoveTo(10.0f, 10.0f),
                    PathNode.LineTo(10.01f, 10.0f)
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
                    PathNode.MoveTo(14.0f, 10.0f),
                    PathNode.LineTo(14.01f, 10.0f)
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
        return _ghost3!!
    }

private var _ghost3: ImageVector? = null
