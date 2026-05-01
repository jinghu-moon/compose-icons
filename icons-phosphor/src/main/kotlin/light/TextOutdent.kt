package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextOutdent: ImageVector
    get() {
        if (_textOutdent != null) return _textOutdent!!
        _textOutdent = phosphorLightIcon(
            name = "TextOutdent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.0f, 128.0f),
                    PathNode.CurveTo(222.0f, 131.3137f, 219.3137f, 134.0f, 216.0f, 134.0f),
                    PathNode.LineTo(112.0f, 134.0f),
                    PathNode.CurveTo(108.686295f, 134.0f, 106.0f, 131.3137f, 106.0f, 128.0f),
                    PathNode.CurveTo(106.0f, 124.686295f, 108.686295f, 122.0f, 112.0f, 122.0f),
                    PathNode.LineTo(216.0f, 122.0f),
                    PathNode.CurveTo(219.3137f, 122.0f, 222.0f, 124.686295f, 222.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 70.0f),
                    PathNode.LineTo(216.0f, 70.0f),
                    PathNode.CurveTo(219.3137f, 70.0f, 222.0f, 67.313705f, 222.0f, 64.0f),
                    PathNode.CurveTo(222.0f, 60.68629f, 219.3137f, 58.0f, 216.0f, 58.0f),
                    PathNode.LineTo(112.0f, 58.0f),
                    PathNode.CurveTo(108.686295f, 58.0f, 106.0f, 60.68629f, 106.0f, 64.0f),
                    PathNode.CurveTo(106.0f, 67.313705f, 108.686295f, 70.0f, 112.0f, 70.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 186.0f),
                    PathNode.LineTo(40.0f, 186.0f),
                    PathNode.CurveTo(36.68629f, 186.0f, 34.0f, 188.6863f, 34.0f, 192.0f),
                    PathNode.CurveTo(34.0f, 195.3137f, 36.68629f, 198.0f, 40.0f, 198.0f),
                    PathNode.LineTo(216.0f, 198.0f),
                    PathNode.CurveTo(219.3137f, 198.0f, 222.0f, 195.3137f, 222.0f, 192.0f),
                    PathNode.CurveTo(222.0f, 188.6863f, 219.3137f, 186.0f, 216.0f, 186.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 142.0f),
                    PathNode.CurveTo(74.42513f, 141.99785f, 76.61053f, 140.53604f, 77.5383f, 138.2954f),
                    PathNode.CurveTo(78.466064f, 136.05473f, 77.953766f, 133.47589f, 76.24f, 131.76f),
                    PathNode.LineTo(40.49f, 96.0f),
                    PathNode.LineTo(76.24f, 60.24f),
                    PathNode.CurveTo(78.44287f, 57.875923f, 78.37787f, 54.19192f, 76.09297f, 51.907024f),
                    PathNode.CurveTo(73.808075f, 49.622128f, 70.12408f, 49.55713f, 67.76f, 51.76f),
                    PathNode.LineTo(27.76f, 91.76f),
                    PathNode.CurveTo(25.420374f, 94.10254f, 25.420374f, 97.89746f, 27.76f, 100.24f),
                    PathNode.LineTo(67.76f, 140.24f),
                    PathNode.CurveTo(68.88415f, 141.36554f, 70.40924f, 141.9986f, 72.0f, 142.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _textOutdent!!
    }

private var _textOutdent: ImageVector? = null
