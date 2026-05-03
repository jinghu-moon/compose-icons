package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AlignBoxRightMiddle: ImageVector
    get() {
        if (_alignBoxRightMiddle != null) return _alignBoxRightMiddle!!
        _alignBoxRightMiddle = tablerFilledIcon(
            name = "AlignBoxRightMiddle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.333f, 2.0f),
                    PathNode.CurveTo(20.293f, 2.0f, 21.893f, 3.537f, 21.995f, 5.472f),
                    PathNode.LineTo(22.0f, 5.667f),
                    PathNode.LineTo(22.0f, 18.333f),
                    PathNode.CurveTo(22.0f, 20.293f, 20.463f, 21.893f, 18.528f, 21.995f),
                    PathNode.LineTo(18.333f, 22.0f),
                    PathNode.LineTo(5.667f, 22.0f),
                    PathNode.CurveTo(3.717474f, 22.000101f, 2.10867f, 20.474768f, 2.005f, 18.528f),
                    PathNode.LineTo(2.0f, 18.333f),
                    PathNode.LineTo(2.0f, 5.667f),
                    PathNode.CurveTo(2.0f, 3.707f, 3.537f, 2.107f, 5.472f, 2.005f),
                    PathNode.LineTo(5.667f, 2.0f),
                    PathNode.LineTo(18.333f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(18.0f, 14.0f),
                    PathNode.LineTo(16.0f, 14.0f),
                    PathNode.LineTo(15.883f, 14.007f),
                    PathNode.CurveTo(15.37995f, 14.066836f, 15.001114f, 14.493402f, 15.001114f, 15.0f),
                    PathNode.CurveTo(15.001114f, 15.506598f, 15.37995f, 15.933164f, 15.883f, 15.993f),
                    PathNode.LineTo(16.0f, 16.0f),
                    PathNode.LineTo(18.0f, 16.0f),
                    PathNode.LineTo(18.117f, 15.993f),
                    PathNode.CurveTo(18.62005f, 15.933164f, 18.998886f, 15.506598f, 18.998886f, 15.0f),
                    PathNode.CurveTo(18.998886f, 14.493402f, 18.62005f, 14.066836f, 18.117f, 14.007f),
                    PathNode.LineTo(18.0f, 14.0f),
                    PathNode.Close,
                    PathNode.MoveTo(18.0f, 11.0f),
                    PathNode.LineTo(12.0f, 11.0f),
                    PathNode.LineTo(11.883f, 11.007f),
                    PathNode.CurveTo(11.37995f, 11.066836f, 11.001114f, 11.493402f, 11.001114f, 12.0f),
                    PathNode.CurveTo(11.001114f, 12.506598f, 11.37995f, 12.933164f, 11.883f, 12.993f),
                    PathNode.LineTo(12.0f, 13.0f),
                    PathNode.LineTo(18.0f, 13.0f),
                    PathNode.LineTo(18.117f, 12.993f),
                    PathNode.CurveTo(18.62005f, 12.933164f, 18.998886f, 12.506598f, 18.998886f, 12.0f),
                    PathNode.CurveTo(18.998886f, 11.493402f, 18.62005f, 11.066836f, 18.117f, 11.007f),
                    PathNode.LineTo(18.0f, 11.0f),
                    PathNode.Close,
                    PathNode.MoveTo(18.0f, 8.0f),
                    PathNode.LineTo(14.0f, 8.0f),
                    PathNode.LineTo(13.883f, 8.007f),
                    PathNode.CurveTo(13.37995f, 8.066837f, 13.001114f, 8.493402f, 13.001114f, 9.0f),
                    PathNode.CurveTo(13.001114f, 9.506598f, 13.37995f, 9.933164f, 13.883f, 9.993f),
                    PathNode.LineTo(14.0f, 10.0f),
                    PathNode.LineTo(18.0f, 10.0f),
                    PathNode.LineTo(18.117f, 9.993f),
                    PathNode.CurveTo(18.62005f, 9.933164f, 18.998886f, 9.506598f, 18.998886f, 9.0f),
                    PathNode.CurveTo(18.998886f, 8.493402f, 18.62005f, 8.066837f, 18.117f, 8.007f),
                    PathNode.LineTo(18.0f, 8.0f),
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
        }
        return _alignBoxRightMiddle!!
    }

private var _alignBoxRightMiddle: ImageVector? = null
