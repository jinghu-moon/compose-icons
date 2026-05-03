package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Student: ImageVector
    get() {
        if (_student != null) return _student!!
        _student = phosphorDuotoneIcon(
            name = "Student",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 64.0f),
                    PathNode.LineTo(128.0f, 96.0f),
                    PathNode.LineTo(32.0f, 64.0f),
                    PathNode.LineTo(128.0f, 32.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(226.53f, 56.41f),
                    PathNode.LineTo(130.53f, 24.41f),
                    PathNode.CurveTo(128.88776f, 23.862543f, 127.11224f, 23.862543f, 125.47f, 24.41f),
                    PathNode.LineTo(29.47f, 56.41f),
                    PathNode.CurveTo(26.50471f, 57.410156f, 24.394844f, 60.047485f, 24.07f, 63.16f),
                    PathNode.CurveTo(24.023066f, 63.43753f, 23.99965f, 63.71853f, 24.0f, 64.0f),
                    PathNode.LineTo(24.0f, 144.0f),
                    PathNode.CurveTo(24.0f, 148.41827f, 27.581722f, 152.0f, 32.0f, 152.0f),
                    PathNode.CurveTo(36.418278f, 152.0f, 40.0f, 148.41827f, 40.0f, 144.0f),
                    PathNode.LineTo(40.0f, 75.1f),
                    PathNode.LineTo(73.59f, 86.29f),
                    PathNode.CurveTo(55.007412f, 116.311485f, 64.24753f, 155.71062f, 94.24f, 174.34f),
                    PathNode.CurveTo(76.24f, 181.4f, 60.68f, 194.17f, 49.3f, 211.63f),
                    PathNode.CurveTo(47.689274f, 214.02397f, 47.492496f, 217.09982f, 48.785034f, 219.67953f),
                    PathNode.CurveTo(50.07758f, 222.25925f, 52.65914f, 223.94304f, 55.540997f, 224.08603f),
                    PathNode.CurveTo(58.422855f, 224.22903f, 61.158424f, 222.80908f, 62.7f, 220.37f),
                    PathNode.CurveTo(77.77f, 197.25f, 101.57f, 184.0f, 128.0f, 184.0f),
                    PathNode.CurveTo(154.43f, 184.0f, 178.23f, 197.25f, 193.3f, 220.37f),
                    PathNode.CurveTo(195.74152f, 223.99875f, 200.64462f, 224.99417f, 204.30792f, 222.60481f),
                    PathNode.CurveTo(207.97122f, 220.21547f, 209.0367f, 215.32712f, 206.7f, 211.63f),
                    PathNode.CurveTo(195.32f, 194.17f, 179.7f, 181.4f, 161.76f, 174.34f),
                    PathNode.CurveTo(191.72202f, 155.71246f, 200.95854f, 116.350975f, 182.41f, 86.34f),
                    PathNode.LineTo(226.53f, 71.64f),
                    PathNode.CurveTo(229.79756f, 70.55158f, 232.00179f, 67.494064f, 232.00179f, 64.05f),
                    PathNode.CurveTo(232.00179f, 60.605934f, 229.79756f, 57.54842f, 226.53f, 56.46f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 120.0f),
                    PathNode.CurveTo(176.0059f, 140.83458f, 162.57071f, 159.29396f, 142.74326f, 165.69333f),
                    PathNode.CurveTo(122.91581f, 172.0927f, 101.22411f, 164.97061f, 89.04886f, 148.06372f),
                    PathNode.CurveTo(76.8736f, 131.15683f, 76.99526f, 108.32618f, 89.35f, 91.55f),
                    PathNode.LineTo(125.47f, 103.55f),
                    PathNode.CurveTo(127.11224f, 104.09746f, 128.88776f, 104.09746f, 130.53f, 103.55f),
                    PathNode.LineTo(166.65f, 91.55f),
                    PathNode.CurveTo(172.72787f, 99.78996f, 176.00482f, 109.76098f, 176.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 87.57f),
                    PathNode.LineTo(57.3f, 64.0f),
                    PathNode.LineTo(128.0f, 40.43f),
                    PathNode.LineTo(198.7f, 64.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _student!!
    }

private var _student: ImageVector? = null
