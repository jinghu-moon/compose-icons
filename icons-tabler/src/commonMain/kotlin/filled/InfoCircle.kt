package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.InfoCircle: ImageVector
    get() {
        if (_infoCircle != null) return _infoCircle!!
        _infoCircle = tablerFilledIcon(
            name = "InfoCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f),
                    PathNode.CurveTo(22.004322f, 17.462755f, 17.624062f, 21.91809f, 12.162023f, 22.006598f),
                    PathNode.CurveTo(6.699982f, 22.095106f, 2.177672f, 17.784027f, 2.005f, 12.324f),
                    PathNode.LineTo(2.0f, 12.0f),
                    PathNode.LineTo(2.004f, 11.72f),
                    PathNode.CurveTo(2.152f, 6.327f, 6.57f, 2.0f, 12.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 11.0f),
                    PathNode.LineTo(11.0f, 11.0f),
                    PathNode.LineTo(10.883f, 11.007f),
                    PathNode.CurveTo(10.37995f, 11.066836f, 10.001114f, 11.493402f, 10.001114f, 12.0f),
                    PathNode.CurveTo(10.001114f, 12.506598f, 10.37995f, 12.933164f, 10.883f, 12.993f),
                    PathNode.LineTo(11.0f, 13.0f),
                    PathNode.LineTo(11.0f, 16.0f),
                    PathNode.LineTo(11.007f, 16.117f),
                    PathNode.CurveTo(11.061188f, 16.57649f, 11.423509f, 16.938812f, 11.883f, 16.993f),
                    PathNode.LineTo(12.0f, 17.0f),
                    PathNode.LineTo(13.0f, 17.0f),
                    PathNode.LineTo(13.117f, 16.993f),
                    PathNode.CurveTo(13.576491f, 16.938812f, 13.938812f, 16.57649f, 13.993f, 16.117f),
                    PathNode.LineTo(14.0f, 16.0f),
                    PathNode.LineTo(13.993f, 15.883f),
                    PathNode.CurveTo(13.944025f, 15.465035f, 13.638621f, 15.122455f, 13.229f, 15.026f),
                    PathNode.LineTo(13.117f, 15.006f),
                    PathNode.LineTo(13.0f, 15.0f),
                    PathNode.LineTo(13.0f, 12.0f),
                    PathNode.LineTo(12.993f, 11.883f),
                    PathNode.CurveTo(12.938812f, 11.423509f, 12.576491f, 11.061188f, 12.117f, 11.007f),
                    PathNode.LineTo(12.0f, 11.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.01f, 8.0f),
                    PathNode.LineTo(11.883f, 8.007f),
                    PathNode.CurveTo(11.37995f, 8.066837f, 11.001114f, 8.493402f, 11.001114f, 9.0f),
                    PathNode.CurveTo(11.001114f, 9.506598f, 11.37995f, 9.933164f, 11.883f, 9.993f),
                    PathNode.LineTo(12.0f, 10.0f),
                    PathNode.LineTo(12.127f, 9.993f),
                    PathNode.CurveTo(12.630051f, 9.933164f, 13.008885f, 9.506598f, 13.008885f, 9.0f),
                    PathNode.CurveTo(13.008885f, 8.493402f, 12.630051f, 8.066837f, 12.127f, 8.007f),
                    PathNode.LineTo(12.01f, 8.0f),
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
        return _infoCircle!!
    }

private var _infoCircle: ImageVector? = null
