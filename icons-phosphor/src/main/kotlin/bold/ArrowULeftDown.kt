package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowULeftDown: ImageVector
    get() {
        if (_arrowULeftDown != null) return _arrowULeftDown!!
        _arrowULeftDown = phosphorBoldIcon(
            name = "ArrowULeftDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 88.0f),
                    PathNode.LineTo(212.0f, 176.0f),
                    PathNode.CurveTo(212.0f, 182.62741f, 206.62741f, 188.0f, 200.0f, 188.0f),
                    PathNode.CurveTo(193.37259f, 188.0f, 188.0f, 182.62741f, 188.0f, 176.0f),
                    PathNode.LineTo(188.0f, 88.0f),
                    PathNode.CurveTo(188.0f, 63.69947f, 168.30052f, 44.0f, 144.0f, 44.0f),
                    PathNode.CurveTo(119.69947f, 44.0f, 100.0f, 63.69947f, 100.0f, 88.0f),
                    PathNode.LineTo(100.0f, 195.0f),
                    PathNode.LineTo(127.51f, 167.48f),
                    PathNode.CurveTo(132.20442f, 162.78558f, 139.81558f, 162.78558f, 144.51f, 167.48f),
                    PathNode.CurveTo(149.20442f, 172.17442f, 149.20442f, 179.78558f, 144.51f, 184.48f),
                    PathNode.LineTo(96.51f, 232.48f),
                    PathNode.CurveTo(94.25838f, 234.73946f, 91.19982f, 236.00946f, 88.01f, 236.00946f),
                    PathNode.CurveTo(84.82018f, 236.00946f, 81.76162f, 234.73946f, 79.51f, 232.48f),
                    PathNode.LineTo(31.51f, 184.48f),
                    PathNode.CurveTo(26.81558f, 179.78558f, 26.815578f, 172.17442f, 31.51f, 167.48f),
                    PathNode.CurveTo(36.20442f, 162.78558f, 43.81558f, 162.78558f, 48.51f, 167.48f),
                    PathNode.LineTo(76.0f, 195.0f),
                    PathNode.LineTo(76.0f, 88.0f),
                    PathNode.CurveTo(76.0f, 50.444637f, 106.44463f, 20.0f, 144.0f, 20.0f),
                    PathNode.CurveTo(181.55536f, 20.0f, 212.0f, 50.444637f, 212.0f, 88.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowULeftDown!!
    }

private var _arrowULeftDown: ImageVector? = null
