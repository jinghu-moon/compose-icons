package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SlidersHorizontal: ImageVector
    get() {
        if (_slidersHorizontal != null) return _slidersHorizontal!!
        _slidersHorizontal = phosphorLightIcon(
            name = "SlidersHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(40.0f, 86.0f),
                    PathNode.LineTo(74.6f, 86.0f),
                    PathNode.CurveTo(77.439156f, 99.98194f, 89.73271f, 110.030075f, 104.0f, 110.030075f),
                    PathNode.CurveTo(118.26729f, 110.030075f, 130.56085f, 99.98194f, 133.4f, 86.0f),
                    PathNode.LineTo(216.0f, 86.0f),
                    PathNode.CurveTo(219.3137f, 86.0f, 222.0f, 83.313705f, 222.0f, 80.0f),
                    PathNode.CurveTo(222.0f, 76.686295f, 219.3137f, 74.0f, 216.0f, 74.0f),
                    PathNode.LineTo(133.4f, 74.0f),
                    PathNode.CurveTo(130.56085f, 60.018055f, 118.26729f, 49.969925f, 104.0f, 49.969925f),
                    PathNode.CurveTo(89.73271f, 49.969925f, 77.439156f, 60.018055f, 74.6f, 74.0f),
                    PathNode.LineTo(40.0f, 74.0f),
                    PathNode.CurveTo(36.68629f, 74.0f, 34.0f, 76.686295f, 34.0f, 80.0f),
                    PathNode.CurveTo(34.0f, 83.313705f, 36.68629f, 86.0f, 40.0f, 86.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 62.0f),
                    PathNode.CurveTo(113.94112f, 62.0f, 122.0f, 70.05888f, 122.0f, 80.0f),
                    PathNode.CurveTo(122.0f, 89.94112f, 113.94112f, 98.0f, 104.0f, 98.0f),
                    PathNode.CurveTo(94.05888f, 98.0f, 86.0f, 89.94112f, 86.0f, 80.0f),
                    PathNode.CurveTo(86.0f, 70.05888f, 94.05888f, 62.0f, 104.0f, 62.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 170.0f),
                    PathNode.LineTo(197.4f, 170.0f),
                    PathNode.CurveTo(194.56085f, 156.01805f, 182.2673f, 145.96992f, 168.0f, 145.96992f),
                    PathNode.CurveTo(153.7327f, 145.96992f, 141.43915f, 156.01805f, 138.6f, 170.0f),
                    PathNode.LineTo(40.0f, 170.0f),
                    PathNode.CurveTo(36.68629f, 170.0f, 34.0f, 172.6863f, 34.0f, 176.0f),
                    PathNode.CurveTo(34.0f, 179.3137f, 36.68629f, 182.0f, 40.0f, 182.0f),
                    PathNode.LineTo(138.6f, 182.0f),
                    PathNode.CurveTo(141.43915f, 195.98195f, 153.7327f, 206.03008f, 168.0f, 206.03008f),
                    PathNode.CurveTo(182.2673f, 206.03008f, 194.56085f, 195.98195f, 197.4f, 182.0f),
                    PathNode.LineTo(216.0f, 182.0f),
                    PathNode.CurveTo(219.3137f, 182.0f, 222.0f, 179.3137f, 222.0f, 176.0f),
                    PathNode.CurveTo(222.0f, 172.6863f, 219.3137f, 170.0f, 216.0f, 170.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 194.0f),
                    PathNode.CurveTo(158.05887f, 194.0f, 150.0f, 185.94113f, 150.0f, 176.0f),
                    PathNode.CurveTo(150.0f, 166.05887f, 158.05887f, 158.0f, 168.0f, 158.0f),
                    PathNode.CurveTo(177.94113f, 158.0f, 186.0f, 166.05887f, 186.0f, 176.0f),
                    PathNode.CurveTo(186.0f, 185.94113f, 177.94113f, 194.0f, 168.0f, 194.0f),
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
        return _slidersHorizontal!!
    }

private var _slidersHorizontal: ImageVector? = null
