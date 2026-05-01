package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CarProfile: ImageVector
    get() {
        if (_carProfile != null) return _carProfile!!
        _carProfile = phosphorLightIcon(
            name = "CarProfile",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 114.0f),
                    PathNode.LineTo(210.49f, 114.0f),
                    PathNode.LineTo(166.59f, 70.1f),
                    PathNode.CurveTo(163.96803f, 67.46894f, 160.40445f, 65.99311f, 156.69f, 66.0f),
                    PathNode.LineTo(44.28f, 66.0f),
                    PathNode.CurveTo(39.599392f, 65.998634f, 35.227737f, 68.33643f, 32.63f, 72.23f),
                    PathNode.LineTo(3.0f, 116.67f),
                    PathNode.CurveTo(2.34531f, 117.656975f, 1.997364f, 118.815636f, 2.0f, 120.0f),
                    PathNode.LineTo(2.0f, 168.0f),
                    PathNode.CurveTo(2.0f, 175.73198f, 8.268014f, 182.0f, 16.0f, 182.0f),
                    PathNode.LineTo(34.6f, 182.0f),
                    PathNode.CurveTo(37.439156f, 195.98195f, 49.73271f, 206.03008f, 64.0f, 206.03008f),
                    PathNode.CurveTo(78.26729f, 206.03008f, 90.560844f, 195.98195f, 93.4f, 182.0f),
                    PathNode.LineTo(162.6f, 182.0f),
                    PathNode.CurveTo(165.43915f, 195.98195f, 177.7327f, 206.03008f, 192.0f, 206.03008f),
                    PathNode.CurveTo(206.2673f, 206.03008f, 218.56085f, 195.98195f, 221.4f, 182.0f),
                    PathNode.LineTo(240.0f, 182.0f),
                    PathNode.CurveTo(247.73198f, 182.0f, 254.0f, 175.73198f, 254.0f, 168.0f),
                    PathNode.LineTo(254.0f, 128.0f),
                    PathNode.CurveTo(254.0f, 120.26801f, 247.73198f, 114.0f, 240.0f, 114.0f),
                    PathNode.Close,
                    PathNode.MoveTo(42.62f, 78.89f),
                    PathNode.CurveTo(42.99026f, 78.33504f, 43.61286f, 78.00123f, 44.28f, 78.0f),
                    PathNode.LineTo(156.69f, 78.0f),
                    PathNode.CurveTo(157.21957f, 78.002235f, 157.72665f, 78.21441f, 158.1f, 78.59f),
                    PathNode.LineTo(193.52f, 114.0f),
                    PathNode.LineTo(19.21f, 114.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 194.0f),
                    PathNode.CurveTo(54.058876f, 194.0f, 46.0f, 185.94113f, 46.0f, 176.0f),
                    PathNode.CurveTo(46.0f, 166.05887f, 54.058876f, 158.0f, 64.0f, 158.0f),
                    PathNode.CurveTo(73.94112f, 158.0f, 82.0f, 166.05887f, 82.0f, 176.0f),
                    PathNode.CurveTo(82.0f, 185.94113f, 73.94112f, 194.0f, 64.0f, 194.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 194.0f),
                    PathNode.CurveTo(182.05887f, 194.0f, 174.0f, 185.94113f, 174.0f, 176.0f),
                    PathNode.CurveTo(174.0f, 166.05887f, 182.05887f, 158.0f, 192.0f, 158.0f),
                    PathNode.CurveTo(201.94113f, 158.0f, 210.0f, 166.05887f, 210.0f, 176.0f),
                    PathNode.CurveTo(210.0f, 185.94113f, 201.94113f, 194.0f, 192.0f, 194.0f),
                    PathNode.Close,
                    PathNode.MoveTo(242.0f, 168.0f),
                    PathNode.CurveTo(242.0f, 169.10457f, 241.10457f, 170.0f, 240.0f, 170.0f),
                    PathNode.LineTo(221.4f, 170.0f),
                    PathNode.CurveTo(218.56085f, 156.01805f, 206.2673f, 145.96992f, 192.0f, 145.96992f),
                    PathNode.CurveTo(177.7327f, 145.96992f, 165.43915f, 156.01805f, 162.6f, 170.0f),
                    PathNode.LineTo(93.4f, 170.0f),
                    PathNode.CurveTo(90.560844f, 156.01805f, 78.26729f, 145.96992f, 64.0f, 145.96992f),
                    PathNode.CurveTo(49.73271f, 145.96992f, 37.439156f, 156.01805f, 34.6f, 170.0f),
                    PathNode.LineTo(16.0f, 170.0f),
                    PathNode.CurveTo(14.895431f, 170.0f, 14.0f, 169.10457f, 14.0f, 168.0f),
                    PathNode.LineTo(14.0f, 126.0f),
                    PathNode.LineTo(240.0f, 126.0f),
                    PathNode.CurveTo(241.10457f, 126.0f, 242.0f, 126.89543f, 242.0f, 128.0f),
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
        return _carProfile!!
    }

private var _carProfile: ImageVector? = null
