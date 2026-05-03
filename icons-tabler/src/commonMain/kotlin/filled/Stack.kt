package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Stack: ImageVector
    get() {
        if (_stack != null) return _stack!!
        _stack = tablerFilledIcon(
            name = "Stack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.894f, 13.553f),
                    PathNode.CurveTo(21.140587f, 14.046762f, 20.940525f, 14.646942f, 20.447f, 14.894f),
                    PathNode.LineTo(12.447f, 18.894f),
                    PathNode.CurveTo(12.165589f, 19.034622f, 11.834411f, 19.034622f, 11.553f, 18.894f),
                    PathNode.LineTo(3.553f, 14.894f),
                    PathNode.CurveTo(3.077481f, 14.637574f, 2.891605f, 14.049824f, 3.133213f, 13.566607f),
                    PathNode.CurveTo(3.374822f, 13.08339f, 3.956548f, 12.87944f, 4.447f, 13.106f),
                    PathNode.LineTo(12.0f, 16.88f),
                    PathNode.LineTo(19.554f, 13.105f),
                    PathNode.CurveTo(20.047762f, 12.858414f, 20.647942f, 13.058473f, 20.895f, 13.552f),
                    PathNode.MoveTo(12.008f, 5.0f),
                    PathNode.QuadTo(12.064f, 5.0f, 12.119f, 5.007f),
                    PathNode.LineTo(12.23f, 5.027f),
                    PathNode.LineTo(12.316f, 5.051f),
                    PathNode.LineTo(12.328f, 5.057f),
                    PathNode.LineTo(12.34f, 5.059f),
                    PathNode.LineTo(12.369f, 5.073f),
                    PathNode.LineTo(12.419f, 5.092f),
                    PathNode.LineTo(12.435f, 5.101f),
                    PathNode.LineTo(12.447f, 5.106f),
                    PathNode.LineTo(20.447f, 9.106f),
                    PathNode.CurveTo(20.785315f, 9.275561f, 20.998934f, 9.621572f, 20.998934f, 10.0f),
                    PathNode.CurveTo(20.998934f, 10.378428f, 20.785315f, 10.724439f, 20.447f, 10.894f),
                    PathNode.LineTo(12.447f, 14.894f),
                    PathNode.CurveTo(12.165589f, 15.034621f, 11.834411f, 15.034621f, 11.553f, 14.894f),
                    PathNode.LineTo(3.553f, 10.894f),
                    PathNode.CurveTo(3.214685f, 10.724439f, 3.001067f, 10.378428f, 3.001067f, 10.0f),
                    PathNode.CurveTo(3.001067f, 9.621572f, 3.214685f, 9.275561f, 3.553f, 9.106f),
                    PathNode.LineTo(11.553f, 5.106f),
                    PathNode.LineTo(11.564f, 5.101f),
                    PathNode.LineTo(11.582f, 5.091f),
                    PathNode.LineTo(11.66f, 5.059f),
                    PathNode.LineTo(11.671f, 5.057f),
                    PathNode.LineTo(11.684f, 5.051f),
                    PathNode.LineTo(11.77f, 5.027f),
                    PathNode.LineTo(11.88f, 5.007f),
                    PathNode.LineTo(11.936f, 5.002f),
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
        return _stack!!
    }

private var _stack: ImageVector? = null
