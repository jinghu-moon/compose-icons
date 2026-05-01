package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Cards: ImageVector
    get() {
        if (_cards != null) return _cards!!
        _cards = tablerFilledIcon(
            name = "Cards",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.348f, 3.169f),
                    PathNode.LineTo(3.198f, 6.282f),
                    PathNode.CurveTo(2.200708f, 6.724797f, 1.742401f, 7.885248f, 2.168f, 8.89f),
                    PathNode.LineTo(7.088f, 20.785f),
                    PathNode.CurveTo(7.286216f, 21.27295f, 7.672468f, 21.660597f, 8.159701f, 21.86057f),
                    PathNode.CurveTo(8.646934f, 22.060541f, 9.194144f, 22.056011f, 9.678f, 21.848f),
                    PathNode.LineTo(16.82f, 18.738f),
                    PathNode.CurveTo(17.82043f, 18.296637f, 18.28166f, 17.134212f, 17.856f, 16.127f),
                    PathNode.LineTo(12.936f, 4.233f),
                    PathNode.CurveTo(12.737953f, 3.745374f, 12.352118f, 3.357887f, 11.865341f, 3.157759f),
                    PathNode.CurveTo(11.378566f, 2.957632f, 10.831758f, 2.961683f, 10.348f, 3.169f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 3.0f),
                    PathNode.CurveTo(17.046625f, 2.999669f, 17.916504f, 3.806323f, 17.995f, 4.85f),
                    PathNode.LineTo(18.0f, 5.0f),
                    PathNode.LineTo(18.0f, 8.5f),
                    PathNode.CurveTo(17.999413f, 9.029094f, 17.58679f, 9.466165f, 17.058605f, 9.497172f),
                    PathNode.CurveTo(16.53042f, 9.528179f, 16.06949f, 9.14239f, 16.007f, 8.617f),
                    PathNode.LineTo(16.0f, 8.5f),
                    PathNode.LineTo(16.0f, 5.0f),
                    PathNode.LineTo(15.0f, 5.0f),
                    PathNode.CurveTo(14.470906f, 4.999413f, 14.033835f, 4.58679f, 14.002828f, 4.058605f),
                    PathNode.CurveTo(13.971821f, 3.530421f, 14.35761f, 3.069491f, 14.883f, 3.007f),
                    PathNode.LineTo(15.0f, 3.0f),
                    PathNode.LineTo(16.0f, 3.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.08f, 5.61f),
                    PathNode.CurveTo(19.295706f, 5.102217f, 19.881895f, 4.865057f, 20.39f, 5.08f),
                    PathNode.CurveTo(20.647f, 5.188f, 20.895f, 5.29f, 21.159f, 5.394f),
                    PathNode.CurveTo(22.120987f, 5.802366f, 22.606382f, 6.882529f, 22.273f, 7.873f),
                    PathNode.LineTo(22.217f, 8.019f),
                    PathNode.LineTo(19.919f, 13.393f),
                    PathNode.CurveTo(19.70913f, 13.877086f, 19.15927f, 14.11483f, 18.66283f, 13.936132f),
                    PathNode.CurveTo(18.166391f, 13.757436f, 17.8942f, 13.223787f, 18.041f, 12.717f),
                    PathNode.LineTo(18.081f, 12.607f),
                    PathNode.LineTo(20.377f, 7.236f),
                    PathNode.LineTo(20.011f, 7.088f),
                    PathNode.LineTo(19.609f, 6.921f),
                    PathNode.CurveTo(19.364635f, 6.81742f, 19.171473f, 6.620944f, 19.07206f, 6.374854f),
                    PathNode.CurveTo(18.972649f, 6.128764f, 18.975145f, 5.853248f, 19.079f, 5.609f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _cards!!
    }

private var _cards: ImageVector? = null
