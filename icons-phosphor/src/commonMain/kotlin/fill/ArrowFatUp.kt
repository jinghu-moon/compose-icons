package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowFatUp: ImageVector
    get() {
        if (_arrowFatUp != null) return _arrowFatUp!!
        _arrowFatUp = phosphorFillIcon(
            name = "ArrowFatUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(231.39f, 123.06f),
                    PathNode.CurveTo(230.15236f, 126.04962f, 227.23566f, 127.99934f, 224.0f, 128.0f),
                    PathNode.LineTo(184.0f, 128.0f),
                    PathNode.LineTo(184.0f, 208.0f),
                    PathNode.CurveTo(184.0f, 216.83656f, 176.83656f, 224.0f, 168.0f, 224.0f),
                    PathNode.LineTo(88.0f, 224.0f),
                    PathNode.CurveTo(79.163445f, 224.0f, 72.0f, 216.83656f, 72.0f, 208.0f),
                    PathNode.LineTo(72.0f, 128.0f),
                    PathNode.LineTo(32.0f, 128.0f),
                    PathNode.CurveTo(28.762346f, 128.00255f, 25.842361f, 126.05338f, 24.60302f, 123.062325f),
                    PathNode.CurveTo(23.36368f, 120.07126f, 24.049358f, 116.62809f, 26.34f, 114.34f),
                    PathNode.LineTo(122.34f, 18.34f),
                    PathNode.CurveTo(123.840546f, 16.837784f, 125.876724f, 15.993707f, 128.0f, 15.993707f),
                    PathNode.CurveTo(130.12328f, 15.993707f, 132.15945f, 16.837784f, 133.66f, 18.34f),
                    PathNode.LineTo(229.66f, 114.34f),
                    PathNode.CurveTo(231.94725f, 116.62924f, 232.63007f, 120.07096f, 231.39f, 123.06f),
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
        return _arrowFatUp!!
    }

private var _arrowFatUp: ImageVector? = null
