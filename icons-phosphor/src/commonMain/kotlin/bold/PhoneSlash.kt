package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PhoneSlash: ImageVector
    get() {
        if (_phoneSlash != null) return _phoneSlash!!
        _phoneSlash = phosphorBoldIcon(
            name = "PhoneSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(56.9f, 31.93f),
                    PathNode.CurveTo(54.052864f, 28.619917f, 49.632553f, 27.117424f, 45.357998f, 28.006802f),
                    PathNode.CurveTo(41.08344f, 28.896181f, 37.62924f, 32.037067f, 36.338642f, 36.20806f),
                    PathNode.CurveTo(35.048046f, 40.379055f, 36.12473f, 44.921898f, 39.15f, 48.07f),
                    PathNode.LineTo(63.0f, 74.36f),
                    PathNode.CurveTo(47.619144f, 81.56201f, 33.601963f, 91.373695f, 21.57f, 103.36f),
                    PathNode.CurveTo(0.12f, 124.82f, -1.95f, 156.46f, 16.57f, 180.36f),
                    PathNode.CurveTo(20.380533f, 185.20763f, 26.214054f, 188.02661f, 32.38f, 188.0f),
                    PathNode.CurveTo(34.814278f, 188.00119f, 37.22793f, 187.55373f, 39.5f, 186.68f),
                    PathNode.LineTo(88.4f, 169.33f),
                    PathNode.LineTo(88.85f, 169.16f),
                    PathNode.CurveTo(95.122215f, 166.64748f, 99.69537f, 161.12958f, 101.0f, 154.5f),
                    PathNode.LineTo(106.44f, 127.28f),
                    PathNode.CurveTo(107.66f, 126.9f, 108.91f, 126.56f, 110.16f, 126.28f),
                    PathNode.LineTo(199.07f, 224.11f),
                    PathNode.CurveTo(201.91713f, 227.42009f, 206.33746f, 228.92258f, 210.612f, 228.0332f),
                    PathNode.CurveTo(214.88657f, 227.14381f, 218.34076f, 224.00293f, 219.63135f, 219.83194f),
                    PathNode.CurveTo(220.92195f, 215.66095f, 219.84528f, 211.1181f, 216.82f, 207.97f),
                    PathNode.Close,
                    PathNode.MoveTo(83.4f, 120.29f),
                    PathNode.LineTo(78.0f, 147.57f),
                    PathNode.LineTo(33.84f, 163.22f),
                    PathNode.CurveTo(24.68f, 149.38f, 26.43f, 132.46f, 38.57f, 120.32f),
                    PathNode.CurveTo(50.38456f, 108.489685f, 64.5122f, 99.22331f, 80.07f, 93.1f),
                    PathNode.LineTo(92.74f, 107.0f),
                    PathNode.CurveTo(87.89208f, 109.91493f, 84.50023f, 114.74125f, 83.4f, 120.29f),
                    PathNode.Close,
                    PathNode.MoveTo(239.4f, 180.29f),
                    PathNode.CurveTo(236.59296f, 183.90936f, 232.62277f, 186.449f, 228.16f, 187.48f),
                    PathNode.CurveTo(221.99846f, 188.92406f, 215.77455f, 185.33496f, 213.93813f, 179.27876f),
                    PathNode.CurveTo(212.10172f, 173.22256f, 215.2841f, 166.78119f, 221.21f, 164.56f),
                    PathNode.CurveTo(231.42f, 150.49f, 229.96f, 132.85f, 217.42f, 120.31f),
                    PathNode.CurveTo(194.77f, 97.65f, 164.0f, 84.76f, 130.91f, 84.0f),
                    PathNode.CurveTo(124.282585f, 83.92544f, 118.97044f, 78.49242f, 119.045f, 71.865f),
                    PathNode.CurveTo(119.11956f, 65.23758f, 124.55258f, 59.92544f, 131.18f, 60.0f),
                    PathNode.LineTo(131.45f, 60.0f),
                    PathNode.CurveTo(170.78f, 60.87f, 207.34f, 76.25f, 234.39f, 103.31f),
                    PathNode.CurveTo(255.84f, 124.81f, 257.91f, 156.45f, 239.41f, 180.3f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _phoneSlash!!
    }

private var _phoneSlash: ImageVector? = null
