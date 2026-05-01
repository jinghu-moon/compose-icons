package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UserSwitch: ImageVector
    get() {
        if (_userSwitch != null) return _userSwitch!!
        _userSwitch = phosphorFillIcon(
            name = "UserSwitch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(84.0f, 120.0f),
                    PathNode.CurveTo(84.0f, 95.69947f, 103.69947f, 76.0f, 128.0f, 76.0f),
                    PathNode.CurveTo(152.30052f, 76.0f, 172.0f, 95.69947f, 172.0f, 120.0f),
                    PathNode.CurveTo(172.0f, 144.30052f, 152.30052f, 164.0f, 128.0f, 164.0f),
                    PathNode.CurveTo(103.69947f, 164.0f, 84.0f, 144.30052f, 84.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.16f, 177.18f),
                    PathNode.CurveTo(206.46443f, 175.03476f, 201.74123f, 176.0829f, 199.3f, 179.59f),
                    PathNode.CurveTo(197.57613f, 181.96452f, 195.7338f, 184.25075f, 193.78f, 186.44f),
                    PathNode.CurveTo(187.95992f, 177.9922f, 180.5648f, 170.74649f, 172.0f, 165.1f),
                    PathNode.CurveTo(170.49864f, 164.10472f, 168.51724f, 164.23572f, 167.16f, 165.42f),
                    PathNode.CurveTo(144.69485f, 184.85948f, 111.36514f, 184.85948f, 88.9f, 165.42f),
                    PathNode.CurveTo(87.53201f, 164.20538f, 85.514336f, 164.07361f, 84.0f, 165.1f),
                    PathNode.CurveTo(75.43361f, 170.73566f, 68.03506f, 177.97125f, 62.21f, 186.41f),
                    PathNode.CurveTo(49.716602f, 172.3809f, 42.060474f, 154.70943f, 40.37f, 136.0f),
                    PathNode.LineTo(55.77f, 136.0f),
                    PathNode.CurveTo(58.396656f, 136.0414f, 60.884136f, 134.82184f, 62.46f, 132.72f),
                    PathNode.CurveTo(64.78907f, 129.53601f, 64.449455f, 125.1295f, 61.66f, 122.34f),
                    PathNode.LineTo(37.66f, 98.34f),
                    PathNode.CurveTo(36.159454f, 96.83778f, 34.123276f, 95.993706f, 32.0f, 95.993706f),
                    PathNode.CurveTo(29.876726f, 95.993706f, 27.840546f, 96.83778f, 26.34f, 98.34f),
                    PathNode.LineTo(2.34f, 122.34f),
                    PathNode.CurveTo(-0.449459f, 125.1295f, -0.789074f, 129.53601f, 1.54f, 132.72f),
                    PathNode.CurveTo(3.115863f, 134.82184f, 5.603344f, 136.0414f, 8.23f, 136.0f),
                    PathNode.LineTo(24.3f, 136.0f),
                    PathNode.CurveTo(27.651688f, 179.5691f, 57.881557f, 216.39612f, 99.96218f, 228.17412f),
                    PathNode.CurveTo(142.04282f, 239.95213f, 186.99788f, 224.16876f, 212.48f, 188.67f),
                    PathNode.CurveTo(213.7774f, 186.86386f, 214.26448f, 184.59918f, 213.82434f, 182.41934f),
                    PathNode.CurveTo(213.3842f, 180.2395f, 212.05656f, 178.34123f, 210.16f, 177.18f),
                    PathNode.Close,
                    PathNode.MoveTo(255.39f, 124.94f),
                    PathNode.CurveTo(254.15236f, 121.95038f, 251.23566f, 120.00066f, 248.0f, 120.0f),
                    PathNode.LineTo(231.7f, 120.0f),
                    PathNode.CurveTo(228.34831f, 76.43089f, 198.11844f, 39.60389f, 156.03781f, 27.825874f),
                    PathNode.CurveTo(113.95719f, 16.047861f, 69.00212f, 31.831236f, 43.52f, 67.33f),
                    PathNode.CurveTo(40.94083f, 70.91985f, 41.76015f, 75.92083f, 45.35f, 78.5f),
                    PathNode.CurveTo(48.93985f, 81.07917f, 53.94083f, 80.25985f, 56.52f, 76.67f),
                    PathNode.CurveTo(77.95263f, 46.82918f, 115.66855f, 33.44397f, 151.11761f, 43.09772f),
                    PathNode.CurveTo(186.56671f, 52.751472f, 212.28767f, 83.412285f, 215.63f, 120.0f),
                    PathNode.LineTo(200.0f, 120.0f),
                    PathNode.CurveTo(196.76236f, 119.99745f, 193.84236f, 121.94662f, 192.60303f, 124.937675f),
                    PathNode.CurveTo(191.36368f, 127.92874f, 192.04936f, 131.3719f, 194.34f, 133.66f),
                    PathNode.LineTo(218.34f, 157.66f),
                    PathNode.CurveTo(219.84055f, 159.16223f, 221.87672f, 160.00629f, 224.0f, 160.00629f),
                    PathNode.CurveTo(226.12328f, 160.00629f, 228.15945f, 159.16223f, 229.66f, 157.66f),
                    PathNode.LineTo(253.66f, 133.66f),
                    PathNode.CurveTo(255.94725f, 131.37076f, 256.63007f, 127.92904f, 255.39f, 124.94f),
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
        return _userSwitch!!
    }

private var _userSwitch: ImageVector? = null
