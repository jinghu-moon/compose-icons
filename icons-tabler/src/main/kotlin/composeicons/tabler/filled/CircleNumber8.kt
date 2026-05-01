package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleNumber8: ImageVector
    get() {
        if (_circleNumber8 != null) return _circleNumber8!!
        _circleNumber8 = tablerFilledIcon(
            name = "CircleNumber8",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(13.0f, 7.0f),
                    PathNode.LineTo(11.0f, 7.0f),
                    PathNode.LineTo(10.85f, 7.005f),
                    PathNode.CurveTo(9.866108f, 7.07894f, 9.083146f, 7.859354f, 9.006f, 8.843f),
                    PathNode.LineTo(9.0f, 9.0f),
                    PathNode.LineTo(9.0f, 11.0f),
                    PathNode.LineTo(9.005f, 11.15f),
                    PathNode.CurveTo(9.023f, 11.386f, 9.082f, 11.61f, 9.175f, 11.817f),
                    PathNode.LineTo(9.25f, 11.969f),
                    PathNode.LineTo(9.268f, 11.999f),
                    PathNode.LineTo(9.25f, 12.031f),
                    PathNode.CurveTo(9.117f, 12.271f, 9.032f, 12.54f, 9.007f, 12.826f),
                    PathNode.LineTo(9.0f, 13.0f),
                    PathNode.LineTo(9.0f, 15.0f),
                    PathNode.LineTo(9.005f, 15.15f),
                    PathNode.CurveTo(9.078939f, 16.133892f, 9.859354f, 16.916855f, 10.843f, 16.994f),
                    PathNode.LineTo(11.0f, 17.0f),
                    PathNode.LineTo(13.0f, 17.0f),
                    PathNode.LineTo(13.15f, 16.995f),
                    PathNode.CurveTo(14.133892f, 16.92106f, 14.916854f, 16.140646f, 14.994f, 15.157f),
                    PathNode.LineTo(15.0f, 15.0f),
                    PathNode.LineTo(15.0f, 13.0f),
                    PathNode.LineTo(14.995f, 12.85f),
                    PathNode.CurveTo(14.977548f, 12.619473f, 14.920018f, 12.393757f, 14.825f, 12.183f),
                    PathNode.LineTo(14.75f, 12.031f),
                    PathNode.LineTo(14.731f, 11.999f),
                    PathNode.LineTo(14.751f, 11.969f),
                    PathNode.CurveTo(14.886165f, 11.723751f, 14.968593f, 11.452964f, 14.993f, 11.174f),
                    PathNode.LineTo(15.0f, 11.0f),
                    PathNode.LineTo(15.0f, 9.0f),
                    PathNode.LineTo(14.995f, 8.85f),
                    PathNode.CurveTo(14.921061f, 7.866108f, 14.140646f, 7.083146f, 13.157f, 7.006f),
                    PathNode.LineTo(13.0f, 7.0f),
                    PathNode.Close,
                    PathNode.MoveTo(13.0f, 13.0f),
                    PathNode.LineTo(13.0f, 15.0f),
                    PathNode.LineTo(11.0f, 15.0f),
                    PathNode.LineTo(11.0f, 13.0f),
                    PathNode.LineTo(13.0f, 13.0f),
                    PathNode.Close,
                    PathNode.MoveTo(13.0f, 9.0f),
                    PathNode.LineTo(13.0f, 11.0f),
                    PathNode.LineTo(11.0f, 11.0f),
                    PathNode.LineTo(11.0f, 9.0f),
                    PathNode.LineTo(13.0f, 9.0f),
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
        return _circleNumber8!!
    }

private var _circleNumber8: ImageVector? = null
