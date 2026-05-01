package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AmazonLogo: ImageVector
    get() {
        if (_amazonLogo != null) return _amazonLogo!!
        _amazonLogo = phosphorFillIcon(
            name = "AmazonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 136.0f),
                    PathNode.CurveTo(152.0f, 149.25484f, 141.25484f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(114.74516f, 160.0f, 104.0f, 149.25484f, 104.0f, 136.0f),
                    PathNode.CurveTo(104.0f, 122.74516f, 114.74516f, 112.0f, 128.0f, 112.0f),
                    PathNode.CurveTo(141.25484f, 112.0f, 152.0f, 122.74516f, 152.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 128.0f),
                    PathNode.CurveTo(232.0f, 185.4376f, 185.4376f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(70.562386f, 232.0f, 24.0f, 185.4376f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 70.562386f, 70.562386f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(185.41248f, 24.060629f, 231.93938f, 70.58752f, 232.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 104.0f),
                    PathNode.LineTo(152.0f, 104.0f),
                    PathNode.CurveTo(135.4978f, 91.62335f, 112.29011f, 93.82533f, 98.41004f, 109.08468f),
                    PathNode.CurveTo(84.52998f, 124.34403f, 84.52998f, 147.65598f, 98.41004f, 162.91531f),
                    PathNode.CurveTo(112.29011f, 178.17467f, 135.4978f, 180.37663f, 152.0f, 168.0f),
                    PathNode.LineTo(152.0f, 168.0f),
                    PathNode.CurveTo(152.0f, 172.41827f, 155.58173f, 176.0f, 160.0f, 176.0f),
                    PathNode.CurveTo(164.41827f, 176.0f, 168.0f, 172.41827f, 168.0f, 168.0f),
                    PathNode.LineTo(168.0f, 104.0f),
                    PathNode.CurveTo(168.00462f, 86.17112f, 156.20903f, 70.491585f, 139.07747f, 65.55411f),
                    PathNode.CurveTo(121.94591f, 60.61664f, 103.61481f, 67.613396f, 94.13f, 82.71f),
                    PathNode.CurveTo(91.87073f, 86.44347f, 93.020256f, 91.298744f, 96.71372f, 93.62284f),
                    PathNode.CurveTo(100.40718f, 95.94694f, 105.281784f, 94.882324f, 107.67f, 91.23f),
                    PathNode.CurveTo(113.357544f, 82.164734f, 124.35989f, 77.960495f, 134.64343f, 80.92284f),
                    PathNode.CurveTo(144.92702f, 83.8852f, 152.00667f, 93.29826f, 152.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.81f, 169.61f),
                    PathNode.CurveTo(193.28061f, 166.95467f, 188.26709f, 167.66193f, 185.61f, 171.19f),
                    PathNode.CurveTo(172.01317f, 189.32787f, 150.6684f, 200.00334f, 128.0f, 200.00334f),
                    PathNode.CurveTo(105.33161f, 200.00334f, 83.98684f, 189.32787f, 70.39f, 171.19f),
                    PathNode.CurveTo(68.69765f, 168.83423f, 65.86271f, 167.57906f, 62.980965f, 167.90965f),
                    PathNode.CurveTo(60.099224f, 168.24025f, 57.622185f, 170.10481f, 56.50729f, 172.78264f),
                    PathNode.CurveTo(55.3924f, 175.46046f, 55.81433f, 178.532f, 57.61f, 180.81f),
                    PathNode.CurveTo(74.22986f, 202.96107f, 100.30722f, 215.99667f, 128.0f, 215.99667f),
                    PathNode.CurveTo(155.69278f, 215.99667f, 181.77014f, 202.96107f, 198.39f, 180.81f),
                    PathNode.CurveTo(201.04533f, 177.28061f, 200.33807f, 172.26709f, 196.81f, 169.61f),
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
        return _amazonLogo!!
    }

private var _amazonLogo: ImageVector? = null
