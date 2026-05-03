package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CheckFat: ImageVector
    get() {
        if (_checkFat != null) return _checkFat!!
        _checkFat = phosphorThinIcon(
            name = "CheckFat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.47f, 71.09f),
                    PathNode.LineTo(216.47f, 47.51f),
                    PathNode.CurveTo(214.21838f, 45.250546f, 211.15982f, 43.980537f, 207.97f, 43.980537f),
                    PathNode.CurveTo(204.78018f, 43.980537f, 201.72162f, 45.250546f, 199.47f, 47.51f),
                    PathNode.LineTo(104.0f, 141.83f),
                    PathNode.LineTo(64.5f, 103.51f),
                    PathNode.CurveTo(62.24838f, 101.25055f, 59.18982f, 99.98054f, 56.0f, 99.98054f),
                    PathNode.CurveTo(52.81018f, 99.98054f, 49.75162f, 101.25055f, 47.5f, 103.51f),
                    PathNode.LineTo(23.5f, 127.51f),
                    PathNode.CurveTo(21.240545f, 129.76163f, 19.970537f, 132.82018f, 19.970537f, 136.01f),
                    PathNode.CurveTo(19.970537f, 139.19981f, 21.240545f, 142.25838f, 23.5f, 144.51f),
                    PathNode.LineTo(95.11f, 216.51f),
                    PathNode.CurveTo(97.361626f, 218.76945f, 100.42018f, 220.03946f, 103.61f, 220.03946f),
                    PathNode.CurveTo(106.79981f, 220.03946f, 109.858376f, 218.76945f, 112.11f, 216.51f),
                    PathNode.LineTo(240.49f, 88.08f),
                    PathNode.CurveTo(242.74374f, 85.826126f, 244.00821f, 82.76822f, 244.00446f, 79.58085f),
                    PathNode.CurveTo(244.0007f, 76.393486f, 242.72903f, 73.33856f, 240.47f, 71.09f),
                    PathNode.Close,
                    PathNode.MoveTo(234.84f, 82.43f),
                    PathNode.LineTo(106.43f, 210.83f),
                    PathNode.CurveTo(104.86869f, 212.38753f, 102.34131f, 212.38753f, 100.78f, 210.83f),
                    PathNode.LineTo(29.17f, 138.83f),
                    PathNode.CurveTo(28.418892f, 138.07973f, 27.996853f, 137.06163f, 27.996853f, 136.0f),
                    PathNode.CurveTo(27.996853f, 134.93837f, 28.418892f, 133.92027f, 29.17f, 133.17f),
                    PathNode.LineTo(53.17f, 109.17f),
                    PathNode.CurveTo(53.91698f, 108.41436f, 54.937496f, 107.992455f, 56.0f, 108.0f),
                    PathNode.CurveTo(57.085308f, 108.005936f, 58.124214f, 108.44091f, 58.89f, 109.21f),
                    PathNode.LineTo(101.24f, 150.29f),
                    PathNode.CurveTo(102.79414f, 151.80804f, 105.275856f, 151.80804f, 106.83f, 150.29f),
                    PathNode.LineTo(205.2f, 53.19f),
                    PathNode.CurveTo(205.95107f, 52.43275f, 206.97345f, 52.006805f, 208.04f, 52.006805f),
                    PathNode.CurveTo(209.10657f, 52.006805f, 210.12894f, 52.43275f, 210.88f, 53.19f),
                    PathNode.LineTo(234.88f, 76.77f),
                    PathNode.CurveTo(235.62582f, 77.525566f, 236.0407f, 78.546646f, 236.03319f, 79.60829f),
                    PathNode.CurveTo(236.02568f, 80.66994f, 235.59644f, 81.68505f, 234.84f, 82.43f),
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
        return _checkFat!!
    }

private var _checkFat: ImageVector? = null
