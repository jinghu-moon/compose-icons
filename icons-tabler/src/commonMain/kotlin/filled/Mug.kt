package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Mug: ImageVector
    get() {
        if (_mug != null) return _mug!!
        _mug = tablerFilledIcon(
            name = "Mug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.903f, 4.008f),
                    PathNode.LineTo(4.086f, 4.0f),
                    PathNode.LineTo(14.914f, 4.0f),
                    PathNode.CurveTo(15.466169f, 3.998407f, 15.996313f, 4.216434f, 16.387602f, 4.606033f),
                    PathNode.CurveTo(16.778889f, 4.995633f, 16.999207f, 5.524829f, 17.0f, 6.077f),
                    PathNode.LineTo(17.0f, 7.0f),
                    PathNode.LineTo(18.5f, 7.0f),
                    PathNode.CurveTo(20.417f, 7.0f, 22.0f, 8.477f, 22.0f, 10.333f),
                    PathNode.LineTo(22.0f, 12.667f),
                    PathNode.CurveTo(22.0f, 14.523f, 20.417f, 16.0f, 18.5f, 16.0f),
                    PathNode.LineTo(16.837f, 16.0f),
                    PathNode.CurveTo(16.229485f, 18.357624f, 14.101636f, 20.00393f, 11.667f, 20.0f),
                    PathNode.LineTo(7.333f, 20.0f),
                    PathNode.CurveTo(4.389f, 20.0f, 2.0f, 17.625f, 2.0f, 14.692f),
                    PathNode.LineTo(2.0f, 6.074f),
                    PathNode.CurveTo(2.003345f, 4.996339f, 2.829242f, 4.0997f, 3.903f, 4.008f),
                    PathNode.MoveTo(17.0f, 14.0f),
                    PathNode.LineTo(18.5f, 14.0f),
                    PathNode.CurveTo(19.343f, 14.0f, 20.0f, 13.387f, 20.0f, 12.667f),
                    PathNode.LineTo(20.0f, 10.333f),
                    PathNode.CurveTo(20.0f, 9.613f, 19.343f, 9.0f, 18.5f, 9.0f),
                    PathNode.LineTo(17.0f, 9.0f),
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
        return _mug!!
    }

private var _mug: ImageVector? = null
