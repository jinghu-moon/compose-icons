package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FlowArrow: ImageVector
    get() {
        if (_flowArrow != null) return _flowArrow!!
        _flowArrow = phosphorThinIcon(
            name = "FlowArrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(242.83f, 77.17f),
                    PathNode.LineTo(210.83f, 45.17f),
                    PathNode.CurveTo(209.26703f, 43.607033f, 206.73297f, 43.607033f, 205.17f, 45.17f),
                    PathNode.CurveTo(203.60704f, 46.732967f, 203.60704f, 49.267033f, 205.17f, 50.83f),
                    PathNode.LineTo(230.34f, 76.0f),
                    PathNode.LineTo(208.0f, 76.0f),
                    PathNode.CurveTo(161.33f, 76.0f, 150.16f, 102.81f, 140.31f, 126.46f),
                    PathNode.CurveTo(130.85f, 149.15f, 121.91f, 170.62f, 83.76f, 171.94f),
                    PathNode.CurveTo(81.63733f, 152.95427f, 65.05424f, 138.93279f, 45.97981f, 139.99577f),
                    PathNode.CurveTo(26.905382f, 141.05875f, 11.982912f, 156.83598f, 11.982912f, 175.94f),
                    PathNode.CurveTo(11.982912f, 195.04402f, 26.905382f, 210.82124f, 45.97981f, 211.88423f),
                    PathNode.CurveTo(65.05424f, 212.9472f, 81.63733f, 198.92574f, 83.76f, 179.94f),
                    PathNode.CurveTo(127.25f, 178.52f, 138.09f, 152.55f, 147.67f, 129.55f),
                    PathNode.CurveTo(157.45f, 106.12f, 166.67f, 84.0f, 208.0f, 84.0f),
                    PathNode.LineTo(230.34f, 84.0f),
                    PathNode.LineTo(205.17f, 109.17f),
                    PathNode.CurveTo(203.60704f, 110.73296f, 203.60704f, 113.26704f, 205.17f, 114.83f),
                    PathNode.CurveTo(206.73297f, 116.39297f, 209.26703f, 116.39297f, 210.83f, 114.83f),
                    PathNode.LineTo(242.83f, 82.83f),
                    PathNode.CurveTo(243.58112f, 82.07973f, 244.00314f, 81.06164f, 244.00314f, 80.0f),
                    PathNode.CurveTo(244.00314f, 78.93836f, 243.58112f, 77.92027f, 242.83f, 77.17f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 204.0f),
                    PathNode.CurveTo(32.536026f, 204.0f, 20.0f, 191.46397f, 20.0f, 176.0f),
                    PathNode.CurveTo(20.0f, 160.53603f, 32.536026f, 148.0f, 48.0f, 148.0f),
                    PathNode.CurveTo(63.46397f, 148.0f, 76.0f, 160.53603f, 76.0f, 176.0f),
                    PathNode.CurveTo(76.0f, 191.46397f, 63.46397f, 204.0f, 48.0f, 204.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _flowArrow!!
    }

private var _flowArrow: ImageVector? = null
