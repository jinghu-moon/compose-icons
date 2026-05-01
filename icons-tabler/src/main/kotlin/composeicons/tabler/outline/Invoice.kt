package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Invoice: ImageVector
    get() {
        if (_invoice != null) return _invoice!!
        _invoice = tablerOutlineIcon(
            name = "Invoice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 3.0f),
                    PathNode.LineTo(14.0f, 7.0f),
                    PathNode.CurveTo(14.0f, 7.552285f, 14.447715f, 8.0f, 15.0f, 8.0f),
                    PathNode.LineTo(19.0f, 8.0f)
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
                    PathNode.MoveTo(19.0f, 12.0f),
                    PathNode.LineTo(19.0f, 19.0f),
                    PathNode.CurveTo(19.097063f, 19.77468f, 18.677975f, 20.52219f, 17.966434f, 20.84353f),
                    PathNode.CurveTo(17.254892f, 21.164873f, 16.417f, 20.985031f, 15.9f, 20.4f),
                    PathNode.CurveTo(15.58729f, 19.999926f, 15.107786f, 19.76612f, 14.6f, 19.76612f),
                    PathNode.CurveTo(14.092215f, 19.76612f, 13.61271f, 19.999926f, 13.3f, 20.4f),
                    PathNode.CurveTo(12.98729f, 20.800074f, 12.507786f, 21.03388f, 12.0f, 21.03388f),
                    PathNode.CurveTo(11.492214f, 21.03388f, 11.01271f, 20.800074f, 10.7f, 20.4f),
                    PathNode.CurveTo(10.38729f, 19.999926f, 9.907785f, 19.76612f, 9.4f, 19.76612f),
                    PathNode.CurveTo(8.892214f, 19.76612f, 8.41271f, 19.999926f, 8.100001f, 20.4f),
                    PathNode.CurveTo(7.582999f, 20.985031f, 6.745107f, 21.164873f, 6.033567f, 20.84353f),
                    PathNode.CurveTo(5.322026f, 20.52219f, 4.902938f, 19.77468f, 5.0f, 19.0f),
                    PathNode.LineTo(5.0f, 5.0f),
                    PathNode.CurveTo(5.0f, 3.895431f, 5.895431f, 3.0f, 7.0f, 3.0f),
                    PathNode.LineTo(14.0f, 3.0f),
                    PathNode.LineTo(19.0f, 8.0f),
                    PathNode.LineTo(19.0f, 12.25f)
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
        return _invoice!!
    }

private var _invoice: ImageVector? = null
