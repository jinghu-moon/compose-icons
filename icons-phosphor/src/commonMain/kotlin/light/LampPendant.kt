package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LampPendant: ImageVector
    get() {
        if (_lampPendant != null) return _lampPendant!!
        _lampPendant = phosphorLightIcon(
            name = "LampPendant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(174.0f, 76.05f),
                    PathNode.LineTo(174.0f, 72.0f),
                    PathNode.CurveTo(174.0f, 64.26801f, 167.73198f, 58.0f, 160.0f, 58.0f),
                    PathNode.LineTo(134.0f, 58.0f),
                    PathNode.LineTo(134.0f, 16.0f),
                    PathNode.CurveTo(134.0f, 12.686292f, 131.3137f, 10.0f, 128.0f, 10.0f),
                    PathNode.CurveTo(124.686295f, 10.0f, 122.0f, 12.686292f, 122.0f, 16.0f),
                    PathNode.LineTo(122.0f, 58.0f),
                    PathNode.LineTo(96.0f, 58.0f),
                    PathNode.CurveTo(88.26801f, 58.0f, 82.0f, 64.26801f, 82.0f, 72.0f),
                    PathNode.LineTo(82.0f, 76.0f),
                    PathNode.CurveTo(42.92367f, 93.92313f, 17.908442f, 133.00943f, 18.0f, 176.0f),
                    PathNode.CurveTo(18.0f, 179.3137f, 20.68629f, 182.0f, 24.0f, 182.0f),
                    PathNode.LineTo(90.0f, 182.0f),
                    PathNode.LineTo(90.0f, 184.0f),
                    PathNode.CurveTo(90.0f, 204.98682f, 107.013176f, 222.0f, 128.0f, 222.0f),
                    PathNode.CurveTo(148.98682f, 222.0f, 166.0f, 204.98682f, 166.0f, 184.0f),
                    PathNode.LineTo(166.0f, 182.0f),
                    PathNode.LineTo(232.0f, 182.0f),
                    PathNode.CurveTo(235.3137f, 182.0f, 238.0f, 179.3137f, 238.0f, 176.0f),
                    PathNode.CurveTo(238.07196f, 133.02751f, 213.05983f, 93.96561f, 174.0f, 76.05f),
                    PathNode.Close,
                    PathNode.MoveTo(154.0f, 184.0f),
                    PathNode.CurveTo(154.0f, 198.3594f, 142.3594f, 210.0f, 128.0f, 210.0f),
                    PathNode.CurveTo(113.640594f, 210.0f, 102.0f, 198.3594f, 102.0f, 184.0f),
                    PathNode.LineTo(102.0f, 182.0f),
                    PathNode.LineTo(154.0f, 182.0f),
                    PathNode.Close,
                    PathNode.MoveTo(30.18f, 170.0f),
                    PathNode.CurveTo(32.40341f, 132.65045f, 55.749737f, 99.84601f, 90.31f, 85.51f),
                    PathNode.CurveTo(92.535446f, 84.58167f, 93.98894f, 82.411285f, 94.0f, 80.0f),
                    PathNode.LineTo(94.0f, 72.0f),
                    PathNode.CurveTo(94.0f, 70.89543f, 94.89543f, 70.0f, 96.0f, 70.0f),
                    PathNode.LineTo(160.0f, 70.0f),
                    PathNode.CurveTo(161.10457f, 70.0f, 162.0f, 70.89543f, 162.0f, 72.0f),
                    PathNode.LineTo(162.0f, 80.0f),
                    PathNode.CurveTo(161.999f, 82.4222f, 163.45451f, 84.60745f, 165.69f, 85.54f),
                    PathNode.CurveTo(200.24095f, 99.871315f, 223.58543f, 132.66153f, 225.82f, 170.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _lampPendant!!
    }

private var _lampPendant: ImageVector? = null
