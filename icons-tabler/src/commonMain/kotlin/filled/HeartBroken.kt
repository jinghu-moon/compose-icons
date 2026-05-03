package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HeartBroken: ImageVector
    get() {
        if (_heartBroken != null) return _heartBroken!!
        _heartBroken = tablerFilledIcon(
            name = "HeartBroken",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.001f, 3.8f),
                    PathNode.LineTo(11.0f, 5.763f),
                    PathNode.LineTo(9.106f, 9.553f),
                    PathNode.LineTo(9.059f, 9.663f),
                    PathNode.CurveTo(8.911105f, 10.075772f, 9.049356f, 10.536745f, 9.4f, 10.8f),
                    PathNode.LineTo(12.732f, 13.299f),
                    PathNode.LineTo(11.106f, 16.553f),
                    PathNode.CurveTo(11.036457f, 16.691755f, 11.000166f, 16.844793f, 11.0f, 17.0f),
                    PathNode.LineTo(11.0f, 20.417f),
                    PathNode.LineTo(3.803f, 13.29f),
                    PathNode.CurveTo(1.670479f, 11.213615f, 1.382511f, 7.887743f, 3.126407f, 5.475722f),
                    PathNode.CurveTo(4.870302f, 3.063701f, 8.118847f, 2.294733f, 10.759f, 3.669f),
                    PathNode.Close,
                    PathNode.MoveTo(16.771f, 3.061f),
                    PathNode.LineTo(17.017f, 3.098f),
                    PathNode.CurveTo(19.235155f, 3.480856f, 21.052422f, 5.073028f, 21.723574f, 7.221597f),
                    PathNode.CurveTo(22.394724f, 9.370166f, 21.806837f, 11.713638f, 20.201f, 13.291f),
                    PathNode.LineTo(20.157f, 13.328f),
                    PathNode.LineTo(13.0f, 20.416f),
                    PathNode.LineTo(13.0f, 17.235f),
                    PathNode.LineTo(14.894f, 13.447f),
                    PathNode.LineTo(14.941f, 13.337f),
                    PathNode.CurveTo(15.088895f, 12.924228f, 14.950644f, 12.463255f, 14.6f, 12.2f),
                    PathNode.LineTo(11.267f, 9.7f),
                    PathNode.LineTo(12.894f, 6.447f),
                    PathNode.CurveTo(12.963543f, 6.308245f, 12.999834f, 6.155207f, 13.0f, 6.0f),
                    PathNode.LineTo(13.0f, 3.813f),
                    PathNode.CurveTo(14.14018f, 3.155642f, 15.464869f, 2.891407f, 16.77f, 3.061f)
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
        return _heartBroken!!
    }

private var _heartBroken: ImageVector? = null
