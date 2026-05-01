package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Sliders: ImageVector
    get() {
        if (_sliders != null) return _sliders!!
        _sliders = phosphorFillIcon(
            name = "Sliders",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(84.0f, 136.0f),
                    PathNode.CurveTo(83.99876f, 148.38165f, 75.86552f, 159.29239f, 64.0f, 162.83f),
                    PathNode.LineTo(64.0f, 216.0f),
                    PathNode.CurveTo(64.0f, 220.41827f, 60.418278f, 224.0f, 56.0f, 224.0f),
                    PathNode.CurveTo(51.581722f, 224.0f, 48.0f, 220.41827f, 48.0f, 216.0f),
                    PathNode.LineTo(48.0f, 162.83f),
                    PathNode.CurveTo(36.138214f, 159.28896f, 28.009438f, 148.37904f, 28.009438f, 136.0f),
                    PathNode.CurveTo(28.009438f, 123.62095f, 36.138214f, 112.711044f, 48.0f, 109.17f),
                    PathNode.LineTo(48.0f, 40.0f),
                    PathNode.CurveTo(48.0f, 35.581722f, 51.581722f, 32.0f, 56.0f, 32.0f),
                    PathNode.CurveTo(60.418278f, 32.0f, 64.0f, 35.581722f, 64.0f, 40.0f),
                    PathNode.LineTo(64.0f, 109.17f),
                    PathNode.CurveTo(75.86552f, 112.70761f, 83.99876f, 123.61835f, 84.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 61.17f),
                    PathNode.LineTo(136.0f, 40.0f),
                    PathNode.CurveTo(136.0f, 35.581722f, 132.41827f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(123.58172f, 32.0f, 120.0f, 35.581722f, 120.0f, 40.0f),
                    PathNode.LineTo(120.0f, 61.17f),
                    PathNode.CurveTo(108.13822f, 64.711044f, 100.00944f, 75.62095f, 100.00944f, 88.0f),
                    PathNode.CurveTo(100.00944f, 100.37905f, 108.13822f, 111.288956f, 120.0f, 114.83f),
                    PathNode.LineTo(120.0f, 216.0f),
                    PathNode.CurveTo(120.0f, 220.41827f, 123.58172f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(132.41827f, 224.0f, 136.0f, 220.41827f, 136.0f, 216.0f),
                    PathNode.LineTo(136.0f, 114.83f),
                    PathNode.CurveTo(147.86179f, 111.288956f, 155.99055f, 100.37905f, 155.99055f, 88.0f),
                    PathNode.CurveTo(155.99055f, 75.62095f, 147.86179f, 64.711044f, 136.0f, 61.17f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 141.17f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.CurveTo(208.0f, 35.581722f, 204.41827f, 32.0f, 200.0f, 32.0f),
                    PathNode.CurveTo(195.58173f, 32.0f, 192.0f, 35.581722f, 192.0f, 40.0f),
                    PathNode.LineTo(192.0f, 141.17f),
                    PathNode.CurveTo(180.13821f, 144.71104f, 172.00945f, 155.62096f, 172.00945f, 168.0f),
                    PathNode.CurveTo(172.00945f, 180.37904f, 180.13821f, 191.28896f, 192.0f, 194.83f),
                    PathNode.LineTo(192.0f, 216.0f),
                    PathNode.CurveTo(192.0f, 220.41827f, 195.58173f, 224.0f, 200.0f, 224.0f),
                    PathNode.CurveTo(204.41827f, 224.0f, 208.0f, 220.41827f, 208.0f, 216.0f),
                    PathNode.LineTo(208.0f, 194.83f),
                    PathNode.CurveTo(219.86179f, 191.28896f, 227.99055f, 180.37904f, 227.99055f, 168.0f),
                    PathNode.CurveTo(227.99055f, 155.62096f, 219.86179f, 144.71104f, 208.0f, 141.17f),
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
        return _sliders!!
    }

private var _sliders: ImageVector? = null
