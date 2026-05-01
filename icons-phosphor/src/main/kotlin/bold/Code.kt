package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Code: ImageVector
    get() {
        if (_code != null) return _code!!
        _code = phosphorBoldIcon(
            name = "Code",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(71.68f, 97.22f),
                    PathNode.LineTo(34.74f, 128.0f),
                    PathNode.LineTo(71.68f, 158.78f),
                    PathNode.CurveTo(75.013596f, 161.51196f, 76.62602f, 165.82184f, 75.90423f, 170.07101f),
                    PathNode.CurveTo(75.18243f, 174.32019f, 72.23729f, 177.85588f, 68.18857f, 179.33382f),
                    PathNode.CurveTo(64.13985f, 180.81177f, 59.609497f, 180.0049f, 56.32f, 177.22f),
                    PathNode.LineTo(8.32f, 137.22f),
                    PathNode.CurveTo(5.583125f, 134.94008f, 4.000599f, 131.56209f, 4.000599f, 128.0f),
                    PathNode.CurveTo(4.000599f, 124.437904f, 5.583125f, 121.05991f, 8.32f, 118.78f),
                    PathNode.LineTo(56.32f, 78.78f),
                    PathNode.CurveTo(61.417023f, 74.60288f, 68.92887f, 75.31767f, 73.1466f, 80.38114f),
                    PathNode.CurveTo(77.36433f, 85.44461f, 76.709595f, 92.96194f, 71.68f, 97.22f),
                    PathNode.Close,
                    PathNode.MoveTo(247.68f, 118.78f),
                    PathNode.LineTo(199.68f, 78.78f),
                    PathNode.CurveTo(196.3905f, 75.9951f, 191.86015f, 75.18823f, 187.81142f, 76.666176f),
                    PathNode.CurveTo(183.76271f, 78.14411f, 180.81757f, 81.67982f, 180.09578f, 85.928986f),
                    PathNode.CurveTo(179.37398f, 90.178154f, 180.9864f, 94.488045f, 184.32f, 97.22f),
                    PathNode.LineTo(221.26f, 128.0f),
                    PathNode.LineTo(184.32f, 158.78f),
                    PathNode.CurveTo(180.9864f, 161.51196f, 179.37398f, 165.82184f, 180.09578f, 170.07101f),
                    PathNode.CurveTo(180.81757f, 174.32019f, 183.76271f, 177.85588f, 187.81142f, 179.33382f),
                    PathNode.CurveTo(191.86015f, 180.81177f, 196.3905f, 180.0049f, 199.68f, 177.22f),
                    PathNode.LineTo(247.68f, 137.22f),
                    PathNode.CurveTo(250.41687f, 134.94008f, 251.9994f, 131.56209f, 251.9994f, 128.0f),
                    PathNode.CurveTo(251.9994f, 124.437904f, 250.41687f, 121.05991f, 247.68f, 118.78f),
                    PathNode.Close,
                    PathNode.MoveTo(164.1f, 28.72f),
                    PathNode.CurveTo(161.10838f, 27.632053f, 157.80708f, 27.77736f, 154.92262f, 29.123941f),
                    PathNode.CurveTo(152.03816f, 30.470522f, 149.80695f, 32.90802f, 148.72f, 35.9f),
                    PathNode.LineTo(84.72f, 211.9f),
                    PathNode.CurveTo(82.46101f, 218.12689f, 85.67476f, 225.00645f, 91.9f, 227.27f),
                    PathNode.CurveTo(93.212524f, 227.75468f, 94.600845f, 228.00188f, 96.0f, 228.0f),
                    PathNode.CurveTo(101.04722f, 228.0009f, 105.555534f, 224.84349f, 107.28f, 220.1f),
                    PathNode.LineTo(171.28f, 44.1f),
                    PathNode.CurveTo(172.36795f, 41.108387f, 172.22264f, 37.80708f, 170.87605f, 34.92262f),
                    PathNode.CurveTo(169.52946f, 32.038162f, 167.09198f, 29.80694f, 164.1f, 28.72f),
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
        return _code!!
    }

private var _code: ImageVector? = null
