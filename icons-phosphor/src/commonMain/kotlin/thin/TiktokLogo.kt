package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TiktokLogo: ImageVector
    get() {
        if (_tiktokLogo != null) return _tiktokLogo!!
        _tiktokLogo = phosphorThinIcon(
            name = "TiktokLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 76.0f),
                    PathNode.CurveTo(195.2949f, 75.966934f, 172.03307f, 52.7051f, 172.0f, 24.0f),
                    PathNode.CurveTo(172.0f, 21.790861f, 170.20914f, 20.0f, 168.0f, 20.0f),
                    PathNode.LineTo(128.0f, 20.0f),
                    PathNode.CurveTo(125.79086f, 20.0f, 124.0f, 21.790861f, 124.0f, 24.0f),
                    PathNode.LineTo(124.0f, 156.0f),
                    PathNode.CurveTo(123.99847f, 167.89172f, 115.28897f, 177.98918f, 103.5263f, 179.73643f),
                    PathNode.CurveTo(91.76363f, 181.48367f, 80.49516f, 174.35376f, 77.03713f, 162.97592f),
                    PathNode.CurveTo(73.57911f, 151.59808f, 78.974396f, 139.40363f, 89.72f, 134.31f),
                    PathNode.CurveTo(91.115654f, 133.64528f, 92.00336f, 132.23587f, 92.0f, 130.69f),
                    PathNode.LineTo(92.0f, 88.0f),
                    PathNode.CurveTo(92.00051f, 86.81637f, 91.47678f, 85.69328f, 90.56971f, 84.932884f),
                    PathNode.CurveTo(89.662636f, 84.172485f, 88.46537f, 83.85287f, 87.3f, 84.06f),
                    PathNode.CurveTo(53.49f, 90.08f, 28.0f, 121.0f, 28.0f, 156.0f),
                    PathNode.CurveTo(28.0f, 195.7645f, 60.235497f, 228.0f, 100.0f, 228.0f),
                    PathNode.CurveTo(139.7645f, 228.0f, 172.0f, 195.7645f, 172.0f, 156.0f),
                    PathNode.LineTo(172.0f, 109.44f),
                    PathNode.CurveTo(187.65472f, 119.005554f, 205.6542f, 124.04541f, 224.0f, 124.0f),
                    PathNode.CurveTo(226.20914f, 124.0f, 228.0f, 122.20914f, 228.0f, 120.0f),
                    PathNode.LineTo(228.0f, 80.0f),
                    PathNode.CurveTo(228.0f, 77.79086f, 226.20914f, 76.0f, 224.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 115.92f),
                    PathNode.CurveTo(202.12097f, 115.18248f, 184.85262f, 109.20844f, 170.34f, 98.74f),
                    PathNode.CurveTo(169.11977f, 97.859825f, 167.50885f, 97.73882f, 166.17084f, 98.42683f),
                    PathNode.CurveTo(164.83281f, 99.11484f, 163.99402f, 100.495476f, 164.0f, 102.0f),
                    PathNode.LineTo(164.0f, 156.0f),
                    PathNode.CurveTo(164.0f, 191.34622f, 135.34622f, 220.0f, 100.0f, 220.0f),
                    PathNode.CurveTo(64.65378f, 220.0f, 36.0f, 191.34622f, 36.0f, 156.0f),
                    PathNode.CurveTo(36.0f, 126.48f, 56.32f, 100.21f, 84.0f, 93.0f),
                    PathNode.LineTo(84.0f, 128.31f),
                    PathNode.CurveTo(70.54866f, 136.07614f, 64.61663f, 152.38031f, 69.93245f, 166.97461f),
                    PathNode.CurveTo(75.248276f, 181.5689f, 90.27672f, 190.23843f, 105.57172f, 187.53401f),
                    PathNode.CurveTo(120.86674f, 184.82959f, 132.01108f, 171.53226f, 132.0f, 156.0f),
                    PathNode.LineTo(132.0f, 28.0f),
                    PathNode.LineTo(164.13f, 28.0f),
                    PathNode.CurveTo(166.17874f, 57.966553f, 190.03345f, 81.82126f, 220.0f, 83.87f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _tiktokLogo!!
    }

private var _tiktokLogo: ImageVector? = null
