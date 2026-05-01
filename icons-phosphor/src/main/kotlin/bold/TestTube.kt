package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TestTube: ImageVector
    get() {
        if (_testTube != null) return _testTube!!
        _testTube = phosphorBoldIcon(
            name = "TestTube",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.49f, 83.51f),
                    PathNode.LineTo(180.49f, 23.51f),
                    PathNode.CurveTo(178.23837f, 21.250546f, 175.17982f, 19.980537f, 171.99f, 19.980537f),
                    PathNode.CurveTo(168.80019f, 19.980537f, 165.74162f, 21.250546f, 163.49f, 23.51f),
                    PathNode.LineTo(34.28f, 152.75f),
                    PathNode.CurveTo(15.226176f, 171.80382f, 15.226177f, 202.69618f, 34.28f, 221.75f),
                    PathNode.CurveTo(53.333824f, 240.80382f, 84.22617f, 240.80382f, 103.28f, 221.75f),
                    PathNode.LineTo(214.48f, 110.49f),
                    PathNode.LineTo(235.79f, 103.38f),
                    PathNode.CurveTo(239.73723f, 102.06714f, 242.72298f, 98.80367f, 243.68051f, 94.75554f),
                    PathNode.CurveTo(244.63805f, 90.707405f, 243.43077f, 86.45213f, 240.49f, 83.51f),
                    PathNode.Close,
                    PathNode.MoveTo(86.28f, 204.75f),
                    PathNode.CurveTo(76.50798f, 213.74396f, 61.381588f, 213.43053f, 51.990532f, 204.03946f),
                    PathNode.CurveTo(42.59948f, 194.6484f, 42.286037f, 179.52202f, 51.28f, 169.75f),
                    PathNode.LineTo(79.41f, 141.62f),
                    PathNode.CurveTo(87.14f, 139.21f, 98.99f, 138.62f, 114.47f, 146.62f),
                    PathNode.CurveTo(121.37798f, 150.2968f, 128.76619f, 152.98955f, 136.42f, 154.62f),
                    PathNode.Close,
                    PathNode.MoveTo(204.2f, 88.62f),
                    PathNode.CurveTo(202.43602f, 89.21154f, 200.83144f, 90.20029f, 199.51f, 91.51f),
                    PathNode.LineTo(160.62f, 130.41f),
                    PathNode.CurveTo(152.89f, 132.82f, 141.04f, 133.41f, 125.56f, 125.41f),
                    PathNode.CurveTo(118.65515f, 121.73406f, 111.27037f, 119.04134f, 103.62f, 117.41f),
                    PathNode.LineTo(172.0f, 49.0f),
                    PathNode.LineTo(209.79f, 86.79f),
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
        return _testTube!!
    }

private var _testTube: ImageVector? = null
