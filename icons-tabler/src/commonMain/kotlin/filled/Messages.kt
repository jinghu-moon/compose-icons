package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Messages: ImageVector
    get() {
        if (_messages != null) return _messages!!
        _messages = tablerFilledIcon(
            name = "Messages",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.901f, 14.995f),
                    PathNode.LineTo(20.857f, 14.989f),
                    PathNode.CurveTo(20.822275f, 14.986798f, 20.787985f, 14.980075f, 20.755f, 14.969f),
                    PathNode.LineTo(20.71f, 14.957f),
                    PathNode.LineTo(20.662f, 14.94f),
                    PathNode.LineTo(20.617f, 14.924f),
                    PathNode.LineTo(20.574f, 14.904f),
                    PathNode.LineTo(20.529f, 14.882f),
                    PathNode.LineTo(20.489f, 14.858f),
                    PathNode.LineTo(20.445f, 14.832f),
                    PathNode.LineTo(20.402f, 14.8f),
                    PathNode.LineTo(20.366f, 14.773f),
                    PathNode.CurveTo(20.3406f, 14.752212f, 20.316235f, 14.730185f, 20.293f, 14.707f),
                    PathNode.LineTo(17.586f, 12.0f),
                    PathNode.LineTo(11.0f, 12.0f),
                    PathNode.CurveTo(9.895431f, 12.0f, 9.0f, 11.104569f, 9.0f, 10.0f),
                    PathNode.LineTo(9.0f, 4.0f),
                    PathNode.CurveTo(9.0f, 2.895431f, 9.895431f, 2.0f, 11.0f, 2.0f),
                    PathNode.LineTo(20.0f, 2.0f),
                    PathNode.CurveTo(21.10457f, 2.0f, 22.0f, 2.895431f, 22.0f, 4.0f),
                    PathNode.LineTo(22.0f, 14.0f),
                    PathNode.CurveTo(22.00008f, 14.13142f, 21.974255f, 14.261568f, 21.924f, 14.383f),
                    PathNode.LineTo(21.904f, 14.426f),
                    PathNode.LineTo(21.882f, 14.471f),
                    PathNode.LineTo(21.858f, 14.511f),
                    PathNode.LineTo(21.832f, 14.555f),
                    PathNode.LineTo(21.8f, 14.598f),
                    PathNode.LineTo(21.773f, 14.634f),
                    PathNode.CurveTo(21.626305f, 14.813082f, 21.422024f, 14.935721f, 21.195f, 14.981f),
                    PathNode.LineTo(21.143f, 14.989f),
                    PathNode.LineTo(21.099f, 14.995f),
                    PathNode.CurveTo(21.033163f, 15.00155f, 20.966837f, 15.00155f, 20.901f, 14.995f)
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
                    PathNode.MoveTo(7.0f, 8.999f),
                    PathNode.LineTo(7.0f, 10.0f),
                    PathNode.CurveTo(7.0f, 12.209139f, 8.790861f, 14.0f, 11.0f, 14.0f),
                    PathNode.LineTo(15.0f, 14.0f),
                    PathNode.LineTo(15.0f, 17.0f),
                    PathNode.CurveTo(15.0f, 18.10457f, 14.104569f, 19.0f, 13.0f, 19.0f),
                    PathNode.LineTo(6.414f, 19.0f),
                    PathNode.LineTo(3.707f, 21.707f),
                    PathNode.CurveTo(3.077f, 22.337f, 2.0f, 21.891f, 2.0f, 21.0f),
                    PathNode.LineTo(2.0f, 11.0f),
                    PathNode.CurveTo(2.0f, 9.895431f, 2.895431f, 9.0f, 4.0f, 9.0f),
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
        return _messages!!
    }

private var _messages: ImageVector? = null
