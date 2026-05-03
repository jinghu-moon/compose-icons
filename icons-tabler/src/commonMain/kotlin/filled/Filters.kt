package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Filters: ImageVector
    get() {
        if (_filters != null) return _filters!!
        _filters = tablerFilledIcon(
            name = "Filters",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.396f, 11.056f),
                    PathNode.CurveTo(21.915007f, 12.791192f, 22.725449f, 16.14356f, 21.277273f, 18.837828f),
                    PathNode.CurveTo(19.8291f, 21.532093f, 16.58596f, 22.705652f, 13.749f, 21.562f),
                    PathNode.QuadTo(13.955f, 21.352f, 14.145f, 21.122f),
                    PathNode.CurveTo(15.573106f, 19.409338f, 16.221565f, 17.178335f, 15.934f, 14.967f),
                    PathNode.CurveTo(17.49208f, 14.086164f, 18.71074f, 12.709453f, 19.396f, 11.056f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.609f, 11.051f),
                    PathNode.CurveTo(6.126126f, 14.740563f, 10.132223f, 16.745747f, 13.995f, 15.749f),
                    PathNode.CurveTo(14.114729f, 18.608929f, 12.197558f, 21.155172f, 9.415943f, 21.83056f),
                    PathNode.CurveTo(6.634329f, 22.505947f, 3.762982f, 21.122375f, 2.557892f, 18.525978f),
                    PathNode.CurveTo(1.352802f, 15.929579f, 2.149601f, 12.843479f, 4.461f, 11.155f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(15.313708f, 2.0f, 18.0f, 4.686292f, 18.0f, 8.0f),
                    PathNode.CurveTo(18.0f, 11.313708f, 15.313708f, 14.0f, 12.0f, 14.0f),
                    PathNode.CurveTo(8.686292f, 14.0f, 6.0f, 11.313708f, 6.0f, 8.0f),
                    PathNode.LineTo(6.004f, 7.775f),
                    PathNode.CurveTo(6.124985f, 4.551027f, 8.773757f, 1.999882f, 12.0f, 2.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _filters!!
    }

private var _filters: ImageVector? = null
