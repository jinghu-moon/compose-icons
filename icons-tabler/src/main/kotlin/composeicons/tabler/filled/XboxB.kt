package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.XboxB: ImageVector
    get() {
        if (_xboxB != null) return _xboxB!!
        _xboxB = tablerFilledIcon(
            name = "XboxB",
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
                    PathNode.MoveTo(13.0f, 7.0f),
                    PathNode.LineTo(10.0f, 7.0f),
                    PathNode.CurveTo(9.447715f, 7.0f, 9.0f, 7.447716f, 9.0f, 8.0f),
                    PathNode.LineTo(9.0f, 16.0f),
                    PathNode.CurveTo(9.0f, 16.552284f, 9.447715f, 17.0f, 10.0f, 17.0f),
                    PathNode.LineTo(13.0f, 17.0f),
                    PathNode.CurveTo(14.18286f, 16.999578f, 15.255054f, 16.304142f, 15.737763f, 15.224257f),
                    PathNode.CurveTo(16.22047f, 14.144373f, 16.023573f, 12.881652f, 15.235f, 12.0f),
                    PathNode.CurveTo(16.023573f, 11.118348f, 16.22047f, 9.855627f, 15.737763f, 8.775743f),
                    PathNode.CurveTo(15.255054f, 7.695858f, 14.18286f, 7.000421f, 13.0f, 7.0f),
                    PathNode.MoveTo(13.0f, 13.0f),
                    PathNode.CurveTo(13.552285f, 13.0f, 14.0f, 13.447715f, 14.0f, 14.0f),
                    PathNode.LineTo(13.993f, 14.117f),
                    PathNode.CurveTo(13.933684f, 14.620493f, 13.506975f, 14.999933f, 13.0f, 15.0f),
                    PathNode.LineTo(11.0f, 15.0f),
                    PathNode.LineTo(11.0f, 13.0f),
                    PathNode.Close,
                    PathNode.MoveTo(13.0f, 9.0f),
                    PathNode.CurveTo(13.552285f, 9.0f, 14.0f, 9.447715f, 14.0f, 10.0f),
                    PathNode.CurveTo(14.0f, 10.552285f, 13.552285f, 11.0f, 13.0f, 11.0f),
                    PathNode.LineTo(11.0f, 11.0f),
                    PathNode.LineTo(11.0f, 9.0f),
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
        return _xboxB!!
    }

private var _xboxB: ImageVector? = null
