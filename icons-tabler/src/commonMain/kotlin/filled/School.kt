package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.School: ImageVector
    get() {
        if (_school != null) return _school!!
        _school = tablerFilledIcon(
            name = "School",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 13.431f),
                    PathNode.LineTo(19.0f, 16.0f),
                    PathNode.CurveTo(19.0f, 18.398f, 15.795f, 20.0f, 12.0f, 20.0f),
                    PathNode.CurveTo(8.205f, 20.0f, 5.0f, 18.398f, 5.0f, 16.0f),
                    PathNode.LineTo(5.0f, 13.431f),
                    PathNode.LineTo(10.886f, 15.785f),
                    PathNode.CurveTo(11.527357f, 16.041773f, 12.237681f, 16.069324f, 12.897f, 15.863f),
                    PathNode.LineTo(13.114f, 15.785f),
                    PathNode.Close,
                    PathNode.MoveTo(21.0f, 10.476f),
                    PathNode.LineTo(12.371f, 13.928f),
                    PathNode.CurveTo(12.132819f, 14.023156f, 11.867181f, 14.023156f, 11.629f, 13.928f),
                    PathNode.LineTo(1.629f, 9.928f),
                    PathNode.CurveTo(0.79f, 9.593f, 0.79f, 8.407f, 1.629f, 8.072f),
                    PathNode.LineTo(11.629f, 4.072f),
                    PathNode.CurveTo(11.707624f, 4.040372f, 11.789951f, 4.018866f, 11.874f, 4.008f),
                    PathNode.LineTo(12.0f, 4.0f),
                    PathNode.LineTo(12.126f, 4.008f),
                    PathNode.CurveTo(12.210049f, 4.018866f, 12.292376f, 4.040372f, 12.371f, 4.072f),
                    PathNode.LineTo(22.403f, 8.085f),
                    PathNode.LineTo(22.511f, 8.140001f),
                    PathNode.LineTo(22.61f, 8.208f),
                    PathNode.LineTo(22.698f, 8.284001f),
                    PathNode.LineTo(22.773f, 8.366f),
                    PathNode.LineTo(22.808f, 8.41f),
                    PathNode.LineTo(22.881f, 8.525f),
                    PathNode.LineTo(22.933f, 8.64f),
                    PathNode.LineTo(22.967f, 8.742f),
                    PathNode.LineTo(22.992f, 8.877f),
                    PathNode.LineTo(22.998f, 8.935f),
                    PathNode.LineTo(23.0f, 15.0f),
                    PathNode.CurveTo(23.0f, 15.552285f, 22.552284f, 16.0f, 22.0f, 16.0f),
                    PathNode.CurveTo(21.447716f, 16.0f, 21.0f, 15.552285f, 21.0f, 15.0f),
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
        return _school!!
    }

private var _school: ImageVector? = null
