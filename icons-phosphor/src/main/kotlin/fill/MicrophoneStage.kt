package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MicrophoneStage: ImageVector
    get() {
        if (_microphoneStage != null) return _microphoneStage!!
        _microphoneStage = phosphorFillIcon(
            name = "MicrophoneStage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(115.06f, 46.36f),
                    PathNode.CurveTo(114.22304f, 45.522736f, 113.05818f, 45.09923f, 111.87892f, 45.203453f),
                    PathNode.CurveTo(110.69966f, 45.30768f, 109.627144f, 45.92892f, 108.95f, 46.9f),
                    PathNode.CurveTo(100.51179f, 58.943428f, 95.98993f, 73.29465f, 96.0f, 88.0f),
                    PathNode.CurveTo(96.007324f, 91.15028f, 96.217766f, 94.29681f, 96.63f, 97.42f),
                    PathNode.LineTo(27.12f, 192.22f),
                    PathNode.CurveTo(22.417032f, 198.58067f, 23.09406f, 207.4289f, 28.71f, 213.0f),
                    PathNode.LineTo(43.0f, 227.29f),
                    PathNode.CurveTo(48.57111f, 232.90594f, 57.41933f, 233.58296f, 63.78f, 228.88f),
                    PathNode.LineTo(158.59f, 159.35f),
                    PathNode.CurveTo(161.70946f, 159.7685f, 164.85263f, 159.98561f, 168.0f, 160.0f),
                    PathNode.CurveTo(182.69978f, 160.01387f, 197.04703f, 155.49916f, 209.09f, 147.07f),
                    PathNode.CurveTo(210.06108f, 146.39285f, 210.68233f, 145.32034f, 210.78654f, 144.14108f),
                    PathNode.CurveTo(210.89076f, 142.96182f, 210.46727f, 141.79697f, 209.63f, 140.96f),
                    PathNode.Close,
                    PathNode.MoveTo(117.67f, 149.64f),
                    PathNode.LineTo(101.67f, 165.64f),
                    PathNode.CurveTo(99.66776f, 167.74748f, 96.679886f, 168.60301f, 93.86565f, 167.87462f),
                    PathNode.CurveTo(91.051414f, 167.14624f, 88.85376f, 164.9486f, 88.125374f, 162.13435f),
                    PathNode.CurveTo(87.39698f, 159.32011f, 88.25251f, 156.33224f, 90.36f, 154.33f),
                    PathNode.LineTo(106.36f, 138.33f),
                    PathNode.CurveTo(109.50532f, 135.34177f, 114.45925f, 135.4052f, 117.52702f, 138.47298f),
                    PathNode.CurveTo(120.5948f, 141.54076f, 120.65823f, 146.49469f, 117.67f, 149.64f),
                    PathNode.Close,
                    PathNode.MoveTo(227.07f, 129.08f),
                    PathNode.CurveTo(226.39305f, 130.05453f, 225.31837f, 130.6782f, 224.1364f, 130.7825f),
                    PathNode.CurveTo(222.95442f, 130.8868f, 221.78714f, 130.46094f, 220.95f, 129.62f),
                    PathNode.LineTo(126.38f, 35.05f),
                    PathNode.CurveTo(125.53907f, 34.212868f, 125.113205f, 33.045586f, 125.2175f, 31.863604f),
                    PathNode.CurveTo(125.32179f, 30.68162f, 125.94547f, 29.606947f, 126.92f, 28.93f),
                    PathNode.CurveTo(155.51059f, 8.980111f, 194.29156f, 12.404895f, 218.94333f, 37.056664f),
                    PathNode.CurveTo(243.59511f, 61.708435f, 247.01988f, 100.48942f, 227.07f, 129.08f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _microphoneStage!!
    }

private var _microphoneStage: ImageVector? = null
