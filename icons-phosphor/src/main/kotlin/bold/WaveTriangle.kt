package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WaveTriangle: ImageVector
    get() {
        if (_waveTriangle != null) return _waveTriangle!!
        _waveTriangle = phosphorBoldIcon(
            name = "WaveTriangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(241.73f, 135.0f),
                    PathNode.LineTo(189.73f, 207.0f),
                    PathNode.CurveTo(187.47415f, 210.12524f, 183.85437f, 211.97667f, 180.0f, 211.97667f),
                    PathNode.CurveTo(176.14563f, 211.97667f, 172.52585f, 210.12524f, 170.27f, 207.0f),
                    PathNode.LineTo(76.0f, 76.5f),
                    PathNode.LineTo(33.73f, 135.0f),
                    PathNode.CurveTo(31.320627f, 138.71005f, 27.065458f, 140.79362f, 22.65736f, 140.4218f),
                    PathNode.CurveTo(18.249264f, 140.04997f, 14.403241f, 137.28305f, 12.649387f, 133.22182f),
                    PathNode.CurveTo(10.895535f, 129.16058f, 11.518329f, 124.4638f, 14.27f, 121.0f),
                    PathNode.LineTo(66.27f, 49.0f),
                    PathNode.CurveTo(68.52587f, 45.874752f, 72.14564f, 44.023327f, 76.0f, 44.023327f),
                    PathNode.CurveTo(79.85436f, 44.023327f, 83.47413f, 45.874752f, 85.73f, 49.0f),
                    PathNode.LineTo(180.0f, 179.5f),
                    PathNode.LineTo(222.27f, 121.0f),
                    PathNode.CurveTo(224.67937f, 117.28995f, 228.93454f, 115.20637f, 233.34264f, 115.5782f),
                    PathNode.CurveTo(237.75073f, 115.95003f, 241.59676f, 118.71695f, 243.35062f, 122.77818f),
                    PathNode.CurveTo(245.10446f, 126.83941f, 244.48167f, 131.53621f, 241.73f, 135.0f),
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
        return _waveTriangle!!
    }

private var _waveTriangle: ImageVector? = null
