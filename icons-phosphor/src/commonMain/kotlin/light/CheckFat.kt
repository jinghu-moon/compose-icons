package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CheckFat: ImageVector
    get() {
        if (_checkFat != null) return _checkFat!!
        _checkFat = phosphorLightIcon(
            name = "CheckFat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(241.87f, 69.66f),
                    PathNode.LineTo(217.87f, 46.1f),
                    PathNode.CurveTo(212.40599f, 40.65196f, 203.56401f, 40.65196f, 198.1f, 46.1f),
                    PathNode.LineTo(104.0f, 139.0f),
                    PathNode.LineTo(65.9f, 102.1f),
                    PathNode.CurveTo(63.27445f, 99.47418f, 59.71328f, 97.99899f, 56.0f, 97.99899f),
                    PathNode.CurveTo(52.28672f, 97.99899f, 48.72555f, 99.47418f, 46.1f, 102.1f),
                    PathNode.LineTo(22.1f, 126.1f),
                    PathNode.CurveTo(16.63865f, 131.56631f, 16.63865f, 140.42369f, 22.1f, 145.89f),
                    PathNode.LineTo(93.72f, 217.89f),
                    PathNode.CurveTo(96.34555f, 220.51582f, 99.90672f, 221.99101f, 103.62f, 221.99101f),
                    PathNode.CurveTo(107.333275f, 221.99101f, 110.89445f, 220.51582f, 113.52f, 217.89f),
                    PathNode.LineTo(241.91f, 89.5f),
                    PathNode.CurveTo(244.54279f, 86.86752f, 246.01857f, 83.294785f, 246.01106f, 79.57169f),
                    PathNode.CurveTo(246.00356f, 75.848595f, 244.51338f, 72.28184f, 241.87f, 69.66f),
                    PathNode.Close,
                    PathNode.MoveTo(233.42f, 81.0f),
                    PathNode.LineTo(105.0f, 209.41f),
                    PathNode.CurveTo(104.22111f, 210.17885f, 102.968895f, 210.17885f, 102.19f, 209.41f),
                    PathNode.LineTo(30.57f, 137.41f),
                    PathNode.CurveTo(29.794554f, 136.62993f, 29.794554f, 135.37007f, 30.57f, 134.59f),
                    PathNode.LineTo(54.57f, 110.59f),
                    PathNode.CurveTo(54.948235f, 110.20949f, 55.463493f, 109.9969f, 56.0f, 110.0f),
                    PathNode.CurveTo(56.565334f, 110.00479f, 57.10534f, 110.23519f, 57.5f, 110.64f),
                    PathNode.LineTo(99.85f, 151.72f),
                    PathNode.CurveTo(102.18184f, 154.00034f, 105.908165f, 154.00034f, 108.24f, 151.72f),
                    PathNode.LineTo(206.61f, 54.61f),
                    PathNode.CurveTo(206.98663f, 54.222046f, 207.5043f, 54.003117f, 208.045f, 54.003117f),
                    PathNode.CurveTo(208.58571f, 54.003117f, 209.10336f, 54.222046f, 209.48f, 54.61f),
                    PathNode.LineTo(233.48f, 78.17f),
                    PathNode.CurveTo(233.84772f, 78.55304f, 234.04802f, 79.06658f, 234.03676f, 79.59744f),
                    PathNode.CurveTo(234.0255f, 80.128296f, 233.80362f, 80.63289f, 233.42f, 81.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _checkFat!!
    }

private var _checkFat: ImageVector? = null
