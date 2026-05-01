package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.AppleLogo: ImageVector
    get() {
        if (_appleLogo != null) return _appleLogo!!
        _appleLogo = phosphorRegularIcon(
            name = "AppleLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(223.3f, 169.59f),
                    PathNode.CurveTo(222.69998f, 168.21896f, 221.73055f, 167.04178f, 220.5f, 166.19f),
                    PathNode.CurveTo(203.53f, 154.53f, 200.0f, 134.64f, 200.0f, 120.0f),
                    PathNode.CurveTo(200.0f, 102.33f, 213.47f, 86.94f, 221.5f, 79.33f),
                    PathNode.CurveTo(223.09625f, 77.81907f, 224.00055f, 75.71794f, 224.00055f, 73.52f),
                    PathNode.CurveTo(224.00055f, 71.32206f, 223.09625f, 69.22094f, 221.5f, 67.71f),
                    PathNode.CurveTo(208.82f, 55.74f, 187.82f, 48.0f, 168.0f, 48.0f),
                    PathNode.CurveTo(153.76231f, 48.010933f, 139.84567f, 52.23115f, 128.0f, 60.13f),
                    PathNode.CurveTo(99.49562f, 41.01599f, 61.434868f, 44.83004f, 37.29f, 69.22f),
                    PathNode.CurveTo(23.151945f, 83.653564f, 15.470131f, 103.20268f, 16.0f, 123.4f),
                    PathNode.CurveTo(16.799738f, 157.48395f, 31.263489f, 189.8166f, 56.14f, 213.13f),
                    PathNode.CurveTo(63.558f, 220.13861f, 73.38479f, 224.02994f, 83.59f, 224.0f),
                    PathNode.LineTo(171.27f, 224.0f),
                    PathNode.CurveTo(182.29805f, 224.02094f, 192.84145f, 219.46974f, 200.39f, 211.43f),
                    PathNode.CurveTo(207.30795f, 203.98491f, 213.29213f, 195.72394f, 218.21f, 186.83f),
                    PathNode.CurveTo(225.23f, 174.0f, 224.33f, 172.0f, 223.3f, 169.59f),
                    PathNode.Close,
                    PathNode.MoveTo(188.67f, 200.53f),
                    PathNode.CurveTo(184.15562f, 205.32346f, 177.8545f, 208.0286f, 171.27f, 208.0f),
                    PathNode.LineTo(83.59f, 208.0f),
                    PathNode.CurveTo(77.47772f, 208.01965f, 71.59178f, 205.68892f, 67.15f, 201.49f),
                    PathNode.CurveTo(45.3752f, 181.10367f, 32.709064f, 152.82016f, 32.0f, 123.0f),
                    PathNode.CurveTo(31.558014f, 107.15292f, 37.566547f, 91.805f, 48.65f, 80.47f),
                    PathNode.CurveTo(59.004475f, 69.89158f, 73.19744f, 63.95109f, 88.0f, 64.0f),
                    PathNode.LineTo(88.78f, 64.0f),
                    PathNode.CurveTo(101.242584f, 64.13126f, 113.29755f, 68.457245f, 123.0f, 76.28f),
                    PathNode.CurveTo(125.92266f, 78.62f, 130.07733f, 78.62f, 133.0f, 76.28f),
                    PathNode.CurveTo(142.9107f, 68.289566f, 155.26945f, 63.953415f, 168.0f, 64.0f),
                    PathNode.CurveTo(180.71274f, 64.14755f, 193.15002f, 67.72327f, 204.0f, 74.35f),
                    PathNode.CurveTo(191.0f, 88.87f, 184.0f, 104.82f, 184.0f, 120.0f),
                    PathNode.CurveTo(184.0f, 143.77f, 191.64f, 162.73f, 206.18f, 175.3f),
                    PathNode.CurveTo(201.60124f, 184.51671f, 195.70247f, 193.0162f, 188.67f, 200.53f),
                    PathNode.Close,
                    PathNode.MoveTo(128.23f, 30.0f),
                    PathNode.CurveTo(132.79372f, 12.324773f, 148.74512f, -0.018329f, 167.0f, 0f),
                    PathNode.LineTo(168.0f, 0f),
                    PathNode.CurveTo(172.41827f, 0f, 176.0f, 3.581722f, 176.0f, 8.0f),
                    PathNode.CurveTo(176.0f, 12.418278f, 172.41827f, 16.0f, 168.0f, 16.0f),
                    PathNode.LineTo(167.0f, 16.0f),
                    PathNode.CurveTo(156.05525f, 15.999043f, 146.49619f, 23.4028f, 143.76f, 34.0f),
                    PathNode.CurveTo(142.65543f, 38.28021f, 138.2902f, 40.85457f, 134.01f, 39.75f),
                    PathNode.CurveTo(129.7298f, 38.64543f, 127.15543f, 34.28021f, 128.26f, 30.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _appleLogo!!
    }

private var _appleLogo: ImageVector? = null
