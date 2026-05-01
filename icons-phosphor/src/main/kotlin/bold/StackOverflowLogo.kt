package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.StackOverflowLogo: ImageVector
    get() {
        if (_stackOverflowLogo != null) return _stackOverflowLogo!!
        _stackOverflowLogo = phosphorBoldIcon(
            name = "StackOverflowLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 151.67f),
                    PathNode.LineTo(220.0f, 216.0f),
                    PathNode.CurveTo(220.0f, 222.62741f, 214.62741f, 228.0f, 208.0f, 228.0f),
                    PathNode.LineTo(48.0f, 228.0f),
                    PathNode.CurveTo(41.37258f, 228.0f, 36.0f, 222.62741f, 36.0f, 216.0f),
                    PathNode.LineTo(36.0f, 151.67f),
                    PathNode.CurveTo(36.0f, 145.04259f, 41.37258f, 139.67f, 48.0f, 139.67f),
                    PathNode.CurveTo(54.62742f, 139.67f, 60.0f, 145.04259f, 60.0f, 151.67f),
                    PathNode.LineTo(60.0f, 203.9f),
                    PathNode.LineTo(196.0f, 203.9f),
                    PathNode.LineTo(196.0f, 151.67f),
                    PathNode.CurveTo(196.0f, 145.04259f, 201.37259f, 139.67f, 208.0f, 139.67f),
                    PathNode.CurveTo(214.62741f, 139.67f, 220.0f, 145.04259f, 220.0f, 151.67f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 183.81f),
                    PathNode.LineTo(168.0f, 183.81f),
                    PathNode.CurveTo(174.52263f, 183.62212f, 179.71275f, 178.28033f, 179.71275f, 171.755f),
                    PathNode.CurveTo(179.71275f, 165.22968f, 174.52263f, 159.88788f, 168.0f, 159.7f),
                    PathNode.LineTo(88.0f, 159.7f),
                    PathNode.CurveTo(81.47737f, 159.88788f, 76.28724f, 165.22968f, 76.28724f, 171.755f),
                    PathNode.CurveTo(76.28724f, 178.28033f, 81.47737f, 183.62212f, 88.0f, 183.81f),
                    PathNode.Close,
                    PathNode.MoveTo(96.2f, 113.0f),
                    PathNode.LineTo(171.37f, 140.49f),
                    PathNode.CurveTo(177.62738f, 142.75713f, 184.53787f, 139.52238f, 186.805f, 133.265f),
                    PathNode.CurveTo(189.07213f, 127.007614f, 185.83739f, 120.09713f, 179.58f, 117.83f),
                    PathNode.LineTo(104.41f, 90.35f),
                    PathNode.CurveTo(98.15537f, 88.08287f, 91.24713f, 91.31538f, 88.98f, 97.57f),
                    PathNode.CurveTo(86.71287f, 103.82462f, 89.94537f, 110.73287f, 96.2f, 113.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 49.29f),
                    PathNode.LineTo(189.29f, 100.93f),
                    PathNode.CurveTo(194.36624f, 105.185745f, 201.93074f, 104.52329f, 206.19f, 99.45f),
                    PathNode.CurveTo(210.46225f, 94.34264f, 209.80057f, 86.74224f, 204.71f, 82.45f),
                    PathNode.LineTo(143.44f, 30.82f),
                    PathNode.CurveTo(141.00038f, 28.774284f, 137.84781f, 27.781923f, 134.67628f, 28.061378f),
                    PathNode.CurveTo(131.50476f, 28.340832f, 128.5743f, 29.869192f, 126.53f, 32.31f),
                    PathNode.CurveTo(122.27444f, 37.413464f, 122.93069f, 44.993813f, 128.0f, 49.29f),
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
        return _stackOverflowLogo!!
    }

private var _stackOverflowLogo: ImageVector? = null
