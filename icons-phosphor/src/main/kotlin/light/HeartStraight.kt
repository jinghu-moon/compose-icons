package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HeartStraight: ImageVector
    get() {
        if (_heartStraight != null) return _heartStraight!!
        _heartStraight = phosphorLightIcon(
            name = "HeartStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(221.6f, 58.38f),
                    PathNode.CurveTo(199.74776f, 36.572067f, 164.3763f, 36.5363f, 142.48f, 58.3f),
                    PathNode.LineTo(128.0f, 71.78f),
                    PathNode.LineTo(113.52f, 58.3f),
                    PathNode.CurveTo(91.63572f, 36.443333f, 56.176674f, 36.465717f, 34.32f, 58.350002f),
                    PathNode.CurveTo(12.463332f, 80.23428f, 12.485718f, 115.69333f, 34.37f, 137.55f),
                    PathNode.LineTo(123.73f, 228.21f),
                    PathNode.CurveTo(124.85737f, 229.35205f, 126.39525f, 229.9949f, 128.0f, 229.9949f),
                    PathNode.CurveTo(129.60475f, 229.9949f, 131.14264f, 229.35205f, 132.27f, 228.21f),
                    PathNode.LineTo(221.6f, 137.59f),
                    PathNode.CurveTo(232.10634f, 127.087395f, 238.00905f, 112.84056f, 238.00905f, 97.985f),
                    PathNode.CurveTo(238.00905f, 83.12943f, 232.10634f, 68.88261f, 221.6f, 58.38f),
                    PathNode.Close,
                    PathNode.MoveTo(213.08f, 129.13f),
                    PathNode.LineTo(128.0f, 215.45f),
                    PathNode.LineTo(42.89f, 129.1f),
                    PathNode.CurveTo(25.81021f, 111.90058f, 25.857555f, 84.12695f, 42.995884f, 66.98587f),
                    PathNode.CurveTo(60.134216f, 49.844784f, 87.90784f, 49.792973f, 105.11f, 66.87f),
                    PathNode.CurveTo(105.158554f, 66.92186f, 105.21215f, 66.96876f, 105.27f, 67.01f),
                    PathNode.LineTo(123.91f, 84.37f),
                    PathNode.CurveTo(126.21414f, 86.5167f, 129.78586f, 86.5167f, 132.09f, 84.37f),
                    PathNode.LineTo(150.73f, 67.0f),
                    PathNode.CurveTo(150.78784f, 66.95876f, 150.84145f, 66.911865f, 150.89f, 66.86f),
                    PathNode.CurveTo(161.99857f, 55.685394f, 178.23451f, 51.30385f, 193.45676f, 55.37264f),
                    PathNode.CurveTo(208.67903f, 59.441425f, 220.56358f, 71.33937f, 224.61523f, 86.56619f),
                    PathNode.CurveTo(228.6669f, 101.79301f, 224.26709f, 118.02402f, 213.08f, 129.12f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _heartStraight!!
    }

private var _heartStraight: ImageVector? = null
