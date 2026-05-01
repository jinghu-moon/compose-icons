package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AlertSquareRounded: ImageVector
    get() {
        if (_alertSquareRounded != null) return _alertSquareRounded!!
        _alertSquareRounded = tablerFilledIcon(
            name = "AlertSquareRounded",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.LineTo(12.642f, 2.005f),
                    PathNode.LineTo(13.258f, 2.022f),
                    PathNode.LineTo(13.557f, 2.035f),
                    PathNode.LineTo(14.136f, 2.069f),
                    PathNode.LineTo(14.689f, 2.115f),
                    PathNode.CurveTo(19.376f, 2.57f, 21.339f, 4.448f, 21.855f, 9.021f),
                    PathNode.LineTo(21.885f, 9.311f),
                    PathNode.LineTo(21.931f, 9.864f),
                    PathNode.LineTo(21.972f, 10.591f),
                    PathNode.LineTo(21.978f, 10.741f),
                    PathNode.LineTo(21.995f, 11.358f),
                    PathNode.LineTo(22.0f, 12.0f),
                    PathNode.LineTo(21.995f, 12.642f),
                    PathNode.LineTo(21.978f, 13.258f),
                    PathNode.LineTo(21.965f, 13.557f),
                    PathNode.LineTo(21.931f, 14.136f),
                    PathNode.LineTo(21.885f, 14.689f),
                    PathNode.CurveTo(21.43f, 19.376f, 19.552f, 21.339f, 14.979f, 21.855f),
                    PathNode.LineTo(14.689f, 21.885f),
                    PathNode.LineTo(14.136f, 21.931f),
                    PathNode.LineTo(13.409f, 21.972f),
                    PathNode.LineTo(13.259f, 21.978f),
                    PathNode.LineTo(12.642f, 21.995f),
                    PathNode.LineTo(12.0f, 22.0f),
                    PathNode.LineTo(11.358f, 21.995f),
                    PathNode.LineTo(10.742f, 21.978f),
                    PathNode.LineTo(10.443f, 21.965f),
                    PathNode.LineTo(9.864f, 21.931f),
                    PathNode.LineTo(9.311f, 21.885f),
                    PathNode.CurveTo(4.624f, 21.43f, 2.661f, 19.552f, 2.145f, 14.979f),
                    PathNode.LineTo(2.115f, 14.689f),
                    PathNode.LineTo(2.069f, 14.136f),
                    PathNode.LineTo(2.028f, 13.409f),
                    PathNode.LineTo(2.022f, 13.259f),
                    PathNode.LineTo(2.005f, 12.642f),
                    PathNode.LineTo(2.001f, 12.324f),
                    PathNode.LineTo(2.001f, 11.676f),
                    PathNode.LineTo(2.005f, 11.358f),
                    PathNode.LineTo(2.022f, 10.742f),
                    PathNode.LineTo(2.035f, 10.443f),
                    PathNode.LineTo(2.069f, 9.864f),
                    PathNode.LineTo(2.115f, 9.311f),
                    PathNode.CurveTo(2.57f, 4.624f, 4.448f, 2.661f, 9.021f, 2.145f),
                    PathNode.LineTo(9.311f, 2.115f),
                    PathNode.LineTo(9.864f, 2.069f),
                    PathNode.LineTo(10.591f, 2.028f),
                    PathNode.LineTo(10.741f, 2.022f),
                    PathNode.LineTo(11.358f, 2.005f),
                    PathNode.CurveTo(11.568f, 2.002f, 11.782f, 2.0f, 12.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.01f, 15.0f),
                    PathNode.LineTo(11.883f, 15.007f),
                    PathNode.CurveTo(11.37995f, 15.066836f, 11.001114f, 15.493402f, 11.001114f, 16.0f),
                    PathNode.CurveTo(11.001114f, 16.506598f, 11.37995f, 16.933163f, 11.883f, 16.993f),
                    PathNode.LineTo(12.0f, 17.0f),
                    PathNode.LineTo(12.127f, 16.993f),
                    PathNode.CurveTo(12.630051f, 16.933163f, 13.008885f, 16.506598f, 13.008885f, 16.0f),
                    PathNode.CurveTo(13.008885f, 15.493402f, 12.630051f, 15.066836f, 12.127f, 15.007f),
                    PathNode.LineTo(12.01f, 15.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 7.0f),
                    PathNode.CurveTo(11.493025f, 7.000067f, 11.066316f, 7.379507f, 11.007f, 7.883f),
                    PathNode.LineTo(11.0f, 8.0f),
                    PathNode.LineTo(11.0f, 12.0f),
                    PathNode.LineTo(11.007f, 12.117f),
                    PathNode.CurveTo(11.066836f, 12.62005f, 11.493402f, 12.998886f, 12.0f, 12.998886f),
                    PathNode.CurveTo(12.506598f, 12.998886f, 12.933164f, 12.62005f, 12.993f, 12.117f),
                    PathNode.LineTo(13.0f, 12.0f),
                    PathNode.LineTo(13.0f, 8.0f),
                    PathNode.LineTo(12.993f, 7.883f),
                    PathNode.CurveTo(12.933684f, 7.379507f, 12.506975f, 7.000067f, 12.0f, 7.0f),
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
        return _alertSquareRounded!!
    }

private var _alertSquareRounded: ImageVector? = null
